package edfdtosimplegraph;

import com.google.common.collect.Iterables;
import edfdtosimplegraph.Assets;
import edfdtosimplegraph.Boundaries;
import edfdtosimplegraph.BoundariesAssets;
import edfdtosimplegraph.DSElements;
import edfdtosimplegraph.EDFD;
import edfdtosimplegraph.EDFDAsset;
import edfdtosimplegraph.EEElements;
import edfdtosimplegraph.EEandDSElement;
import edfdtosimplegraph.NodeElements;
import edfdtosimplegraph.ProcessElements;
import edfdtosimplegraph.Responsibilities;
import graph.Edge;
import graph.GraphAsset;
import graph.GraphPackage;
import graph.Identifiable;
import graph.Node;
import graph.NodeResponsibility;
import graph.Subgraphs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.secdfd.model.Asset;
import org.secdfd.model.AttackerProfile;
import org.secdfd.model.DataStore;
import org.secdfd.model.Element;
import org.secdfd.model.ExternalEntity;
import org.secdfd.model.Flow;
import org.secdfd.model.NamedEntity;
import org.secdfd.model.Responsibility;
import org.secdfd.model.ResponsibilityType;
import org.secdfd.model.TrustZone;
import org.secdfd.model.Value;
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
        final Procedure1<GraphAsset> _function = (GraphAsset it_1) -> {
          try {
            boolean confidential = false;
            for (final Value av : eDFDAssetValues) {
              String _string = av.getObjective().toString();
              boolean _equals = Objects.equals(_string, "Confidentiality");
              if (_equals) {
                confidential = true;
              }
            }
            if ((confidential == true)) {
              this.manipulation.set(it_1, this.graphPackage.getGraphAsset_Label(), Integer.valueOf(1));
            } else {
              this.manipulation.set(it_1, this.graphPackage.getGraphAsset_Label(), Integer.valueOf(0));
            }
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        final GraphAsset gA = ObjectExtensions.<GraphAsset>operator_doubleArrow(((GraphAsset) _createChild), _function);
        gA.setID(eDFDAsset.getName());
        EObject _createChild_1 = this.manipulation.createChild(this.edfd2graph, this.trPackage.getEDFDToGraph_EdfdGraphTraces(), this.trPackage.getEDFDGraphTrace());
        final Procedure1<EObject> _function_1 = (EObject it_1) -> {
          try {
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_EdfdElements(), eDFDAsset);
            this.manipulation.addTo(it_1, this.trPackage.getEDFDGraphTrace_GraphElements(), gA);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        ObjectExtensions.<EObject>operator_doubleArrow(_createChild_1, _function_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    })).build();

  private final BatchTransformationRule<Responsibilities.Match, Responsibilities.Matcher> eDFDProcessResponsibilitiesRule = this._batchTransformationRuleFactory.<Responsibilities.Match, Responsibilities.Matcher>createRule().precondition(Responsibilities.Matcher.querySpecification()).action(
    ((Consumer<Responsibilities.Match>) (Responsibilities.Match it) -> {
      try {
        final Responsibility eDFDResponsibility = it.getR();
        org.secdfd.model.Process _process = eDFDResponsibility.getProcess();
        final NamedEntity eDFDResponsibilityProcess = ((NamedEntity) _process);
        final EList<Asset> eDFDIncomingAssets = eDFDResponsibility.getIncomeassets();
        final EList<Asset> eDFDOutgoingAssets = eDFDResponsibility.getOutcomeassets();
        final EList<ResponsibilityType> eDFDResponsibilityActions = eDFDResponsibility.getAction();
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
            this.manipulation.addTo(it_1, this.graphPackage.getNodeResponsibility_Operation(), eDFDResponsibilityActions);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        final Identifiable graphResponsibility = ObjectExtensions.<Identifiable>operator_doubleArrow(((Identifiable) _createChild), _function);
        graphResponsibility.setID(eDFDResponsibilityProcess.getName().concat(eDFDResponsibilityActions.toString()).concat(eDFDResponsibility.getIncomeassets().toString()));
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
      final EList<Responsibility> eDFDProcessResponsibilities = eDFDProcess.getResponsibility();
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
      for (final Responsibility r : eDFDProcessResponsibilities) {
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

  private final BatchTransformationRule<EEandDSElement.Match, EEandDSElement.Matcher> initLabels = this._batchTransformationRuleFactory.<EEandDSElement.Match, EEandDSElement.Matcher>createRule().precondition(EEandDSElement.Matcher.querySpecification()).action(
    ((Consumer<EEandDSElement.Match>) (EEandDSElement.Match it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Inferring labels for: ");
      String _name = it.getEl().getName();
      _builder.append(_name);
      InputOutput.<String>print(_builder.toString());
      final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, null), Subgraphs.class));
      Element _el = it.getEl();
      Node locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) _el)), Node.class));
      EList<Node> _nodes = subgraph.getNodes();
      for (final Node n : _nodes) {
        String _name_1 = n.getName();
        String _name_2 = locate_correct_graph_node.getName();
        boolean _equals = Objects.equals(_name_1, _name_2);
        if (_equals) {
          locate_correct_graph_node = n;
        }
      }
      EList<Edge> _outedges = locate_correct_graph_node.getOutedges();
      for (final Edge e : _outedges) {
        {
          e.setVisited(true);
          int setlabel = (-1);
          EList<GraphAsset> _graphassets = e.getGraphassets();
          for (final GraphAsset gs : _graphassets) {
            int _label = gs.getLabel();
            boolean _greaterThan = (_label > setlabel);
            if (_greaterThan) {
              setlabel = gs.getLabel();
            }
          }
          e.setEdgeLabel(setlabel);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(" ");
          _builder_1.append("to ");
          int _edgeLabel = e.getEdgeLabel();
          _builder_1.append(_edgeLabel, " ");
          InputOutput.<String>print(_builder_1.toString());
          InputOutput.println();
        }
      }
    })).build();

  public Boolean recursiveDFS(final Node node) {
    boolean _isVisited = node.isVisited();
    boolean _equals = (_isVisited == false);
    if (_equals) {
      node.setVisited(true);
      final ArrayList<Node> neighbor_nodes = CollectionLiterals.<Node>newArrayList();
      EList<Edge> _outedges = node.getOutedges();
      for (final Edge outgoing : _outedges) {
        {
          outgoing.setVisited(true);
          EList<GraphAsset> _graphassets = outgoing.getGraphassets();
          for (final GraphAsset ga : _graphassets) {
            {
              ArrayList<NodeResponsibility> r = CollectionLiterals.<NodeResponsibility>newArrayList();
              EList<NodeResponsibility> _responsibility = node.getResponsibility();
              for (final NodeResponsibility noder : _responsibility) {
                boolean _contains = noder.getOutgoingassets().contains(ga);
                if (_contains) {
                  r.add(noder);
                }
              }
              for (final NodeResponsibility nr : r) {
                String _string = nr.getOperation().toString();
                if (_string != null) {
                  switch (_string) {
                    case "[EncryptOrHash]":
                      outgoing.setEdgeLabel(0);
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("Label propagation of edge ");
                      String _iD = outgoing.getID();
                      _builder.append(_iD);
                      InputOutput.<String>print(_builder.toString());
                      StringConcatenation _builder_1 = new StringConcatenation();
                      _builder_1.append(" ");
                      _builder_1.append("is ");
                      int _edgeLabel = outgoing.getEdgeLabel();
                      _builder_1.append(_edgeLabel, " ");
                      InputOutput.<String>print(_builder_1.toString());
                      StringConcatenation _builder_2 = new StringConcatenation();
                      _builder_2.append(" ");
                      _builder_2.append("for ecrypting asset:");
                      String _iD_1 = ga.getID();
                      _builder_2.append(_iD_1, " ");
                      InputOutput.<String>print(_builder_2.toString());
                      InputOutput.println();
                      break;
                    case "[Decrypt]":
                      int most_restrictive = (-1);
                      EList<GraphAsset> _incomingassets = nr.getIncomingassets();
                      for (final GraphAsset i : _incomingassets) {
                        int _label = i.getLabel();
                        boolean _greaterThan = (_label > most_restrictive);
                        if (_greaterThan) {
                          most_restrictive = i.getLabel();
                        }
                      }
                      if ((most_restrictive == 1)) {
                        outgoing.setEdgeLabel(1);
                      } else {
                        outgoing.setEdgeLabel(0);
                      }
                      StringConcatenation _builder_3 = new StringConcatenation();
                      _builder_3.append("Label propagation of edge ");
                      String _iD_2 = outgoing.getID();
                      _builder_3.append(_iD_2);
                      InputOutput.<String>print(_builder_3.toString());
                      StringConcatenation _builder_4 = new StringConcatenation();
                      _builder_4.append(" ");
                      _builder_4.append("is ");
                      int _edgeLabel_1 = outgoing.getEdgeLabel();
                      _builder_4.append(_edgeLabel_1, " ");
                      InputOutput.<String>print(_builder_4.toString());
                      StringConcatenation _builder_5 = new StringConcatenation();
                      _builder_5.append(" ");
                      _builder_5.append("for decrypting asset:");
                      String _iD_3 = ga.getID();
                      _builder_5.append(_iD_3, " ");
                      InputOutput.<String>print(_builder_5.toString());
                      InputOutput.println();
                      break;
                    case "[Comparator]":
                      int most_restrictive_1 = (-1);
                      EList<GraphAsset> _incomingassets_1 = nr.getIncomingassets();
                      for (final GraphAsset i_1 : _incomingassets_1) {
                        int _label_1 = i_1.getLabel();
                        boolean _greaterThan_1 = (_label_1 > most_restrictive_1);
                        if (_greaterThan_1) {
                          most_restrictive_1 = i_1.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_1);
                      StringConcatenation _builder_6 = new StringConcatenation();
                      _builder_6.append("Label propagation of edge ");
                      String _iD_4 = outgoing.getID();
                      _builder_6.append(_iD_4);
                      InputOutput.<String>print(_builder_6.toString());
                      StringConcatenation _builder_7 = new StringConcatenation();
                      _builder_7.append(" ");
                      _builder_7.append("is ");
                      int _edgeLabel_2 = outgoing.getEdgeLabel();
                      _builder_7.append(_edgeLabel_2, " ");
                      InputOutput.<String>print(_builder_7.toString());
                      StringConcatenation _builder_8 = new StringConcatenation();
                      _builder_8.append(" ");
                      _builder_8.append("for comparing asset:");
                      String _iD_5 = ga.getID();
                      _builder_8.append(_iD_5, " ");
                      InputOutput.<String>print(_builder_8.toString());
                      InputOutput.println();
                      break;
                    case "[Joiner]":
                      int most_restrictive_2 = (-1);
                      EList<GraphAsset> _incomingassets_2 = nr.getIncomingassets();
                      for (final GraphAsset i_2 : _incomingassets_2) {
                        int _label_2 = i_2.getLabel();
                        boolean _greaterThan_2 = (_label_2 > most_restrictive_2);
                        if (_greaterThan_2) {
                          most_restrictive_2 = i_2.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_2);
                      StringConcatenation _builder_9 = new StringConcatenation();
                      _builder_9.append("Label propagation of edge ");
                      String _iD_6 = outgoing.getID();
                      _builder_9.append(_iD_6);
                      InputOutput.<String>print(_builder_9.toString());
                      StringConcatenation _builder_10 = new StringConcatenation();
                      _builder_10.append(" ");
                      _builder_10.append("is ");
                      int _edgeLabel_3 = outgoing.getEdgeLabel();
                      _builder_10.append(_edgeLabel_3, " ");
                      InputOutput.<String>print(_builder_10.toString());
                      StringConcatenation _builder_11 = new StringConcatenation();
                      _builder_11.append(" ");
                      _builder_11.append("for joining asset:");
                      String _iD_7 = ga.getID();
                      _builder_11.append(_iD_7, " ");
                      InputOutput.<String>print(_builder_11.toString());
                      InputOutput.println();
                      break;
                    case "[Splitter]":
                      int most_restrictive_3 = (-1);
                      EList<GraphAsset> _incomingassets_3 = nr.getIncomingassets();
                      for (final GraphAsset i_3 : _incomingassets_3) {
                        int _label_3 = i_3.getLabel();
                        boolean _greaterThan_3 = (_label_3 > most_restrictive_3);
                        if (_greaterThan_3) {
                          most_restrictive_3 = i_3.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_3);
                      StringConcatenation _builder_12 = new StringConcatenation();
                      _builder_12.append("Label propagation of edge ");
                      String _iD_8 = outgoing.getID();
                      _builder_12.append(_iD_8);
                      InputOutput.<String>print(_builder_12.toString());
                      StringConcatenation _builder_13 = new StringConcatenation();
                      _builder_13.append(" ");
                      _builder_13.append("is ");
                      int _edgeLabel_4 = outgoing.getEdgeLabel();
                      _builder_13.append(_edgeLabel_4, " ");
                      InputOutput.<String>print(_builder_13.toString());
                      StringConcatenation _builder_14 = new StringConcatenation();
                      _builder_14.append(" ");
                      _builder_14.append("for spliting asset:");
                      String _iD_9 = ga.getID();
                      _builder_14.append(_iD_9, " ");
                      InputOutput.<String>print(_builder_14.toString());
                      InputOutput.println();
                      break;
                    case "[User]":
                      int most_restrictive_4 = (-1);
                      EList<GraphAsset> _incomingassets_4 = nr.getIncomingassets();
                      for (final GraphAsset i_4 : _incomingassets_4) {
                        int _label_4 = i_4.getLabel();
                        boolean _greaterThan_4 = (_label_4 > most_restrictive_4);
                        if (_greaterThan_4) {
                          most_restrictive_4 = i_4.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_4);
                      StringConcatenation _builder_15 = new StringConcatenation();
                      _builder_15.append("Label propagation of edge ");
                      String _iD_10 = outgoing.getID();
                      _builder_15.append(_iD_10);
                      InputOutput.<String>print(_builder_15.toString());
                      StringConcatenation _builder_16 = new StringConcatenation();
                      _builder_16.append(" ");
                      _builder_16.append("is ");
                      int _edgeLabel_5 = outgoing.getEdgeLabel();
                      _builder_16.append(_edgeLabel_5, " ");
                      InputOutput.<String>print(_builder_16.toString());
                      StringConcatenation _builder_17 = new StringConcatenation();
                      _builder_17.append(" ");
                      _builder_17.append("for using asset:");
                      String _iD_11 = ga.getID();
                      _builder_17.append(_iD_11, " ");
                      InputOutput.<String>print(_builder_17.toString());
                      InputOutput.println();
                      break;
                    case "[Copier]":
                      outgoing.setEdgeLabel(nr.getIncomingassets().get(0).getLabel());
                      StringConcatenation _builder_18 = new StringConcatenation();
                      _builder_18.append("Label propagation of edge ");
                      String _iD_12 = outgoing.getID();
                      _builder_18.append(_iD_12);
                      InputOutput.<String>print(_builder_18.toString());
                      StringConcatenation _builder_19 = new StringConcatenation();
                      _builder_19.append(" ");
                      _builder_19.append("is ");
                      int _edgeLabel_6 = outgoing.getEdgeLabel();
                      _builder_19.append(_edgeLabel_6, " ");
                      InputOutput.<String>print(_builder_19.toString());
                      StringConcatenation _builder_20 = new StringConcatenation();
                      _builder_20.append(" ");
                      _builder_20.append("for copying asset:");
                      String _iD_13 = ga.getID();
                      _builder_20.append(_iD_13, " ");
                      InputOutput.<String>print(_builder_20.toString());
                      InputOutput.println();
                      break;
                    case "[Forward]":
                      outgoing.setEdgeLabel(nr.getIncomingassets().get(0).getLabel());
                      StringConcatenation _builder_21 = new StringConcatenation();
                      _builder_21.append("Label propagation of edge ");
                      String _iD_14 = outgoing.getID();
                      _builder_21.append(_iD_14);
                      InputOutput.<String>print(_builder_21.toString());
                      StringConcatenation _builder_22 = new StringConcatenation();
                      _builder_22.append(" ");
                      _builder_22.append("is ");
                      int _edgeLabel_7 = outgoing.getEdgeLabel();
                      _builder_22.append(_edgeLabel_7, " ");
                      InputOutput.<String>print(_builder_22.toString());
                      StringConcatenation _builder_23 = new StringConcatenation();
                      _builder_23.append(" ");
                      _builder_23.append("for forwarding asset:");
                      String _iD_15 = ga.getID();
                      _builder_23.append(_iD_15, " ");
                      InputOutput.<String>print(_builder_23.toString());
                      InputOutput.println();
                      break;
                    default:
                      {
                        InputOutput.<String>print(nr.getOperation().toString());
                        InputOutput.<String>print("Does not effect confidentiality label propagation.");
                        InputOutput.println();
                      }
                      break;
                  }
                } else {
                  {
                    InputOutput.<String>print(nr.getOperation().toString());
                    InputOutput.<String>print("Does not effect confidentiality label propagation.");
                    InputOutput.println();
                  }
                }
              }
            }
          }
          int _edgeLabel = outgoing.getEdgeLabel();
          boolean _equals_1 = (_edgeLabel == (-1));
          if (_equals_1) {
            Edge edgecontainingassets = node.getInedges().get(0);
            EList<Edge> _inedges = node.getInedges();
            for (final Edge e : _inedges) {
              boolean _containsAll = e.getGraphassets().containsAll(outgoing.getGraphassets());
              if (_containsAll) {
                edgecontainingassets = e;
              }
            }
            outgoing.setEdgeLabel(edgecontainingassets.getEdgeLabel());
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Label inferred for edge ");
            String _iD = outgoing.getID();
            _builder.append(_iD);
            InputOutput.<String>print(_builder.toString());
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(" ");
            _builder_1.append("to ");
            int _edgeLabel_1 = outgoing.getEdgeLabel();
            _builder_1.append(_edgeLabel_1, " ");
            InputOutput.<String>print(_builder_1.toString());
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append(" ");
            _builder_2.append("since no label propagation rules apply to this edge.");
            InputOutput.<String>print(_builder_2.toString());
            InputOutput.println();
          }
          neighbor_nodes.addAll(outgoing.getTarget());
        }
      }
      for (final Node neighbor : neighbor_nodes) {
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("...Next target: ");
          String _name = neighbor.getName();
          _builder.append(_name);
          InputOutput.<String>println(_builder.toString());
          this.recursiveDFS(neighbor);
        }
      }
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(true);
  }

  private final BatchTransformationRule<DSElements.Match, DSElements.Matcher> propagateLabelsDS = this._batchTransformationRuleFactory.<DSElements.Match, DSElements.Matcher>createRule().precondition(DSElements.Matcher.querySpecification()).action(
    ((Consumer<DSElements.Match>) (DSElements.Match it) -> {
      int _length = ((Object[])Conversions.unwrapArray(it.getDs().getOutflows(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, null), Subgraphs.class));
        DataStore _ds = it.getDs();
        Node locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) _ds)), Node.class));
        EList<Node> _nodes = subgraph.getNodes();
        for (final Node n : _nodes) {
          String _name = n.getName();
          String _name_1 = locate_correct_graph_node.getName();
          boolean _equals = Objects.equals(_name, _name_1);
          if (_equals) {
            locate_correct_graph_node = n;
          }
        }
        InputOutput.println();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Starting propagation at: ");
        String _name_2 = it.getDs().getName();
        _builder.append(_name_2);
        InputOutput.<String>println(_builder.toString());
        this.recursiveDFS(locate_correct_graph_node);
      }
    })).build();

  private final BatchTransformationRule<EEElements.Match, EEElements.Matcher> propagateLabelsEE = this._batchTransformationRuleFactory.<EEElements.Match, EEElements.Matcher>createRule().precondition(EEElements.Matcher.querySpecification()).action(
    ((Consumer<EEElements.Match>) (EEElements.Match it) -> {
      int _length = ((Object[])Conversions.unwrapArray(it.getEe().getOutflows(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        final Subgraphs subgraph = IterableExtensions.<Subgraphs>head(Iterables.<Subgraphs>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, null), Subgraphs.class));
        ExternalEntity _ee = it.getEe();
        Node locate_correct_graph_node = IterableExtensions.<Node>head(Iterables.<Node>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) _ee)), Node.class));
        EList<Node> _nodes = subgraph.getNodes();
        for (final Node n : _nodes) {
          String _name = n.getName();
          String _name_1 = locate_correct_graph_node.getName();
          boolean _equals = Objects.equals(_name, _name_1);
          if (_equals) {
            locate_correct_graph_node = n;
          }
        }
        InputOutput.println();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Starting propagation at: ");
        String _name_2 = it.getEe().getName();
        _builder.append(_name_2);
        InputOutput.<String>println(_builder.toString());
        this.recursiveDFS(locate_correct_graph_node);
      }
    })).build();

  private final BatchTransformationRule<EDFD.Match, EDFD.Matcher> propagateLabelsInOrder = this._batchTransformationRuleFactory.<EDFD.Match, EDFD.Matcher>createRule().precondition(EDFD.Matcher.querySpecification()).action(
    ((Consumer<EDFD.Match>) (EDFD.Match it) -> {
      final EList<Element> all_elements = it.getEdfd().getElements();
      final ArrayList<Flow> all_flows = CollectionLiterals.<Flow>newArrayList();
      for (final Element e : all_elements) {
        all_flows.addAll(e.getOutflows());
      }
      final Comparator<Flow> _function = (Flow a, Flow b) -> {
        int _number = a.getNumber();
        int _number_1 = b.getNumber();
        return (_number - _number_1);
      };
      Collections.<Flow>sort(all_flows, _function);
      for (final Element f : all_flows) {
        {
          Edge outgoing = IterableExtensions.<Edge>head(Iterables.<Edge>filter(this.edfdxformm2m.getEdfd2simplegraph(this.engine).getAllValuesOfgraphElements(null, null, ((NamedEntity) f)), Edge.class));
          Node node = outgoing.getSource();
          outgoing.setVisited(true);
          EList<GraphAsset> _graphassets = outgoing.getGraphassets();
          for (final GraphAsset ga : _graphassets) {
            {
              ArrayList<NodeResponsibility> r = CollectionLiterals.<NodeResponsibility>newArrayList();
              EList<NodeResponsibility> _responsibility = node.getResponsibility();
              for (final NodeResponsibility noder : _responsibility) {
                boolean _contains = noder.getOutgoingassets().contains(ga);
                if (_contains) {
                  r.add(noder);
                }
              }
              for (final NodeResponsibility nr : r) {
                String _string = nr.getOperation().toString();
                if (_string != null) {
                  switch (_string) {
                    case "[EncryptOrHash]":
                      break;
                    case "[Decrypt]":
                      int most_restrictive = (-1);
                      EList<GraphAsset> _incomingassets = nr.getIncomingassets();
                      for (final GraphAsset i : _incomingassets) {
                        int _label = i.getLabel();
                        boolean _greaterThan = (_label > most_restrictive);
                        if (_greaterThan) {
                          most_restrictive = i.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(1);
                      break;
                    case "[Comparator]":
                      int most_restrictive_1 = (-1);
                      EList<GraphAsset> _incomingassets_1 = nr.getIncomingassets();
                      for (final GraphAsset i_1 : _incomingassets_1) {
                        int _label_1 = i_1.getLabel();
                        boolean _greaterThan_1 = (_label_1 > most_restrictive_1);
                        if (_greaterThan_1) {
                          most_restrictive_1 = i_1.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_1);
                      break;
                    case "[Joiner]":
                      int most_restrictive_2 = (-1);
                      EList<GraphAsset> _incomingassets_2 = nr.getIncomingassets();
                      for (final GraphAsset i_2 : _incomingassets_2) {
                        int _label_2 = i_2.getLabel();
                        boolean _greaterThan_2 = (_label_2 > most_restrictive_2);
                        if (_greaterThan_2) {
                          most_restrictive_2 = i_2.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_2);
                      break;
                    case "[Splitter]":
                      int most_restrictive_3 = (-1);
                      EList<GraphAsset> _incomingassets_3 = nr.getIncomingassets();
                      for (final GraphAsset i_3 : _incomingassets_3) {
                        int _label_3 = i_3.getLabel();
                        boolean _greaterThan_3 = (_label_3 > most_restrictive_3);
                        if (_greaterThan_3) {
                          most_restrictive_3 = i_3.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_3);
                      break;
                    case "[User]":
                      int most_restrictive_4 = (-1);
                      EList<GraphAsset> _incomingassets_4 = nr.getIncomingassets();
                      for (final GraphAsset i_4 : _incomingassets_4) {
                        int _label_4 = i_4.getLabel();
                        boolean _greaterThan_4 = (_label_4 > most_restrictive_4);
                        if (_greaterThan_4) {
                          most_restrictive_4 = i_4.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_4);
                      break;
                    case "[Copier]":
                      outgoing.setEdgeLabel(nr.getIncomingassets().get(0).getLabel());
                      break;
                    case "[Forward]":
                      outgoing.setEdgeLabel(nr.getIncomingassets().get(0).getLabel());
                      break;
                    case "[Store]":
                      int most_restrictive_5 = (-1);
                      EList<GraphAsset> _incomingassets_5 = nr.getIncomingassets();
                      for (final GraphAsset i_5 : _incomingassets_5) {
                        int _label_5 = i_5.getLabel();
                        boolean _greaterThan_5 = (_label_5 > most_restrictive_5);
                        if (_greaterThan_5) {
                          most_restrictive_5 = i_5.getLabel();
                        }
                      }
                      outgoing.setEdgeLabel(most_restrictive_5);
                      break;
                    default:
                      {
                        InputOutput.<String>print(nr.getOperation().toString());
                        InputOutput.<String>print("Does not effect confidentiality label propagation.");
                        InputOutput.println();
                      }
                      break;
                  }
                } else {
                  {
                    InputOutput.<String>print(nr.getOperation().toString());
                    InputOutput.<String>print("Does not effect confidentiality label propagation.");
                    InputOutput.println();
                  }
                }
              }
              int _edgeLabel = outgoing.getEdgeLabel();
              boolean _equals = (_edgeLabel == (-1));
              if (_equals) {
                int most_restrictive_6 = (-1);
                EList<GraphAsset> _graphassets_1 = outgoing.getGraphassets();
                for (final GraphAsset i_6 : _graphassets_1) {
                  int _label_6 = i_6.getLabel();
                  boolean _greaterThan_6 = (_label_6 > most_restrictive_6);
                  if (_greaterThan_6) {
                    most_restrictive_6 = i_6.getLabel();
                  }
                }
                outgoing.setEdgeLabel(most_restrictive_6);
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("Label inferred for edge ");
                String _iD = outgoing.getID();
                _builder.append(_iD);
                InputOutput.<String>print(_builder.toString());
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append(" ");
                _builder_1.append("to ");
                int _edgeLabel_1 = outgoing.getEdgeLabel();
                _builder_1.append(_edgeLabel_1, " ");
                InputOutput.<String>print(_builder_1.toString());
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append(" ");
                _builder_2.append("since no label propagation rules apply to this edge.");
                InputOutput.<String>print(_builder_2.toString());
                InputOutput.println();
              }
              InputOutput.<Integer>print(Integer.valueOf(f.getNumber()));
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append(": ");
              InputOutput.<String>print(_builder_3.toString());
              InputOutput.<Integer>print(Integer.valueOf(outgoing.getEdgeLabel()));
              InputOutput.println();
            }
          }
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
}
