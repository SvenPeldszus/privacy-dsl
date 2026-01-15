package edfdtosimplegraph


import edfdtosimplegraph.EDFD
import org.secdfd.model.Asset
import org.secdfd.model.AttackerProfile
import org.secdfd.model.Element
import org.secdfd.model.Flow
import org.secdfd.model.NamedEntity
import org.secdfd.model.SecurityContract
import org.secdfd.model.Value
import org.secdfd.model.Objective //new
import org.secdfd.model.Level //new
import org.secdfd.model.TrustFactor
import org.secdfd.model.TrustZone
import graph.Edge
import graph.GraphAsset
import graph.GraphPackage
import graph.Identifiable
import graph.Node
import graph.NodeResponsibility
import graph.AssetLabel //new
import graph.EdgeLabel //new
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import traceability.EDFDToGraph
import traceability.TraceabilityPackage
import graph.Subgraphs
import java.util.Collections
import org.eclipse.emf.common.util.EList
import graph.GraphFactory
import graph.SecurityLabel
import org.secdfd.model.ContractBase
import org.secdfd.model.ContractType
import org.secdfd.model.ClassificationContract
import org.secdfd.model.ClusteringContract
import org.secdfd.model.DecisionMakingContract
import org.secdfd.model.RecommendationContract
import org.secdfd.model.PredictionContract
import org.secdfd.model.DimensionalityReductionContract
import org.secdfd.model.DataGenerationContract

class eDFDToGraphTransformation {
	/** VIATRA Query Pattern group **/
	val extension EDFDXformM2M edfdxformm2m = EDFDXformM2M.instance

	/** EMF metamodels **/
	val extension TraceabilityPackage trPackage = TraceabilityPackage.eINSTANCE
	val extension GraphPackage graphPackage = GraphPackage.eINSTANCE
	
    /* Transformation-related extensions */
    extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    
    /* Transformation rule-related extensions */
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension IModelManipulations manipulation

    protected ViatraQueryEngine engine
    protected Resource resource
    var EDFDToGraph edfd2graph
        
    new(EDFDToGraph edfd2graph, ViatraQueryEngine engine){
    	this.edfd2graph = edfd2graph
    	resource = edfd2graph.graphs.eResource
    	this.engine = engine
    	prepare(engine)
    	createTransformation
    }
	

    private def createTransformation() {
        //Create VIATRA model manipulations
        this.manipulation = new SimpleModelManipulations(engine)
        //Create VIATRA Batch transformation
        transformation = BatchTransformation.forEngine(engine)
        .build
        //Initialize batch transformation statements
        statements = transformation.transformationStatements
    }

/*
 * user defined transformation rules
 */
 
