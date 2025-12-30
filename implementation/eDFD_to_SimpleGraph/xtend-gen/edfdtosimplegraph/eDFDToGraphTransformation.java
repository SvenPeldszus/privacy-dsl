package edfdtosimplegraph;

import com.google.common.collect.Iterables;
import edfdtosimplegraph.Assets;
import edfdtosimplegraph.Boundaries;
import edfdtosimplegraph.BoundariesAssets;
import edfdtosimplegraph.EDFD;
import edfdtosimplegraph.EDFDAsset;
import edfdtosimplegraph.EEandDSElement;
import edfdtosimplegraph.NodeElements;
import edfdtosimplegraph.ProcessElements;
import edfdtosimplegraph.Responsibilities;
import graph.AssetLabel;
import graph.Edge;
import graph.EdgeLabel;
import graph.GraphAsset;
import graph.GraphFactory;
import graph.GraphPackage;
import graph.Identifiable;
import graph.Node;
import graph.NodeResponsibility;
import graph.SecurityLabel;
import graph.Subgraphs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.secdfd.model.Asset;
import org.secdfd.model.AttackerProfile;
import org.secdfd.model.ClassificationContract;
import org.secdfd.model.ClusteringContract;
import org.secdfd.model.ContractBase;
import org.secdfd.model.ContractType;
import org.secdfd.model.DataGenerationContract;
import org.secdfd.model.DataGenerationDirection;
import org.secdfd.model.DecisionMakingContract;
import org.secdfd.model.DimensionalityReductionContract;
import org.secdfd.model.Element;
import org.secdfd.model.Flow;
import org.secdfd.model.NamedEntity;
import org.secdfd.model.Objective;
import org.secdfd.model.PredictionContract;
import org.secdfd.model.Priority;
import org.secdfd.model.RecommendationContract;
import org.secdfd.model.SecurityContract;
import org.secdfd.model.TrustZone;
import org.secdfd.model.Value;
import traceability.EDFDGraphTrace;
import traceability.EDFDToGraph;
import traceability.TraceabilityPackage;

@SuppressWarnings("all")
public class eDFDToGraphTransformation {
  /**
   * VIATRA Query Pattern group
   */
  @Extension
  private final EDFDXformM2M edfdxformm2m = EDFDXformM2M.instance();

  /**
   * EMF metamodels
   */
  @Extension
  private final TraceabilityPackage trPackage = TraceabilityPackage.eINSTANCE;

  @Extension
  private final GraphPackage graphPackage = GraphPackage.eINSTANCE;

  /**
   * Transformation-related extensions
   */
  @Extension
  private BatchTransformation transformation;

  @Extension
  private BatchTransformationStatements statements;

  /**
   * Transformation rule-related extensions
   */
  @Extension
  private BatchTransformationRuleFactory _batchTransformationRuleFactory = new BatchTransformationRuleFactory();

  @Extension
  private IModelManipulations manipulation;

  protected ViatraQueryEngine engine;

  protected Resource resource;

  private EDFDToGraph edfd2graph;

  public eDFDToGraphTransformation(final EDFDToGraph edfd2graph, final ViatraQueryEngine engine) {
    this.edfd2graph = edfd2graph;
    this.resource = edfd2graph.getGraphs().eResource();
    this.engine = engine;
    this.edfdxformm2m.prepare(engine);
    this.createTransformation();
  }

  private BatchTransformationStatements createTransformation() {
    BatchTransformationStatements _xblockexpression = null;
    {
      SimpleModelManipulations _simpleModelManipulations = new SimpleModelManipulations(this.engine);
      this.manipulation = _simpleModelManipulations;
      this.transformation = BatchTransformation.forEngine(this.engine).build();
      _xblockexpression = this.statements = this.transformation.getTransformationStatements();
    }
    return _xblockexpression;
  }

