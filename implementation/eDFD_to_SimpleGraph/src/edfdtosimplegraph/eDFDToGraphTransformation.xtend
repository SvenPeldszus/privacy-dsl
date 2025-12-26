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
import org.secdfd.model.Priority //new
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
import org.secdfd.model.MLContract
import org.secdfd.model.ClassificationContract
import org.secdfd.model.ClusteringContract
import org.secdfd.model.DecisionMakingContract
import org.secdfd.model.RecommendationContract
import org.secdfd.model.PredictionContract
import org.secdfd.model.DimensionalityReductionContract

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
    //protected BatchTransformationRule<?,?> exampleRule
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
		  upsertLabel_Asset(gA.assetlabel, v.objective, lvl(v.priority))          
		}
		/*val gA = subgraph.createChild(subgraphs_Assets, graphAsset) as GraphAsset => [
	    	var confidential = false
	    	for (Value av : eDFDAssetValues){
	    		//if there is any confidentiality values then the label is secret
	    		if (av.objective.toString == 'Confidentiality'){
	    			confidential = true
	    		}//otherwise its public
	    	}
	    	//set label
	    	if (confidential==true){
	    		// 1 means secret
	    		set(graphAsset_Label, 1)
	    	}else{
	    		// 0 means public
	    		set(graphAsset_Label, 0)
	    	}
    	]*/
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
    	val eDFDResponsibilityActions = if (eDFDResponsibility instanceof SecurityContract) {
    		(eDFDResponsibility as SecurityContract).task
    	} else {
    		newArrayList()
    	}
    	
    	val eDFDMLResponsibilityActions = if (eDFDResponsibility instanceof MLContract) {
    		(eDFDResponsibility as MLContract).MLTask
    	} else {
    		newArrayList()
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
    	val graphResponsibility = node_of_process.createChild(node_Responsibility, nodeResponsibility) as Identifiable => [
    		//set incoming assets
    		addTo(nodeResponsibility_Incomingassets, incomingassets_of_process)
    		//set outgoing assets
			addTo(nodeResponsibility_Outgoingassets, outgoingassets_of_process)
    		//set operations for SecurityContract
    		if (eDFDResponsibility instanceof SecurityContract && !eDFDResponsibilityActions.empty) {
    			addTo(nodeResponsibility_Task, eDFDResponsibilityActions)
    		}
    		//set mlTasks for MLContract
    		if (eDFDResponsibility instanceof MLContract && !eDFDMLResponsibilityActions.empty) {
    			addTo(nodeResponsibility_MlTask, eDFDMLResponsibilityActions)
    		}
    	]
    	val actionsString = if (eDFDResponsibility instanceof SecurityContract) {
    		eDFDResponsibilityActions.toString
    	} else if (eDFDResponsibility instanceof MLContract) {
    		eDFDMLResponsibilityActions.toString
    	} else if (eDFDResponsibility instanceof ClassificationContract) {
    		"[Classification]"
    	} else if (eDFDResponsibility instanceof ClusteringContract) {
    		"[Clustering]"
    	} else if (eDFDResponsibility instanceof DecisionMakingContract) {
    		"[DecisionMaking]"
    	} else if (eDFDResponsibility instanceof RecommendationContract) {
    		"[Recommendation]"
    	} else if (eDFDResponsibility instanceof PredictionContract) {
    		"[Prediction]"
    	} else if (eDFDResponsibility instanceof DimensionalityReductionContract) {
    		"[DimensionalityReduction]"
    	} else {
    		''
    	}
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
    	val eDFDProcessResponsibilities = eDFDProcess.responsibility
    	    	
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
 	
 	
    /*val initLabels = createRule.precondition(edfdtosimplegraph.EEandDSElement.Matcher.querySpecification).action[
    	print('''Inferring labels for: «it.el.name»''')
    	
    	//find subgraph in target model
      	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
       	// get the node of EE or DS
		var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.el as NamedEntity).filter(Node).head
    	for (Node n : subgraph.nodes){
    		if (n.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = n
    		}
    	}
  	
    	// set the nodes of the outgoing flows only
    	for (Edge e : locate_correct_graph_node.outedges){
    	// for each set label according to the most restrictive asset on the flow
    		e.visited = true
    		var setlabel = -1 // not set
    		for (GraphAsset gs: e.graphassets){
    			if (gs.label > setlabel)
    				setlabel = gs.label
    		}
    		e.edgeLabel = setlabel
    		print(''' to «e.edgeLabel»''')
    		println()
    	}

    ].build*/
    
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
	        val max = e.graphassets.map [ levelOf(assetlabel, o) ].max
	        upsertLabel_Edge(e.edgelabel, o, max ?: 0)
	      }
	      println('''  → edge «e.ID» labelled
	                   ${e.edgelabel.map[objective.literal + '=' + level].join(', ')}''')
	    }
	    
	  ].build
    
    /*def Boolean recursiveDFS (Node node){ 
    	//exit when all nodes have been visited
		if (node.visited == false){
			//mark node
			node.visited = true
			val neighbor_nodes  = newArrayList()
			for (Edge outgoing : node.outedges){
				outgoing.visited = true
				//println(outgoing.ID)
				for (GraphAsset ga : outgoing.graphassets){
				//for each asset, collect what kind of responsibility they are part of in the node
					var r = newArrayList()
					for (NodeResponsibility noder : node.responsibility){
						if (noder.outgoingassets.contains(ga)) r.add(noder)
					}
					//go through these responsibilities
					for (NodeResponsibility nr : r){
						switch(nr.task.toString){
							case "[EncryptOrHash]":{
								//set low output
								outgoing.edgeLabel = 0
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for encrypting asset:«ga.ID»''')
								println()
							}
							case "[Decrypt]": {
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								//set high output if the most sensitive asset being decrypted was high before
								if (most_restrictive ==	1){
									outgoing.edgeLabel = 1
								}else{
									//if sth low is decrypted it remains low
									outgoing.edgeLabel = 0
								}
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for decrypting asset:«ga.ID»''')
								println()
							}
							//Comparator, Joiner, User => the same propagation
							case "[Comparator]":{
								//join labels (most restrictive input to node responsibility)
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								outgoing.edgeLabel = most_restrictive
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for comparing asset:«ga.ID»''')
								println()
							}
							case "[Joiner]":{
								//join labels (most restrictive input to node responsibility
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								outgoing.edgeLabel = most_restrictive
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for joining asset:«ga.ID»''')
								println()
							}
							//splitter should be included (substring), to remain conservative
							case "[Splitter]":{
								//join labels (most restrictive input to node responsibility)
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								outgoing.edgeLabel = most_restrictive
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for spliting asset:«ga.ID»''')
								println()
							}
							case "[User]":{
								//join labels (most restrictive input to node responsibility
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								outgoing.edgeLabel = most_restrictive
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for using asset:«ga.ID»''')
								println()
							}	
							//Copier and Forward => the same								
							case "[Copier]":{
								//copy labels (add semantic constraint - all assets in one copy responsibility must have the same label)
								outgoing.edgeLabel = nr.incomingassets.get(0).label			
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for copying asset:«ga.ID»''')
								println()		
							}
							case "[Forward]":{
								//copy labels (add semantic constraint - all assets in one forward responsibility must have the same label)
								outgoing.edgeLabel = nr.incomingassets.get(0).label	
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for forwarding asset:«ga.ID»''')
								println()
							} 
							//case "[Discarder]":
							//case "[Verifier]":					
							//case "[Authenticator]":
							//case "[Authoriser]":
							//case "[Store]":
							default :{
								print(nr.task.toString)
								print("Does not effect confidentiality label propagation.")
								println()		
							}
						}
					}
				}
				//if the outgoing flow was not labeled by now 
					// -> the default action is to copy the label of the incoming flow that contains the asset(s) on the outgoing flows
				if (outgoing.edgeLabel == -1){
					//var setlabel = -1 // not set
					var edgecontainingassets = node.inedges.get(0)
					for (Edge e : node.inedges){
						if (e.graphassets.containsAll(outgoing.graphassets))
							edgecontainingassets = e
					}
					
		    		for (GraphAsset gs: outgoing.graphassets){
		    			if (gs.label > setlabel)
		    				setlabel = gs.label	
		    		}
		    		outgoing.edgeLabel = edgecontainingassets.edgeLabel
					print('''Label inferred for edge «outgoing.ID»''')
					print(''' to «outgoing.edgeLabel»''')
					print(''' since no label propagation rules apply to this edge.''')
					println()
				}
    			//collect target nodes				
    			neighbor_nodes.addAll(outgoing.target)
			}

    		
    		for (Node neighbor : neighbor_nodes){
    			//recursive call for other edges of the same node
    			println('''...Next target: «neighbor.name»''')
    		    recursiveDFS(neighbor)	
    		}
    		return true
		}
		return true 
    }
    
    val propagateLabelsDS = createRule.precondition(edfdtosimplegraph.DSElements.Matcher.querySpecification).action[
    	//TODO new pattern for finding EE/DS with at least one outgoing flow in VIATRA
    	//- currently will only work correctly for 1 EE(or DS)
    	if (it.ds.outflows.length > 0){	
	    	//find subgraph in target model
	      	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
	       	// get the node of EE
			var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.ds as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}	    	
	    	println()
	    	println('''Starting propagation at: «it.ds.name»''')  
	    	recursiveDFS(locate_correct_graph_node) 
    	}
    ].build 
    
    val propagateLabelsEE = createRule.precondition(edfdtosimplegraph.EEElements.Matcher.querySpecification).action[
    	//TODO new pattern for finding EE/DS with at least one outgoing flow in VIATRA
    	//- currently will only work correctly for 1 EE(or DS)
    	if (it.ee.outflows.length > 0){	
	    	//find subgraph in target model
	      	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
	       	// get the node of EE
			var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.ee as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}	    	
	    	println()
	    	println('''Starting propagation at: «it.ee.name»''')  
	    	recursiveDFS(locate_correct_graph_node) 
    	}
    ].build */
    
    /*val propagateLabelsInOrder = createRule.precondition(edfdtosimplegraph.EDFD.Matcher.querySpecification).action[
    	val all_elements = it.edfd.elements
			
    	//print(all_elements)
    	val all_flows = newArrayList()
    	for (Element e : all_elements){
			all_flows.addAll(e.outflows)
    	}
		Collections.sort(all_flows) [ a, b |
		  a.number - b.number
		]
    	for (Element f : all_flows){
    		var outgoing = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, f as NamedEntity).filter(Edge).head
			var node = outgoing.source
			outgoing.visited = true
			for (GraphAsset ga : outgoing.graphassets){
			//for each asset, collect what kind of responsibility they are part of in the node
				var r = newArrayList()
				for (NodeResponsibility noder : node.responsibility){
					if (noder.outgoingassets.contains(ga)) r.add(noder)
				}
				//go through responsibilities
				for (NodeResponsibility nr : r){
					switch(nr.task.toString){
						case "[EncryptOrHash]":{
							//set low output
							outgoing.edgeLabel = 0
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for ecrypting asset:«ga.ID»''')
							println()
						}
						case "[Decrypt]": {
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							
							
							//set high output if the most sensitive asset being decrypted was high before
							if (most_restrictive ==	1){
								outgoing.edgeLabel = 1
							}else{
								//if sth low is decrypted it remains low
								outgoing.edgeLabel = 0
							} 
							
							outgoing.edgeLabel = 1
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for decrypting asset:«ga.ID»''')
							println()
						}
						//Comparator, Joiner, User => the same propagation
						case "[Comparator]":{
							//join labels (most restrictive input to node responsibility)
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for comparing asset:«ga.ID»''')
							println()
						}
						case "[Joiner]":{
							//join labels (most restrictive input to node responsibility
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for joining asset:«ga.ID»''')
							println()
						}
						//splitter should be included (substring), to remain conservative
						case "[Splitter]":{
							//join labels (most restrictive input to node responsibility
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for spliting asset:«ga.ID»''')
							println()
						}
						case "[User]":{
							//join labels (most restrictive input to node responsibility)
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for using asset:«ga.ID»''')
							println()
						}	
						//Copier and Forward => the same								
						case "[Copier]":{
							//copy labels (add semantic constraint - all assets in one copy responsibility must have the same label)
							outgoing.edgeLabel = nr.incomingassets.get(0).label			
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for copying asset:«ga.ID»''')
							println()		
						}
						case "[Forward]":{
							//copy labels (add semantic constraint - all assets in one forward responsibility must have the same label)
							outgoing.edgeLabel = nr.incomingassets.get(0).label	
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for forwarding asset:«ga.ID»''')
							println()
						}
						case "[Store]":{
							//most restrictive stored asset
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
							print(''' is «outgoing.edgeLabel»''')
							print(''' for using asset:«ga.ID»''')
							println()
						}
						//case "[Discarder]":
						//case "[Verifier]":					
						//case "[Authenticator]":
						//case "[Authoriser]":
						default :{
							print(nr.operation.toString)
							print("Does not effect confidentiality label propagation.")
							println()		
						}
					}
				}
				
				//if the flow has no connected responsibility, inferr the label from the most restrictive asset
				if (outgoing.edgeLabel == -1){
					var most_restrictive = -1
						for (GraphAsset i : outgoing.graphassets){
							if	(i.label > most_restrictive) most_restrictive = i.label
						}
					outgoing.edgeLabel = most_restrictive
					print('''Label inferred for edge «outgoing.ID»''')
					print(''' to «outgoing.edgeLabel»''')
					print(''' since no label propagation rules apply to this edge.''')
					println()
				}
				
				print(f.number)
				print(''': ''')
				print(outgoing.edgeLabel)
				println()
			}
    	}
    	
    	
    ].build*/
 
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

	      // FIRST: Check for contracts that set Privacy labels (generic approach)
	      // This must run BEFORE the asset loop to ensure Privacy label is always set
	      // Find first contract that sets Privacy and apply its label propagation rule
	      var privacyLabelContractFound = false
	      var privacyLabelLevel = 0
	      var privacyLabelContractName = ""
	      
	      for (NodeResponsibility nr : node.responsibility) {
	        val contract = findContract(nr)
	        
	        // Handle ClassificationContract: uses PClass attribute
	        if (contract instanceof ClassificationContract && !privacyLabelContractFound) {
	          privacyLabelContractFound = true
	          privacyLabelContractName = "ClassificationContract"
	          val pClass = (contract as ClassificationContract).getPClass() ?: Priority.L
	          privacyLabelLevel = lvl(pClass)
	          // lbl_classification(p_1, ..., p_n, p_class) = p_class for Privacy
	          upsertLabel_Edge(outgoing.edgelabel, Objective.PRIVACY, privacyLabelLevel)
	          
	          println('''[DEBUG] Label propagation of edge «outgoing.ID», «outgoing.number»''')
	          println('''[DEBUG]   Found «privacyLabelContractName», setting Privacy=«privacyLabelLevel» (from pClass=«pClass.getName()»)''')
	          println('''[DEBUG]   Edge labels after setting Privacy: «outgoing.edgelabel.map[objective.literal + '=' + level].join(', ')»''')
	        }
	        
	        // Handle DecisionMakingContract: uses PAction attribute
	        if (contract instanceof DecisionMakingContract && !privacyLabelContractFound) {
	          privacyLabelContractFound = true
	          privacyLabelContractName = "DecisionMakingContract"
	          val pAction = (contract as DecisionMakingContract).getPAction() ?: Priority.L
	          privacyLabelLevel = lvl(pAction)
	          // lbl_decision(p_1, ..., p_n, p_action) = p_action for Privacy
	          upsertLabel_Edge(outgoing.edgelabel, Objective.PRIVACY, privacyLabelLevel)
	          
	          println('''[DEBUG] Label propagation of edge «outgoing.ID», «outgoing.number»''')
	          println('''[DEBUG]   Found «privacyLabelContractName», setting Privacy=«privacyLabelLevel» (from pAction=«pAction.getName()»)''')
	          println('''[DEBUG]   Edge labels after setting Privacy: «outgoing.edgelabel.map[objective.literal + '=' + level].join(', ')»''')
	        }
	        
	        // Handle RecommendationContract: lbl_recommendation(p_1, ..., p_n, s) = L, if s = true; N, otherwise
	        if (contract instanceof RecommendationContract && !privacyLabelContractFound) {
	          privacyLabelContractFound = true
	          privacyLabelContractName = "RecommendationContract"
	          val s = (contract as RecommendationContract).isS()
	          // lbl_recommendation(p_1, ..., p_n, s) = L, if s = true; N, otherwise
	          privacyLabelLevel = if (s) 1 else 0 // L=1 if person-specific, N=0 otherwise
	          upsertLabel_Edge(outgoing.edgelabel, Objective.PRIVACY, privacyLabelLevel)
	          
	          println('''[DEBUG] Label propagation of edge «outgoing.ID», «outgoing.number»''')
	          println('''[DEBUG]   Found «privacyLabelContractName», setting Privacy=«privacyLabelLevel» (person-specific=«s»)''')
	          println('''[DEBUG]   Edge labels after setting Privacy: «outgoing.edgelabel.map[objective.literal + '=' + level].join(', ')»''')
	        }
	        
	        // Handle ClusteringContract: lbl_clustering(p_1, ..., p_n) = N, if p_1 ⊔ p_2 ⊔ ... ⊔ p_n = N; L, otherwise
	        if (contract instanceof ClusteringContract && !privacyLabelContractFound) {
	          privacyLabelContractFound = true
	          privacyLabelContractName = "ClusteringContract"
	          
	          // Check all incoming assets' Privacy labels
	          // All are N if no asset has a Privacy level != 0
	          val allPrivacyLabelsAreN = !nr.incomingassets.exists[ina |
	            val inaPrivacyLevel = levelOf(ina.assetlabel, Objective.PRIVACY)
	            inaPrivacyLevel != 0 // 0 = N, anything else is not N
	          ]
	          
	          privacyLabelLevel = if (allPrivacyLabelsAreN) 0 else 1 // N=0, L=1
	          upsertLabel_Edge(outgoing.edgelabel, Objective.PRIVACY, privacyLabelLevel)
	          
	          println('''[DEBUG] Label propagation of edge «outgoing.ID», «outgoing.number»''')
	          println('''[DEBUG]   Found «privacyLabelContractName», setting Privacy=«privacyLabelLevel» (all inputs N=«allPrivacyLabelsAreN»)''')
	          println('''[DEBUG]   Edge labels after setting Privacy: «outgoing.edgelabel.map[objective.literal + '=' + level].join(', ')»''')
	        }
	      }

	      val hasPrivacyLabelContract = privacyLabelContractFound
	      
	      for (GraphAsset ga : outgoing.graphassets) {
			//for each asset, collect what kind of responsibility they are part of in the node	        
			val r = newArrayList
	        for (NodeResponsibility nrCollect : node.responsibility) {
	          if (nrCollect.outgoingassets.contains(ga)) r.add(nrCollect)
	        }
			//go through responsibilities
	        for (NodeResponsibility nrProcess : r) {
	          // Check if this contract sets Privacy labels (ClassificationContract, ClusteringContract, PredictionContract, or DimensionalityReductionContract)
	          val contractProcess = findContract(nrProcess)
	          val hasPrivacyLabel = getPrivacyLabelFromContract(contractProcess) !== null || contractProcess instanceof ClusteringContract || contractProcess instanceof PredictionContract || contractProcess instanceof DimensionalityReductionContract
	          
	          if (hasPrivacyLabel) {
	            // Handle PredictionContract: lbl_prediction(p_1, ..., p_n, s) = N, if p_max = N; p_max, if p_max ≥ L ∧ s = true; L, if p_max ≥ L ∧ s = false
	            if (contractProcess instanceof PredictionContract) {
	              val s = (contractProcess as PredictionContract).isS()
	              // Calculate p_max = p_1 ⊔ p_2 ⊔ ... ⊔ p_n (most restrictive)
	              var pMax = 0
	              for (ina : nrProcess.incomingassets) {
	                val inaPrivacyLevel = levelOf(ina.assetlabel, Objective.PRIVACY)
	                pMax = Math::max(pMax, inaPrivacyLevel)
	              }
	              
	              // lbl_prediction(p_1, ..., p_n, s) = N, if p_max = N; p_max, if p_max ≥ L ∧ s = true; L, if p_max ≥ L ∧ s = false
	              val privacyLevel = if (pMax == 0) {
	                0 // N, if p_max = N
	              } else if (s) {
	                pMax // p_max, if p_max ≥ L ∧ s = true
	              } else {
	                1 // L, if p_max ≥ L ∧ s = false
	              }
	              
	              upsertLabel_Edge(outgoing.edgelabel, Objective.PRIVACY, privacyLevel)
	              
	              println('''[DEBUG] Label propagation of edge «outgoing.ID», «outgoing.number»''')
	              println('''[DEBUG]   Found PredictionContract, p_max=«pMax», s=«s», setting Privacy=«privacyLevel»''')
	              
	              // Set other Objectives: Standard-Logik (most restrictive aus Input-Labels)
	              for (o : Objective.values) {
	                if (o != Objective.PRIVACY) {
	                  var max = 0
	                  for (ina : nrProcess.incomingassets)
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            } else if (contractProcess instanceof DimensionalityReductionContract) {
	              val k = (contractProcess as DimensionalityReductionContract).getK()
	              // Calculate p_max = p_1 ⊔ p_2 ⊔ ... ⊔ p_n (most restrictive)
	              var pMax = 0
	              for (ina : nrProcess.incomingassets) {
	                val inaPrivacyLevel = levelOf(ina.assetlabel, Objective.PRIVACY)
	                pMax = Math::max(pMax, inaPrivacyLevel)
	              }
	              
	              // lbl_DR(p_1, ..., p_n, k) = reduce^k(p_max)
	              // reduce(C)=H, reduce(H)=M, reduce(M)=L, reduce(L)=N, reduce(N)=N
	              var privacyLevel = pMax
	              for (var i = 0; i < k; i++) {
	                privacyLevel = reducePrivacyLevel(privacyLevel)
	              }
	              
	              upsertLabel_Edge(outgoing.edgelabel, Objective.PRIVACY, privacyLevel)
	              
	              println('''[DEBUG] Label propagation of edge «outgoing.ID», «outgoing.number»''')
	              println('''[DEBUG]   Found DimensionalityReductionContract, p_max=«pMax», k=«k», setting Privacy=«privacyLevel»''')
	              
	              // Set other Objectives: Standard-Logik (most restrictive aus Input-Labels)
	              for (o : Objective.values) {
	                if (o != Objective.PRIVACY) {
	                  var max = 0
	                  for (ina : nrProcess.incomingassets)
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            } else {
	              // ClassificationContract, ClusteringContract, or RecommendationContract: Privacy already handled above, set other Objectives
	              // Für andere Objectives: Standard-Logik (most restrictive aus Input-Labels)
	              for (o : Objective.values) {
	                if (o != Objective.PRIVACY) {
	                  var max = 0
	                  for (ina : nrProcess.incomingassets)
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            }
	          } else {
	            // Standard SecurityContract/MLContract handling
	            // IMPORTANT: Skip Privacy if ClassificationContract exists (already set above)
	            switch nrProcess.task.toString {
	            case "[EncryptOrHash]" : {
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  upsertLabel_Edge(outgoing.edgelabel, o, 0)
	                }
	              }
	            }
	            case "[Decrypt]" : {
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  var max = 0
	                  for (ina : nrProcess.incomingassets)
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            }
	            case "[Comparator]" : {                
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  var max = 0                        
	                  for (ina : nrProcess.incomingassets)      
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            }
	            case "[Joiner]"   : {
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  var max = 0
	                  for (ina : nrProcess.incomingassets)
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            }
	            case "[User]"     : {
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  var max = 0
	                  for (ina : nrProcess.incomingassets)
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            }
	            case "[Splitter]" : {
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  var max = 0
	                  for (ina : nrProcess.incomingassets)
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            }
	            case "[Copier]" : {
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  upsertLabel_Edge(outgoing.edgelabel, o, levelOf(nrProcess.incomingassets.get(0).assetlabel, o))
	                }
	              }
	            }
	            case "[Forward]" : {
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  upsertLabel_Edge(outgoing.edgelabel, o, levelOf(nrProcess.incomingassets.get(0).assetlabel, o))
	                }
	              }
	            }
	            case "[Store]" : {                      // most-restrictive input
	              for (o : Objective.values) {
	                if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	                  // Skip Privacy - already set by contract
	                } else {
	                  var max = 0
	                  for (ina : nrProcess.incomingassets)
	                    max = Math::max(max, levelOf(ina.assetlabel, o))
	                  upsertLabel_Edge(outgoing.edgelabel, o, max)
	                }
	              }
	            }
	
	            default : { /* no confidentiality effect */ }
	          }
	          }
	        }
	      }
	
	      
	      //edge still unlabeled?  fall back to asset labels
	      // But preserve Privacy label if it was set by any contract
	      // hasPrivacyLabelContract was already set above (line 948)
	      
	      val hasPrivacyLabel = !outgoing.edgelabel.filter[l | l.objective == Objective.PRIVACY].empty
	      
	      println('''[DEBUG] After asset loop - hasPrivacyLabelContract=«hasPrivacyLabelContract», hasPrivacyLabel=«hasPrivacyLabel»''')
	      println('''[DEBUG]   Current edge labels: «outgoing.edgelabel.map[objective.literal + '=' + level].join(', ')»''')
	      
	      // If ClassificationContract exists, Privacy label was already set above
	      // and should NOT be overwritten by fallback logic
	      
	      if (outgoing.edgelabel.empty) {
	        // Edge has no labels at all - set all from assets
	        // But skip Privacy if it was set by any contract
	        println('''[DEBUG] Edge is empty, setting labels from assets (skipping Privacy if contract exists)''')
	        for (o : Objective.values) {
	          if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	            // Privacy already set by contract above, skip
	            println('''[DEBUG]   Skipping Privacy (set by contract)''')
	          } else {
	            var max = 0
	            for (gs : outgoing.graphassets)
	              max = Math::max(max, levelOf(gs.assetlabel, o))
	            if (max > 0)
	              upsertLabel_Edge(outgoing.edgelabel, o, max)
	          }
	        }
	      } else {
	        // Edge has some labels - add missing ones from assets
	        // But NEVER overwrite Privacy if it was set by any contract
	        println('''[DEBUG] Edge has labels, adding missing ones from assets''')
	        for (o : Objective.values) {
	          val hasLabel = !outgoing.edgelabel.filter[l | l.objective == o].empty
	          if (!hasLabel) {
	            // Label is missing - add it from assets
	            if (o == Objective.PRIVACY && hasPrivacyLabelContract) {
	              // Privacy was set by contract above, don't overwrite
	              println('''[DEBUG]   Privacy missing but contract exists - should have been set above!''')
	            } else {
	              var max = 0
	              for (gs : outgoing.graphassets)
	                max = Math::max(max, levelOf(gs.assetlabel, o))
	              if (max > 0)
	                upsertLabel_Edge(outgoing.edgelabel, o, max)
	            }
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
		
		//propagateLabelsDS.fireAllCurrent 
		propagateLabelsInOrder.fireAllCurrent
		
    }
    
    def dispose() {
        if (transformation !== null) {
            transformation.ruleEngine.dispose
        }
        transformation = null
        return
    }
    
    //newly added
    /** Return the label-level for OBJ or 0 if the label is missing           */
	def int levelOf(EList<? extends SecurityLabel> list, Objective obj) {
	  val l = list.findFirst[objective == obj]
	  l === null ? 0 : l.level
	}
	
    //newly added 
    def int lvl(Priority p) {
	  switch p {
	    case Priority::C : 4  // Critical
	    case Priority::H : 3  // High
	    case Priority::M : 2  // Medium
	    case Priority::L : 1  // Low
	    case Priority::N : 0  // None
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
	
	// Helper to find ClassificationContract from NodeResponsibility via traces
	def ClassificationContract findClassificationContract(NodeResponsibility nr) {
		for (trace : edfd2graph.edfdGraphTraces) {
			if (trace.graphElements.contains(nr)) {
				for (edfdElement : trace.edfdElements) {
					if (edfdElement instanceof ClassificationContract) {
						return edfdElement as ClassificationContract
					}
				}
			}
		}
		return null
	}
	
	// Helper to find ClusteringContract from NodeResponsibility via traces
	def ClusteringContract findClusteringContract(NodeResponsibility nr) {
		for (trace : edfd2graph.edfdGraphTraces) {
			if (trace.graphElements.contains(nr)) {
				for (edfdElement : trace.edfdElements) {
					if (edfdElement instanceof ClusteringContract) {
						return edfdElement as ClusteringContract
					}
				}
			}
		}
		return null
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
	
	// Generic helper to get Privacy label level from a contract
	// Returns the privacy level (as int) if the contract sets one, null otherwise
	// Note: ClusteringContract returns null here because it needs input assets to calculate the label
	def Integer getPrivacyLabelFromContract(ContractBase contract) {
		if (contract === null) {
			return null
		}
		
		// ClassificationContract: uses PClass attribute
		if (contract instanceof ClassificationContract) {
			val pClass = (contract as ClassificationContract).getPClass()
			return if (pClass !== null) lvl(pClass) else lvl(Priority.L) // Default to L
		}
		
		// DecisionMakingContract: uses PAction attribute
		if (contract instanceof DecisionMakingContract) {
			val pAction = (contract as DecisionMakingContract).getPAction()
			return if (pAction !== null) lvl(pAction) else lvl(Priority.L) // Default to L
		}
		
		// RecommendationContract: uses S (Boolean) attribute
		// lbl_recommendation(p_1, ..., p_n, s) = L, if s = true; N, otherwise
		if (contract instanceof RecommendationContract) {
			val s = (contract as RecommendationContract).isS()
			return if (s) 1 else 0 // L=1 if person-specific, N=0 otherwise
		}
		
		// ClusteringContract: returns null because it needs input assets to calculate
		// The actual calculation happens in the asset loop based on input assets
		// This ensures it's not marked as "already handled" in the first loop
		if (contract instanceof ClusteringContract) {
			return null // Will be handled in asset loop
		}
		
		// Other contract types don't set Privacy labels
		return null
	}
	
	// Helper to check if a contract is a ClusteringContract (needs special handling)
	def boolean isClusteringContract(ContractBase contract) {
		return contract instanceof ClusteringContract
	}
	
	// Generic helper to check if a NodeResponsibility has a contract that sets Privacy labels
	def boolean hasPrivacyLabelContract(NodeResponsibility nr) {
		val contract = findContract(nr)
		return getPrivacyLabelFromContract(contract) !== null
	}
    
    //newly added
	def void upsertLabel_Asset(EList<AssetLabel> list, Objective o, int level) {
	  val l = list.findFirst[objective == o]
	  
	  if (level <= 0) {
    	if (l !== null) list.remove(l)   // ggf. altes 0-Label löschen
    		return
  	  }
  
	  if (l === null) {
	    val n = GraphFactory.eINSTANCE.createAssetLabel
	    n.objective = o
	    n.level     = level
	    list += n
	  } else {
	    l.level = level
	  }
	}
	def void upsertLabel_Edge(EList<EdgeLabel> list, Objective o, int level) {
	  val l = list.findFirst[objective == o]
	  
	  // Allow level 0 for Privacy labels (Priority::N = 0 is a valid privacy level)
	  // Only remove labels if level < 0 (invalid)
	  if (level < 0) {
    	if (l !== null) list.remove(l)   // ggf. altes ungültiges Label löschen
    		return
  	  }
  	  
	  if (l === null) {
	    val n = GraphFactory.eINSTANCE.createEdgeLabel
	    n.objective = o
	    n.level     = level
	    list += n
	  } else {
	    l.level = level
	  }
	}
	
	//newly added helper function for printing information during label propagation
	def void logEdge(Edge e) {
    val sb = new StringBuilder

    /* 1️⃣   number + edge-ID */
    sb.append(String.format("%03d  %-20s", e.number, e.ID))

    /* 2️⃣   labels */
    val lbls = e.edgelabel.filter[level > 0]
                          .sortBy[objective.literal]
                          .map[o | o.objective.literal + "=" + o.level]
    sb.append("  ").append(
        lbls.empty ? "[no-label]" : lbls.join(", ")
    )

    /* 3️⃣   originating operations (Encrypt, Joiner …)             */
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
                     } else if (contract instanceof ClusteringContract) {
                       "Clustering"
                     } else if (it.task !== null && !it.task.empty) {
                       it.task.toString.replace("[","").replace("]","")
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