    val buildFirstSubgraphRule = createRule.precondition(edfdtosimplegraph.EDFD.Matcher.querySpecification).action[
    	val eDFD = it.edfd
    	
 		val graph = edfd2graph.graphs.createChild(graph_Subgraphs, subgraphs) => [
 			//set all graph nodes later once they are transformed
 			//set all graph assets later
 		]
 		
    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
    		addTo(EDFDGraphTrace_EdfdElements, eDFD)
    		addTo(EDFDGraphTrace_GraphElements, graph)
    	]
    	
    ].build

    val eDFDNodeElementRule = createRule.precondition(NodeElements.Matcher.querySpecification).action[
    	val eDFDElement = it.el
    	val eDFDElementName = eDFDElement.name
    	val eDFD = eDFDElement.eContainer

    	println('''Mapping eDFD Node element with Graph Nodes: «eDFDElementName»''')
    	
    	//find subgraph in target model
    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFD as NamedEntity).filter(Subgraphs).head
    
    	val graphNode = subgraph.createChild(subgraphs_Nodes, node) => [
    		set(node_Name, eDFDElementName)
    		//set default attacker observation to -1 -> has not been set
    		set(node_AttackerObservation, -1)
    		//set if the node is malicious
    		//set(node_Attacker, eDFDElement.attacker)
    	]
    	
    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
    		addTo(EDFDGraphTrace_EdfdElements, eDFDElement)
    		addTo(EDFDGraphTrace_GraphElements, graphNode)
    	]
    ].build
    
    val eDFDNodeAttackerZoneRule = createRule.precondition(Boundaries.Matcher.querySpecification).action[
    	val eDFDBoundary = it.tb
    	val eDFDBoundaryTrustFactor = eDFDBoundary.trustFactor
    	
		//find subgraph in target model
    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.edfd as NamedEntity).filter(Subgraphs).head
    	
    	for (Element el : eDFDBoundary.elements){
    		//find this node in target graph
	    	var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, el as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}
	    	val correct_graph_node = locate_correct_graph_node
    		
    		//set that it can be malicious
    		correct_graph_node.attacker = true
    		
    		//set trust factor from TrustZone if specified - convert enum to string
    		if (eDFDBoundaryTrustFactor !== null) {
    			correct_graph_node.trustFactor = eDFDBoundaryTrustFactor.literal
    		}
    	}
    	
    ].build
    
    val eDFDOutFlowRule = createRule.precondition(NodeElements.Matcher.querySpecification).action[
    	val eDFDElement = it.el
    	val eDFDElementName = eDFDElement.name
    	val eDFDOutgoingFlows = eDFDElement.outflows //list of flows

    	println('''Adding outgoing flows to node: «eDFDElementName»''')
  	
    	//find subgraph in target model (the only one)
    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
    	
    	var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDElement as NamedEntity).filter(Node).head
    	for (Node n : subgraph.nodes){
    		if (n.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = n
    		}
    	}
    	val correct_graph_node = locate_correct_graph_node
    	
      	//create outgoing flows and link them to the nodes
    	for (Flow fl : eDFDOutgoingFlows){
	    	val targets = newArrayList()
	    	for(Element target : fl.target){
	    		val t = target as NamedEntity
	    		targets.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, t).filter(Node).head)
	    	}
	
    		//find assets in target model
	    	val graphassets = newArrayList()
	    	for(Asset edfdasset : fl.assets){
	    		graphassets.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, edfdasset as NamedEntity).filter(GraphAsset).head)
	    	}
	  		
			//create new child of that node
	    	val graphEdge = correct_graph_node.createChild(node_Outedges, edge) as Identifiable => [
	    		//set the source as this node
	    		set(edge_Source, correct_graph_node)
	    		//set the target as the list of found references to other nodes
	    		addTo(edge_Target, targets)
	    		//add reference to all the assets
	    		addTo(edge_Graphassets, graphassets)
	    	]
	    	//concat the asset name to differentiate between subgraph elements
	    	graphEdge.ID = fl.name	    		
	    	//set the number of flow
	    	graphEdge.number = fl.number
	    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
	    		addTo(EDFDGraphTrace_EdfdElements, fl)
	    		addTo(EDFDGraphTrace_GraphElements, graphEdge)
	    	]
    	} 
    	
    ].build
    
    
    val eDFDInFlowRule = createRule.precondition(NodeElements.Matcher.querySpecification).action[
    	if (it.el.inflows.size>0){
	       	val eDFDElement = it.el
	    	val eDFDElementName = eDFDElement.name
	    	val eDFDIncomingFlows = eDFDElement.inflows //list of references
	    	
	    	println('''Adding ref to incoming edges to node: «eDFDElementName»''')
	  	
	    	//find subgraph in target model (the only one)
	    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
	    	
	    	var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDElement as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}
	    	val correct_graph_node = locate_correct_graph_node
	    
	    	
	    	for(Flow fl : eDFDIncomingFlows){
	    		//find existing edge
	    		val existingEdge = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, fl).filter(Edge).head
	    		
	    		//add it to the incoming edges 
	    		correct_graph_node.inedges.add(existingEdge)
	    	}    		
    	}

    ].build
 
    
    val eDFDAssetRule = createRule.precondition(Assets.Matcher.querySpecification).action[
    	val eDFDAsset = it.a
    	val eDFDAssetValues = eDFDAsset.value
    	val eDFD = eDFDAsset.eContainer
		
		println('''Mapping eDFD Asset with GraphAsset: «eDFDAsset.name»''')
		
    	//find subgraph in target model
    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFD as NamedEntity).filter(Subgraphs).head
    	
    	val gA = subgraph.createChild(subgraphs_Assets, graphAsset) as GraphAsset


		/* overwrite with the priorities coming from the eDFD model */
		for (Value v : eDFDAssetValues) {
		  if (v.objective !== null) {
		    setOrUpdateAssetLabel(gA.assetlabel, v.objective.literal, lvl(v.level))
		  }
		}
    	gA.ID = eDFDAsset.name

    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
    		addTo(EDFDGraphTrace_EdfdElements, eDFDAsset)
    		addTo(EDFDGraphTrace_GraphElements, gA)
    	]
		
    ].build 
   
   
    val eDFDProcessResponsibilitiesRule = createRule.precondition(Responsibilities.Matcher.querySpecification).action[
    	val eDFDResponsibility = it.r
    	val eDFDResponsibilityProcess = eDFDResponsibility.process as NamedEntity
    	val eDFDIncomingAssets = eDFDResponsibility.incomeassets
    	val eDFDOutgoingAssets = eDFDResponsibility.outcomeassets
    	
    	// Get contract types from ContractBase.task (for SecurityContract) or set automatically for ML-Contracts
    	// Convert ContractType enum values to strings
    	val eDFDResponsibilityActions = newArrayList()
    	
    	// For SecurityContract: use existing task values and convert to strings
    	if (eDFDResponsibility instanceof SecurityContract) {
    		eDFDResponsibilityActions.addAll(eDFDResponsibility.task.map[t | t.literal])
    	} else if (eDFDResponsibility instanceof ClassificationContract) {
    		// Automatically set ContractType::Classification as string
    		eDFDResponsibilityActions.add(ContractType.CLASSIFICATION.literal)
    	} else if (eDFDResponsibility instanceof ClusteringContract) {
    		eDFDResponsibilityActions.add(ContractType.CLUSTERING.literal)
    	} else if (eDFDResponsibility instanceof DecisionMakingContract) {
    		eDFDResponsibilityActions.add(ContractType.DECISION_MAKING.literal)
    	} else if (eDFDResponsibility instanceof RecommendationContract) {
    		eDFDResponsibilityActions.add(ContractType.RECOMMENDATION.literal)
    	} else if (eDFDResponsibility instanceof PredictionContract) {
    		eDFDResponsibilityActions.add(ContractType.PREDICTION.literal)
    	} else if (eDFDResponsibility instanceof DimensionalityReductionContract) {
    		eDFDResponsibilityActions.add(ContractType.DIMENSIONALITY_REDUCTION.literal)
    	} else if (eDFDResponsibility instanceof DataGenerationContract) {
    		eDFDResponsibilityActions.add(ContractType.DATA_GENERATION.literal)
    	}
    	
    	
    	println('''Mapping eDFD Responsibility with Graph NodeResponsibility: «eDFDResponsibilityProcess.name»''')
    	
    	//find target process node (in graph)
    	val node_of_process = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDResponsibilityProcess).filter(Node).head
    	
   		//find incoming assets (in graph)
   		val incomingassets_of_process  = newArrayList()
   		for (Asset s : eDFDIncomingAssets){
   			val o = s as NamedEntity
   			incomingassets_of_process.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, o).filter(GraphAsset).head)
   		}
   		//find outgoing assets (in graph)
   		val outgoingassets_of_process  = newArrayList()
   		for (Asset s : eDFDOutgoingAssets){
   			val o = s as NamedEntity
   			outgoingassets_of_process.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, o).filter(GraphAsset).head)
   		}

    	//create new child of that node (node contains responsibilities)
    	val graphResponsibility = node_of_process.createChild(node_Responsibility, nodeResponsibility) as NodeResponsibility => [
    		//set incoming assets
    		addTo(nodeResponsibility_Incomingassets, incomingassets_of_process)
    		//set outgoing assets
			addTo(nodeResponsibility_Outgoingassets, outgoingassets_of_process)
    		//set contract types as strings
    		if (!eDFDResponsibilityActions.empty) {
    			it.contractTypes.clear()
    			it.contractTypes.addAll(eDFDResponsibilityActions)
    		}
    	]
    	// actionsString can be derived directly from eDFDResponsibilityActions
    	val actionsString = eDFDResponsibilityActions.toString
    	graphResponsibility.ID = eDFDResponsibilityProcess.name.concat(actionsString).concat(eDFDResponsibility.incomeassets.toString)
    	
    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
    		addTo(EDFDGraphTrace_EdfdElements, eDFDResponsibility)
    		addTo(EDFDGraphTrace_GraphElements, graphResponsibility)
    	] 
    	
    ].build
     
 
    val eDFDProcessRule = createRule.precondition(ProcessElements.Matcher.querySpecification).action[
    	val eDFDProcess = it.p
    	val eDFDProcessOutgoingFlows = eDFDProcess.outflows
    	val eDFDProcessName = eDFDProcess.name
    	val eDFDProcessResponsibilities = eDFDProcess.contract
    	    	
    	println('''Mapping Process properties with Graph Node: «eDFDProcessName»''')
    	
    	//find target process node (in graph)
   		val node_of_process = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDProcess).filter(Node).head
   		//find target outgoing edges (in graph)
   		val outgoingflows = newArrayList()
    	for(Flow f : eDFDProcessOutgoingFlows){
    		val o = f as NamedEntity
    		outgoingflows.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, o).filter(Edge).head)
    	}

   		//connect them in the graph
   		node_of_process.outedges.addAll(outgoingflows)
   		
   		//find target process responsibilities (in graph)
   		val responsibilities_of_process  = newArrayList()
   		for (ContractBase r : eDFDProcessResponsibilities){
   			val o = r as NamedEntity
   			responsibilities_of_process.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, o).filter(NodeResponsibility).head)
   		}
   		
   		//set the responsibilities in the graph
   		node_of_process.responsibility.addAll(responsibilities_of_process) 
    	 
    ].build
    

    val eDFDTBRule = createRule.precondition(BoundariesAssets.Matcher.querySpecification).action[
	    /*
		 * attacker profile from eDFD to graph -> attacker profiles are related to trust zones/subzones which are related to a group of elements. 
		 * if the attacker profile has skill level: -1 (default; not set), 0 (she can neither read/modify info here), 1 (she can intercept/read info here), 2 (she can tamper with it), ...
		 * attacker observation in graph is an attribute of Node
		 */
    	val eDFDTB  = it.tb
    	val eDFDAsset = it.a
    	val eDFDElementsInBoundary = eDFDTB.elements
    	val eDFDAttackerProfilesForBoundary = eDFDTB.attackerprofile
    	
    	println('''Setting attacker observations to Graph Node: «eDFDTB.name»''')
    	
    	//find asset in target model
    	val asset = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDAsset as NamedEntity).filter(GraphAsset).head
    	
    	//find subgraph in target model
    	val subgraph = asset.eContainer as Subgraphs
	    	   	
    	for (Element e : eDFDElementsInBoundary){
	    	var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, e as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}
	    	val correct_graph_node = locate_correct_graph_node
	   		
	   		for (AttackerProfile ap : eDFDAttackerProfilesForBoundary){
	   			val attacker_observation_skill = ap.observation
	   			if(attacker_observation_skill> correct_graph_node.attackerObservation){
	   				//the attacker is more powerful -> always take the max observation power
	   				correct_graph_node.attackerObservation = attacker_observation_skill
	   			}
	   		}
	   		
    	}
   		
    ].build
    
    val eDFDModifyAsset = createRule.precondition(edfdtosimplegraph.EDFDAsset.Matcher.querySpecification).action[
    	val eDFDAsset = it.a
    	val eDFDAssetSource = eDFDAsset.source //reference to one element
    	val eDFDAssetTargets = eDFDAsset.targets //list of references to elements
    	
    	println('''Setting asset source and targets : «eDFDAsset.name»''')
    	
    	//find asset in target model
    	val asset = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDAsset as NamedEntity).filter(GraphAsset).head
    	
    	//find subgraph in target model
    	val subgraph = asset.eContainer as Subgraphs
	    
	    //find and add the source graph node
		var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDAssetSource as NamedEntity).filter(Node).head
    	for (Node n : subgraph.nodes){
    		if (n.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = n
    		}
    	}	
    	asset.source = locate_correct_graph_node
	   
	   	//find and add the target graph nodes
    	for (Element e : eDFDAssetTargets){
	    	locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, e as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}
	    	asset.targets.add(locate_correct_graph_node)
    	}
    ].build
    
    
 	val eDFDToOneGraphRule = createRule.precondition(edfdtosimplegraph.EDFD.Matcher.querySpecification).action[
 		val eDFD = it.edfd
 		val eDFDAllElements = eDFD.elements
 		val eDFDAllAssets = eDFD.asset
 		
 		//find subgraph in target model
 		val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFD as NamedEntity).filter(Subgraphs).head
 		
 		//find graph nodes in target model
 		val graph_nodes = newArrayList()
    	for(Element el : eDFDAllElements){
    		val t = el as NamedEntity
    		graph_nodes.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, t).filter(Node).head)
    	}
  		//find graph assets in target model
 		val graph_assets = newArrayList()
    	for(Asset a : eDFDAllAssets){
    		val t = a as NamedEntity
    		graph_assets.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, t).filter(GraphAsset).head)
    	}
 		
 		subgraph.nodes.addAll(graph_nodes)
 		subgraph.assets.addAll(graph_assets)

 	].build
 	
    
    //updated
    val initLabels = createRule.precondition(edfdtosimplegraph.EEandDSElement.Matcher.querySpecification).action [

	    println('''Inferring labels for «it.el.name»''')
	
	    val sub = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
	
	    var gn = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.el as NamedEntity).filter(Node).head
	    for (n : sub.nodes) {
	      if (n.name == gn.name) gn = n
		}
		
	    for (Edge e : gn.outedges) {
	      e.visited = true
	      for (o : Objective.values) {
	        val oStr = o.literal
	        val max = e.graphassets.map [ levelOf(assetlabel, oStr) ].max
	          if (max !== null && max >= 0) {  // Only set label if max exists and is >= 0
	          setOrUpdateEdgeLabel(e.edgelabel, oStr, max)
	        }
	      }
	      println('''  → edge «e.ID» labelled
	                   ${e.edgelabel.map[objective + '=' + level].join(', ')}''')
	    }
	    
	  ].build
    
 	//updated
 	val propagateLabelsInOrder = createRule.precondition(edfdtosimplegraph.EDFD.Matcher.querySpecification).action[
		
		val all_elements = it.edfd.elements
	    val allFlows = newArrayList
	    for (Element e : all_elements){
	      allFlows.addAll(e.outflows)
	    }
	
	    Collections.sort(allFlows) [ a , b | a.number - b.number ]
	
	    for (Element f : allFlows) {
	
	      val outgoing = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, f as NamedEntity).filter(Edge).head
	      val node     = outgoing.source
			outgoing.visited = true

	      // Einfache Logik: Eine Schleife über alle Responsibilities
	      for (NodeResponsibility nr : node.responsibility) {
	        val contract = findContract(nr)
	        
	        // Berechne p_max für alle Contracts, die Input-Assets benötigen
	        var pMax = -1  // Initialize with -1 (no label)
	        for (ina : nr.incomingassets) {
	          val level = levelOf(ina.assetlabel, "Privacy")
	          if (level >= 0) {  // Only consider actual labels (level >= 0)
	            pMax = Math::max(pMax, level)
	          }
	        }
	        // If no labels found, default to N (0)
	        if (pMax == -1) {
	          pMax = 0
	        }
	        
        // Setze Privacy-Label basierend auf Contract-Typ (nur wenn noch nicht gesetzt)
        if (!outgoing.edgelabel.exists[l | l.objective == "Privacy"]) {
          val contractTypeStr = if (nr.contractTypes !== null && !nr.contractTypes.empty) 
            "[" + nr.contractTypes.join(",") + "]" else ""
          switch contractTypeStr {
            case "[Classification]": {
              val contractClass = contract as ClassificationContract
              val pClass = if (contractClass !== null && contractClass.getPClass() !== null) contractClass.getPClass() else Level.L
              setOrUpdateEdgeLabel(outgoing.edgelabel, "Privacy", lvl(pClass))
            }
            case "[DecisionMaking]": {
              val contractDM = contract as DecisionMakingContract
              val pAction = if (contractDM !== null && contractDM.getPAction() !== null) contractDM.getPAction() else Level.L
              setOrUpdateEdgeLabel(outgoing.edgelabel, "Privacy", lvl(pAction))
            }
            case "[Recommendation]": {
              val contractRec = contract as RecommendationContract
              val s = if (contractRec !== null) contractRec.isS() else false
              setOrUpdateEdgeLabel(outgoing.edgelabel, "Privacy", if (s) 1 else 0)  // L=1 if s=true, N=0 if s=false
            }
            case "[Clustering]": {
              // Check if all incoming assets have privacy labels and all are N (level 0)
              val allHaveLabels = !nr.incomingassets.empty && nr.incomingassets.forall[ina | levelOf(ina.assetlabel, "Privacy") >= 0]
              val allPrivacyLabelsAreN = allHaveLabels && !nr.incomingassets.exists[ina | levelOf(ina.assetlabel, "Privacy") != 0]
              // If no labels exist or all are N, set to N (0), otherwise L (1)
              setOrUpdateEdgeLabel(outgoing.edgelabel, "Privacy", if (allPrivacyLabelsAreN) 0 else 1)
            }
            case "[Prediction]": {
              val contractPred = contract as PredictionContract
              val s = if (contractPred !== null) contractPred.isS() else false
              // pMax is already >= 0 (defaulted to 0 if no labels found)
              val privacyLevel = if (pMax == 0) 0 else if (s) pMax else 1  // N=0 if pMax is N, pMax if s=true, L=1 otherwise
              setOrUpdateEdgeLabel(outgoing.edgelabel, "Privacy", privacyLevel)
            }
            case "[DimensionalityReduction]": {
              val contractDR = contract as DimensionalityReductionContract
              val k = if (contractDR !== null) contractDR.getK() else 0
              var privacyLevel = pMax
              for (var i = 0; i < k; i++) {
                privacyLevel = reducePrivacyLevel(privacyLevel)
              }
              setOrUpdateEdgeLabel(outgoing.edgelabel, "Privacy", privacyLevel)
            }
            case "[DataGeneration]": {
              val contractDG = contract as DataGenerationContract
              val direction = if (contractDG !== null) contractDG.getDirection() else null
              val k = if (contractDG !== null) contractDG.getK() else 1
              var privacyLevel = pMax
              if (direction !== null) {
                if (direction.toString() == "REDUCE") {
                  for (var i = 0; i < k; i++) {
                    privacyLevel = reducePrivacyLevel(privacyLevel)
                  }
                } else if (direction.toString() == "ELEVATE") {
                  for (var i = 0; i < k; i++) {
                    privacyLevel = elevatePrivacyLevel(privacyLevel)
                  }
                }
              }
              setOrUpdateEdgeLabel(outgoing.edgelabel, "Privacy", privacyLevel)
            }
            case "[EncryptOrHash]": {
              for (o : Objective.values) {
                val oStr = o.literal
                if (!outgoing.edgelabel.exists[l | l.objective == oStr]) {
                  setOrUpdateEdgeLabel(outgoing.edgelabel, oStr, 0)
                }
              }
            }
            case "[Decrypt]": {
              // Decrypt propagates labels asset-by-asset: each encrypted incoming asset's labels 
              if (!nr.incomingassets.empty) {
                for (var i = 0; i < nr.incomingassets.size; i++) {
                  val incomingAsset = nr.incomingassets.get(i)
                  val outgoingAssetIndex = if (i < nr.outgoingassets.size) i else nr.outgoingassets.size - 1
                  val correspondingOutgoingAsset = if (outgoingAssetIndex >= 0) nr.outgoingassets.get(outgoingAssetIndex) else null
                  if (correspondingOutgoingAsset !== null && outgoing.graphassets.contains(correspondingOutgoingAsset)) {
                    for (o : Objective.values) {
                      val oStr = o.literal
                      if (!outgoing.edgelabel.exists[l | l.objective == oStr]) {
                        val level = levelOf(incomingAsset.assetlabel, oStr)
                        if (level >= 0) {  // Only set label if it exists (level >= 0)
                          setOrUpdateEdgeLabel(outgoing.edgelabel, oStr, level)
                        }
                      }
                    }
                  }
                }
              }
            }
            case "[Copier]": {
              // Copier propagates labels asset-by-asset: each incoming asset's labels 
              if (!nr.incomingassets.empty) {
                for (var i = 0; i < nr.incomingassets.size; i++) {
                  val incomingAsset = nr.incomingassets.get(i)
                  val outgoingAssetIndex = if (i < nr.outgoingassets.size) i else nr.outgoingassets.size - 1
                  val correspondingOutgoingAsset = if (outgoingAssetIndex >= 0) nr.outgoingassets.get(outgoingAssetIndex) else null
                  if (correspondingOutgoingAsset !== null && outgoing.graphassets.contains(correspondingOutgoingAsset)) {
                    for (o : Objective.values) {
                      val oStr = o.literal
                      if (!outgoing.edgelabel.exists[l | l.objective == oStr]) {
                        val level = levelOf(incomingAsset.assetlabel, oStr)
                        if (level >= 0) {  // Only set label if it exists (level >= 0)
                          setOrUpdateEdgeLabel(outgoing.edgelabel, oStr, level)
                        }
                      }
                    }
                  }
                }
              }
            }
            case "[Forward]": {
              // Forward propagates labels asset-by-asset: each incoming asset's labels 
              if (!nr.incomingassets.empty) {
                for (var i = 0; i < nr.incomingassets.size; i++) {
                  val incomingAsset = nr.incomingassets.get(i)
                  val outgoingAssetIndex = if (i < nr.outgoingassets.size) i else nr.outgoingassets.size - 1
                  val correspondingOutgoingAsset = if (outgoingAssetIndex >= 0) nr.outgoingassets.get(outgoingAssetIndex) else null
                  if (correspondingOutgoingAsset !== null && outgoing.graphassets.contains(correspondingOutgoingAsset)) {
                    for (o : Objective.values) {
                      val oStr = o.literal
                      if (!outgoing.edgelabel.exists[l | l.objective == oStr]) {
                        val level = levelOf(incomingAsset.assetlabel, oStr)
                        if (level >= 0) {  // Only set label if it exists (level >= 0)
                          setOrUpdateEdgeLabel(outgoing.edgelabel, oStr, level)
                        }
                      }
                    }
                  }
                }
              }
            }
            case "[Splitter]": {
              // Splitter propagates labels asset-by-asset: splits incoming asset(s) into multiple outgoing assets
              if (!nr.incomingassets.empty) {
                val matchingOutgoingAsset = nr.outgoingassets.findFirst[outAsset | outgoing.graphassets.contains(outAsset)]
                if (matchingOutgoingAsset !== null) {
                  val outgoingAssetIndex = nr.outgoingassets.indexOf(matchingOutgoingAsset)
                  val incomingAssetIndex = if (outgoingAssetIndex < nr.incomingassets.size) outgoingAssetIndex else nr.incomingassets.size - 1
                  val incomingAsset = nr.incomingassets.get(incomingAssetIndex)
                  
                  for (o : Objective.values) {
                    val oStr = o.literal
                    if (!outgoing.edgelabel.exists[l | l.objective == oStr]) {
                      val level = levelOf(incomingAsset.assetlabel, oStr)
                      if (level >= 0) {  // Only set label if it exists (level >= 0)
                        setOrUpdateEdgeLabel(outgoing.edgelabel, oStr, level)
                      }
                    }
                  }
                }
              }
            }
            default: {
              // Comparator, Joiner, User, Store: most restrictive (combine multiple assets)
	              for (o : Objective.values) {
                val oStr = o.literal
                if (!outgoing.edgelabel.exists[l | l.objective == oStr]) {
	                var max = 0
                  for (ina : nr.incomingassets) {
	                  max = Math::max(max, levelOf(ina.assetlabel, oStr))
                  }
                  if (max >= 0) {
                    setOrUpdateEdgeLabel(outgoing.edgelabel, oStr, max)
                  }
                }
              }
            }
          }
        }
	        
	        // Setze andere Objectives (most restrictive aus Input-Assets) für alle Contracts
	              for (o : Objective.values) {
	          val oStr = o.literal
	          if (oStr != "Privacy" && !outgoing.edgelabel.exists[l | l.objective == oStr]) {
	                var max = 0
	            for (ina : nr.incomingassets) {
	                  max = Math::max(max, levelOf(ina.assetlabel, oStr))
	              }
	            if (max > 0) {
	              setOrUpdateEdgeLabel(outgoing.edgelabel, oStr, max)
	            }
	          }
	        }
	      }
	
	      
	      // Falls Edge noch keine Labels hat, setze von Assets
	        for (o : Objective.values) {
	        val oStr = o.literal
	        if (!outgoing.edgelabel.exists[l | l.objective == oStr]) {
	          var max = 0
	          for (ga : outgoing.graphassets) {
	            max = Math::max(max, levelOf(ga.assetlabel, oStr))
	          }
	          if (max > 0) {
	            setOrUpdateEdgeLabel(outgoing.edgelabel, oStr, max)
	          }
	        }
	      }
	
	      logEdge(outgoing)
	    }
	].build
 	 	

    public def execute() {

    	println('''Executing transformation on entire eDFD: «edfd2graph.edfds.name»''')
		edfd2graph.graphs.subgraphs.clear
		edfd2graph.edfdGraphTraces.clear
		edfd2graph.graphEndToEndTrace.clear
		
		buildFirstSubgraphRule.fireAllCurrent
		//fire the rules for assets
		eDFDAssetRule.fireAllCurrent
		//fire the rules for nodes and edges
		eDFDNodeElementRule.fireAllCurrent
		eDFDNodeAttackerZoneRule.fireAllCurrent
		eDFDOutFlowRule.fireAllCurrent
		eDFDInFlowRule.fireAllCurrent

		//fire the rules for responsibilities
		eDFDProcessResponsibilitiesRule.fireAllCurrent
		//fire the rules for processes
		eDFDProcessRule.fireAllCurrent
		//attacker observation
		eDFDTBRule.fireAllCurrent
		
		//add asset source and targets (as in end-to-end)
		eDFDModifyAsset.fireAllCurrent

		//execute to create one graph
		eDFDToOneGraphRule.fireAllCurrent
		
		
		//initialize labels
		initLabels.fireAllCurrent
		//propagate on the entire graph
		propagateLabelsInOrder.fireAllCurrent
		
    }
    
    def dispose() {
        if (transformation !== null) {
            transformation.ruleEngine.dispose
        }
        transformation = null
        return
    }
    
    //newly added - updated to work with string objective values
	def int levelOf(EList<? extends SecurityLabel> list, String objStr) {
	  val l = list.findFirst[objective == objStr]
	  l === null ? -1 : l.level  // Return -1 if no label found (-1 means no label exists, valid levels are 0-4)
	}
	
    //newly added 
    def int lvl(Level p) {
	  switch p {
	    case Level::C : 4  // Critical
	    case Level::H : 3  // High
	    case Level::M : 2  // Medium
	    case Level::L : 1  // Low
	    case Level::N : 0  // None
	    default          : 0
	  }
	}
    
	// reduce(C)=H, reduce(H)=M, reduce(M)=L, reduce(L)=N, reduce(N)=N
	def int reducePrivacyLevel(int level) {
		switch (level) {
			case 4: 3 // C -> H
			case 3: 2 // H -> M
			case 2: 1 // M -> L
			case 1: 0 // L -> N
			case 0: 0 // N -> N
			default: level
		}
	}
	
	// elevate(N)=L, elevate(L)=M, elevate(M)=H, elevate(H)=C, elevate(C)=C
	def int elevatePrivacyLevel(int level) {
		switch (level) {
			case 0: 1 // N -> L
			case 1: 2 // L -> M
			case 2: 3 // M -> H
			case 3: 4 // H -> C
			case 4: 4 // C -> C
			default: level
		}
	}
	
	// Generic helper to find ContractBase from NodeResponsibility via traces
	def ContractBase findContract(NodeResponsibility nr) {
		for (trace : edfd2graph.edfdGraphTraces) {
			if (trace.graphElements.contains(nr)) {
				for (edfdElement : trace.edfdElements) {
					if (edfdElement instanceof ContractBase) {
						return edfdElement as ContractBase
					}
				}
			}
		}
		return null
	}
	
    // Set or update a security label for an asset (creates new label if it doesn't exist, updates level if it does)
	// Updated to work with string objective values
	def void setOrUpdateAssetLabel(EList<AssetLabel> list, String objStr, int level) {
	  val l = list.findFirst[objective == objStr]
	  
	  if (level < 0) {  // Level must be at least 0 (N=0 is the minimum valid level, -1 means no label)
    	if (l !== null) list.remove(l)   // Remove label if level is invalid (< 0)
    		return
  	  }
  
	  if (l === null) {
	    val n = GraphFactory.eINSTANCE.createAssetLabel
	    n.objective = objStr
	    n.level     = level
	    list += n
	  } else {
	    l.level = level
	  }
	}
	
	// Set or update a security label for an edge (creates new label if it doesn't exist, updates level if it does)
	// Updated to work with string objective values
	def void setOrUpdateEdgeLabel(EList<EdgeLabel> list, String objStr, int level) {
	  val l = list.findFirst[objective == objStr]
	  
	  // Level must be at least 0 (N=0 is the minimum valid privacy level, -1 means no label)
	  // Only remove labels if level < 0 (invalid)
	  if (level < 0) {
    	if (l !== null) list.remove(l) 
    		return
  	  }
  	  
	  if (l === null) {
	    val n = GraphFactory.eINSTANCE.createEdgeLabel
	    n.objective = objStr
	    n.level     = level
	    list += n
	  } else {
	    l.level = level
	  }
	}
	
	//newly added helper function for printing information during label propagation
	def void logEdge(Edge e) {
    val sb = new StringBuilder

    /* 1️   number + edge-ID */
    sb.append(String.format("%03d  %-20s", e.number, e.ID))

    /* 2️   labels */
    val lbls = e.edgelabel.filter[level >= 0]
                          .sortBy[objective]
                          .map[o | o.objective + "=" + o.level]
    sb.append("  ").append(
        lbls.empty ? "[no-label]" : lbls.join(", ")
    )

    /* 3️   originating operations (Encrypt, Joiner …)             */
    val ops = e.source.responsibility
                   .filter[r | r.outgoingassets.exists[e.graphassets.contains(it)]]
                   .map[
                     val contract = findContract(it)
                     if (contract instanceof ClassificationContract) {
                       "Classification"
                     } else if (contract instanceof DecisionMakingContract) {
                       "DecisionMaking"
                     } else                      if (contract instanceof RecommendationContract) {
                       "Recommendation"
                     } else if (contract instanceof PredictionContract) {
                       "Prediction"
                     } else if (contract instanceof DimensionalityReductionContract) {
                       "DimensionalityReduction"
                     } else if (contract instanceof DataGenerationContract) {
                       "DataGeneration"
                     } else if (contract instanceof ClusteringContract) {
                       "Clustering"
                     } else if (it.contractTypes !== null && !it.contractTypes.empty) {
                       it.contractTypes.join("+")
                     } else {
                       ""
                     }
                   ]
                   .filter[!it.empty]
                   .toSet
    sb.append("  via ").append(
        ops.empty ? "no-rule" : ops.join("+")
    )

    println(sb.toString)
}
}
