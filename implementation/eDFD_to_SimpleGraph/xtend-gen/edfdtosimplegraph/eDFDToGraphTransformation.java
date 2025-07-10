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
import org.secdfd.model.Element;
import org.secdfd.model.Flow;
import org.secdfd.model.NamedEntity;
import org.secdfd.model.Objective;
import org.secdfd.model.Priority;
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
   * switch(nr.operation.toString){
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
          EList<GraphAsset> _graphassets = outgoing.getGraphassets();
          for (final GraphAsset ga : _graphassets) {
            {
              final ArrayList<NodeResponsibility> r = CollectionLiterals.<NodeResponsibility>newArrayList();
              EList<NodeResponsibility> _responsibility = node.getResponsibility();
              for (final NodeResponsibility nr : _responsibility) {
                boolean _contains = nr.getOutgoingassets().contains(ga);
                if (_contains) {
                  r.add(nr);
                }
              }
              for (final NodeResponsibility nr_1 : r) {
                String _string = nr_1.getOperation().toString();
                if (_string != null) {
                  switch (_string) {
                    case "[EncryptOrHash]":
                      Objective[] _values = Objective.values();
                      for (final Objective o : _values) {
                        this.upsertLabel_Edge(outgoing.getEdgelabel(), o, 0);
                      }
                      break;
                    case "[Decrypt]":
                      Objective[] _values_1 = Objective.values();
                      for (final Objective o_1 : _values_1) {
                        {
                          int max = 0;
                          EList<GraphAsset> _incomingassets = nr_1.getIncomingassets();
                          for (final GraphAsset ina : _incomingassets) {
                            max = Math.max(max, this.levelOf(ina.getAssetlabel(), o_1));
                          }
                          this.upsertLabel_Edge(outgoing.getEdgelabel(), o_1, max);
                        }
                      }
                      break;
                    case "[Comparator]":
                      Objective[] _values_2 = Objective.values();
                      for (final Objective o_2 : _values_2) {
                        {
                          int max = 0;
                          EList<GraphAsset> _incomingassets = nr_1.getIncomingassets();
                          for (final GraphAsset ina : _incomingassets) {
                            max = Math.max(max, this.levelOf(ina.getAssetlabel(), o_2));
                          }
                          this.upsertLabel_Edge(outgoing.getEdgelabel(), o_2, max);
                        }
                      }
                      break;
                    case "[Joiner]":
                      Objective[] _values_3 = Objective.values();
                      for (final Objective o_3 : _values_3) {
                        {
                          int max = 0;
                          EList<GraphAsset> _incomingassets = nr_1.getIncomingassets();
                          for (final GraphAsset ina : _incomingassets) {
                            max = Math.max(max, this.levelOf(ina.getAssetlabel(), o_3));
                          }
                          this.upsertLabel_Edge(outgoing.getEdgelabel(), o_3, max);
                        }
                      }
                      break;
                    case "[User]":
                      Objective[] _values_4 = Objective.values();
                      for (final Objective o_4 : _values_4) {
                        {
                          int max = 0;
                          EList<GraphAsset> _incomingassets = nr_1.getIncomingassets();
                          for (final GraphAsset ina : _incomingassets) {
                            max = Math.max(max, this.levelOf(ina.getAssetlabel(), o_4));
                          }
                          this.upsertLabel_Edge(outgoing.getEdgelabel(), o_4, max);
                        }
                      }
                      break;
                    case "[Splitter]":
                      Objective[] _values_5 = Objective.values();
                      for (final Objective o_5 : _values_5) {
                        {
                          int max = 0;
                          EList<GraphAsset> _incomingassets = nr_1.getIncomingassets();
                          for (final GraphAsset ina : _incomingassets) {
                            max = Math.max(max, this.levelOf(ina.getAssetlabel(), o_5));
                          }
                          this.upsertLabel_Edge(outgoing.getEdgelabel(), o_5, max);
                        }
                      }
                      break;
                    case "[Copier]":
                      Objective[] _values_6 = Objective.values();
                      for (final Objective o_6 : _values_6) {
                        this.upsertLabel_Edge(outgoing.getEdgelabel(), o_6, this.levelOf(nr_1.getIncomingassets().get(0).getAssetlabel(), o_6));
                      }
                      break;
                    case "[Forward]":
                      Objective[] _values_7 = Objective.values();
                      for (final Objective o_7 : _values_7) {
                        this.upsertLabel_Edge(outgoing.getEdgelabel(), o_7, this.levelOf(nr_1.getIncomingassets().get(0).getAssetlabel(), o_7));
                      }
                      break;
                    case "[Store]":
                      Objective[] _values_8 = Objective.values();
                      for (final Objective o_8 : _values_8) {
                        {
                          int max = 0;
                          EList<GraphAsset> _incomingassets = nr_1.getIncomingassets();
                          for (final GraphAsset ina : _incomingassets) {
                            max = Math.max(max, this.levelOf(ina.getAssetlabel(), o_8));
                          }
                          this.upsertLabel_Edge(outgoing.getEdgelabel(), o_8, max);
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
          boolean _isEmpty = outgoing.getEdgelabel().isEmpty();
          if (_isEmpty) {
            Objective[] _values = Objective.values();
            for (final Objective o : _values) {
              {
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
        case H:
          _switchResult = 3;
          break;
        case M:
          _switchResult = 2;
          break;
        case L:
          _switchResult = 1;
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
    if ((level <= 0)) {
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
      return it.getOperation().toString().replace("[", "").replace("]", "");
    };
    final Set<String> ops = IterableExtensions.<String>toSet(IterableExtensions.<NodeResponsibility, String>map(IterableExtensions.<NodeResponsibility>filter(e.getSource().getResponsibility(), _function_3), _function_4));
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
