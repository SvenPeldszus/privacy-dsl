/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Graph/model/graph.ecore
 * using:
 *   /Graph/model/graph.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package graph;

// import graph.GraphPackage;
// import graph.GraphTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.secdfd.model.ModelPackage;

/**
 * GraphTables provides the dispatch tables for the graph for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class GraphTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(GraphPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_graph = IdManager.getNsURIPackageId("http://www.example.org/graph", null, GraphPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_secdfd_org_s_secdfd = IdManager.getNsURIPackageId("http://www.secdfd.org/secdfd", null, ModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AssetLabel = GraphTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("AssetLabel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Edge = GraphTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("Edge", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EdgeLabel = GraphTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("EdgeLabel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Graph = GraphTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("Graph", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_GraphAsset = GraphTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("GraphAsset", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Node = GraphTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("Node", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NodeResponsibility = GraphTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("NodeResponsibility", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Subgraphs = GraphTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("Subgraphs", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = GraphTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MLContractType = GraphTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("MLContractType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Objective = GraphTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Objective");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SecurityContractType = GraphTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("SecurityContractType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ String STR__94__a_Authenticator_a_$ = "^.*Authenticator.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Business_a_$ = "^.*Business.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Classification_a_$ = "^.*Classification.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Clustering_a_$ = "^.*Clustering.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Comparator_a_$ = "^.*Comparator.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Copier_a_$ = "^.*Copier.*$";
	public static final /*@NonInvalid*/ String STR__94__a_DataGeneration_a_$ = "^.*DataGeneration.*$";
	public static final /*@NonInvalid*/ String STR__94__a_DecisionMaking_a_$ = "^.*DecisionMaking.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Descrypt_a_$ = "^.*Descrypt.*$";
	public static final /*@NonInvalid*/ String STR__94__a_DimensionalityReduction_a_$ = "^.*DimensionalityReduction.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Discarder_a_$ = "^.*Discarder.*$";
	public static final /*@NonInvalid*/ String STR__94__a_EncryptOrHash_a_$ = "^.*EncryptOrHash.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Forward_a_$ = "^.*Forward.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Joiner_a_$ = "^.*Joiner.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Prediction_a_$ = "^.*Prediction.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Recommendation_a_$ = "^.*Recommendation.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Splitter_a_$ = "^.*Splitter.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Store_a_$ = "^.*Store.*$";
	public static final /*@NonInvalid*/ String STR__94__a_User_a_$ = "^.*User.*$";
	public static final /*@NonInvalid*/ String STR__94__a_Verifier_a_$ = "^.*Verifier.*$";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Edge = TypeId.BAG.getSpecializedId(GraphTables.CLSSid_Edge, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_GraphAsset = TypeId.BAG.getSpecializedId(GraphTables.CLSSid_GraphAsset, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Node = TypeId.BAG.getSpecializedId(GraphTables.CLSSid_Node, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_NodeResponsibility = TypeId.BAG.getSpecializedId(GraphTables.CLSSid_NodeResponsibility, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssetLabel = TypeId.ORDERED_SET.getSpecializedId(GraphTables.CLSSid_AssetLabel, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Edge = TypeId.ORDERED_SET.getSpecializedId(GraphTables.CLSSid_Edge, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EdgeLabel = TypeId.ORDERED_SET.getSpecializedId(GraphTables.CLSSid_EdgeLabel, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_GraphAsset = TypeId.ORDERED_SET.getSpecializedId(GraphTables.CLSSid_GraphAsset, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Node = TypeId.ORDERED_SET.getSpecializedId(GraphTables.CLSSid_Node, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_NodeResponsibility = TypeId.ORDERED_SET.getSpecializedId(GraphTables.CLSSid_NodeResponsibility, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Node_0 = TypeId.ORDERED_SET.getSpecializedId(GraphTables.CLSSid_Node, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Subgraphs = TypeId.ORDERED_SET.getSpecializedId(GraphTables.CLSSid_Subgraphs, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_MLContractType = TypeId.ORDERED_SET.getSpecializedId(GraphTables.ENUMid_MLContractType, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_SecurityContractType = TypeId.ORDERED_SET.getSpecializedId(GraphTables.ENUMid_SecurityContractType, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_AssetLabel = TypeId.SEQUENCE.getSpecializedId(GraphTables.CLSSid_AssetLabel, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(GraphTables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			GraphTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AssetLabel = new EcoreExecutorType(GraphPackage.Literals.ASSET_LABEL, PACKAGE, 0);
		public static final EcoreExecutorType _Edge = new EcoreExecutorType(GraphPackage.Literals.EDGE, PACKAGE, 0);
		public static final EcoreExecutorType _EdgeLabel = new EcoreExecutorType(GraphPackage.Literals.EDGE_LABEL, PACKAGE, 0);
		public static final EcoreExecutorType _Graph = new EcoreExecutorType(GraphPackage.Literals.GRAPH, PACKAGE, 0);
		public static final EcoreExecutorType _GraphAsset = new EcoreExecutorType(GraphPackage.Literals.GRAPH_ASSET, PACKAGE, 0);
		public static final EcoreExecutorType _Identifiable = new EcoreExecutorType(GraphPackage.Literals.IDENTIFIABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Node = new EcoreExecutorType(GraphPackage.Literals.NODE, PACKAGE, 0);
		public static final EcoreExecutorType _NodeResponsibility = new EcoreExecutorType(GraphPackage.Literals.NODE_RESPONSIBILITY, PACKAGE, 0);
		public static final EcoreExecutorType _SecurityLabel = new EcoreExecutorType(GraphPackage.Literals.SECURITY_LABEL, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Subgraphs = new EcoreExecutorType(GraphPackage.Literals.SUBGRAPHS, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AssetLabel,
			_Edge,
			_EdgeLabel,
			_Graph,
			_GraphAsset,
			_Identifiable,
			_Node,
			_NodeResponsibility,
			_SecurityLabel,
			_Subgraphs
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AssetLabel__AssetLabel = new ExecutorFragment(Types._AssetLabel, GraphTables.Types._AssetLabel);
		private static final ExecutorFragment _AssetLabel__OclAny = new ExecutorFragment(Types._AssetLabel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssetLabel__OclElement = new ExecutorFragment(Types._AssetLabel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AssetLabel__SecurityLabel = new ExecutorFragment(Types._AssetLabel, GraphTables.Types._SecurityLabel);

		private static final ExecutorFragment _Edge__Edge = new ExecutorFragment(Types._Edge, GraphTables.Types._Edge);
		private static final ExecutorFragment _Edge__Identifiable = new ExecutorFragment(Types._Edge, GraphTables.Types._Identifiable);
		private static final ExecutorFragment _Edge__OclAny = new ExecutorFragment(Types._Edge, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Edge__OclElement = new ExecutorFragment(Types._Edge, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EdgeLabel__EdgeLabel = new ExecutorFragment(Types._EdgeLabel, GraphTables.Types._EdgeLabel);
		private static final ExecutorFragment _EdgeLabel__OclAny = new ExecutorFragment(Types._EdgeLabel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EdgeLabel__OclElement = new ExecutorFragment(Types._EdgeLabel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EdgeLabel__SecurityLabel = new ExecutorFragment(Types._EdgeLabel, GraphTables.Types._SecurityLabel);

		private static final ExecutorFragment _Graph__Graph = new ExecutorFragment(Types._Graph, GraphTables.Types._Graph);
		private static final ExecutorFragment _Graph__OclAny = new ExecutorFragment(Types._Graph, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Graph__OclElement = new ExecutorFragment(Types._Graph, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _GraphAsset__GraphAsset = new ExecutorFragment(Types._GraphAsset, GraphTables.Types._GraphAsset);
		private static final ExecutorFragment _GraphAsset__Identifiable = new ExecutorFragment(Types._GraphAsset, GraphTables.Types._Identifiable);
		private static final ExecutorFragment _GraphAsset__OclAny = new ExecutorFragment(Types._GraphAsset, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _GraphAsset__OclElement = new ExecutorFragment(Types._GraphAsset, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Identifiable__Identifiable = new ExecutorFragment(Types._Identifiable, GraphTables.Types._Identifiable);
		private static final ExecutorFragment _Identifiable__OclAny = new ExecutorFragment(Types._Identifiable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Identifiable__OclElement = new ExecutorFragment(Types._Identifiable, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Node__Identifiable = new ExecutorFragment(Types._Node, GraphTables.Types._Identifiable);
		private static final ExecutorFragment _Node__Node = new ExecutorFragment(Types._Node, GraphTables.Types._Node);
		private static final ExecutorFragment _Node__OclAny = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Node__OclElement = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NodeResponsibility__Identifiable = new ExecutorFragment(Types._NodeResponsibility, GraphTables.Types._Identifiable);
		private static final ExecutorFragment _NodeResponsibility__NodeResponsibility = new ExecutorFragment(Types._NodeResponsibility, GraphTables.Types._NodeResponsibility);
		private static final ExecutorFragment _NodeResponsibility__OclAny = new ExecutorFragment(Types._NodeResponsibility, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NodeResponsibility__OclElement = new ExecutorFragment(Types._NodeResponsibility, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _SecurityLabel__OclAny = new ExecutorFragment(Types._SecurityLabel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SecurityLabel__OclElement = new ExecutorFragment(Types._SecurityLabel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SecurityLabel__SecurityLabel = new ExecutorFragment(Types._SecurityLabel, GraphTables.Types._SecurityLabel);

		private static final ExecutorFragment _Subgraphs__Identifiable = new ExecutorFragment(Types._Subgraphs, GraphTables.Types._Identifiable);
		private static final ExecutorFragment _Subgraphs__OclAny = new ExecutorFragment(Types._Subgraphs, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Subgraphs__OclElement = new ExecutorFragment(Types._Subgraphs, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Subgraphs__Subgraphs = new ExecutorFragment(Types._Subgraphs, GraphTables.Types._Subgraphs);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _NodeResponsibility__findLeastRestrictiveLabel = new ExecutorOperation("findLeastRestrictiveLabel", TypeUtil.EMPTY_PARAMETER_TYPES, Types._NodeResponsibility,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _NodeResponsibility__findMostRestrictiveLabel = new ExecutorOperation("findMostRestrictiveLabel", TypeUtil.EMPTY_PARAMETER_TYPES, Types._NodeResponsibility,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AssetLabel__GraphAsset__assetlabel = new ExecutorPropertyWithImplementation("GraphAsset", Types._AssetLabel, 0, new EcoreLibraryOppositeProperty(GraphPackage.Literals.GRAPH_ASSET__ASSETLABEL));

		public static final ExecutorProperty _Edge__edgelabel = new EcoreExecutorProperty(GraphPackage.Literals.EDGE__EDGELABEL, Types._Edge, 0);
		public static final ExecutorProperty _Edge__graphassets = new EcoreExecutorProperty(GraphPackage.Literals.EDGE__GRAPHASSETS, Types._Edge, 1);
		public static final ExecutorProperty _Edge__source = new EcoreExecutorProperty(GraphPackage.Literals.EDGE__SOURCE, Types._Edge, 2);
		public static final ExecutorProperty _Edge__target = new EcoreExecutorProperty(GraphPackage.Literals.EDGE__TARGET, Types._Edge, 3);
		public static final ExecutorProperty _Edge__visited = new EcoreExecutorProperty(GraphPackage.Literals.EDGE__VISITED, Types._Edge, 4);
		public static final ExecutorProperty _Edge__Node__inedges = new ExecutorPropertyWithImplementation("Node", Types._Edge, 5, new EcoreLibraryOppositeProperty(GraphPackage.Literals.NODE__INEDGES));
		public static final ExecutorProperty _Edge__Node__outedges = new ExecutorPropertyWithImplementation("Node", Types._Edge, 6, new EcoreLibraryOppositeProperty(GraphPackage.Literals.NODE__OUTEDGES));

		public static final ExecutorProperty _EdgeLabel__Edge__edgelabel = new ExecutorPropertyWithImplementation("Edge", Types._EdgeLabel, 0, new EcoreLibraryOppositeProperty(GraphPackage.Literals.EDGE__EDGELABEL));

		public static final ExecutorProperty _Graph__subgraphs = new EcoreExecutorProperty(GraphPackage.Literals.GRAPH__SUBGRAPHS, Types._Graph, 0);

		public static final ExecutorProperty _GraphAsset__Encrypted = new EcoreExecutorProperty(GraphPackage.Literals.GRAPH_ASSET__ENCRYPTED, Types._GraphAsset, 0);
		public static final ExecutorProperty _GraphAsset__assetlabel = new EcoreExecutorProperty(GraphPackage.Literals.GRAPH_ASSET__ASSETLABEL, Types._GraphAsset, 1);
		public static final ExecutorProperty _GraphAsset__source = new EcoreExecutorProperty(GraphPackage.Literals.GRAPH_ASSET__SOURCE, Types._GraphAsset, 2);
		public static final ExecutorProperty _GraphAsset__targets = new EcoreExecutorProperty(GraphPackage.Literals.GRAPH_ASSET__TARGETS, Types._GraphAsset, 3);
		public static final ExecutorProperty _GraphAsset__Edge__graphassets = new ExecutorPropertyWithImplementation("Edge", Types._GraphAsset, 4, new EcoreLibraryOppositeProperty(GraphPackage.Literals.EDGE__GRAPHASSETS));
		public static final ExecutorProperty _GraphAsset__NodeResponsibility__incomingassets = new ExecutorPropertyWithImplementation("NodeResponsibility", Types._GraphAsset, 5, new EcoreLibraryOppositeProperty(GraphPackage.Literals.NODE_RESPONSIBILITY__INCOMINGASSETS));
		public static final ExecutorProperty _GraphAsset__NodeResponsibility__outgoingassets = new ExecutorPropertyWithImplementation("NodeResponsibility", Types._GraphAsset, 6, new EcoreLibraryOppositeProperty(GraphPackage.Literals.NODE_RESPONSIBILITY__OUTGOINGASSETS));
		public static final ExecutorProperty _GraphAsset__Subgraphs__assets = new ExecutorPropertyWithImplementation("Subgraphs", Types._GraphAsset, 7, new EcoreLibraryOppositeProperty(GraphPackage.Literals.SUBGRAPHS__ASSETS));

		public static final ExecutorProperty _Identifiable__ID = new EcoreExecutorProperty(GraphPackage.Literals.IDENTIFIABLE__ID, Types._Identifiable, 0);
		public static final ExecutorProperty _Identifiable__number = new EcoreExecutorProperty(GraphPackage.Literals.IDENTIFIABLE__NUMBER, Types._Identifiable, 1);

		public static final ExecutorProperty _Node__Attacker = new EcoreExecutorProperty(GraphPackage.Literals.NODE__ATTACKER, Types._Node, 0);
		public static final ExecutorProperty _Node__AttackerObservation = new EcoreExecutorProperty(GraphPackage.Literals.NODE__ATTACKER_OBSERVATION, Types._Node, 1);
		public static final ExecutorProperty _Node__inedges = new EcoreExecutorProperty(GraphPackage.Literals.NODE__INEDGES, Types._Node, 2);
		public static final ExecutorProperty _Node__name = new EcoreExecutorProperty(GraphPackage.Literals.NODE__NAME, Types._Node, 3);
		public static final ExecutorProperty _Node__outedges = new EcoreExecutorProperty(GraphPackage.Literals.NODE__OUTEDGES, Types._Node, 4);
		public static final ExecutorProperty _Node__responsibility = new EcoreExecutorProperty(GraphPackage.Literals.NODE__RESPONSIBILITY, Types._Node, 5);
		public static final ExecutorProperty _Node__visited = new EcoreExecutorProperty(GraphPackage.Literals.NODE__VISITED, Types._Node, 6);
		public static final ExecutorProperty _Node__Edge__source = new ExecutorPropertyWithImplementation("Edge", Types._Node, 7, new EcoreLibraryOppositeProperty(GraphPackage.Literals.EDGE__SOURCE));
		public static final ExecutorProperty _Node__Edge__target = new ExecutorPropertyWithImplementation("Edge", Types._Node, 8, new EcoreLibraryOppositeProperty(GraphPackage.Literals.EDGE__TARGET));
		public static final ExecutorProperty _Node__GraphAsset__source = new ExecutorPropertyWithImplementation("GraphAsset", Types._Node, 9, new EcoreLibraryOppositeProperty(GraphPackage.Literals.GRAPH_ASSET__SOURCE));
		public static final ExecutorProperty _Node__GraphAsset__targets = new ExecutorPropertyWithImplementation("GraphAsset", Types._Node, 10, new EcoreLibraryOppositeProperty(GraphPackage.Literals.GRAPH_ASSET__TARGETS));
		public static final ExecutorProperty _Node__Subgraphs__nodes = new ExecutorPropertyWithImplementation("Subgraphs", Types._Node, 11, new EcoreLibraryOppositeProperty(GraphPackage.Literals.SUBGRAPHS__NODES));

		public static final ExecutorProperty _NodeResponsibility__incomingassets = new EcoreExecutorProperty(GraphPackage.Literals.NODE_RESPONSIBILITY__INCOMINGASSETS, Types._NodeResponsibility, 0);
		public static final ExecutorProperty _NodeResponsibility__mlTask = new EcoreExecutorProperty(GraphPackage.Literals.NODE_RESPONSIBILITY__ML_TASK, Types._NodeResponsibility, 1);
		public static final ExecutorProperty _NodeResponsibility__outgoingassets = new EcoreExecutorProperty(GraphPackage.Literals.NODE_RESPONSIBILITY__OUTGOINGASSETS, Types._NodeResponsibility, 2);
		public static final ExecutorProperty _NodeResponsibility__task = new EcoreExecutorProperty(GraphPackage.Literals.NODE_RESPONSIBILITY__TASK, Types._NodeResponsibility, 3);
		public static final ExecutorProperty _NodeResponsibility__Node__responsibility = new ExecutorPropertyWithImplementation("Node", Types._NodeResponsibility, 4, new EcoreLibraryOppositeProperty(GraphPackage.Literals.NODE__RESPONSIBILITY));

		public static final ExecutorProperty _SecurityLabel__level = new EcoreExecutorProperty(GraphPackage.Literals.SECURITY_LABEL__LEVEL, Types._SecurityLabel, 0);
		public static final ExecutorProperty _SecurityLabel__objective = new EcoreExecutorProperty(GraphPackage.Literals.SECURITY_LABEL__OBJECTIVE, Types._SecurityLabel, 1);

		public static final ExecutorProperty _Subgraphs__assets = new EcoreExecutorProperty(GraphPackage.Literals.SUBGRAPHS__ASSETS, Types._Subgraphs, 0);
		public static final ExecutorProperty _Subgraphs__nodes = new EcoreExecutorProperty(GraphPackage.Literals.SUBGRAPHS__NODES, Types._Subgraphs, 1);
		public static final ExecutorProperty _Subgraphs__Graph__subgraphs = new ExecutorPropertyWithImplementation("Graph", Types._Subgraphs, 2, new EcoreLibraryOppositeProperty(GraphPackage.Literals.GRAPH__SUBGRAPHS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AssetLabel =
			{
				Fragments._AssetLabel__OclAny /* 0 */,
				Fragments._AssetLabel__OclElement /* 1 */,
				Fragments._AssetLabel__SecurityLabel /* 2 */,
				Fragments._AssetLabel__AssetLabel /* 3 */
			};
		private static final int /*@NonNull*/ [] __AssetLabel = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Edge =
			{
				Fragments._Edge__OclAny /* 0 */,
				Fragments._Edge__OclElement /* 1 */,
				Fragments._Edge__Identifiable /* 2 */,
				Fragments._Edge__Edge /* 3 */
			};
		private static final int /*@NonNull*/ [] __Edge = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EdgeLabel =
			{
				Fragments._EdgeLabel__OclAny /* 0 */,
				Fragments._EdgeLabel__OclElement /* 1 */,
				Fragments._EdgeLabel__SecurityLabel /* 2 */,
				Fragments._EdgeLabel__EdgeLabel /* 3 */
			};
		private static final int /*@NonNull*/ [] __EdgeLabel = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Graph =
			{
				Fragments._Graph__OclAny /* 0 */,
				Fragments._Graph__OclElement /* 1 */,
				Fragments._Graph__Graph /* 2 */
			};
		private static final int /*@NonNull*/ [] __Graph = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _GraphAsset =
			{
				Fragments._GraphAsset__OclAny /* 0 */,
				Fragments._GraphAsset__OclElement /* 1 */,
				Fragments._GraphAsset__Identifiable /* 2 */,
				Fragments._GraphAsset__GraphAsset /* 3 */
			};
		private static final int /*@NonNull*/ [] __GraphAsset = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Identifiable =
			{
				Fragments._Identifiable__OclAny /* 0 */,
				Fragments._Identifiable__OclElement /* 1 */,
				Fragments._Identifiable__Identifiable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Identifiable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Node =
			{
				Fragments._Node__OclAny /* 0 */,
				Fragments._Node__OclElement /* 1 */,
				Fragments._Node__Identifiable /* 2 */,
				Fragments._Node__Node /* 3 */
			};
		private static final int /*@NonNull*/ [] __Node = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NodeResponsibility =
			{
				Fragments._NodeResponsibility__OclAny /* 0 */,
				Fragments._NodeResponsibility__OclElement /* 1 */,
				Fragments._NodeResponsibility__Identifiable /* 2 */,
				Fragments._NodeResponsibility__NodeResponsibility /* 3 */
			};
		private static final int /*@NonNull*/ [] __NodeResponsibility = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SecurityLabel =
			{
				Fragments._SecurityLabel__OclAny /* 0 */,
				Fragments._SecurityLabel__OclElement /* 1 */,
				Fragments._SecurityLabel__SecurityLabel /* 2 */
			};
		private static final int /*@NonNull*/ [] __SecurityLabel = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Subgraphs =
			{
				Fragments._Subgraphs__OclAny /* 0 */,
				Fragments._Subgraphs__OclElement /* 1 */,
				Fragments._Subgraphs__Identifiable /* 2 */,
				Fragments._Subgraphs__Subgraphs /* 3 */
			};
		private static final int /*@NonNull*/ [] __Subgraphs = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AssetLabel.initFragments(_AssetLabel, __AssetLabel);
			Types._Edge.initFragments(_Edge, __Edge);
			Types._EdgeLabel.initFragments(_EdgeLabel, __EdgeLabel);
			Types._Graph.initFragments(_Graph, __Graph);
			Types._GraphAsset.initFragments(_GraphAsset, __GraphAsset);
			Types._Identifiable.initFragments(_Identifiable, __Identifiable);
			Types._Node.initFragments(_Node, __Node);
			Types._NodeResponsibility.initFragments(_NodeResponsibility, __NodeResponsibility);
			Types._SecurityLabel.initFragments(_SecurityLabel, __SecurityLabel);
			Types._Subgraphs.initFragments(_Subgraphs, __Subgraphs);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AssetLabel__AssetLabel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssetLabel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssetLabel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssetLabel__SecurityLabel = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Edge__Edge = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Edge__Identifiable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Edge__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Edge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EdgeLabel__EdgeLabel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EdgeLabel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EdgeLabel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EdgeLabel__SecurityLabel = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Graph__Graph = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Graph__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Graph__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _GraphAsset__GraphAsset = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GraphAsset__Identifiable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GraphAsset__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GraphAsset__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Identifiable__Identifiable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Identifiable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Identifiable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Node__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__Identifiable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NodeResponsibility__NodeResponsibility = {
			GraphTables.Operations._NodeResponsibility__findLeastRestrictiveLabel /* findLeastRestrictiveLabel() */,
			GraphTables.Operations._NodeResponsibility__findMostRestrictiveLabel /* findMostRestrictiveLabel() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResponsibility__Identifiable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResponsibility__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResponsibility__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SecurityLabel__SecurityLabel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityLabel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityLabel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Subgraphs__Subgraphs = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Subgraphs__Identifiable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Subgraphs__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Subgraphs__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AssetLabel__AssetLabel.initOperations(_AssetLabel__AssetLabel);
			Fragments._AssetLabel__OclAny.initOperations(_AssetLabel__OclAny);
			Fragments._AssetLabel__OclElement.initOperations(_AssetLabel__OclElement);
			Fragments._AssetLabel__SecurityLabel.initOperations(_AssetLabel__SecurityLabel);

			Fragments._Edge__Edge.initOperations(_Edge__Edge);
			Fragments._Edge__Identifiable.initOperations(_Edge__Identifiable);
			Fragments._Edge__OclAny.initOperations(_Edge__OclAny);
			Fragments._Edge__OclElement.initOperations(_Edge__OclElement);

			Fragments._EdgeLabel__EdgeLabel.initOperations(_EdgeLabel__EdgeLabel);
			Fragments._EdgeLabel__OclAny.initOperations(_EdgeLabel__OclAny);
			Fragments._EdgeLabel__OclElement.initOperations(_EdgeLabel__OclElement);
			Fragments._EdgeLabel__SecurityLabel.initOperations(_EdgeLabel__SecurityLabel);

			Fragments._Graph__Graph.initOperations(_Graph__Graph);
			Fragments._Graph__OclAny.initOperations(_Graph__OclAny);
			Fragments._Graph__OclElement.initOperations(_Graph__OclElement);

			Fragments._GraphAsset__GraphAsset.initOperations(_GraphAsset__GraphAsset);
			Fragments._GraphAsset__Identifiable.initOperations(_GraphAsset__Identifiable);
			Fragments._GraphAsset__OclAny.initOperations(_GraphAsset__OclAny);
			Fragments._GraphAsset__OclElement.initOperations(_GraphAsset__OclElement);

			Fragments._Identifiable__Identifiable.initOperations(_Identifiable__Identifiable);
			Fragments._Identifiable__OclAny.initOperations(_Identifiable__OclAny);
			Fragments._Identifiable__OclElement.initOperations(_Identifiable__OclElement);

			Fragments._Node__Identifiable.initOperations(_Node__Identifiable);
			Fragments._Node__Node.initOperations(_Node__Node);
			Fragments._Node__OclAny.initOperations(_Node__OclAny);
			Fragments._Node__OclElement.initOperations(_Node__OclElement);

			Fragments._NodeResponsibility__Identifiable.initOperations(_NodeResponsibility__Identifiable);
			Fragments._NodeResponsibility__NodeResponsibility.initOperations(_NodeResponsibility__NodeResponsibility);
			Fragments._NodeResponsibility__OclAny.initOperations(_NodeResponsibility__OclAny);
			Fragments._NodeResponsibility__OclElement.initOperations(_NodeResponsibility__OclElement);

			Fragments._SecurityLabel__OclAny.initOperations(_SecurityLabel__OclAny);
			Fragments._SecurityLabel__OclElement.initOperations(_SecurityLabel__OclElement);
			Fragments._SecurityLabel__SecurityLabel.initOperations(_SecurityLabel__SecurityLabel);

			Fragments._Subgraphs__Identifiable.initOperations(_Subgraphs__Identifiable);
			Fragments._Subgraphs__OclAny.initOperations(_Subgraphs__OclAny);
			Fragments._Subgraphs__OclElement.initOperations(_Subgraphs__OclElement);
			Fragments._Subgraphs__Subgraphs.initOperations(_Subgraphs__Subgraphs);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AssetLabel = {
			GraphTables.Properties._SecurityLabel__level,
			GraphTables.Properties._SecurityLabel__objective,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Edge = {
			GraphTables.Properties._Identifiable__ID,
			GraphTables.Properties._Edge__edgelabel,
			GraphTables.Properties._Edge__graphassets,
			GraphTables.Properties._Identifiable__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			GraphTables.Properties._Edge__source,
			GraphTables.Properties._Edge__target,
			GraphTables.Properties._Edge__visited
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EdgeLabel = {
			GraphTables.Properties._SecurityLabel__level,
			GraphTables.Properties._SecurityLabel__objective,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Graph = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			GraphTables.Properties._Graph__subgraphs
		};

		private static final ExecutorProperty /*@NonNull*/ [] _GraphAsset = {
			GraphTables.Properties._GraphAsset__Encrypted,
			GraphTables.Properties._Identifiable__ID,
			GraphTables.Properties._GraphAsset__assetlabel,
			GraphTables.Properties._Identifiable__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			GraphTables.Properties._GraphAsset__source,
			GraphTables.Properties._GraphAsset__targets
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Identifiable = {
			GraphTables.Properties._Identifiable__ID,
			GraphTables.Properties._Identifiable__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Node = {
			GraphTables.Properties._Node__Attacker,
			GraphTables.Properties._Node__AttackerObservation,
			GraphTables.Properties._Identifiable__ID,
			GraphTables.Properties._Node__inedges,
			GraphTables.Properties._Node__name,
			GraphTables.Properties._Identifiable__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			GraphTables.Properties._Node__outedges,
			GraphTables.Properties._Node__responsibility,
			GraphTables.Properties._Node__visited
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NodeResponsibility = {
			GraphTables.Properties._Identifiable__ID,
			GraphTables.Properties._NodeResponsibility__incomingassets,
			GraphTables.Properties._NodeResponsibility__mlTask,
			GraphTables.Properties._Identifiable__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			GraphTables.Properties._NodeResponsibility__outgoingassets,
			GraphTables.Properties._NodeResponsibility__task
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SecurityLabel = {
			GraphTables.Properties._SecurityLabel__level,
			GraphTables.Properties._SecurityLabel__objective,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Subgraphs = {
			GraphTables.Properties._Identifiable__ID,
			GraphTables.Properties._Subgraphs__assets,
			GraphTables.Properties._Subgraphs__nodes,
			GraphTables.Properties._Identifiable__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AssetLabel__AssetLabel.initProperties(_AssetLabel);
			Fragments._Edge__Edge.initProperties(_Edge);
			Fragments._EdgeLabel__EdgeLabel.initProperties(_EdgeLabel);
			Fragments._Graph__Graph.initProperties(_Graph);
			Fragments._GraphAsset__GraphAsset.initProperties(_GraphAsset);
			Fragments._Identifiable__Identifiable.initProperties(_Identifiable);
			Fragments._Node__Node.initProperties(_Node);
			Fragments._NodeResponsibility__NodeResponsibility.initProperties(_NodeResponsibility);
			Fragments._SecurityLabel__SecurityLabel.initProperties(_SecurityLabel);
			Fragments._Subgraphs__Subgraphs.initProperties(_Subgraphs);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GraphTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new GraphTables();
	}

	private GraphTables() {
		super(GraphPackage.eNS_URI);
	}
}
