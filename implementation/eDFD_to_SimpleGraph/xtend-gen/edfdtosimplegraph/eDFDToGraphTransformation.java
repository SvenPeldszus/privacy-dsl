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
import org.secdfd.model.SecurityContractType;
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
          this.upsertLabel_Asset(gA.getAssetlabel(), v.getObjective(), this.lvl(v.getPriority()));
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
        List<SecurityContractType> _xifexpression = null;
        if ((eDFDResponsibility instanceof SecurityContract)) {
          _xifexpression = ((SecurityContract) eDFDResponsibility).getTask();
        } else {
          _xifexpression = CollectionLiterals.<SecurityContractType>newArrayList();
        }
        final List<SecurityContractType> eDFDResponsibilityActions = _xifexpression;
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
            if (((eDFDResponsibility instanceof SecurityContract) && (!eDFDResponsibilityActions.isEmpty()))) {
              this.manipulation.addTo(it_1, this.graphPackage.getNodeResponsibility_Task(), eDFDResponsibilityActions);
            }
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        final Identifiable graphResponsibility = ObjectExtensions.<Identifiable>operator_doubleArrow(((Identifiable) _createChild), _function);
        String _xifexpression_1 = null;
        if ((eDFDResponsibility instanceof SecurityContract)) {
          _xifexpression_1 = eDFDResponsibilityActions.toString();
        } else {
          String _xifexpression_2 = null;
          if ((eDFDResponsibility instanceof ClassificationContract)) {
            _xifexpression_2 = "[Classification]";
          } else {
            String _xifexpression_3 = null;
            if ((eDFDResponsibility instanceof ClusteringContract)) {
              _xifexpression_3 = "[Clustering]";
            } else {
              String _xifexpression_4 = null;
              if ((eDFDResponsibility instanceof DecisionMakingContract)) {
                _xifexpression_4 = "[DecisionMaking]";
              } else {
                String _xifexpression_5 = null;
                if ((eDFDResponsibility instanceof RecommendationContract)) {
                  _xifexpression_5 = "[Recommendation]";
                } else {
                  String _xifexpression_6 = null;
                  if ((eDFDResponsibility instanceof PredictionContract)) {
                    _xifexpression_6 = "[Prediction]";
                  } else {
                    String _xifexpression_7 = null;
                    if ((eDFDResponsibility instanceof DimensionalityReductionContract)) {
                      _xifexpression_7 = "[DimensionalityReduction]";
                    } else {
                      String _xifexpression_8 = null;
                      if ((eDFDResponsibility instanceof DataGenerationContract)) {
                        _xifexpression_8 = "[DataGeneration]";
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
        final String actionsString = _xifexpression_1;
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

  /**
   * val initLabels = createRule.precondition(edfdtosimplegraph.EEandDSElement.Matcher.querySpecification).action[
   * print('''Inferring labels for: «it.el.name»''')
   * 
   * //find subgraph in target model
   * val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
   * // get the node of EE or DS
   * var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.el as NamedEntity).filter(Node).head
   * for (Node n : subgraph.nodes){
   * if (n.name == locate_correct_graph_node.name){
   * locate_correct_graph_node = n
   * }
   * }
   * 
   * // set the nodes of the outgoing flows only
   * for (Edge e : locate_correct_graph_node.outedges){
   * // for each set label according to the most restrictive asset on the flow
   * e.visited = true
   * var setlabel = -1 // not set
   * for (GraphAsset gs: e.graphassets){
   * if (gs.label > setlabel)
   * setlabel = gs.label
   * }
   * e.edgeLabel = setlabel
   * print(''' to «e.edgeLabel»''')
   * println()
   * }
   * 
   * ].build
   */
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
            this.upsertLabel_Edge(_edgelabel, o, (_elvis).intValue());
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

  /**
   * val propagateLabelsInOrder = createRule.precondition(edfdtosimplegraph.EDFD.Matcher.querySpecification).action[
   * val all_elements = it.edfd.elements
   * 
   * //print(all_elements)
   * val all_flows = newArrayList()
   * for (Element e : all_elements){
   * all_flows.addAll(e.outflows)
   * }
   * Collections.sort(all_flows) [ a, b |
   * a.number - b.number
   * ]
   * for (Element f : all_flows){
   * var outgoing = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, f as NamedEntity).filter(Edge).head
   * var node = outgoing.source
   * outgoing.visited = true
   * for (GraphAsset ga : outgoing.graphassets){
   * //for each asset, collect what kind of responsibility they are part of in the node
   * var r = newArrayList()
   * for (NodeResponsibility noder : node.responsibility){
   * if (noder.outgoingassets.contains(ga)) r.add(noder)
   * }
   * //go through responsibilities
   * for (NodeResponsibility nr : r){
   * switch(nr.task.toString){
   * case "[EncryptOrHash]":{
   * //set low output
   * outgoing.edgeLabel = 0
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for ecrypting asset:«ga.ID»''')
   * println()
   * }
   * case "[Decrypt]": {
   * var most_restrictive = -1
   * for (GraphAsset i : nr.incomingassets){
   * if	(i.label > most_restrictive) most_restrictive = i.label
   * }
   * 
   * 
   * //set high output if the most sensitive asset being decrypted was high before
   * if (most_restrictive ==	1){
   * outgoing.edgeLabel = 1
   * }else{
   * //if sth low is decrypted it remains low
   * outgoing.edgeLabel = 0
   * }
   * 
   * outgoing.edgeLabel = 1
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for decrypting asset:«ga.ID»''')
   * println()
   * }
   * //Comparator, Joiner, User => the same propagation
   * case "[Comparator]":{
   * //join labels (most restrictive input to node responsibility)
   * var most_restrictive = -1
   * for (GraphAsset i : nr.incomingassets){
   * if	(i.label > most_restrictive) most_restrictive = i.label
   * }
   * outgoing.edgeLabel = most_restrictive
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for comparing asset:«ga.ID»''')
   * println()
   * }
   * case "[Joiner]":{
   * //join labels (most restrictive input to node responsibility
   * var most_restrictive = -1
   * for (GraphAsset i : nr.incomingassets){
   * if	(i.label > most_restrictive) most_restrictive = i.label
   * }
   * outgoing.edgeLabel = most_restrictive
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for joining asset:«ga.ID»''')
   * println()
   * }
   * //splitter should be included (substring), to remain conservative
   * case "[Splitter]":{
   * //join labels (most restrictive input to node responsibility
   * var most_restrictive = -1
   * for (GraphAsset i : nr.incomingassets){
   * if	(i.label > most_restrictive) most_restrictive = i.label
   * }
   * outgoing.edgeLabel = most_restrictive
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for spliting asset:«ga.ID»''')
   * println()
   * }
   * case "[User]":{
   * //join labels (most restrictive input to node responsibility)
   * var most_restrictive = -1
   * for (GraphAsset i : nr.incomingassets){
   * if	(i.label > most_restrictive) most_restrictive = i.label
   * }
   * outgoing.edgeLabel = most_restrictive
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for using asset:«ga.ID»''')
   * println()
   * }
   * //Copier and Forward => the same
   * case "[Copier]":{
   * //copy labels (add semantic constraint - all assets in one copy responsibility must have the same label)
   * outgoing.edgeLabel = nr.incomingassets.get(0).label
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for copying asset:«ga.ID»''')
   * println()
   * }
   * case "[Forward]":{
   * //copy labels (add semantic constraint - all assets in one forward responsibility must have the same label)
   * outgoing.edgeLabel = nr.incomingassets.get(0).label
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for forwarding asset:«ga.ID»''')
   * println()
   * }
   * case "[Store]":{
   * //most restrictive stored asset
   * var most_restrictive = -1
   * for (GraphAsset i : nr.incomingassets){
   * if	(i.label > most_restrictive) most_restrictive = i.label
   * }
   * outgoing.edgeLabel = most_restrictive
   * print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
   * print(''' is «outgoing.edgeLabel»''')
   * print(''' for using asset:«ga.ID»''')
   * println()
   * }
   * //case "[Discarder]":
   * //case "[Verifier]":
   * //case "[Authenticator]":
   * //case "[Authoriser]":
   * default :{
   * print(nr.operation.toString)
   * print("Does not effect confidentiality label propagation.")
   * println()
   * }
   * }
   * }
   * 
   * //if the flow has no connected responsibility, inferr the label from the most restrictive asset
   * if (outgoing.edgeLabel == -1){
   * var most_restrictive = -1
   * for (GraphAsset i : outgoing.graphassets){
   * if	(i.label > most_restrictive) most_restrictive = i.label
   * }
   * outgoing.edgeLabel = most_restrictive
   * print('''Label inferred for edge «outgoing.ID»''')
   * print(''' to «outgoing.edgeLabel»''')
   * print(''' since no label propagation rules apply to this edge.''')
   * println()
   * }
   * 
   * print(f.number)
   * print(''': ''')
   * print(outgoing.edgeLabel)
   * println()
   * }
   * }
   * 
   * 
   * ].build
   */
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
          boolean privacyLabelContractFound = false;
          int privacyLabelLevel = 0;
          String privacyLabelContractName = "";
          EList<NodeResponsibility> _responsibility = node.getResponsibility();
          for (final NodeResponsibility nr : _responsibility) {
            {
              final ContractBase contract = this.findContract(nr);
              if (((contract instanceof ClassificationContract) && (!privacyLabelContractFound))) {
                privacyLabelContractFound = true;
                privacyLabelContractName = "ClassificationContract";
                Priority _elvis = null;
                Priority _pClass = ((ClassificationContract) contract).getPClass();
                if (_pClass != null) {
                  _elvis = _pClass;
                } else {
                  _elvis = Priority.L;
                }
                final Priority pClass = _elvis;
                privacyLabelLevel = this.lvl(pClass);
                this.upsertLabel_Edge(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLabelLevel);
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("[DEBUG] Label propagation of edge ");
                String _iD = outgoing.getID();
                _builder.append(_iD);
                _builder.append(", ");
                int _number = outgoing.getNumber();
                _builder.append(_number);
                InputOutput.<String>println(_builder.toString());
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("[DEBUG]   Found ");
                _builder_1.append(privacyLabelContractName);
                _builder_1.append(", setting Privacy=");
                _builder_1.append(privacyLabelLevel);
                _builder_1.append(" (from pClass=");
                String _name = pClass.getName();
                _builder_1.append(_name);
                _builder_1.append(")");
                InputOutput.<String>println(_builder_1.toString());
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("[DEBUG]   Edge labels after setting Privacy: ");
                final Function1<EdgeLabel, String> _function_1 = (EdgeLabel it_1) -> {
                  String _literal = it_1.getObjective().getLiteral();
                  String _plus = (_literal + "=");
                  int _level = it_1.getLevel();
                  return (_plus + Integer.valueOf(_level));
                };
                String _join = IterableExtensions.join(ListExtensions.<EdgeLabel, String>map(outgoing.getEdgelabel(), _function_1), ", ");
                _builder_2.append(_join);
                InputOutput.<String>println(_builder_2.toString());
              }
              if (((contract instanceof DecisionMakingContract) && (!privacyLabelContractFound))) {
                privacyLabelContractFound = true;
                privacyLabelContractName = "DecisionMakingContract";
                Priority _elvis_1 = null;
                Priority _pAction = ((DecisionMakingContract) contract).getPAction();
                if (_pAction != null) {
                  _elvis_1 = _pAction;
                } else {
                  _elvis_1 = Priority.L;
                }
                final Priority pAction = _elvis_1;
                privacyLabelLevel = this.lvl(pAction);
                this.upsertLabel_Edge(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLabelLevel);
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("[DEBUG] Label propagation of edge ");
                String _iD_1 = outgoing.getID();
                _builder_3.append(_iD_1);
                _builder_3.append(", ");
                int _number_1 = outgoing.getNumber();
                _builder_3.append(_number_1);
                InputOutput.<String>println(_builder_3.toString());
                StringConcatenation _builder_4 = new StringConcatenation();
                _builder_4.append("[DEBUG]   Found ");
                _builder_4.append(privacyLabelContractName);
                _builder_4.append(", setting Privacy=");
                _builder_4.append(privacyLabelLevel);
                _builder_4.append(" (from pAction=");
                String _name_1 = pAction.getName();
                _builder_4.append(_name_1);
                _builder_4.append(")");
                InputOutput.<String>println(_builder_4.toString());
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("[DEBUG]   Edge labels after setting Privacy: ");
                final Function1<EdgeLabel, String> _function_2 = (EdgeLabel it_1) -> {
                  String _literal = it_1.getObjective().getLiteral();
                  String _plus = (_literal + "=");
                  int _level = it_1.getLevel();
                  return (_plus + Integer.valueOf(_level));
                };
                String _join_1 = IterableExtensions.join(ListExtensions.<EdgeLabel, String>map(outgoing.getEdgelabel(), _function_2), ", ");
                _builder_5.append(_join_1);
                InputOutput.<String>println(_builder_5.toString());
              }
              if (((contract instanceof RecommendationContract) && (!privacyLabelContractFound))) {
                privacyLabelContractFound = true;
                privacyLabelContractName = "RecommendationContract";
                final boolean s = ((RecommendationContract) contract).isS();
                int _xifexpression = (int) 0;
                if (s) {
                  _xifexpression = 1;
                } else {
                  _xifexpression = 0;
                }
                privacyLabelLevel = _xifexpression;
                this.upsertLabel_Edge(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLabelLevel);
                StringConcatenation _builder_6 = new StringConcatenation();
                _builder_6.append("[DEBUG] Label propagation of edge ");
                String _iD_2 = outgoing.getID();
                _builder_6.append(_iD_2);
                _builder_6.append(", ");
                int _number_2 = outgoing.getNumber();
                _builder_6.append(_number_2);
                InputOutput.<String>println(_builder_6.toString());
                StringConcatenation _builder_7 = new StringConcatenation();
                _builder_7.append("[DEBUG]   Found ");
                _builder_7.append(privacyLabelContractName);
                _builder_7.append(", setting Privacy=");
                _builder_7.append(privacyLabelLevel);
                _builder_7.append(" (person-specific=");
                _builder_7.append(s);
                _builder_7.append(")");
                InputOutput.<String>println(_builder_7.toString());
                StringConcatenation _builder_8 = new StringConcatenation();
                _builder_8.append("[DEBUG]   Edge labels after setting Privacy: ");
                final Function1<EdgeLabel, String> _function_3 = (EdgeLabel it_1) -> {
                  String _literal = it_1.getObjective().getLiteral();
                  String _plus = (_literal + "=");
                  int _level = it_1.getLevel();
                  return (_plus + Integer.valueOf(_level));
                };
                String _join_2 = IterableExtensions.join(ListExtensions.<EdgeLabel, String>map(outgoing.getEdgelabel(), _function_3), ", ");
                _builder_8.append(_join_2);
                InputOutput.<String>println(_builder_8.toString());
              }
              if (((contract instanceof ClusteringContract) && (!privacyLabelContractFound))) {
                privacyLabelContractFound = true;
                privacyLabelContractName = "ClusteringContract";
                final Function1<GraphAsset, Boolean> _function_4 = (GraphAsset ina) -> {
                  boolean _xblockexpression = false;
                  {
                    final int inaPrivacyLevel = this.levelOf(ina.getAssetlabel(), Objective.PRIVACY);
                    _xblockexpression = (inaPrivacyLevel != 0);
                  }
                  return Boolean.valueOf(_xblockexpression);
                };
                boolean _exists = IterableExtensions.<GraphAsset>exists(nr.getIncomingassets(), _function_4);
                final boolean allPrivacyLabelsAreN = (!_exists);
                int _xifexpression_1 = (int) 0;
                if (allPrivacyLabelsAreN) {
                  _xifexpression_1 = 0;
                } else {
                  _xifexpression_1 = 1;
                }
                privacyLabelLevel = _xifexpression_1;
                this.upsertLabel_Edge(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLabelLevel);
                StringConcatenation _builder_9 = new StringConcatenation();
                _builder_9.append("[DEBUG] Label propagation of edge ");
                String _iD_3 = outgoing.getID();
                _builder_9.append(_iD_3);
                _builder_9.append(", ");
                int _number_3 = outgoing.getNumber();
                _builder_9.append(_number_3);
                InputOutput.<String>println(_builder_9.toString());
                StringConcatenation _builder_10 = new StringConcatenation();
                _builder_10.append("[DEBUG]   Found ");
                _builder_10.append(privacyLabelContractName);
                _builder_10.append(", setting Privacy=");
                _builder_10.append(privacyLabelLevel);
                _builder_10.append(" (all inputs N=");
                _builder_10.append(allPrivacyLabelsAreN);
                _builder_10.append(")");
                InputOutput.<String>println(_builder_10.toString());
                StringConcatenation _builder_11 = new StringConcatenation();
                _builder_11.append("[DEBUG]   Edge labels after setting Privacy: ");
                final Function1<EdgeLabel, String> _function_5 = (EdgeLabel it_1) -> {
                  String _literal = it_1.getObjective().getLiteral();
                  String _plus = (_literal + "=");
                  int _level = it_1.getLevel();
                  return (_plus + Integer.valueOf(_level));
                };
                String _join_3 = IterableExtensions.join(ListExtensions.<EdgeLabel, String>map(outgoing.getEdgelabel(), _function_5), ", ");
                _builder_11.append(_join_3);
                InputOutput.<String>println(_builder_11.toString());
              }
            }
          }
          final boolean hasPrivacyLabelContract = privacyLabelContractFound;
          EList<GraphAsset> _graphassets = outgoing.getGraphassets();
          for (final GraphAsset ga : _graphassets) {
            {
              final ArrayList<NodeResponsibility> r = CollectionLiterals.<NodeResponsibility>newArrayList();
              EList<NodeResponsibility> _responsibility_1 = node.getResponsibility();
              for (final NodeResponsibility nrCollect : _responsibility_1) {
                boolean _contains = nrCollect.getOutgoingassets().contains(ga);
                if (_contains) {
                  r.add(nrCollect);
                }
              }
              for (final NodeResponsibility nrProcess : r) {
                {
                  final ContractBase contractProcess = this.findContract(nrProcess);
                  final boolean hasPrivacyLabel = (((((this.getPrivacyLabelFromContract(contractProcess) != null) || (contractProcess instanceof ClusteringContract)) || (contractProcess instanceof PredictionContract)) || (contractProcess instanceof DimensionalityReductionContract)) || (contractProcess instanceof DataGenerationContract));
                  if (hasPrivacyLabel) {
                    if ((contractProcess instanceof PredictionContract)) {
                      final boolean s = ((PredictionContract) contractProcess).isS();
                      int pMax = 0;
                      EList<GraphAsset> _incomingassets = nrProcess.getIncomingassets();
                      for (final GraphAsset ina : _incomingassets) {
                        {
                          final int inaPrivacyLevel = this.levelOf(ina.getAssetlabel(), Objective.PRIVACY);
                          pMax = Math.max(pMax, inaPrivacyLevel);
                        }
                      }
                      int _xifexpression = (int) 0;
                      if ((pMax == 0)) {
                        _xifexpression = 0;
                      } else {
                        int _xifexpression_1 = (int) 0;
                        if (s) {
                          _xifexpression_1 = pMax;
                        } else {
                          _xifexpression_1 = 1;
                        }
                        _xifexpression = _xifexpression_1;
                      }
                      final int privacyLevel = _xifexpression;
                      this.upsertLabel_Edge(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLevel);
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("[DEBUG] Label propagation of edge ");
                      String _iD = outgoing.getID();
                      _builder.append(_iD);
                      _builder.append(", ");
                      int _number = outgoing.getNumber();
                      _builder.append(_number);
                      InputOutput.<String>println(_builder.toString());
                      StringConcatenation _builder_1 = new StringConcatenation();
                      _builder_1.append("[DEBUG]   Found PredictionContract, p_max=");
                      _builder_1.append(pMax);
                      _builder_1.append(", s=");
                      _builder_1.append(s);
                      _builder_1.append(", setting Privacy=");
                      _builder_1.append(privacyLevel);
                      InputOutput.<String>println(_builder_1.toString());
                      Objective[] _values = Objective.values();
                      for (final Objective o : _values) {
                        boolean _notEquals = (!Objects.equals(o, Objective.PRIVACY));
                        if (_notEquals) {
                          int max = 0;
                          EList<GraphAsset> _incomingassets_1 = nrProcess.getIncomingassets();
                          for (final GraphAsset ina_1 : _incomingassets_1) {
                            max = Math.max(max, this.levelOf(ina_1.getAssetlabel(), o));
                          }
                          this.upsertLabel_Edge(outgoing.getEdgelabel(), o, max);
                        }
                      }
                    } else {
                      if ((contractProcess instanceof DimensionalityReductionContract)) {
                        final int k = ((DimensionalityReductionContract) contractProcess).getK();
                        int pMax_1 = 0;
                        EList<GraphAsset> _incomingassets_2 = nrProcess.getIncomingassets();
                        for (final GraphAsset ina_2 : _incomingassets_2) {
                          {
                            final int inaPrivacyLevel = this.levelOf(ina_2.getAssetlabel(), Objective.PRIVACY);
                            pMax_1 = Math.max(pMax_1, inaPrivacyLevel);
                          }
                        }
                        int privacyLevel_1 = pMax_1;
                        for (int i = 0; (i < k); i++) {
                          privacyLevel_1 = this.reducePrivacyLevel(privacyLevel_1);
                        }
                        this.upsertLabel_Edge(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLevel_1);
                        StringConcatenation _builder_2 = new StringConcatenation();
                        _builder_2.append("[DEBUG] Label propagation of edge ");
                        String _iD_1 = outgoing.getID();
                        _builder_2.append(_iD_1);
                        _builder_2.append(", ");
                        int _number_1 = outgoing.getNumber();
                        _builder_2.append(_number_1);
                        InputOutput.<String>println(_builder_2.toString());
                        StringConcatenation _builder_3 = new StringConcatenation();
                        _builder_3.append("[DEBUG]   Found DimensionalityReductionContract, p_max=");
                        _builder_3.append(pMax_1);
                        _builder_3.append(", k=");
                        _builder_3.append(k);
                        _builder_3.append(", setting Privacy=");
                        _builder_3.append(privacyLevel_1);
                        InputOutput.<String>println(_builder_3.toString());
                        Objective[] _values_1 = Objective.values();
                        for (final Objective o_1 : _values_1) {
                          boolean _notEquals_1 = (!Objects.equals(o_1, Objective.PRIVACY));
                          if (_notEquals_1) {
                            int max_1 = 0;
                            EList<GraphAsset> _incomingassets_3 = nrProcess.getIncomingassets();
                            for (final GraphAsset ina_3 : _incomingassets_3) {
                              max_1 = Math.max(max_1, this.levelOf(ina_3.getAssetlabel(), o_1));
                            }
                            this.upsertLabel_Edge(outgoing.getEdgelabel(), o_1, max_1);
                          }
                        }
                      } else {
                        if ((contractProcess instanceof DataGenerationContract)) {
                          final DataGenerationDirection direction = ((DataGenerationContract) contractProcess).getDirection();
                          final int k_1 = ((DataGenerationContract) contractProcess).getK();
                          int pMax_2 = 0;
                          EList<GraphAsset> _incomingassets_4 = nrProcess.getIncomingassets();
                          for (final GraphAsset ina_4 : _incomingassets_4) {
                            {
                              final int inaPrivacyLevel = this.levelOf(ina_4.getAssetlabel(), Objective.PRIVACY);
                              pMax_2 = Math.max(pMax_2, inaPrivacyLevel);
                            }
                          }
                          int privacyLevel_2 = pMax_2;
                          if ((direction != null)) {
                            boolean _equals = Objects.equals(direction, DataGenerationDirection.REDUCE);
                            if (_equals) {
                              for (int i = 0; (i < k_1); i++) {
                                privacyLevel_2 = this.reducePrivacyLevel(privacyLevel_2);
                              }
                            } else {
                              boolean _equals_1 = Objects.equals(direction, DataGenerationDirection.ELEVATE);
                              if (_equals_1) {
                                for (int i = 0; (i < k_1); i++) {
                                  privacyLevel_2 = this.elevatePrivacyLevel(privacyLevel_2);
                                }
                              }
                            }
                          }
                          this.upsertLabel_Edge(outgoing.getEdgelabel(), Objective.PRIVACY, privacyLevel_2);
                          StringConcatenation _builder_4 = new StringConcatenation();
                          _builder_4.append("[DEBUG] Label propagation of edge ");
                          String _iD_2 = outgoing.getID();
                          _builder_4.append(_iD_2);
                          _builder_4.append(", ");
                          int _number_2 = outgoing.getNumber();
                          _builder_4.append(_number_2);
                          InputOutput.<String>println(_builder_4.toString());
                          StringConcatenation _builder_5 = new StringConcatenation();
                          _builder_5.append("[DEBUG]   Found DataGenerationContract, p_max=");
                          _builder_5.append(pMax_2);
                          _builder_5.append(", direction=");
                          _builder_5.append(direction);
                          _builder_5.append(", k=");
                          _builder_5.append(k_1);
                          _builder_5.append(", setting Privacy=");
                          _builder_5.append(privacyLevel_2);
                          InputOutput.<String>println(_builder_5.toString());
                          Objective[] _values_2 = Objective.values();
                          for (final Objective o_2 : _values_2) {
                            boolean _notEquals_2 = (!Objects.equals(o_2, Objective.PRIVACY));
                            if (_notEquals_2) {
                              int max_2 = 0;
                              EList<GraphAsset> _incomingassets_5 = nrProcess.getIncomingassets();
                              for (final GraphAsset ina_5 : _incomingassets_5) {
                                max_2 = Math.max(max_2, this.levelOf(ina_5.getAssetlabel(), o_2));
                              }
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_2, max_2);
                            }
                          }
                        } else {
                          Objective[] _values_3 = Objective.values();
                          for (final Objective o_3 : _values_3) {
                            boolean _notEquals_3 = (!Objects.equals(o_3, Objective.PRIVACY));
                            if (_notEquals_3) {
                              int max_3 = 0;
                              EList<GraphAsset> _incomingassets_6 = nrProcess.getIncomingassets();
                              for (final GraphAsset ina_6 : _incomingassets_6) {
                                max_3 = Math.max(max_3, this.levelOf(ina_6.getAssetlabel(), o_3));
                              }
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_3, max_3);
                            }
                          }
                        }
                      }
                    }
                  } else {
                    String _string = nrProcess.getTask().toString();
                    if (_string != null) {
                      switch (_string) {
                        case "[EncryptOrHash]":
                          Objective[] _values_4 = Objective.values();
                          for (final Objective o_4 : _values_4) {
                            if ((Objects.equals(o_4, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_4, 0);
                            }
                          }
                          break;
                        case "[Decrypt]":
                          Objective[] _values_5 = Objective.values();
                          for (final Objective o_5 : _values_5) {
                            if ((Objects.equals(o_5, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              int max_4 = 0;
                              EList<GraphAsset> _incomingassets_7 = nrProcess.getIncomingassets();
                              for (final GraphAsset ina_7 : _incomingassets_7) {
                                max_4 = Math.max(max_4, this.levelOf(ina_7.getAssetlabel(), o_5));
                              }
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_5, max_4);
                            }
                          }
                          break;
                        case "[Comparator]":
                          Objective[] _values_6 = Objective.values();
                          for (final Objective o_6 : _values_6) {
                            if ((Objects.equals(o_6, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              int max_5 = 0;
                              EList<GraphAsset> _incomingassets_8 = nrProcess.getIncomingassets();
                              for (final GraphAsset ina_8 : _incomingassets_8) {
                                max_5 = Math.max(max_5, this.levelOf(ina_8.getAssetlabel(), o_6));
                              }
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_6, max_5);
                            }
                          }
                          break;
                        case "[Joiner]":
                          Objective[] _values_7 = Objective.values();
                          for (final Objective o_7 : _values_7) {
                            if ((Objects.equals(o_7, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              int max_6 = 0;
                              EList<GraphAsset> _incomingassets_9 = nrProcess.getIncomingassets();
                              for (final GraphAsset ina_9 : _incomingassets_9) {
                                max_6 = Math.max(max_6, this.levelOf(ina_9.getAssetlabel(), o_7));
                              }
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_7, max_6);
                            }
                          }
                          break;
                        case "[User]":
                          Objective[] _values_8 = Objective.values();
                          for (final Objective o_8 : _values_8) {
                            if ((Objects.equals(o_8, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              int max_7 = 0;
                              EList<GraphAsset> _incomingassets_10 = nrProcess.getIncomingassets();
                              for (final GraphAsset ina_10 : _incomingassets_10) {
                                max_7 = Math.max(max_7, this.levelOf(ina_10.getAssetlabel(), o_8));
                              }
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_8, max_7);
                            }
                          }
                          break;
                        case "[Splitter]":
                          Objective[] _values_9 = Objective.values();
                          for (final Objective o_9 : _values_9) {
                            if ((Objects.equals(o_9, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              int max_8 = 0;
                              EList<GraphAsset> _incomingassets_11 = nrProcess.getIncomingassets();
                              for (final GraphAsset ina_11 : _incomingassets_11) {
                                max_8 = Math.max(max_8, this.levelOf(ina_11.getAssetlabel(), o_9));
                              }
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_9, max_8);
                            }
                          }
                          break;
                        case "[Copier]":
                          Objective[] _values_10 = Objective.values();
                          for (final Objective o_10 : _values_10) {
                            if ((Objects.equals(o_10, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_10, this.levelOf(nrProcess.getIncomingassets().get(0).getAssetlabel(), o_10));
                            }
                          }
                          break;
                        case "[Forward]":
                          Objective[] _values_11 = Objective.values();
                          for (final Objective o_11 : _values_11) {
                            if ((Objects.equals(o_11, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_11, this.levelOf(nrProcess.getIncomingassets().get(0).getAssetlabel(), o_11));
                            }
                          }
                          break;
                        case "[Store]":
                          Objective[] _values_12 = Objective.values();
                          for (final Objective o_12 : _values_12) {
                            if ((Objects.equals(o_12, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                            } else {
                              int max_9 = 0;
                              EList<GraphAsset> _incomingassets_12 = nrProcess.getIncomingassets();
                              for (final GraphAsset ina_12 : _incomingassets_12) {
                                max_9 = Math.max(max_9, this.levelOf(ina_12.getAssetlabel(), o_12));
                              }
                              this.upsertLabel_Edge(outgoing.getEdgelabel(), o_12, max_9);
                            }
                          }
                          break;
                        default:
                          break;
                      }
                    } else {
                    }
                  }
                }
              }
            }
          }
          final Function1<EdgeLabel, Boolean> _function_1 = (EdgeLabel l) -> {
            Objective _objective = l.getObjective();
            return Boolean.valueOf(Objects.equals(_objective, Objective.PRIVACY));
          };
          boolean _isEmpty = IterableExtensions.isEmpty(IterableExtensions.<EdgeLabel>filter(outgoing.getEdgelabel(), _function_1));
          final boolean hasPrivacyLabel = (!_isEmpty);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("[DEBUG] After asset loop - hasPrivacyLabelContract=");
          _builder.append(hasPrivacyLabelContract);
          _builder.append(", hasPrivacyLabel=");
          _builder.append(hasPrivacyLabel);
          InputOutput.<String>println(_builder.toString());
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("[DEBUG]   Current edge labels: ");
          final Function1<EdgeLabel, String> _function_2 = (EdgeLabel it_1) -> {
            String _literal = it_1.getObjective().getLiteral();
            String _plus = (_literal + "=");
            int _level = it_1.getLevel();
            return (_plus + Integer.valueOf(_level));
          };
          String _join = IterableExtensions.join(ListExtensions.<EdgeLabel, String>map(outgoing.getEdgelabel(), _function_2), ", ");
          _builder_1.append(_join);
          InputOutput.<String>println(_builder_1.toString());
          boolean _isEmpty_1 = outgoing.getEdgelabel().isEmpty();
          if (_isEmpty_1) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("[DEBUG] Edge is empty, setting labels from assets (skipping Privacy if contract exists)");
            InputOutput.<String>println(_builder_2.toString());
            Objective[] _values = Objective.values();
            for (final Objective o : _values) {
              if ((Objects.equals(o, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("[DEBUG]   Skipping Privacy (set by contract)");
                InputOutput.<String>println(_builder_3.toString());
              } else {
                int max = 0;
                EList<GraphAsset> _graphassets_1 = outgoing.getGraphassets();
                for (final GraphAsset gs : _graphassets_1) {
                  max = Math.max(max, this.levelOf(gs.getAssetlabel(), o));
                }
                if ((max > 0)) {
                  this.upsertLabel_Edge(outgoing.getEdgelabel(), o, max);
                }
              }
            }
          } else {
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("[DEBUG] Edge has labels, adding missing ones from assets");
            InputOutput.<String>println(_builder_4.toString());
            Objective[] _values_1 = Objective.values();
            for (final Objective o_1 : _values_1) {
              {
                final Function1<EdgeLabel, Boolean> _function_3 = (EdgeLabel l) -> {
                  Objective _objective = l.getObjective();
                  return Boolean.valueOf(Objects.equals(_objective, o_1));
                };
                boolean _isEmpty_2 = IterableExtensions.isEmpty(IterableExtensions.<EdgeLabel>filter(outgoing.getEdgelabel(), _function_3));
                final boolean hasLabel = (!_isEmpty_2);
                if ((!hasLabel)) {
                  if ((Objects.equals(o_1, Objective.PRIVACY) && hasPrivacyLabelContract)) {
                    StringConcatenation _builder_5 = new StringConcatenation();
                    _builder_5.append("[DEBUG]   Privacy missing but contract exists - should have been set above!");
                    InputOutput.<String>println(_builder_5.toString());
                  } else {
                    int max_1 = 0;
                    EList<GraphAsset> _graphassets_2 = outgoing.getGraphassets();
                    for (final GraphAsset gs_1 : _graphassets_2) {
                      max_1 = Math.max(max_1, this.levelOf(gs_1.getAssetlabel(), o_1));
                    }
                    if ((max_1 > 0)) {
                      this.upsertLabel_Edge(outgoing.getEdgelabel(), o_1, max_1);
                    }
                  }
                }
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

  /**
   * Return the label-level for OBJ or 0 if the label is missing
   */
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

  public Integer getPrivacyLabelFromContract(final ContractBase contract) {
    if ((contract == null)) {
      return null;
    }
    if ((contract instanceof ClassificationContract)) {
      final Priority pClass = ((ClassificationContract) contract).getPClass();
      int _xifexpression = (int) 0;
      if ((pClass != null)) {
        _xifexpression = this.lvl(pClass);
      } else {
        _xifexpression = this.lvl(Priority.L);
      }
      return Integer.valueOf(_xifexpression);
    }
    if ((contract instanceof DecisionMakingContract)) {
      final Priority pAction = ((DecisionMakingContract) contract).getPAction();
      int _xifexpression_1 = (int) 0;
      if ((pAction != null)) {
        _xifexpression_1 = this.lvl(pAction);
      } else {
        _xifexpression_1 = this.lvl(Priority.L);
      }
      return Integer.valueOf(_xifexpression_1);
    }
    if ((contract instanceof RecommendationContract)) {
      final boolean s = ((RecommendationContract) contract).isS();
      int _xifexpression_2 = (int) 0;
      if (s) {
        _xifexpression_2 = 1;
      } else {
        _xifexpression_2 = 0;
      }
      return Integer.valueOf(_xifexpression_2);
    }
    if ((contract instanceof ClusteringContract)) {
      return null;
    }
    return null;
  }

  public void upsertLabel_Asset(final EList<AssetLabel> list, final Objective o, final int level) {
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

  public void upsertLabel_Edge(final EList<EdgeLabel> list, final Objective o, final int level) {
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