  /**
   * user defined transformation rules
   */
  private final BatchTransformationRule<EDFD.Match, EDFD.Matcher> buildFirstSubgraphRule = this._batchTransformationRuleFactory.<EDFD.Match, EDFD.Matcher>createRule().precondition(EDFD.Matcher.querySpecification()).action(
    ((Consumer<EDFD.Match>) (EDFD.Match it) -> {
      try {
        final org.secdfd.model.EDFD eDFD = it.getEdfd();
        EObject _createChild = this.manipulation.createChild(this.edfd2graph.getGraphs(), this.graphPackage.getGraph_Subgraphs(), this.graphPackage.getSubgraphs());
        final Procedure1<EObject> _function = (EObject it_1) -> {
        };
        final EObject graph = ObjectExtensions.<EObject>operator_doubleArrow(_createChild, _function);
        EObject _createChild_1 = this.manipulation.createChild(this.edfd2graph, this.trPackage.getEDFDToGraph_EdfdGraphTraces(), this.trPackage.getEDFDGraphTrace());
        final Procedure1<EObject> _function_1 = (EObject it_1) -> {
          try {
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_EdfdElements(), eDFD);
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_GraphElements(), graph);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        ObjectExtensions.<EObject>operator_doubleArrow(_createChild_1, _function_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    })).build();

  private final BatchTransformationRule<NodeElements.Match, NodeElements.Matcher> eDFDNodeElementRule = this._batchTransformationRuleFactory.<NodeElements.Match, NodeElements.Matcher>createRule().precondition(NodeElements.Matcher.querySpecification()).action(
    ((Consumer<NodeElements.Match>) (NodeElements.Match it) -> {
      try {
        final Element eDFDElement = it.getEl();
        final String eDFDElementName = eDFDElement.getName();
        final EObject eDFD = eDFDElement.eContainer();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Mapping eDFD Node element with Graph Nodes: ");
        _builder.append(eDFDElementName);
        InputOutput.<String>println(_builder.toString());
        final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) eDFD)), Subgraphs.class));
        EObject _createChild = this.manipulation.createChild(subgraph, this.graphPackage.getSubgraphs_Nodes(), this.graphPackage.getNode());
        final Procedure1<EObject> _function = (EObject it_1) -> {
          try {
            this.manipulation.set(it_1, this.graphPackage.getNode_Name(), eDFDElementName);
            this.manipulation.set(it_1, this.graphPackage.getNode_AttackerObservation(), Integer.valueOf((-1)));
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        final EObject graphNode = ObjectExtensions.<EObject>operator_doubleArrow(_createChild, _function);
        EObject _createChild_1 = this.manipulation.createChild(this.edfd2graph, this.trPackage.getEDFDToGraph_EdfdGraphTraces(), this.trPackage.getEDFDGraphTrace());
        final Procedure1<EObject> _function_1 = (EObject it_1) -> {
          try {
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_EdfdElements(), eDFDElement);
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_GraphElements(), graphNode);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        ObjectExtensions.<EObject>operator_doubleArrow(_createChild_1, _function_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    })).build();

  private final BatchTransformationRule<Boundaries.Match, Boundaries.Matcher> eDFDNodeAttackerZoneRule = this._batchTransformationRuleFactory.<Boundaries.Match, Boundaries.Matcher>createRule().precondition(Boundaries.Matcher.querySpecification()).action(
    ((Consumer<Boundaries.Match>) (Boundaries.Match it) -> {
      final TrustZone eDFDBoundary = it.getTb();
      org.secdfd.model.EDFD _edfd = it.getEdfd();
      final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) _edfd)), Subgraphs.class));
      EList<Element> _elements = eDFDBoundary.getElements();
      for (final Element el : _elements) {
        {
          Node locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) el)), Node.class));
          EList<Node> _nodes = subgraph.getNodes();
          for (final Node n : _nodes) {
            String _name = n.getName();
            String _name_1 = locate_correct_graph_node.getName();
            boolean _equals = Objects.equals(_name, _name_1);
            if (_equals) {
              locate_correct_graph_node = n;
            }
          }
          final Node correct_graph_node = locate_correct_graph_node;
          correct_graph_node.setAttacker(true);
        }
      }
    })).build();

  private final BatchTransformationRule<NodeElements.Match, NodeElements.Matcher> eDFDOutFlowRule = this._batchTransformationRuleFactory.<NodeElements.Match, NodeElements.Matcher>createRule().precondition(NodeElements.Matcher.querySpecification()).action(
    ((Consumer<NodeElements.Match>) (NodeElements.Match it) -> {
      try {
        final Element eDFDElement = it.getEl();
        final String eDFDElementName = eDFDElement.getName();
        final EList<Flow> eDFDOutgoingFlows = eDFDElement.getOutflows();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Adding outgoing flows to node: ");
        _builder.append(eDFDElementName);
        InputOutput.<String>println(_builder.toString());
        final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, null), Subgraphs.class));
        Node locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) eDFDElement)), Node.class));
        EList<Node> _nodes = subgraph.getNodes();
        for (final Node n : _nodes) {
          String _name = n.getName();
          String _name_1 = locate_correct_graph_node.getName();
          boolean _equals = Objects.equals(_name, _name_1);
          if (_equals) {
            locate_correct_graph_node = n;
          }
        }
        final Node correct_graph_node = locate_correct_graph_node;
        for (final Flow fl : eDFDOutgoingFlows) {
          {
            final ArrayList<Node> targets = CollectionLiterals.<Node>newArrayList();
            EList<Element> _target = fl.getTarget();
            for (final Element target : _target) {
              {
                final NamedEntity t = ((NamedEntity) target);
                targets.add(IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, t), Node.class)));
              }
            }
            final ArrayList<GraphAsset> graphassets = CollectionLiterals.<GraphAsset>newArrayList();
            EList<Asset> _assets = fl.getAssets();
            for (final Asset edfdasset : _assets) {
              graphassets.add(IterableExtensions.<GraphAsset>head(Iterables.<GraphAsset>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) edfdasset)), GraphAsset.class)));
            }
            EObject _createChild = this.manipulation.createChild(correct_graph_node, this.graphPackage.getNode_Outedges(), this.graphPackage.getEdge());
            final Procedure1<Identifiable> _function = (Identifiable it_1) -> {
              try {
                this.manipulation.set(it_1, this.graphPackage.getEdge_Source(), correct_graph_node);
                this.manipulation.addTo(it_1, this.graphPackage.getEdge_Target(), targets);
                this.manipulation.addTo(it_1, this.graphPackage.getEdge_Graphassets(), graphassets);
              } catch (Throwable _e) {
                throw Exceptions.sneakyThrow(_e);
              }
            };
            final Identifiable graphEdge = ObjectExtensions.<Identifiable>operator_doubleArrow(((Identifiable) _createChild), _function);
            graphEdge.setID(fl.getName());
            graphEdge.setNumber(fl.getNumber());
            EObject _createChild_1 = this.manipulation.createChild(this.edfd2graph, this.trPackage.getEDFDToGraph_EdfdGraphTraces(), this.trPackage.getEDFDGraphTrace());
            final Procedure1<EObject> _function_1 = (EObject it_1) -> {
              try {
                this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_EdfdElements(), fl);
                this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_GraphElements(), graphEdge);
              } catch (Throwable _e) {
                throw Exceptions.sneakyThrow(_e);
              }
            };
            ObjectExtensions.<EObject>operator_doubleArrow(_createChild_1, _function_1);
          }
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    })).build();

  private final BatchTransformationRule<NodeElements.Match, NodeElements.Matcher> eDFDInFlowRule = this._batchTransformationRuleFactory.<NodeElements.Match, NodeElements.Matcher>createRule().precondition(NodeElements.Matcher.querySpecification()).action(
    ((Consumer<NodeElements.Match>) (NodeElements.Match it) -> {
      int _size = it.getEl().getInflows().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        final Element eDFDElement = it.getEl();
        final String eDFDElementName = eDFDElement.getName();
        final EList<Flow> eDFDIncomingFlows = eDFDElement.getInflows();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Adding ref to incoming edges to node: ");
        _builder.append(eDFDElementName);
        InputOutput.<String>println(_builder.toString());
        final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, null), Subgraphs.class));
        Node locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) eDFDElement)), Node.class));
        EList<Node> _nodes = subgraph.getNodes();
        for (final Node n : _nodes) {
          String _name = n.getName();
          String _name_1 = locate_correct_graph_node.getName();
          boolean _equals = Objects.equals(_name, _name_1);
          if (_equals) {
            locate_correct_graph_node = n;
          }
        }
        final Node correct_graph_node = locate_correct_graph_node;
        for (final Flow fl : eDFDIncomingFlows) {
          {
            final Edge existingEdge = IterableExtensions.<Edge>head(Iterables.<Edge>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, fl), Edge.class));
            correct_graph_node.getInedges().add(existingEdge);
          }
        }
      }
    })).build();

  private final BatchTransformationRule<Assets.Match, Assets.Matcher> eDFDAssetRule = this._batchTransformationRuleFactory.<Assets.Match, Assets.Matcher>createRule().precondition(Assets.Matcher.querySpecification()).action(
    ((Consumer<Assets.Match>) (Assets.Match it) -> {
      try {
        final Asset eDFDAsset = it.getA();
        final EList<Value> eDFDAssetValues = eDFDAsset.getValue();
        final EObject eDFD = eDFDAsset.eContainer();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Mapping eDFD Asset with GraphAsset: ");
        String _name = eDFDAsset.getName();
        _builder.append(_name);
        InputOutput.<String>println(_builder.toString());
        final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) eDFD)), Subgraphs.class));
        EObject _createChild = this.manipulation.createChild(subgraph, this.graphPackage.getSubgraphs_Assets(), this.graphPackage.getGraphAsset());
        final GraphAsset gA = ((GraphAsset) _createChild);
        for (final Value v : eDFDAssetValues) {
          this.setOrUpdateAssetLabel(gA.getAssetlabel(), v.getObjective(), this.lvl(v.getPriority()));
        }
        gA.setID(eDFDAsset.getName());
        EObject _createChild_1 = this.manipulation.createChild(this.edfd2graph, this.trPackage.getEDFDToGraph_EdfdGraphTraces(), this.trPackage.getEDFDGraphTrace());
        final Procedure1<EObject> _function = (EObject it_1) -> {
          try {
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_EdfdElements(), eDFDAsset);
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_GraphElements(), gA);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        ObjectExtensions.<EObject>operator_doubleArrow(_createChild_1, _function);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    })).build();

  private final BatchTransformationRule<Responsibilities.Match, Responsibilities.Matcher> eDFDProcessResponsibilitiesRule = this._batchTransformationRuleFactory.<Responsibilities.Match, Responsibilities.Matcher>createRule().precondition(Responsibilities.Matcher.querySpecification()).action(
    ((Consumer<Responsibilities.Match>) (Responsibilities.Match it) -> {
      try {
        final ContractBase eDFDResponsibility = it.getR();
        org.secdfd.model.Process _process = eDFDResponsibility.getProcess();
        final NamedEntity eDFDResponsibilityProcess = ((NamedEntity) _process);
        final EList<Asset> eDFDIncomingAssets = eDFDResponsibility.getIncomeassets();
        final EList<Asset> eDFDOutgoingAssets = eDFDResponsibility.getOutcomeassets();
        final ArrayList<ContractType> eDFDResponsibilityActions = CollectionLiterals.<ContractType>newArrayList();
        if ((eDFDResponsibility instanceof SecurityContract)) {
          eDFDResponsibilityActions.addAll(((SecurityContract)eDFDResponsibility).getTask());
        } else {
          if ((eDFDResponsibility instanceof ClassificationContract)) {
            eDFDResponsibilityActions.add(ContractType.CLASSIFICATION);
          } else {
            if ((eDFDResponsibility instanceof ClusteringContract)) {
              eDFDResponsibilityActions.add(ContractType.CLUSTERING);
            } else {
              if ((eDFDResponsibility instanceof DecisionMakingContract)) {
                eDFDResponsibilityActions.add(ContractType.DECISION_MAKING);
              } else {
                if ((eDFDResponsibility instanceof RecommendationContract)) {
                  eDFDResponsibilityActions.add(ContractType.RECOMMENDATION);
                } else {
                  if ((eDFDResponsibility instanceof PredictionContract)) {
                    eDFDResponsibilityActions.add(ContractType.PREDICTION);
                  } else {
                    if ((eDFDResponsibility instanceof DimensionalityReductionContract)) {
                      eDFDResponsibilityActions.add(ContractType.DIMENSIONALITY_REDUCTION);
                    } else {
                      if ((eDFDResponsibility instanceof DataGenerationContract)) {
                        eDFDResponsibilityActions.add(ContractType.DATA_GENERATION);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Mapping eDFD Responsibility with Graph NodeResponsibility: ");
        String _name = eDFDResponsibilityProcess.getName();
        _builder.append(_name);
        InputOutput.<String>println(_builder.toString());
        final Node node_of_process = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, eDFDResponsibilityProcess), Node.class));
        final ArrayList<GraphAsset> incomingassets_of_process = CollectionLiterals.<GraphAsset>newArrayList();
        for (final Asset s : eDFDIncomingAssets) {
          {
            final NamedEntity o = ((NamedEntity) s);
            incomingassets_of_process.add(IterableExtensions.<GraphAsset>head(Iterables.<GraphAsset>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, o), GraphAsset.class)));
          }
        }
        final ArrayList<GraphAsset> outgoingassets_of_process = CollectionLiterals.<GraphAsset>newArrayList();
        for (final Asset s_1 : eDFDOutgoingAssets) {
          {
            final NamedEntity o = ((NamedEntity) s_1);
            outgoingassets_of_process.add(IterableExtensions.<GraphAsset>head(Iterables.<GraphAsset>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, o), GraphAsset.class)));
          }
        }
        EObject _createChild = this.manipulation.createChild(node_of_process, this.graphPackage.getNode_Responsibility(), this.graphPackage.getNodeResponsibility());
        final Procedure1<Identifiable> _function = (Identifiable it_1) -> {
          try {
            this.manipulation.addTo(it_1, this.graphPackage.getNodeResponsibility_Incomingassets(), incomingassets_of_process);
            this.manipulation.addTo(it_1, this.graphPackage.getNodeResponsibility_Outgoingassets(), outgoingassets_of_process);
            boolean _isEmpty = eDFDResponsibilityActions.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              this.manipulation.addTo(it_1, this.graphPackage.getNodeResponsibility_Task(), eDFDResponsibilityActions);
            }
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        final Identifiable graphResponsibility = ObjectExtensions.<Identifiable>operator_doubleArrow(((Identifiable) _createChild), _function);
        final String actionsString = eDFDResponsibilityActions.toString();
        graphResponsibility.setID(eDFDResponsibilityProcess.getName().concat(actionsString).concat(eDFDResponsibility.getIncomeassets().toString()));
        EObject _createChild_1 = this.manipulation.createChild(this.edfd2graph, this.trPackage.getEDFDToGraph_EdfdGraphTraces(), this.trPackage.getEDFDGraphTrace());
        final Procedure1<EObject> _function_1 = (EObject it_1) -> {
          try {
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_EdfdElements(), eDFDResponsibility);
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_GraphElements(), graphResponsibility);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        ObjectExtensions.<EObject>operator_doubleArrow(_createChild_1, _function_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    })).build();

  private final BatchTransformationRule<ProcessElements.Match, ProcessElements.Matcher> eDFDProcessRule = this._batchTransformationRuleFactory.<ProcessElements.Match, ProcessElements.Matcher>createRule().precondition(ProcessElements.Matcher.querySpecification()).action(
    ((Consumer<ProcessElements.Match>) (ProcessElements.Match it) -> {
      final org.secdfd.model.Process eDFDProcess = it.getP();
      final EList<Flow> eDFDProcessOutgoingFlows = eDFDProcess.getOutflows();
      final String eDFDProcessName = eDFDProcess.getName();
      final EList<ContractBase> eDFDProcessResponsibilities = eDFDProcess.getResponsibility();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Mapping Process properties with Graph Node: ");
      _builder.append(eDFDProcessName);
      InputOutput.<String>println(_builder.toString());
      final Node node_of_process = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, eDFDProcess), Node.class));
      final ArrayList<Edge> outgoingflows = CollectionLiterals.<Edge>newArrayList();
      for (final Flow f : eDFDProcessOutgoingFlows) {
        {
          final NamedEntity o = ((NamedEntity) f);
          outgoingflows.add(IterableExtensions.<Edge>head(Iterables.<Edge>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, o), Edge.class)));
        }
      }
      node_of_process.getOutedges().addAll(outgoingflows);
      final ArrayList<NodeResponsibility> responsibilities_of_process = CollectionLiterals.<NodeResponsibility>newArrayList();
      for (final ContractBase r : eDFDProcessResponsibilities) {
        {
          final NamedEntity o = ((NamedEntity) r);
          responsibilities_of_process.add(IterableExtensions.<NodeResponsibility>head(Iterables.<NodeResponsibility>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, o), NodeResponsibility.class)));
        }
      }
      node_of_process.getResponsibility().addAll(responsibilities_of_process);
    })).build();

  private final BatchTransformationRule<BoundariesAssets.Match, BoundariesAssets.Matcher> eDFDTBRule = this._batchTransformationRuleFactory.<BoundariesAssets.Match, BoundariesAssets.Matcher>createRule().precondition(BoundariesAssets.Matcher.querySpecification()).action(
    ((Consumer<BoundariesAssets.Match>) (BoundariesAssets.Match it) -> {
      final TrustZone eDFDTB = it.getTb();
      final Asset eDFDAsset = it.getA();
      final EList<Element> eDFDElementsInBoundary = eDFDTB.getElements();
      final EList<AttackerProfile> eDFDAttackerProfilesForBoundary = eDFDTB.getAttackerprofile();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Setting attacker observations to Graph Node: ");
      String _name = eDFDTB.getName();
      _builder.append(_name);
      InputOutput.<String>println(_builder.toString());
      final GraphAsset asset = IterableExtensions.<GraphAsset>head(Iterables.<GraphAsset>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) eDFDAsset)), GraphAsset.class));
      EObject _eContainer = asset.eContainer();
      final Subgraphs subgraph = ((Subgraphs) _eContainer);
      for (final Element e : eDFDElementsInBoundary) {
        {
          Node locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) e)), Node.class));
          EList<Node> _nodes = subgraph.getNodes();
          for (final Node n : _nodes) {
            String _name_1 = n.getName();
            String _name_2 = locate_correct_graph_node.getName();
            boolean _equals = Objects.equals(_name_1, _name_2);
            if (_equals) {
              locate_correct_graph_node = n;
            }
          }
          final Node correct_graph_node = locate_correct_graph_node;
          for (final AttackerProfile ap : eDFDAttackerProfilesForBoundary) {
            {
              final int attacker_observation_skill = ap.getObservation();
              int _attackerObservation = correct_graph_node.getAttackerObservation();
              boolean _greaterThan = (attacker_observation_skill > _attackerObservation);
              if (_greaterThan) {
                correct_graph_node.setAttackerObservation(attacker_observation_skill);
              }
            }
          }
        }
      }
    })).build();

  private final BatchTransformationRule<EDFDAsset.Match, EDFDAsset.Matcher> eDFDModifyAsset = this._batchTransformationRuleFactory.<EDFDAsset.Match, EDFDAsset.Matcher>createRule().precondition(EDFDAsset.Matcher.querySpecification()).action(
    ((Consumer<EDFDAsset.Match>) (EDFDAsset.Match it) -> {
      final Asset eDFDAsset = it.getA();
      final Element eDFDAssetSource = eDFDAsset.getSource();
      final EList<Element> eDFDAssetTargets = eDFDAsset.getTargets();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Setting asset source and targets : ");
      String _name = eDFDAsset.getName();
      _builder.append(_name);
      InputOutput.<String>println(_builder.toString());
      final GraphAsset asset = IterableExtensions.<GraphAsset>head(Iterables.<GraphAsset>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) eDFDAsset)), GraphAsset.class));
      EObject _eContainer = asset.eContainer();
      final Subgraphs subgraph = ((Subgraphs) _eContainer);
      Node locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) eDFDAssetSource)), Node.class));
      EList<Node> _nodes = subgraph.getNodes();
      for (final Node n : _nodes) {
        String _name_1 = n.getName();
        String _name_2 = locate_correct_graph_node.getName();
        boolean _equals = Objects.equals(_name_1, _name_2);
        if (_equals) {
          locate_correct_graph_node = n;
        }
      }
      asset.setSource(locate_correct_graph_node);
      for (final Element e : eDFDAssetTargets) {
        {
          locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) e)), Node.class));
          EList<Node> _nodes_1 = subgraph.getNodes();
          for (final Node n_1 : _nodes_1) {
            String _name_3 = n_1.getName();
            String _name_4 = locate_correct_graph_node.getName();
            boolean _equals_1 = Objects.equals(_name_3, _name_4);
            if (_equals_1) {
              locate_correct_graph_node = n_1;
            }
          }
          asset.getTargets().add(locate_correct_graph_node);
        }
      }
    })).build();

  private final BatchTransformationRule<EDFD.Match, EDFD.Matcher> eDFDToOneGraphRule = this._batchTransformationRuleFactory.<EDFD.Match, EDFD.Matcher>createRule().precondition(EDFD.Matcher.querySpecification()).action(
    ((Consumer<EDFD.Match>) (EDFD.Match it) -> {
      final org.secdfd.model.EDFD eDFD = it.getEdfd();
      final EList<Element> eDFDAllElements = eDFD.getElements();
      final EList<Asset> eDFDAllAssets = eDFD.getAsset();
      final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) eDFD)), Subgraphs.class));
      final ArrayList<Node> graph_nodes = CollectionLiterals.<Node>newArrayList();
      for (final Element el : eDFDAllElements) {
        {
          final NamedEntity t = ((NamedEntity) el);
          graph_nodes.add(IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, t), Node.class)));
        }
      }
      final ArrayList<GraphAsset> graph_assets = CollectionLiterals.<GraphAsset>newArrayList();
      for (final Asset a : eDFDAllAssets) {
        {
          final NamedEntity t = ((NamedEntity) a);
          graph_assets.add(IterableExtensions.<GraphAsset>head(Iterables.<GraphAsset>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, t), GraphAsset.class)));
        }
      }
      subgraph.getNodes().addAll(graph_nodes);
      subgraph.getAssets().addAll(graph_assets);
    })).build();

  private final BatchTransformationRule<EEandDSElement.Match, EEandDSElement.Matcher> initLabels = this._batchTransformationRuleFactory.<EEandDSElement.Match, EEandDSElement.Matcher>createRule().precondition(EEandDSElement.Matcher.querySpecification()).action(((Consumer<EEandDSElement.Match>) (EEandDSElement.Match it) -> {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Inferring labels for ");
    String _name = it.getEl().getName();
    _builder.append(_name);
    InputOutput.<String>println(_builder.toString());
    final Subgraphs sub = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, null), Subgraphs.class));
    Element _el = it.getEl();
    Node gn = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) _el)), Node.class));
    EList<Node> _nodes = sub.getNodes();
    for (final Node n : _nodes) {
      String _name_1 = n.getName();
      String _name_2 = gn.getName();
      boolean _equals = Objects.equals(_name_1, _name_2);
      if (_equals) {
        gn = n;
      }
    }
    EList<Edge> _outedges = gn.getOutedges();
    for (final Edge e : _outedges) {
      {
        e.setVisited(true);
        Objective[] _values = Objective.values();
        for (final Objective o : _values) {
          {
            final Function1<GraphAsset, Integer> _function = (GraphAsset it_1) -> {
              return Integer.valueOf(this.levelOf(it_1.getAssetlabel(), o));
            };
            final Integer max = IterableExtensions.<Integer>max(ListExtensions.<GraphAsset, Integer>map(e.getGraphassets(), _function));
            EList<EdgeLabel> _edgelabel = e.getEdgelabel();
            Integer _elvis = null;
            if (max != null) {
              _elvis = max;
            } else {
              _elvis = Integer.valueOf(0);
            }
            this.setOrUpdateEdgeLabel(_edgelabel, o, (_elvis).intValue());
          }
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("  ");
        _builder_1.append("→ edge ");
        String _iD = e.getID();
        _builder_1.append(_iD, "  ");
        _builder_1.append(" labelled");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t                   ");
        _builder_1.append("${e.edgelabel.map[objective.literal + \'=\' + level].join(\', \')}");
        InputOutput.<String>println(_builder_1.toString());
      }
    }
  })).build();

  private final BatchTransformationRule<EDFD.Match, EDFD.Matcher> propagateLabelsInOrder = this._batchTransformationRuleFactory.<EDFD.Match, EDFD.Matcher>createRule().precondition(EDFD.Matcher.querySpecification()).action(
    ((Consumer<EDFD.Match>) (EDFD.Match it) -> {
      final EList<Element> all_elements = it.getEdfd().getElements();
      final ArrayList<Flow> allFlows = CollectionLiterals.<Flow>newArrayList();
      for (final Element e : all_elements) {
        allFlows.addAll(e.getOutflows());
      }
      final Comparator<Flow> _function = (Flow a, Flow b) -> {
        int _number = a.getNumber();
        int _number_1 = b.getNumber();
        return (_number - _number_1);
      };
      Collections.<Flow>sort(allFlows, _function);
      for (final Element f : allFlows) {
        {
          final Edge outgoing = IterableExtensions.<Edge>head(Iterables.<Edge>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) f)), Edge.class));
          final Node node = outgoing.getSource();
          outgoing.setVisited(true);
          EList<NodeResponsibility> _responsibility = node.getResponsibility();
          for (final NodeResponsibility nr : _responsibility) {
            {
              final ContractBase contract = this.findContract(nr);
              int pMax = 0;
              EList<GraphAsset> _incomingassets = nr.getIncomingassets();
              for (final GraphAsset ina : _incomingassets) {
                pMax = Math.max(pMax, this.levelOf(ina.getAssetlabel(), Objective.PRIVACY));
              }
              final Function1<EdgeLabel, Boolean> _function_1 = (EdgeLabel l) -> {
                Objective _objective = l.getObjective();
                return Boolean.valueOf(Objects.equals(_objective, Objective.PRIVACY));
              };
              boolean _exists = IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), _function_1);
              boolean _not = (!_exists);
              if (_not) {
                String _string = nr.getTask().toString();
                if (_string != null) {
                  switch (_string) {
                    case "[Classification]":
                      final ClassificationContract contractClass = ((ClassificationContract) contract);
                      Priority _xifexpression = null;
                      if (((contractClass != null) && (contractClass.getPClass() != null))) {
                        _xifexpression = contractClass.getPClass();
                      } else {
                        _xifexpression = Priority.L;
                      }
                      final Priority pClass = _xifexpression;
                      this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), Objective.PRIVACY, this.lvl(pClass));
                      break;
                    case "[DecisionMaking]":
                      final DecisionMakingContract contractDM = ((DecisionMakingContract) contract);
                      Priority _xifexpression_1 = null;
                      if (((contractDM != null) && (contractDM.getPAction() != null))) {
                        _xifexpression_1 = contractDM.getPAction();
                      } else {
                        _xifexpression_1 = Priority.L;
                      }
                      final Priority pAction = _xifexpression_1;
                      this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), Objective.PRIVACY, this.lvl(pAction));
                      break;
                    case "[Recommendation]":
                      final RecommendationContract contractRec = ((RecommendationContract) contract);
                      boolean _xifexpression_2 = false;
                      if ((contractRec != null)) {
                        _xifexpression_2 = contractRec.isS();
                      } else {
                        _xifexpression_2 = false;
                      }
                      final boolean s = _xifexpression_2;
                      EList<EdgeLabel> _edgelabel = outgoing.getEdgelabel();
                      int _xifexpression_3 = (int) 0;
                      if (s) {
                        _xifexpression_3 = 1;
                      } else {
                        _xifexpression_3 = 0;
                      }
                      this.setOrUpdateEdgeLabel(_edgelabel, Objective.PRIVACY, _xifexpression_3);
                      break;
                    case "[Clustering]":
                      final Function1<GraphAsset, Boolean> _function_2 = (GraphAsset ina_1) -> {
                        int _levelOf = this.levelOf(ina_1.getAssetlabel(), Objective.PRIVACY);
                        return Boolean.valueOf((_levelOf != 0));
                      };
                      boolean _exists_1 = IterableExtensions.<GraphAsset>exists(nr.getIncomingassets(), _function_2);
                      final boolean allPrivacyLabelsAreN = (!_exists_1);
                      EList<EdgeLabel> _edgelabel_1 = outgoing.getEdgelabel();
                      int _xifexpression_4 = (int) 0;
                      if (allPrivacyLabelsAreN) {
                        _xifexpression_4 = 0;
                      } else {
                        _xifexpression_4 = 1;
                      }
                      this.setOrUpdateEdgeLabel(_edgelabel_1, Objective.PRIVACY, _xifexpression_4);
                      break;
                    case "[Prediction]":
                      final PredictionContract contractPred = ((PredictionContract) contract);
                      boolean _xifexpression_5 = false;
                      if ((contractPred != null)) {
                        _xifexpression_5 = contractPred.isS();
                      } else {
                        _xifexpression_5 = false;
                      }
                      final boolean s_1 = _xifexpression_5;
                      int _xifexpression_6 = (int) 0;
                      if ((pMax == 0)) {
                        _xifexpression_6 = 0;
                      } else {
                        int _xifexpression_7 = (int) 0;
                        if (s_1) {
                          _xifexpression_7 = pMax;
                        } else {
                          _xifexpression_7 = 1;
                        }
                        _xifexpression_6 = _xifexpression_7;
                      }
                      final int privacyLevel = _xifexpression_6;
                      this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLevel);
                      break;
                    case "[DimensionalityReduction]":
                      final DimensionalityReductionContract contractDR = ((DimensionalityReductionContract) contract);
                      int _xifexpression_8 = (int) 0;
                      if ((contractDR != null)) {
                        _xifexpression_8 = contractDR.getK();
                      } else {
                        _xifexpression_8 = 0;
                      }
                      final int k = _xifexpression_8;
                      int privacyLevel_1 = pMax;
                      for (int i = 0; (i < k); i++) {
                        privacyLevel_1 = this.reducePrivacyLevel(privacyLevel_1);
                      }
                      this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLevel_1);
                      break;
                    case "[DataGeneration]":
                      final DataGenerationContract contractDG = ((DataGenerationContract) contract);
                      DataGenerationDirection _xifexpression_9 = null;
                      if ((contractDG != null)) {
                        _xifexpression_9 = contractDG.getDirection();
                      } else {
                        _xifexpression_9 = null;
                      }
                      final DataGenerationDirection direction = _xifexpression_9;
                      int _xifexpression_10 = (int) 0;
                      if ((contractDG != null)) {
                        _xifexpression_10 = contractDG.getK();
                      } else {
                        _xifexpression_10 = 1;
                      }
                      final int k_1 = _xifexpression_10;
                      int privacyLevel_2 = pMax;
                      if ((direction != null)) {
                        String _string_1 = direction.toString();
                        boolean _equals = Objects.equals(_string_1, "REDUCE");
                        if (_equals) {
                          for (int i = 0; (i < k_1); i++) {
                            privacyLevel_2 = this.reducePrivacyLevel(privacyLevel_2);
                          }
                        } else {
                          String _string_2 = direction.toString();
                          boolean _equals_1 = Objects.equals(_string_2, "ELEVATE");
                          if (_equals_1) {
                            for (int i = 0; (i < k_1); i++) {
                              privacyLevel_2 = this.elevatePrivacyLevel(privacyLevel_2);
                            }
                          }
                        }
                      }
                      this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLevel_2);
                      break;
                    case "[EncryptOrHash]":
                      Objective[] _values = Objective.values();
                      for (final Objective o : _values) {
                        final Function1<EdgeLabel, Boolean> _function_3 = (EdgeLabel l) -> {
                          Objective _objective = l.getObjective();
                          return Boolean.valueOf(Objects.equals(_objective, o));
                        };
                        boolean _exists_2 = IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), _function_3);
                        boolean _not_1 = (!_exists_2);
                        if (_not_1) {
                          this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), o, 0);
                        }
                      }
                      break;
                    case "[Decrypt]":
                      Objective[] _values_1 = Objective.values();
                      for (final Objective o_1 : _values_1) {
                        final Function1<EdgeLabel, Boolean> _function_4 = (EdgeLabel l) -> {
                          Objective _objective = l.getObjective();
                          return Boolean.valueOf(Objects.equals(_objective, o_1));
                        };
                        boolean _exists_3 = IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), _function_4);
                        boolean _not_2 = (!_exists_3);
                        if (_not_2) {
                          int max = 0;
                          EList<GraphAsset> _incomingassets_1 = nr.getIncomingassets();
                          for (final GraphAsset ina_1 : _incomingassets_1) {
                            max = Math.max(max, this.levelOf(ina_1.getAssetlabel(), o_1));
                          }
                          this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), o_1, max);
                        }
                      }
                      break;
                    case "[Copier]":
                      boolean _isEmpty = nr.getIncomingassets().isEmpty();
                      boolean _not_3 = (!_isEmpty);
                      if (_not_3) {
                        Objective[] _values_2 = Objective.values();
                        for (final Objective o_2 : _values_2) {
                          final Function1<EdgeLabel, Boolean> _function_5 = (EdgeLabel l) -> {
                            Objective _objective = l.getObjective();
                            return Boolean.valueOf(Objects.equals(_objective, o_2));
                          };
                          boolean _exists_4 = IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), _function_5);
                          boolean _not_4 = (!_exists_4);
                          if (_not_4) {
                            this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), o_2, this.levelOf(nr.getIncomingassets().get(0).getAssetlabel(), o_2));
                          }
                        }
                      }
                      break;
                    case "[Forward]":
                      boolean _isEmpty_1 = nr.getIncomingassets().isEmpty();
                      boolean _not_5 = (!_isEmpty_1);
                      if (_not_5) {
                        Objective[] _values_3 = Objective.values();
                        for (final Objective o_3 : _values_3) {
                          final Function1<EdgeLabel, Boolean> _function_6 = (EdgeLabel l) -> {
                            Objective _objective = l.getObjective();
                            return Boolean.valueOf(Objects.equals(_objective, o_3));
                          };
                          boolean _exists_5 = IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), _function_6);
                          boolean _not_6 = (!_exists_5);
                          if (_not_6) {
                            this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), o_3, this.levelOf(nr.getIncomingassets().get(0).getAssetlabel(), o_3));
                          }
                        }
                      }
                      break;
                    default:
                      Objective[] _values_4 = Objective.values();
                      for (final Objective o_4 : _values_4) {
                        final Function1<EdgeLabel, Boolean> _function_7 = (EdgeLabel l) -> {
                          Objective _objective = l.getObjective();
                          return Boolean.valueOf(Objects.equals(_objective, o_4));
                        };
                        boolean _exists_6 = IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), _function_7);
                        boolean _not_7 = (!_exists_6);
                        if (_not_7) {
                          int max_1 = 0;
                          EList<GraphAsset> _incomingassets_2 = nr.getIncomingassets();
                          for (final GraphAsset ina_2 : _incomingassets_2) {
                            max_1 = Math.max(max_1, this.levelOf(ina_2.getAssetlabel(), o_4));
                          }
                          if ((max_1 > 0)) {
                            this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), o_4, max_1);
                          }
                        }
                      }
                      break;
                  }
                } else {
                  Objective[] _values_4 = Objective.values();
                  for (final Objective o_4 : _values_4) {
                    final Function1<EdgeLabel, Boolean> _function_7 = (EdgeLabel l) -> {
                      Objective _objective = l.getObjective();
                      return Boolean.valueOf(Objects.equals(_objective, o_4));
                    };
                    boolean _exists_6 = IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), _function_7);
                    boolean _not_7 = (!_exists_6);
                    if (_not_7) {
                      int max_1 = 0;
                      EList<GraphAsset> _incomingassets_2 = nr.getIncomingassets();
                      for (final GraphAsset ina_2 : _incomingassets_2) {
                        max_1 = Math.max(max_1, this.levelOf(ina_2.getAssetlabel(), o_4));
                      }
                      if ((max_1 > 0)) {
                        this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), o_4, max_1);
                      }
                    }
                  }
                }
              }
              Objective[] _values_5 = Objective.values();
              for (final Objective o_5 : _values_5) {
                if (((!Objects.equals(o_5, Objective.PRIVACY)) && (!IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), ((Function1<EdgeLabel, Boolean>) (EdgeLabel l) -> {
                  Objective _objective = l.getObjective();
                  return Boolean.valueOf(Objects.equals(_objective, o_5));
                }))))) {
                  int max_2 = 0;
                  EList<GraphAsset> _incomingassets_3 = nr.getIncomingassets();
                  for (final GraphAsset ina_3 : _incomingassets_3) {
                    max_2 = Math.max(max_2, this.levelOf(ina_3.getAssetlabel(), o_5));
                  }
                  if ((max_2 > 0)) {
                    this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), o_5, max_2);
                  }
                }
              }
            }
          }
          Objective[] _values = Objective.values();
          for (final Objective o : _values) {
            final Function1<EdgeLabel, Boolean> _function_1 = (EdgeLabel l) -> {
              Objective _objective = l.getObjective();
              return Boolean.valueOf(Objects.equals(_objective, o));
            };
            boolean _exists = IterableExtensions.<EdgeLabel>exists(outgoing.getEdgelabel(), _function_1);
            boolean _not = (!_exists);
            if (_not) {
              int max = 0;
              EList<GraphAsset> _graphassets = outgoing.getGraphassets();
              for (final GraphAsset ga : _graphassets) {
                max = Math.max(max, this.levelOf(ga.getAssetlabel(), o));
              }
              if ((max > 0)) {
                this.setOrUpdateEdgeLabel(outgoing.getEdgelabel(), o, max);
              }
            }
          }
          this.logEdge(outgoing);
        }
      }
    })).build();

  public void execute() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Executing transformation on entire eDFD: ");
    String _name = this.edfd2graph.getEdfds().getName();
    _builder.append(_name);
    InputOutput.<String>println(_builder.toString());
    this.edfd2graph.getGraphs().getSubgraphs().clear();
    this.edfd2graph.getEdfdGraphTraces().clear();
    this.edfd2graph.getGraphEndToEndTrace().clear();
    this.statements.<EDFD.Match>fireAllCurrent(this.buildFirstSubgraphRule);
    this.statements.<Assets.Match>fireAllCurrent(this.eDFDAssetRule);
    this.statements.<NodeElements.Match>fireAllCurrent(this.eDFDNodeElementRule);
    this.statements.<Boundaries.Match>fireAllCurrent(this.eDFDNodeAttackerZoneRule);
    this.statements.<NodeElements.Match>fireAllCurrent(this.eDFDOutFlowRule);
    this.statements.<NodeElements.Match>fireAllCurrent(this.eDFDInFlowRule);
    this.statements.<Responsibilities.Match>fireAllCurrent(this.eDFDProcessResponsibilitiesRule);
    this.statements.<ProcessElements.Match>fireAllCurrent(this.eDFDProcessRule);
    this.statements.<BoundariesAssets.Match>fireAllCurrent(this.eDFDTBRule);
    this.statements.<EDFDAsset.Match>fireAllCurrent(this.eDFDModifyAsset);
    this.statements.<EDFD.Match>fireAllCurrent(this.eDFDToOneGraphRule);
    this.statements.<EEandDSElement.Match>fireAllCurrent(this.initLabels);
    this.statements.<EDFD.Match>fireAllCurrent(this.propagateLabelsInOrder);
  }

  public void dispose() {
    if ((this.transformation != null)) {
      this.transformation.getRuleEngine().dispose();
    }
    this.transformation = null;
    return;
  }

  public int levelOf(final EList<? extends SecurityLabel> list, final Objective obj) {
    int _xblockexpression = (int) 0;
    {
      final Function1<SecurityLabel, Boolean> _function = (SecurityLabel it) -> {
        Objective _objective = it.getObjective();
        return Boolean.valueOf(Objects.equals(_objective, obj));
      };
      final SecurityLabel l = IterableExtensions.findFirst(list, _function);
      int _xifexpression = (int) 0;
      if ((l == null)) {
        _xifexpression = 0;
      } else {
        _xifexpression = l.getLevel();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public int lvl(final Priority p) {
    int _switchResult = (int) 0;
    if (p != null) {
      switch (p) {
        case C:
          _switchResult = 4;
          break;
        case H:
          _switchResult = 3;
          break;
        case M:
          _switchResult = 2;
          break;
        case L:
          _switchResult = 1;
          break;
        case N:
          _switchResult = 0;
          break;
        default:
          _switchResult = 0;
          break;
      }
    } else {
      _switchResult = 0;
    }
    return _switchResult;
  }

  public int reducePrivacyLevel(final int level) {
    int _switchResult = (int) 0;
    switch (level) {
      case 4:
        _switchResult = 3;
        break;
      case 3:
        _switchResult = 2;
        break;
      case 2:
        _switchResult = 1;
        break;
      case 1:
        _switchResult = 0;
        break;
      case 0:
        _switchResult = 0;
        break;
      default:
        _switchResult = level;
        break;
    }
    return _switchResult;
  }

  public int elevatePrivacyLevel(final int level) {
    int _switchResult = (int) 0;
    switch (level) {
      case 0:
        _switchResult = 1;
        break;
      case 1:
        _switchResult = 2;
        break;
      case 2:
        _switchResult = 3;
        break;
      case 3:
        _switchResult = 4;
        break;
      case 4:
        _switchResult = 4;
        break;
      default:
        _switchResult = level;
        break;
    }
    return _switchResult;
  }

  public ContractBase findContract(final NodeResponsibility nr) {
    EList<EDFDGraphTrace> _edfdGraphTraces = this.edfd2graph.getEdfdGraphTraces();
    for (final EDFDGraphTrace trace : _edfdGraphTraces) {
      boolean _contains = trace.getGraphElements().contains(nr);
      if (_contains) {
        EList<NamedEntity> _edfdElements = trace.getEdfdElements();
        for (final NamedEntity edfdElement : _edfdElements) {
          if ((edfdElement instanceof ContractBase)) {
            return ((ContractBase) edfdElement);
          }
        }
      }
    }
    return null;
  }

  public void setOrUpdateAssetLabel(final EList<AssetLabel> list, final Objective o, final int level) {
    final Function1<AssetLabel, Boolean> _function = (AssetLabel it) -> {
      Objective _objective = it.getObjective();
      return Boolean.valueOf(Objects.equals(_objective, o));
    };
    final AssetLabel l = IterableExtensions.<AssetLabel>findFirst(list, _function);
    if ((level <= 0)) {
      if ((l != null)) {
        list.remove(l);
      }
      return;
    }
    if ((l == null)) {
      final AssetLabel n = GraphFactory.eINSTANCE.createAssetLabel();
      n.setObjective(o);
      n.setLevel(level);
      list.add(n);
    } else {
      l.setLevel(level);
    }
  }

  public void setOrUpdateEdgeLabel(final EList<EdgeLabel> list, final Objective o, final int level) {
    final Function1<EdgeLabel, Boolean> _function = (EdgeLabel it) -> {
      Objective _objective = it.getObjective();
      return Boolean.valueOf(Objects.equals(_objective, o));
    };
    final EdgeLabel l = IterableExtensions.<EdgeLabel>findFirst(list, _function);
    if ((level < 0)) {
      if ((l != null)) {
        list.remove(l);
      }
      return;
    }
    if ((l == null)) {
      final EdgeLabel n = GraphFactory.eINSTANCE.createEdgeLabel();
      n.setObjective(o);
      n.setLevel(level);
      list.add(n);
    } else {
      l.setLevel(level);
    }
  }

  public void logEdge(final Edge e) {
    final StringBuilder sb = new StringBuilder();
    sb.append(String.format("%03d  %-20s", Integer.valueOf(e.getNumber()), e.getID()));
    final Function1<EdgeLabel, Boolean> _function = (EdgeLabel it) -> {
      int _level = it.getLevel();
      return Boolean.valueOf((_level > 0));
    };
    final Function1<EdgeLabel, String> _function_1 = (EdgeLabel it) -> {
      return it.getObjective().getLiteral();
    };
    final Function1<EdgeLabel, String> _function_2 = (EdgeLabel o) -> {
      String _literal = o.getObjective().getLiteral();
      String _plus = (_literal + "=");
      int _level = o.getLevel();
      return (_plus + Integer.valueOf(_level));
    };
    final List<String> lbls = ListExtensions.<EdgeLabel, String>map(IterableExtensions.<EdgeLabel, String>sortBy(IterableExtensions.<EdgeLabel>filter(e.getEdgelabel(), _function), _function_1), _function_2);
    StringBuilder _append = sb.append("  ");
    String _xifexpression = null;
    boolean _isEmpty = lbls.isEmpty();
    if (_isEmpty) {
      _xifexpression = "[no-label]";
    } else {
      _xifexpression = IterableExtensions.join(lbls, ", ");
    }
    _append.append(_xifexpression);
    final Function1<NodeResponsibility, Boolean> _function_3 = (NodeResponsibility r) -> {
      final Function1<GraphAsset, Boolean> _function_4 = (GraphAsset it) -> {
        return Boolean.valueOf(e.getGraphassets().contains(it));
      };
      return Boolean.valueOf(IterableExtensions.<GraphAsset>exists(r.getOutgoingassets(), _function_4));
    };
    final Function1<NodeResponsibility, String> _function_4 = (NodeResponsibility it) -> {
      String _xblockexpression = null;
      {
        final ContractBase contract = this.findContract(it);
        String _xifexpression_1 = null;
        if ((contract instanceof ClassificationContract)) {
          _xifexpression_1 = "Classification";
        } else {
          String _xifexpression_2 = null;
          if ((contract instanceof DecisionMakingContract)) {
            _xifexpression_2 = "DecisionMaking";
          } else {
            String _xifexpression_3 = null;
            if ((contract instanceof RecommendationContract)) {
              _xifexpression_3 = "Recommendation";
            } else {
              String _xifexpression_4 = null;
              if ((contract instanceof PredictionContract)) {
                _xifexpression_4 = "Prediction";
              } else {
                String _xifexpression_5 = null;
                if ((contract instanceof DimensionalityReductionContract)) {
                  _xifexpression_5 = "DimensionalityReduction";
                } else {
                  String _xifexpression_6 = null;
                  if ((contract instanceof DataGenerationContract)) {
                    _xifexpression_6 = "DataGeneration";
                  } else {
                    String _xifexpression_7 = null;
                    if ((contract instanceof ClusteringContract)) {
                      _xifexpression_7 = "Clustering";
                    } else {
                      String _xifexpression_8 = null;
                      if (((it.getTask() != null) && (!it.getTask().isEmpty()))) {
                        _xifexpression_8 = it.getTask().toString().replace("[", "").replace("]", "");
                      } else {
                        _xifexpression_8 = "";
                      }
                      _xifexpression_7 = _xifexpression_8;
                    }
                    _xifexpression_6 = _xifexpression_7;
                  }
                  _xifexpression_5 = _xifexpression_6;
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xblockexpression = _xifexpression_1;
      }
      return _xblockexpression;
    };
    final Function1<String, Boolean> _function_5 = (String it) -> {
      boolean _isEmpty_1 = it.isEmpty();
      return Boolean.valueOf((!_isEmpty_1));
    };
    final Set<String> ops = IterableExtensions.<String>toSet(IterableExtensions.<String>filter(IterableExtensions.<NodeResponsibility, String>map(IterableExtensions.<NodeResponsibility>filter(e.getSource().getResponsibility(), _function_3), _function_4), _function_5));
    StringBuilder _append_1 = sb.append("  via ");
    String _xifexpression_1 = null;
    boolean _isEmpty_1 = ops.isEmpty();
    if (_isEmpty_1) {
      _xifexpression_1 = "no-rule";
    } else {
      _xifexpression_1 = IterableExtensions.join(ops, "+");
    }
    _append_1.append(_xifexpression_1);
    InputOutput.<String>println(sb.toString());
  }
}
