/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.secdfd.model/model/model.ecore
 * using:
 *   /org.secdfd.model/model/model.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.secdfd.model;

import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
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
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import org.secdfd.model.ModelPackage;
// import org.secdfd.model.ModelTables;

/**
 * ModelTables provides the dispatch tables for the model for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ModelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ModelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_secdfd_org_s_secdfd = IdManager.getNsURIPackageId("http://www.secdfd.org/secdfd", null, ModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Asset = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Asset", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Assumption = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Assumption", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AttackerProfile = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("AttackerProfile", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ContractBase = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("ContractBase", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EDFD = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("EDFD", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Flow = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Flow", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Process = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Process", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TrustZone = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("TrustZone", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Value = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Value", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = ModelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_AssetType = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("AssetType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Channel = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Channel");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Layer = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Layer");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MLContractType = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("MLContractType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Objective = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Objective");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Priority = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Priority");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SecurityContractType = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("SecurityContractType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ String STR_Privacy_32_as_32_objective_32_can_32_only_32_have_32_a_32_high_32_or_32_low_32_priority = "Privacy as objective can only have a high or low priority.";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Asset = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_Asset, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ContractBase = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_ContractBase, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Element = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_Element, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Flow = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_Flow, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TrustZone = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_TrustZone, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_H = ModelTables.ENUMid_Priority.getEnumerationLiteralId("H");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_L = ModelTables.ENUMid_Priority.getEnumerationLiteralId("L");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Privacy = ModelTables.ENUMid_Objective.getEnumerationLiteralId("Privacy");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Asset = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Asset, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Assumption = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Assumption, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AttackerProfile = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_AttackerProfile, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ContractBase = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_ContractBase, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Element, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element_0 = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Element, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Flow = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Flow, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TrustZone = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_TrustZone, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Value = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Value, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_MLContractType = TypeId.ORDERED_SET.getSpecializedId(ModelTables.ENUMid_MLContractType, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_Objective = TypeId.ORDERED_SET.getSpecializedId(ModelTables.ENUMid_Objective, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_SecurityContractType = TypeId.ORDERED_SET.getSpecializedId(ModelTables.ENUMid_SecurityContractType, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", ModelTables.PARTid_, ModelTables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ModelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Asset = new EcoreExecutorType(ModelPackage.Literals.ASSET, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _AssetType = new EcoreExecutorEnumeration(ModelPackage.Literals.ASSET_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Assumption = new EcoreExecutorType(ModelPackage.Literals.ASSUMPTION, PACKAGE, 0);
		public static final EcoreExecutorType _AttackerProfile = new EcoreExecutorType(ModelPackage.Literals.ATTACKER_PROFILE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Channel = new EcoreExecutorEnumeration(ModelPackage.Literals.CHANNEL, PACKAGE, 0);
		public static final EcoreExecutorType _ClassificationContract = new EcoreExecutorType(ModelPackage.Literals.CLASSIFICATION_CONTRACT, PACKAGE, 0);
		public static final EcoreExecutorType _ClusteringContract = new EcoreExecutorType(ModelPackage.Literals.CLUSTERING_CONTRACT, PACKAGE, 0);
		public static final EcoreExecutorType _ContractBase = new EcoreExecutorType(ModelPackage.Literals.CONTRACT_BASE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DataStore = new EcoreExecutorType(ModelPackage.Literals.DATA_STORE, PACKAGE, 0);
		public static final EcoreExecutorType _DecisionMakingContract = new EcoreExecutorType(ModelPackage.Literals.DECISION_MAKING_CONTRACT, PACKAGE, 0);
		public static final EcoreExecutorType _EDFD = new EcoreExecutorType(ModelPackage.Literals.EDFD, PACKAGE, 0);
		public static final EcoreExecutorType _Element = new EcoreExecutorType(ModelPackage.Literals.ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ExternalEntity = new EcoreExecutorType(ModelPackage.Literals.EXTERNAL_ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _Flow = new EcoreExecutorType(ModelPackage.Literals.FLOW, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Layer = new EcoreExecutorEnumeration(ModelPackage.Literals.LAYER, PACKAGE, 0);
		public static final EcoreExecutorType _MLContract = new EcoreExecutorType(ModelPackage.Literals.ML_CONTRACT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MLContractType = new EcoreExecutorEnumeration(ModelPackage.Literals.ML_CONTRACT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _NamedEntity = new EcoreExecutorType(ModelPackage.Literals.NAMED_ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Objective = new EcoreExecutorEnumeration(ModelPackage.Literals.OBJECTIVE, PACKAGE, 0);
		public static final EcoreExecutorType _PredictionContract = new EcoreExecutorType(ModelPackage.Literals.PREDICTION_CONTRACT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Priority = new EcoreExecutorEnumeration(ModelPackage.Literals.PRIORITY, PACKAGE, 0);
		public static final EcoreExecutorType _Process = new EcoreExecutorType(ModelPackage.Literals.PROCESS, PACKAGE, 0);
		public static final EcoreExecutorType _RecommendationContract = new EcoreExecutorType(ModelPackage.Literals.RECOMMENDATION_CONTRACT, PACKAGE, 0);
		public static final EcoreExecutorType _SecurityContract = new EcoreExecutorType(ModelPackage.Literals.SECURITY_CONTRACT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SecurityContractType = new EcoreExecutorEnumeration(ModelPackage.Literals.SECURITY_CONTRACT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _TrustZone = new EcoreExecutorType(ModelPackage.Literals.TRUST_ZONE, PACKAGE, 0);
		public static final EcoreExecutorType _Value = new EcoreExecutorType(ModelPackage.Literals.VALUE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Asset,
			_AssetType,
			_Assumption,
			_AttackerProfile,
			_Channel,
			_ClassificationContract,
			_ClusteringContract,
			_ContractBase,
			_DataStore,
			_DecisionMakingContract,
			_EDFD,
			_Element,
			_ExternalEntity,
			_Flow,
			_Layer,
			_MLContract,
			_MLContractType,
			_NamedEntity,
			_Objective,
			_PredictionContract,
			_Priority,
			_Process,
			_RecommendationContract,
			_SecurityContract,
			_SecurityContractType,
			_TrustZone,
			_Value
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Asset__Asset = new ExecutorFragment(Types._Asset, ModelTables.Types._Asset);
		private static final ExecutorFragment _Asset__NamedEntity = new ExecutorFragment(Types._Asset, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _Asset__OclAny = new ExecutorFragment(Types._Asset, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Asset__OclElement = new ExecutorFragment(Types._Asset, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AssetType__AssetType = new ExecutorFragment(Types._AssetType, ModelTables.Types._AssetType);
		private static final ExecutorFragment _AssetType__OclAny = new ExecutorFragment(Types._AssetType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssetType__OclElement = new ExecutorFragment(Types._AssetType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AssetType__OclEnumeration = new ExecutorFragment(Types._AssetType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _AssetType__OclType = new ExecutorFragment(Types._AssetType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Assumption__Assumption = new ExecutorFragment(Types._Assumption, ModelTables.Types._Assumption);
		private static final ExecutorFragment _Assumption__OclAny = new ExecutorFragment(Types._Assumption, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Assumption__OclElement = new ExecutorFragment(Types._Assumption, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AttackerProfile__AttackerProfile = new ExecutorFragment(Types._AttackerProfile, ModelTables.Types._AttackerProfile);
		private static final ExecutorFragment _AttackerProfile__NamedEntity = new ExecutorFragment(Types._AttackerProfile, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _AttackerProfile__OclAny = new ExecutorFragment(Types._AttackerProfile, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AttackerProfile__OclElement = new ExecutorFragment(Types._AttackerProfile, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Channel__Channel = new ExecutorFragment(Types._Channel, ModelTables.Types._Channel);
		private static final ExecutorFragment _Channel__OclAny = new ExecutorFragment(Types._Channel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Channel__OclElement = new ExecutorFragment(Types._Channel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Channel__OclEnumeration = new ExecutorFragment(Types._Channel, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Channel__OclType = new ExecutorFragment(Types._Channel, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ClassificationContract__ClassificationContract = new ExecutorFragment(Types._ClassificationContract, ModelTables.Types._ClassificationContract);
		private static final ExecutorFragment _ClassificationContract__ContractBase = new ExecutorFragment(Types._ClassificationContract, ModelTables.Types._ContractBase);
		private static final ExecutorFragment _ClassificationContract__NamedEntity = new ExecutorFragment(Types._ClassificationContract, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _ClassificationContract__OclAny = new ExecutorFragment(Types._ClassificationContract, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ClassificationContract__OclElement = new ExecutorFragment(Types._ClassificationContract, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ClusteringContract__ClusteringContract = new ExecutorFragment(Types._ClusteringContract, ModelTables.Types._ClusteringContract);
		private static final ExecutorFragment _ClusteringContract__ContractBase = new ExecutorFragment(Types._ClusteringContract, ModelTables.Types._ContractBase);
		private static final ExecutorFragment _ClusteringContract__NamedEntity = new ExecutorFragment(Types._ClusteringContract, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _ClusteringContract__OclAny = new ExecutorFragment(Types._ClusteringContract, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ClusteringContract__OclElement = new ExecutorFragment(Types._ClusteringContract, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ContractBase__ContractBase = new ExecutorFragment(Types._ContractBase, ModelTables.Types._ContractBase);
		private static final ExecutorFragment _ContractBase__NamedEntity = new ExecutorFragment(Types._ContractBase, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _ContractBase__OclAny = new ExecutorFragment(Types._ContractBase, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContractBase__OclElement = new ExecutorFragment(Types._ContractBase, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataStore__DataStore = new ExecutorFragment(Types._DataStore, ModelTables.Types._DataStore);
		private static final ExecutorFragment _DataStore__Element = new ExecutorFragment(Types._DataStore, ModelTables.Types._Element);
		private static final ExecutorFragment _DataStore__NamedEntity = new ExecutorFragment(Types._DataStore, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _DataStore__OclAny = new ExecutorFragment(Types._DataStore, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataStore__OclElement = new ExecutorFragment(Types._DataStore, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DecisionMakingContract__ContractBase = new ExecutorFragment(Types._DecisionMakingContract, ModelTables.Types._ContractBase);
		private static final ExecutorFragment _DecisionMakingContract__DecisionMakingContract = new ExecutorFragment(Types._DecisionMakingContract, ModelTables.Types._DecisionMakingContract);
		private static final ExecutorFragment _DecisionMakingContract__NamedEntity = new ExecutorFragment(Types._DecisionMakingContract, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _DecisionMakingContract__OclAny = new ExecutorFragment(Types._DecisionMakingContract, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DecisionMakingContract__OclElement = new ExecutorFragment(Types._DecisionMakingContract, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EDFD__EDFD = new ExecutorFragment(Types._EDFD, ModelTables.Types._EDFD);
		private static final ExecutorFragment _EDFD__NamedEntity = new ExecutorFragment(Types._EDFD, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _EDFD__OclAny = new ExecutorFragment(Types._EDFD, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EDFD__OclElement = new ExecutorFragment(Types._EDFD, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, ModelTables.Types._Element);
		private static final ExecutorFragment _Element__NamedEntity = new ExecutorFragment(Types._Element, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExternalEntity__Element = new ExecutorFragment(Types._ExternalEntity, ModelTables.Types._Element);
		private static final ExecutorFragment _ExternalEntity__ExternalEntity = new ExecutorFragment(Types._ExternalEntity, ModelTables.Types._ExternalEntity);
		private static final ExecutorFragment _ExternalEntity__NamedEntity = new ExecutorFragment(Types._ExternalEntity, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _ExternalEntity__OclAny = new ExecutorFragment(Types._ExternalEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExternalEntity__OclElement = new ExecutorFragment(Types._ExternalEntity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Flow__Element = new ExecutorFragment(Types._Flow, ModelTables.Types._Element);
		private static final ExecutorFragment _Flow__Flow = new ExecutorFragment(Types._Flow, ModelTables.Types._Flow);
		private static final ExecutorFragment _Flow__NamedEntity = new ExecutorFragment(Types._Flow, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _Flow__OclAny = new ExecutorFragment(Types._Flow, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Flow__OclElement = new ExecutorFragment(Types._Flow, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Layer__Layer = new ExecutorFragment(Types._Layer, ModelTables.Types._Layer);
		private static final ExecutorFragment _Layer__OclAny = new ExecutorFragment(Types._Layer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Layer__OclElement = new ExecutorFragment(Types._Layer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Layer__OclEnumeration = new ExecutorFragment(Types._Layer, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Layer__OclType = new ExecutorFragment(Types._Layer, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _MLContract__ContractBase = new ExecutorFragment(Types._MLContract, ModelTables.Types._ContractBase);
		private static final ExecutorFragment _MLContract__MLContract = new ExecutorFragment(Types._MLContract, ModelTables.Types._MLContract);
		private static final ExecutorFragment _MLContract__NamedEntity = new ExecutorFragment(Types._MLContract, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _MLContract__OclAny = new ExecutorFragment(Types._MLContract, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MLContract__OclElement = new ExecutorFragment(Types._MLContract, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MLContractType__MLContractType = new ExecutorFragment(Types._MLContractType, ModelTables.Types._MLContractType);
		private static final ExecutorFragment _MLContractType__OclAny = new ExecutorFragment(Types._MLContractType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MLContractType__OclElement = new ExecutorFragment(Types._MLContractType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MLContractType__OclEnumeration = new ExecutorFragment(Types._MLContractType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MLContractType__OclType = new ExecutorFragment(Types._MLContractType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _NamedEntity__NamedEntity = new ExecutorFragment(Types._NamedEntity, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _NamedEntity__OclAny = new ExecutorFragment(Types._NamedEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedEntity__OclElement = new ExecutorFragment(Types._NamedEntity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Objective__Objective = new ExecutorFragment(Types._Objective, ModelTables.Types._Objective);
		private static final ExecutorFragment _Objective__OclAny = new ExecutorFragment(Types._Objective, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Objective__OclElement = new ExecutorFragment(Types._Objective, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Objective__OclEnumeration = new ExecutorFragment(Types._Objective, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Objective__OclType = new ExecutorFragment(Types._Objective, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _PredictionContract__ContractBase = new ExecutorFragment(Types._PredictionContract, ModelTables.Types._ContractBase);
		private static final ExecutorFragment _PredictionContract__NamedEntity = new ExecutorFragment(Types._PredictionContract, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _PredictionContract__OclAny = new ExecutorFragment(Types._PredictionContract, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PredictionContract__OclElement = new ExecutorFragment(Types._PredictionContract, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PredictionContract__PredictionContract = new ExecutorFragment(Types._PredictionContract, ModelTables.Types._PredictionContract);

		private static final ExecutorFragment _Priority__OclAny = new ExecutorFragment(Types._Priority, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Priority__OclElement = new ExecutorFragment(Types._Priority, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Priority__OclEnumeration = new ExecutorFragment(Types._Priority, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Priority__OclType = new ExecutorFragment(Types._Priority, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Priority__Priority = new ExecutorFragment(Types._Priority, ModelTables.Types._Priority);

		private static final ExecutorFragment _Process__Element = new ExecutorFragment(Types._Process, ModelTables.Types._Element);
		private static final ExecutorFragment _Process__NamedEntity = new ExecutorFragment(Types._Process, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _Process__OclAny = new ExecutorFragment(Types._Process, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Process__OclElement = new ExecutorFragment(Types._Process, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Process__Process = new ExecutorFragment(Types._Process, ModelTables.Types._Process);

		private static final ExecutorFragment _RecommendationContract__ContractBase = new ExecutorFragment(Types._RecommendationContract, ModelTables.Types._ContractBase);
		private static final ExecutorFragment _RecommendationContract__NamedEntity = new ExecutorFragment(Types._RecommendationContract, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _RecommendationContract__OclAny = new ExecutorFragment(Types._RecommendationContract, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RecommendationContract__OclElement = new ExecutorFragment(Types._RecommendationContract, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RecommendationContract__RecommendationContract = new ExecutorFragment(Types._RecommendationContract, ModelTables.Types._RecommendationContract);

		private static final ExecutorFragment _SecurityContract__ContractBase = new ExecutorFragment(Types._SecurityContract, ModelTables.Types._ContractBase);
		private static final ExecutorFragment _SecurityContract__NamedEntity = new ExecutorFragment(Types._SecurityContract, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _SecurityContract__OclAny = new ExecutorFragment(Types._SecurityContract, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SecurityContract__OclElement = new ExecutorFragment(Types._SecurityContract, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SecurityContract__SecurityContract = new ExecutorFragment(Types._SecurityContract, ModelTables.Types._SecurityContract);

		private static final ExecutorFragment _SecurityContractType__OclAny = new ExecutorFragment(Types._SecurityContractType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SecurityContractType__OclElement = new ExecutorFragment(Types._SecurityContractType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SecurityContractType__OclEnumeration = new ExecutorFragment(Types._SecurityContractType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SecurityContractType__OclType = new ExecutorFragment(Types._SecurityContractType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SecurityContractType__SecurityContractType = new ExecutorFragment(Types._SecurityContractType, ModelTables.Types._SecurityContractType);

		private static final ExecutorFragment _TrustZone__Element = new ExecutorFragment(Types._TrustZone, ModelTables.Types._Element);
		private static final ExecutorFragment _TrustZone__NamedEntity = new ExecutorFragment(Types._TrustZone, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _TrustZone__OclAny = new ExecutorFragment(Types._TrustZone, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TrustZone__OclElement = new ExecutorFragment(Types._TrustZone, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TrustZone__TrustZone = new ExecutorFragment(Types._TrustZone, ModelTables.Types._TrustZone);

		private static final ExecutorFragment _Value__OclAny = new ExecutorFragment(Types._Value, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Value__OclElement = new ExecutorFragment(Types._Value, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Value__Value = new ExecutorFragment(Types._Value, ModelTables.Types._Value);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ModelTables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Asset__Type = new EcoreExecutorProperty(ModelPackage.Literals.ASSET__TYPE, Types._Asset, 0);
		public static final ExecutorProperty _Asset__source = new EcoreExecutorProperty(ModelPackage.Literals.ASSET__SOURCE, Types._Asset, 1);
		public static final ExecutorProperty _Asset__targets = new EcoreExecutorProperty(ModelPackage.Literals.ASSET__TARGETS, Types._Asset, 2);
		public static final ExecutorProperty _Asset__value = new EcoreExecutorProperty(ModelPackage.Literals.ASSET__VALUE, Types._Asset, 3);
		public static final ExecutorProperty _Asset__ContractBase__incomeassets = new ExecutorPropertyWithImplementation("ContractBase", Types._Asset, 4, new EcoreLibraryOppositeProperty(ModelPackage.Literals.CONTRACT_BASE__INCOMEASSETS));
		public static final ExecutorProperty _Asset__ContractBase__outcomeassets = new ExecutorPropertyWithImplementation("ContractBase", Types._Asset, 5, new EcoreLibraryOppositeProperty(ModelPackage.Literals.CONTRACT_BASE__OUTCOMEASSETS));
		public static final ExecutorProperty _Asset__EDFD__asset = new ExecutorPropertyWithImplementation("EDFD", Types._Asset, 6, new EcoreLibraryOppositeProperty(ModelPackage.Literals.EDFD__ASSET));
		public static final ExecutorProperty _Asset__Element__assets = new ExecutorPropertyWithImplementation("Element", Types._Asset, 7, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ELEMENT__ASSETS));

		public static final ExecutorProperty _Assumption__Layer = new EcoreExecutorProperty(ModelPackage.Literals.ASSUMPTION__LAYER, Types._Assumption, 0);
		public static final ExecutorProperty _Assumption__Objective = new EcoreExecutorProperty(ModelPackage.Literals.ASSUMPTION__OBJECTIVE, Types._Assumption, 1);
		public static final ExecutorProperty _Assumption__Element__assumption = new ExecutorPropertyWithImplementation("Element", Types._Assumption, 2, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ELEMENT__ASSUMPTION));

		public static final ExecutorProperty _AttackerProfile__Observation = new EcoreExecutorProperty(ModelPackage.Literals.ATTACKER_PROFILE__OBSERVATION, Types._AttackerProfile, 0);
		public static final ExecutorProperty _AttackerProfile__TrustZone__attackerprofile = new ExecutorPropertyWithImplementation("TrustZone", Types._AttackerProfile, 1, new EcoreLibraryOppositeProperty(ModelPackage.Literals.TRUST_ZONE__ATTACKERPROFILE));

		public static final ExecutorProperty _ClassificationContract__PClass = new EcoreExecutorProperty(ModelPackage.Literals.CLASSIFICATION_CONTRACT__PCLASS, Types._ClassificationContract, 0);

		public static final ExecutorProperty _ContractBase__incomeassets = new EcoreExecutorProperty(ModelPackage.Literals.CONTRACT_BASE__INCOMEASSETS, Types._ContractBase, 0);
		public static final ExecutorProperty _ContractBase__outcomeassets = new EcoreExecutorProperty(ModelPackage.Literals.CONTRACT_BASE__OUTCOMEASSETS, Types._ContractBase, 1);
		public static final ExecutorProperty _ContractBase__process = new EcoreExecutorProperty(ModelPackage.Literals.CONTRACT_BASE__PROCESS, Types._ContractBase, 2);

		public static final ExecutorProperty _DecisionMakingContract__PAction = new EcoreExecutorProperty(ModelPackage.Literals.DECISION_MAKING_CONTRACT__PACTION, Types._DecisionMakingContract, 0);

		public static final ExecutorProperty _EDFD__asset = new EcoreExecutorProperty(ModelPackage.Literals.EDFD__ASSET, Types._EDFD, 0);
		public static final ExecutorProperty _EDFD__elements = new EcoreExecutorProperty(ModelPackage.Literals.EDFD__ELEMENTS, Types._EDFD, 1);
		public static final ExecutorProperty _EDFD__trustzones = new EcoreExecutorProperty(ModelPackage.Literals.EDFD__TRUSTZONES, Types._EDFD, 2);

		public static final ExecutorProperty _Element__Attacker = new EcoreExecutorProperty(ModelPackage.Literals.ELEMENT__ATTACKER, Types._Element, 0);
		public static final ExecutorProperty _Element__assets = new EcoreExecutorProperty(ModelPackage.Literals.ELEMENT__ASSETS, Types._Element, 1);
		public static final ExecutorProperty _Element__assumption = new EcoreExecutorProperty(ModelPackage.Literals.ELEMENT__ASSUMPTION, Types._Element, 2);
		public static final ExecutorProperty _Element__inflows = new EcoreExecutorProperty(ModelPackage.Literals.ELEMENT__INFLOWS, Types._Element, 3);
		public static final ExecutorProperty _Element__outflows = new EcoreExecutorProperty(ModelPackage.Literals.ELEMENT__OUTFLOWS, Types._Element, 4);
		public static final ExecutorProperty _Element__Asset__source = new ExecutorPropertyWithImplementation("Asset", Types._Element, 5, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ASSET__SOURCE));
		public static final ExecutorProperty _Element__Asset__targets = new ExecutorPropertyWithImplementation("Asset", Types._Element, 6, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ASSET__TARGETS));
		public static final ExecutorProperty _Element__EDFD__elements = new ExecutorPropertyWithImplementation("EDFD", Types._Element, 7, new EcoreLibraryOppositeProperty(ModelPackage.Literals.EDFD__ELEMENTS));
		public static final ExecutorProperty _Element__Flow__source = new ExecutorPropertyWithImplementation("Flow", Types._Element, 8, new EcoreLibraryOppositeProperty(ModelPackage.Literals.FLOW__SOURCE));
		public static final ExecutorProperty _Element__Flow__target = new ExecutorPropertyWithImplementation("Flow", Types._Element, 9, new EcoreLibraryOppositeProperty(ModelPackage.Literals.FLOW__TARGET));
		public static final ExecutorProperty _Element__TrustZone__elements = new ExecutorPropertyWithImplementation("TrustZone", Types._Element, 10, new EcoreLibraryOppositeProperty(ModelPackage.Literals.TRUST_ZONE__ELEMENTS));

		public static final ExecutorProperty _Flow__Channel = new EcoreExecutorProperty(ModelPackage.Literals.FLOW__CHANNEL, Types._Flow, 0);
		public static final ExecutorProperty _Flow__Label = new EcoreExecutorProperty(ModelPackage.Literals.FLOW__LABEL, Types._Flow, 1);
		public static final ExecutorProperty _Flow__source = new EcoreExecutorProperty(ModelPackage.Literals.FLOW__SOURCE, Types._Flow, 2);
		public static final ExecutorProperty _Flow__target = new EcoreExecutorProperty(ModelPackage.Literals.FLOW__TARGET, Types._Flow, 3);
		public static final ExecutorProperty _Flow__Element__inflows = new ExecutorPropertyWithImplementation("Element", Types._Flow, 4, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ELEMENT__INFLOWS));
		public static final ExecutorProperty _Flow__Element__outflows = new ExecutorPropertyWithImplementation("Element", Types._Flow, 5, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ELEMENT__OUTFLOWS));

		public static final ExecutorProperty _MLContract__MLTask = new EcoreExecutorProperty(ModelPackage.Literals.ML_CONTRACT__ML_TASK, Types._MLContract, 0);

		public static final ExecutorProperty _NamedEntity__name = new EcoreExecutorProperty(ModelPackage.Literals.NAMED_ENTITY__NAME, Types._NamedEntity, 0);
		public static final ExecutorProperty _NamedEntity__number = new EcoreExecutorProperty(ModelPackage.Literals.NAMED_ENTITY__NUMBER, Types._NamedEntity, 1);

		public static final ExecutorProperty _PredictionContract__S = new EcoreExecutorProperty(ModelPackage.Literals.PREDICTION_CONTRACT__S, Types._PredictionContract, 0);

		public static final ExecutorProperty _Process__responsibility = new EcoreExecutorProperty(ModelPackage.Literals.PROCESS__RESPONSIBILITY, Types._Process, 0);

		public static final ExecutorProperty _RecommendationContract__S = new EcoreExecutorProperty(ModelPackage.Literals.RECOMMENDATION_CONTRACT__S, Types._RecommendationContract, 0);

		public static final ExecutorProperty _SecurityContract__Task = new EcoreExecutorProperty(ModelPackage.Literals.SECURITY_CONTRACT__TASK, Types._SecurityContract, 0);

		public static final ExecutorProperty _TrustZone__attackerprofile = new EcoreExecutorProperty(ModelPackage.Literals.TRUST_ZONE__ATTACKERPROFILE, Types._TrustZone, 0);
		public static final ExecutorProperty _TrustZone__elements = new EcoreExecutorProperty(ModelPackage.Literals.TRUST_ZONE__ELEMENTS, Types._TrustZone, 1);
		public static final ExecutorProperty _TrustZone__subzones = new EcoreExecutorProperty(ModelPackage.Literals.TRUST_ZONE__SUBZONES, Types._TrustZone, 2);
		public static final ExecutorProperty _TrustZone__EDFD__trustzones = new ExecutorPropertyWithImplementation("EDFD", Types._TrustZone, 3, new EcoreLibraryOppositeProperty(ModelPackage.Literals.EDFD__TRUSTZONES));
		public static final ExecutorProperty _TrustZone__TrustZone__subzones = new ExecutorPropertyWithImplementation("TrustZone", Types._TrustZone, 4, new EcoreLibraryOppositeProperty(ModelPackage.Literals.TRUST_ZONE__SUBZONES));

		public static final ExecutorProperty _Value__Objective = new EcoreExecutorProperty(ModelPackage.Literals.VALUE__OBJECTIVE, Types._Value, 0);
		public static final ExecutorProperty _Value__Priority = new EcoreExecutorProperty(ModelPackage.Literals.VALUE__PRIORITY, Types._Value, 1);
		public static final ExecutorProperty _Value__Asset__value = new ExecutorPropertyWithImplementation("Asset", Types._Value, 2, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ASSET__VALUE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Asset =
			{
				Fragments._Asset__OclAny /* 0 */,
				Fragments._Asset__OclElement /* 1 */,
				Fragments._Asset__NamedEntity /* 2 */,
				Fragments._Asset__Asset /* 3 */
			};
		private static final int /*@NonNull*/ [] __Asset = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AssetType =
			{
				Fragments._AssetType__OclAny /* 0 */,
				Fragments._AssetType__OclElement /* 1 */,
				Fragments._AssetType__OclType /* 2 */,
				Fragments._AssetType__OclEnumeration /* 3 */,
				Fragments._AssetType__AssetType /* 4 */
			};
		private static final int /*@NonNull*/ [] __AssetType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Assumption =
			{
				Fragments._Assumption__OclAny /* 0 */,
				Fragments._Assumption__OclElement /* 1 */,
				Fragments._Assumption__Assumption /* 2 */
			};
		private static final int /*@NonNull*/ [] __Assumption = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AttackerProfile =
			{
				Fragments._AttackerProfile__OclAny /* 0 */,
				Fragments._AttackerProfile__OclElement /* 1 */,
				Fragments._AttackerProfile__NamedEntity /* 2 */,
				Fragments._AttackerProfile__AttackerProfile /* 3 */
			};
		private static final int /*@NonNull*/ [] __AttackerProfile = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Channel =
			{
				Fragments._Channel__OclAny /* 0 */,
				Fragments._Channel__OclElement /* 1 */,
				Fragments._Channel__OclType /* 2 */,
				Fragments._Channel__OclEnumeration /* 3 */,
				Fragments._Channel__Channel /* 4 */
			};
		private static final int /*@NonNull*/ [] __Channel = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ClassificationContract =
			{
				Fragments._ClassificationContract__OclAny /* 0 */,
				Fragments._ClassificationContract__OclElement /* 1 */,
				Fragments._ClassificationContract__NamedEntity /* 2 */,
				Fragments._ClassificationContract__ContractBase /* 3 */,
				Fragments._ClassificationContract__ClassificationContract /* 4 */
			};
		private static final int /*@NonNull*/ [] __ClassificationContract = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ClusteringContract =
			{
				Fragments._ClusteringContract__OclAny /* 0 */,
				Fragments._ClusteringContract__OclElement /* 1 */,
				Fragments._ClusteringContract__NamedEntity /* 2 */,
				Fragments._ClusteringContract__ContractBase /* 3 */,
				Fragments._ClusteringContract__ClusteringContract /* 4 */
			};
		private static final int /*@NonNull*/ [] __ClusteringContract = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContractBase =
			{
				Fragments._ContractBase__OclAny /* 0 */,
				Fragments._ContractBase__OclElement /* 1 */,
				Fragments._ContractBase__NamedEntity /* 2 */,
				Fragments._ContractBase__ContractBase /* 3 */
			};
		private static final int /*@NonNull*/ [] __ContractBase = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataStore =
			{
				Fragments._DataStore__OclAny /* 0 */,
				Fragments._DataStore__OclElement /* 1 */,
				Fragments._DataStore__NamedEntity /* 2 */,
				Fragments._DataStore__Element /* 3 */,
				Fragments._DataStore__DataStore /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataStore = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DecisionMakingContract =
			{
				Fragments._DecisionMakingContract__OclAny /* 0 */,
				Fragments._DecisionMakingContract__OclElement /* 1 */,
				Fragments._DecisionMakingContract__NamedEntity /* 2 */,
				Fragments._DecisionMakingContract__ContractBase /* 3 */,
				Fragments._DecisionMakingContract__DecisionMakingContract /* 4 */
			};
		private static final int /*@NonNull*/ [] __DecisionMakingContract = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EDFD =
			{
				Fragments._EDFD__OclAny /* 0 */,
				Fragments._EDFD__OclElement /* 1 */,
				Fragments._EDFD__NamedEntity /* 2 */,
				Fragments._EDFD__EDFD /* 3 */
			};
		private static final int /*@NonNull*/ [] __EDFD = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Element =
			{
				Fragments._Element__OclAny /* 0 */,
				Fragments._Element__OclElement /* 1 */,
				Fragments._Element__NamedEntity /* 2 */,
				Fragments._Element__Element /* 3 */
			};
		private static final int /*@NonNull*/ [] __Element = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExternalEntity =
			{
				Fragments._ExternalEntity__OclAny /* 0 */,
				Fragments._ExternalEntity__OclElement /* 1 */,
				Fragments._ExternalEntity__NamedEntity /* 2 */,
				Fragments._ExternalEntity__Element /* 3 */,
				Fragments._ExternalEntity__ExternalEntity /* 4 */
			};
		private static final int /*@NonNull*/ [] __ExternalEntity = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Flow =
			{
				Fragments._Flow__OclAny /* 0 */,
				Fragments._Flow__OclElement /* 1 */,
				Fragments._Flow__NamedEntity /* 2 */,
				Fragments._Flow__Element /* 3 */,
				Fragments._Flow__Flow /* 4 */
			};
		private static final int /*@NonNull*/ [] __Flow = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Layer =
			{
				Fragments._Layer__OclAny /* 0 */,
				Fragments._Layer__OclElement /* 1 */,
				Fragments._Layer__OclType /* 2 */,
				Fragments._Layer__OclEnumeration /* 3 */,
				Fragments._Layer__Layer /* 4 */
			};
		private static final int /*@NonNull*/ [] __Layer = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MLContract =
			{
				Fragments._MLContract__OclAny /* 0 */,
				Fragments._MLContract__OclElement /* 1 */,
				Fragments._MLContract__NamedEntity /* 2 */,
				Fragments._MLContract__ContractBase /* 3 */,
				Fragments._MLContract__MLContract /* 4 */
			};
		private static final int /*@NonNull*/ [] __MLContract = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MLContractType =
			{
				Fragments._MLContractType__OclAny /* 0 */,
				Fragments._MLContractType__OclElement /* 1 */,
				Fragments._MLContractType__OclType /* 2 */,
				Fragments._MLContractType__OclEnumeration /* 3 */,
				Fragments._MLContractType__MLContractType /* 4 */
			};
		private static final int /*@NonNull*/ [] __MLContractType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedEntity =
			{
				Fragments._NamedEntity__OclAny /* 0 */,
				Fragments._NamedEntity__OclElement /* 1 */,
				Fragments._NamedEntity__NamedEntity /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedEntity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Objective =
			{
				Fragments._Objective__OclAny /* 0 */,
				Fragments._Objective__OclElement /* 1 */,
				Fragments._Objective__OclType /* 2 */,
				Fragments._Objective__OclEnumeration /* 3 */,
				Fragments._Objective__Objective /* 4 */
			};
		private static final int /*@NonNull*/ [] __Objective = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PredictionContract =
			{
				Fragments._PredictionContract__OclAny /* 0 */,
				Fragments._PredictionContract__OclElement /* 1 */,
				Fragments._PredictionContract__NamedEntity /* 2 */,
				Fragments._PredictionContract__ContractBase /* 3 */,
				Fragments._PredictionContract__PredictionContract /* 4 */
			};
		private static final int /*@NonNull*/ [] __PredictionContract = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Priority =
			{
				Fragments._Priority__OclAny /* 0 */,
				Fragments._Priority__OclElement /* 1 */,
				Fragments._Priority__OclType /* 2 */,
				Fragments._Priority__OclEnumeration /* 3 */,
				Fragments._Priority__Priority /* 4 */
			};
		private static final int /*@NonNull*/ [] __Priority = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Process =
			{
				Fragments._Process__OclAny /* 0 */,
				Fragments._Process__OclElement /* 1 */,
				Fragments._Process__NamedEntity /* 2 */,
				Fragments._Process__Element /* 3 */,
				Fragments._Process__Process /* 4 */
			};
		private static final int /*@NonNull*/ [] __Process = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RecommendationContract =
			{
				Fragments._RecommendationContract__OclAny /* 0 */,
				Fragments._RecommendationContract__OclElement /* 1 */,
				Fragments._RecommendationContract__NamedEntity /* 2 */,
				Fragments._RecommendationContract__ContractBase /* 3 */,
				Fragments._RecommendationContract__RecommendationContract /* 4 */
			};
		private static final int /*@NonNull*/ [] __RecommendationContract = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SecurityContract =
			{
				Fragments._SecurityContract__OclAny /* 0 */,
				Fragments._SecurityContract__OclElement /* 1 */,
				Fragments._SecurityContract__NamedEntity /* 2 */,
				Fragments._SecurityContract__ContractBase /* 3 */,
				Fragments._SecurityContract__SecurityContract /* 4 */
			};
		private static final int /*@NonNull*/ [] __SecurityContract = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SecurityContractType =
			{
				Fragments._SecurityContractType__OclAny /* 0 */,
				Fragments._SecurityContractType__OclElement /* 1 */,
				Fragments._SecurityContractType__OclType /* 2 */,
				Fragments._SecurityContractType__OclEnumeration /* 3 */,
				Fragments._SecurityContractType__SecurityContractType /* 4 */
			};
		private static final int /*@NonNull*/ [] __SecurityContractType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TrustZone =
			{
				Fragments._TrustZone__OclAny /* 0 */,
				Fragments._TrustZone__OclElement /* 1 */,
				Fragments._TrustZone__NamedEntity /* 2 */,
				Fragments._TrustZone__Element /* 3 */,
				Fragments._TrustZone__TrustZone /* 4 */
			};
		private static final int /*@NonNull*/ [] __TrustZone = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Value =
			{
				Fragments._Value__OclAny /* 0 */,
				Fragments._Value__OclElement /* 1 */,
				Fragments._Value__Value /* 2 */
			};
		private static final int /*@NonNull*/ [] __Value = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Asset.initFragments(_Asset, __Asset);
			Types._AssetType.initFragments(_AssetType, __AssetType);
			Types._Assumption.initFragments(_Assumption, __Assumption);
			Types._AttackerProfile.initFragments(_AttackerProfile, __AttackerProfile);
			Types._Channel.initFragments(_Channel, __Channel);
			Types._ClassificationContract.initFragments(_ClassificationContract, __ClassificationContract);
			Types._ClusteringContract.initFragments(_ClusteringContract, __ClusteringContract);
			Types._ContractBase.initFragments(_ContractBase, __ContractBase);
			Types._DataStore.initFragments(_DataStore, __DataStore);
			Types._DecisionMakingContract.initFragments(_DecisionMakingContract, __DecisionMakingContract);
			Types._EDFD.initFragments(_EDFD, __EDFD);
			Types._Element.initFragments(_Element, __Element);
			Types._ExternalEntity.initFragments(_ExternalEntity, __ExternalEntity);
			Types._Flow.initFragments(_Flow, __Flow);
			Types._Layer.initFragments(_Layer, __Layer);
			Types._MLContract.initFragments(_MLContract, __MLContract);
			Types._MLContractType.initFragments(_MLContractType, __MLContractType);
			Types._NamedEntity.initFragments(_NamedEntity, __NamedEntity);
			Types._Objective.initFragments(_Objective, __Objective);
			Types._PredictionContract.initFragments(_PredictionContract, __PredictionContract);
			Types._Priority.initFragments(_Priority, __Priority);
			Types._Process.initFragments(_Process, __Process);
			Types._RecommendationContract.initFragments(_RecommendationContract, __RecommendationContract);
			Types._SecurityContract.initFragments(_SecurityContract, __SecurityContract);
			Types._SecurityContractType.initFragments(_SecurityContractType, __SecurityContractType);
			Types._TrustZone.initFragments(_TrustZone, __TrustZone);
			Types._Value.initFragments(_Value, __Value);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Asset__Asset = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Asset__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Asset__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Asset__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _AssetType__AssetType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssetType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _AssetType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
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
		private static final ExecutorOperation /*@NonNull*/ [] _AssetType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssetType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Assumption__Assumption = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Assumption__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Assumption__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _AttackerProfile__AttackerProfile = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttackerProfile__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttackerProfile__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _AttackerProfile__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Channel__Channel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
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
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ClassificationContract__ClassificationContract = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassificationContract__ContractBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassificationContract__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassificationContract__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ClassificationContract__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ClusteringContract__ClusteringContract = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClusteringContract__ContractBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClusteringContract__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClusteringContract__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ClusteringContract__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ContractBase__ContractBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContractBase__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContractBase__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ContractBase__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _DataStore__DataStore = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataStore__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataStore__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataStore__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DataStore__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _DecisionMakingContract__DecisionMakingContract = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DecisionMakingContract__ContractBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DecisionMakingContract__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DecisionMakingContract__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DecisionMakingContract__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _EDFD__EDFD = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EDFD__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EDFD__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _EDFD__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Element__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ExternalEntity__ExternalEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalEntity__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalEntity__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalEntity__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalEntity__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Flow__Flow = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Flow__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Flow__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Flow__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Flow__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Layer__Layer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Layer__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Layer__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
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
		private static final ExecutorOperation /*@NonNull*/ [] _Layer__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Layer__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MLContract__MLContract = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MLContract__ContractBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MLContract__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MLContract__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MLContract__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _MLContractType__MLContractType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MLContractType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MLContractType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
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
		private static final ExecutorOperation /*@NonNull*/ [] _MLContractType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MLContractType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Objective__Objective = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Objective__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Objective__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
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
		private static final ExecutorOperation /*@NonNull*/ [] _Objective__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Objective__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PredictionContract__PredictionContract = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PredictionContract__ContractBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PredictionContract__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PredictionContract__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _PredictionContract__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Priority__Priority = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Priority__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Priority__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
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
		private static final ExecutorOperation /*@NonNull*/ [] _Priority__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Priority__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Process__Process = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Process__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Process__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Process__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Process__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _RecommendationContract__RecommendationContract = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RecommendationContract__ContractBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RecommendationContract__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RecommendationContract__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _RecommendationContract__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContract__SecurityContract = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContract__ContractBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContract__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContract__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContract__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContractType__SecurityContractType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContractType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContractType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
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
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContractType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityContractType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TrustZone__TrustZone = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TrustZone__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TrustZone__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TrustZone__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _TrustZone__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Value__Value = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Value__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Value__OclElement = {
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
			Fragments._Asset__Asset.initOperations(_Asset__Asset);
			Fragments._Asset__NamedEntity.initOperations(_Asset__NamedEntity);
			Fragments._Asset__OclAny.initOperations(_Asset__OclAny);
			Fragments._Asset__OclElement.initOperations(_Asset__OclElement);

			Fragments._AssetType__AssetType.initOperations(_AssetType__AssetType);
			Fragments._AssetType__OclAny.initOperations(_AssetType__OclAny);
			Fragments._AssetType__OclElement.initOperations(_AssetType__OclElement);
			Fragments._AssetType__OclEnumeration.initOperations(_AssetType__OclEnumeration);
			Fragments._AssetType__OclType.initOperations(_AssetType__OclType);

			Fragments._Assumption__Assumption.initOperations(_Assumption__Assumption);
			Fragments._Assumption__OclAny.initOperations(_Assumption__OclAny);
			Fragments._Assumption__OclElement.initOperations(_Assumption__OclElement);

			Fragments._AttackerProfile__AttackerProfile.initOperations(_AttackerProfile__AttackerProfile);
			Fragments._AttackerProfile__NamedEntity.initOperations(_AttackerProfile__NamedEntity);
			Fragments._AttackerProfile__OclAny.initOperations(_AttackerProfile__OclAny);
			Fragments._AttackerProfile__OclElement.initOperations(_AttackerProfile__OclElement);

			Fragments._Channel__Channel.initOperations(_Channel__Channel);
			Fragments._Channel__OclAny.initOperations(_Channel__OclAny);
			Fragments._Channel__OclElement.initOperations(_Channel__OclElement);
			Fragments._Channel__OclEnumeration.initOperations(_Channel__OclEnumeration);
			Fragments._Channel__OclType.initOperations(_Channel__OclType);

			Fragments._ClassificationContract__ClassificationContract.initOperations(_ClassificationContract__ClassificationContract);
			Fragments._ClassificationContract__ContractBase.initOperations(_ClassificationContract__ContractBase);
			Fragments._ClassificationContract__NamedEntity.initOperations(_ClassificationContract__NamedEntity);
			Fragments._ClassificationContract__OclAny.initOperations(_ClassificationContract__OclAny);
			Fragments._ClassificationContract__OclElement.initOperations(_ClassificationContract__OclElement);

			Fragments._ClusteringContract__ClusteringContract.initOperations(_ClusteringContract__ClusteringContract);
			Fragments._ClusteringContract__ContractBase.initOperations(_ClusteringContract__ContractBase);
			Fragments._ClusteringContract__NamedEntity.initOperations(_ClusteringContract__NamedEntity);
			Fragments._ClusteringContract__OclAny.initOperations(_ClusteringContract__OclAny);
			Fragments._ClusteringContract__OclElement.initOperations(_ClusteringContract__OclElement);

			Fragments._ContractBase__ContractBase.initOperations(_ContractBase__ContractBase);
			Fragments._ContractBase__NamedEntity.initOperations(_ContractBase__NamedEntity);
			Fragments._ContractBase__OclAny.initOperations(_ContractBase__OclAny);
			Fragments._ContractBase__OclElement.initOperations(_ContractBase__OclElement);

			Fragments._DataStore__DataStore.initOperations(_DataStore__DataStore);
			Fragments._DataStore__Element.initOperations(_DataStore__Element);
			Fragments._DataStore__NamedEntity.initOperations(_DataStore__NamedEntity);
			Fragments._DataStore__OclAny.initOperations(_DataStore__OclAny);
			Fragments._DataStore__OclElement.initOperations(_DataStore__OclElement);

			Fragments._DecisionMakingContract__ContractBase.initOperations(_DecisionMakingContract__ContractBase);
			Fragments._DecisionMakingContract__DecisionMakingContract.initOperations(_DecisionMakingContract__DecisionMakingContract);
			Fragments._DecisionMakingContract__NamedEntity.initOperations(_DecisionMakingContract__NamedEntity);
			Fragments._DecisionMakingContract__OclAny.initOperations(_DecisionMakingContract__OclAny);
			Fragments._DecisionMakingContract__OclElement.initOperations(_DecisionMakingContract__OclElement);

			Fragments._EDFD__EDFD.initOperations(_EDFD__EDFD);
			Fragments._EDFD__NamedEntity.initOperations(_EDFD__NamedEntity);
			Fragments._EDFD__OclAny.initOperations(_EDFD__OclAny);
			Fragments._EDFD__OclElement.initOperations(_EDFD__OclElement);

			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__NamedEntity.initOperations(_Element__NamedEntity);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);

			Fragments._ExternalEntity__Element.initOperations(_ExternalEntity__Element);
			Fragments._ExternalEntity__ExternalEntity.initOperations(_ExternalEntity__ExternalEntity);
			Fragments._ExternalEntity__NamedEntity.initOperations(_ExternalEntity__NamedEntity);
			Fragments._ExternalEntity__OclAny.initOperations(_ExternalEntity__OclAny);
			Fragments._ExternalEntity__OclElement.initOperations(_ExternalEntity__OclElement);

			Fragments._Flow__Element.initOperations(_Flow__Element);
			Fragments._Flow__Flow.initOperations(_Flow__Flow);
			Fragments._Flow__NamedEntity.initOperations(_Flow__NamedEntity);
			Fragments._Flow__OclAny.initOperations(_Flow__OclAny);
			Fragments._Flow__OclElement.initOperations(_Flow__OclElement);

			Fragments._Layer__Layer.initOperations(_Layer__Layer);
			Fragments._Layer__OclAny.initOperations(_Layer__OclAny);
			Fragments._Layer__OclElement.initOperations(_Layer__OclElement);
			Fragments._Layer__OclEnumeration.initOperations(_Layer__OclEnumeration);
			Fragments._Layer__OclType.initOperations(_Layer__OclType);

			Fragments._MLContract__ContractBase.initOperations(_MLContract__ContractBase);
			Fragments._MLContract__MLContract.initOperations(_MLContract__MLContract);
			Fragments._MLContract__NamedEntity.initOperations(_MLContract__NamedEntity);
			Fragments._MLContract__OclAny.initOperations(_MLContract__OclAny);
			Fragments._MLContract__OclElement.initOperations(_MLContract__OclElement);

			Fragments._MLContractType__MLContractType.initOperations(_MLContractType__MLContractType);
			Fragments._MLContractType__OclAny.initOperations(_MLContractType__OclAny);
			Fragments._MLContractType__OclElement.initOperations(_MLContractType__OclElement);
			Fragments._MLContractType__OclEnumeration.initOperations(_MLContractType__OclEnumeration);
			Fragments._MLContractType__OclType.initOperations(_MLContractType__OclType);

			Fragments._NamedEntity__NamedEntity.initOperations(_NamedEntity__NamedEntity);
			Fragments._NamedEntity__OclAny.initOperations(_NamedEntity__OclAny);
			Fragments._NamedEntity__OclElement.initOperations(_NamedEntity__OclElement);

			Fragments._Objective__Objective.initOperations(_Objective__Objective);
			Fragments._Objective__OclAny.initOperations(_Objective__OclAny);
			Fragments._Objective__OclElement.initOperations(_Objective__OclElement);
			Fragments._Objective__OclEnumeration.initOperations(_Objective__OclEnumeration);
			Fragments._Objective__OclType.initOperations(_Objective__OclType);

			Fragments._PredictionContract__ContractBase.initOperations(_PredictionContract__ContractBase);
			Fragments._PredictionContract__NamedEntity.initOperations(_PredictionContract__NamedEntity);
			Fragments._PredictionContract__OclAny.initOperations(_PredictionContract__OclAny);
			Fragments._PredictionContract__OclElement.initOperations(_PredictionContract__OclElement);
			Fragments._PredictionContract__PredictionContract.initOperations(_PredictionContract__PredictionContract);

			Fragments._Priority__OclAny.initOperations(_Priority__OclAny);
			Fragments._Priority__OclElement.initOperations(_Priority__OclElement);
			Fragments._Priority__OclEnumeration.initOperations(_Priority__OclEnumeration);
			Fragments._Priority__OclType.initOperations(_Priority__OclType);
			Fragments._Priority__Priority.initOperations(_Priority__Priority);

			Fragments._Process__Element.initOperations(_Process__Element);
			Fragments._Process__NamedEntity.initOperations(_Process__NamedEntity);
			Fragments._Process__OclAny.initOperations(_Process__OclAny);
			Fragments._Process__OclElement.initOperations(_Process__OclElement);
			Fragments._Process__Process.initOperations(_Process__Process);

			Fragments._RecommendationContract__ContractBase.initOperations(_RecommendationContract__ContractBase);
			Fragments._RecommendationContract__NamedEntity.initOperations(_RecommendationContract__NamedEntity);
			Fragments._RecommendationContract__OclAny.initOperations(_RecommendationContract__OclAny);
			Fragments._RecommendationContract__OclElement.initOperations(_RecommendationContract__OclElement);
			Fragments._RecommendationContract__RecommendationContract.initOperations(_RecommendationContract__RecommendationContract);

			Fragments._SecurityContract__ContractBase.initOperations(_SecurityContract__ContractBase);
			Fragments._SecurityContract__NamedEntity.initOperations(_SecurityContract__NamedEntity);
			Fragments._SecurityContract__OclAny.initOperations(_SecurityContract__OclAny);
			Fragments._SecurityContract__OclElement.initOperations(_SecurityContract__OclElement);
			Fragments._SecurityContract__SecurityContract.initOperations(_SecurityContract__SecurityContract);

			Fragments._SecurityContractType__OclAny.initOperations(_SecurityContractType__OclAny);
			Fragments._SecurityContractType__OclElement.initOperations(_SecurityContractType__OclElement);
			Fragments._SecurityContractType__OclEnumeration.initOperations(_SecurityContractType__OclEnumeration);
			Fragments._SecurityContractType__OclType.initOperations(_SecurityContractType__OclType);
			Fragments._SecurityContractType__SecurityContractType.initOperations(_SecurityContractType__SecurityContractType);

			Fragments._TrustZone__Element.initOperations(_TrustZone__Element);
			Fragments._TrustZone__NamedEntity.initOperations(_TrustZone__NamedEntity);
			Fragments._TrustZone__OclAny.initOperations(_TrustZone__OclAny);
			Fragments._TrustZone__OclElement.initOperations(_TrustZone__OclElement);
			Fragments._TrustZone__TrustZone.initOperations(_TrustZone__TrustZone);

			Fragments._Value__OclAny.initOperations(_Value__OclAny);
			Fragments._Value__OclElement.initOperations(_Value__OclElement);
			Fragments._Value__Value.initOperations(_Value__Value);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Asset = {
			ModelTables.Properties._Asset__Type,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Asset__source,
			ModelTables.Properties._Asset__targets,
			ModelTables.Properties._Asset__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AssetType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Assumption = {
			ModelTables.Properties._Assumption__Layer,
			ModelTables.Properties._Assumption__Objective,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AttackerProfile = {
			ModelTables.Properties._AttackerProfile__Observation,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Channel = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ClassificationContract = {
			ModelTables.Properties._ClassificationContract__PClass,
			ModelTables.Properties._ContractBase__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._ContractBase__outcomeassets,
			ModelTables.Properties._ContractBase__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ClusteringContract = {
			ModelTables.Properties._ContractBase__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._ContractBase__outcomeassets,
			ModelTables.Properties._ContractBase__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContractBase = {
			ModelTables.Properties._ContractBase__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._ContractBase__outcomeassets,
			ModelTables.Properties._ContractBase__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataStore = {
			ModelTables.Properties._Element__Attacker,
			ModelTables.Properties._Element__assets,
			ModelTables.Properties._Element__assumption,
			ModelTables.Properties._Element__inflows,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Element__outflows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DecisionMakingContract = {
			ModelTables.Properties._DecisionMakingContract__PAction,
			ModelTables.Properties._ContractBase__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._ContractBase__outcomeassets,
			ModelTables.Properties._ContractBase__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EDFD = {
			ModelTables.Properties._EDFD__asset,
			ModelTables.Properties._EDFD__elements,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._EDFD__trustzones
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Element = {
			ModelTables.Properties._Element__Attacker,
			ModelTables.Properties._Element__assets,
			ModelTables.Properties._Element__assumption,
			ModelTables.Properties._Element__inflows,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Element__outflows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExternalEntity = {
			ModelTables.Properties._Element__Attacker,
			ModelTables.Properties._Element__assets,
			ModelTables.Properties._Element__assumption,
			ModelTables.Properties._Element__inflows,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Element__outflows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Flow = {
			ModelTables.Properties._Element__Attacker,
			ModelTables.Properties._Flow__Channel,
			ModelTables.Properties._Flow__Label,
			ModelTables.Properties._Element__assets,
			ModelTables.Properties._Element__assumption,
			ModelTables.Properties._Element__inflows,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Element__outflows,
			ModelTables.Properties._Flow__source,
			ModelTables.Properties._Flow__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Layer = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MLContract = {
			ModelTables.Properties._MLContract__MLTask,
			ModelTables.Properties._ContractBase__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._ContractBase__outcomeassets,
			ModelTables.Properties._ContractBase__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MLContractType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedEntity = {
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Objective = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PredictionContract = {
			ModelTables.Properties._PredictionContract__S,
			ModelTables.Properties._ContractBase__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._ContractBase__outcomeassets,
			ModelTables.Properties._ContractBase__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Priority = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Process = {
			ModelTables.Properties._Element__Attacker,
			ModelTables.Properties._Element__assets,
			ModelTables.Properties._Element__assumption,
			ModelTables.Properties._Element__inflows,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Element__outflows,
			ModelTables.Properties._Process__responsibility
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RecommendationContract = {
			ModelTables.Properties._RecommendationContract__S,
			ModelTables.Properties._ContractBase__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._ContractBase__outcomeassets,
			ModelTables.Properties._ContractBase__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SecurityContract = {
			ModelTables.Properties._SecurityContract__Task,
			ModelTables.Properties._ContractBase__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._ContractBase__outcomeassets,
			ModelTables.Properties._ContractBase__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SecurityContractType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TrustZone = {
			ModelTables.Properties._Element__Attacker,
			ModelTables.Properties._Element__assets,
			ModelTables.Properties._Element__assumption,
			ModelTables.Properties._TrustZone__attackerprofile,
			ModelTables.Properties._TrustZone__elements,
			ModelTables.Properties._Element__inflows,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Element__outflows,
			ModelTables.Properties._TrustZone__subzones
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Value = {
			ModelTables.Properties._Value__Objective,
			ModelTables.Properties._Value__Priority,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Asset__Asset.initProperties(_Asset);
			Fragments._AssetType__AssetType.initProperties(_AssetType);
			Fragments._Assumption__Assumption.initProperties(_Assumption);
			Fragments._AttackerProfile__AttackerProfile.initProperties(_AttackerProfile);
			Fragments._Channel__Channel.initProperties(_Channel);
			Fragments._ClassificationContract__ClassificationContract.initProperties(_ClassificationContract);
			Fragments._ClusteringContract__ClusteringContract.initProperties(_ClusteringContract);
			Fragments._ContractBase__ContractBase.initProperties(_ContractBase);
			Fragments._DataStore__DataStore.initProperties(_DataStore);
			Fragments._DecisionMakingContract__DecisionMakingContract.initProperties(_DecisionMakingContract);
			Fragments._EDFD__EDFD.initProperties(_EDFD);
			Fragments._Element__Element.initProperties(_Element);
			Fragments._ExternalEntity__ExternalEntity.initProperties(_ExternalEntity);
			Fragments._Flow__Flow.initProperties(_Flow);
			Fragments._Layer__Layer.initProperties(_Layer);
			Fragments._MLContract__MLContract.initProperties(_MLContract);
			Fragments._MLContractType__MLContractType.initProperties(_MLContractType);
			Fragments._NamedEntity__NamedEntity.initProperties(_NamedEntity);
			Fragments._Objective__Objective.initProperties(_Objective);
			Fragments._PredictionContract__PredictionContract.initProperties(_PredictionContract);
			Fragments._Priority__Priority.initProperties(_Priority);
			Fragments._Process__Process.initProperties(_Process);
			Fragments._RecommendationContract__RecommendationContract.initProperties(_RecommendationContract);
			Fragments._SecurityContract__SecurityContract.initProperties(_SecurityContract);
			Fragments._SecurityContractType__SecurityContractType.initProperties(_SecurityContractType);
			Fragments._TrustZone__TrustZone.initProperties(_TrustZone);
			Fragments._Value__Value.initProperties(_Value);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral _AssetType__String = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ASSET_TYPE.getEEnumLiteral("String"), Types._AssetType, 0);
		public static final EcoreExecutorEnumerationLiteral _AssetType__Object = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ASSET_TYPE.getEEnumLiteral("Object"), Types._AssetType, 1);
		public static final EcoreExecutorEnumerationLiteral _AssetType__Number = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ASSET_TYPE.getEEnumLiteral("Number"), Types._AssetType, 2);
		public static final EcoreExecutorEnumerationLiteral _AssetType__Vector = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ASSET_TYPE.getEEnumLiteral("Vector"), Types._AssetType, 3);
		public static final EcoreExecutorEnumerationLiteral _AssetType__Boolean = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ASSET_TYPE.getEEnumLiteral("Boolean"), Types._AssetType, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AssetType = {
			_AssetType__String,
			_AssetType__Object,
			_AssetType__Number,
			_AssetType__Vector,
			_AssetType__Boolean
		};

		public static final EcoreExecutorEnumerationLiteral _Channel__WiFi = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.CHANNEL.getEEnumLiteral("WiFi"), Types._Channel, 0);
		public static final EcoreExecutorEnumerationLiteral _Channel__VLAN = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.CHANNEL.getEEnumLiteral("VLAN"), Types._Channel, 1);
		public static final EcoreExecutorEnumerationLiteral _Channel__ETH = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.CHANNEL.getEEnumLiteral("ETH"), Types._Channel, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Channel = {
			_Channel__WiFi,
			_Channel__VLAN,
			_Channel__ETH
		};

		public static final EcoreExecutorEnumerationLiteral _Layer__Transport = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.LAYER.getEEnumLiteral("Transport"), Types._Layer, 0);
		public static final EcoreExecutorEnumerationLiteral _Layer__Architectural = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.LAYER.getEEnumLiteral("Architectural"), Types._Layer, 1);
		public static final EcoreExecutorEnumerationLiteral _Layer__Application = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.LAYER.getEEnumLiteral("Application"), Types._Layer, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Layer = {
			_Layer__Transport,
			_Layer__Architectural,
			_Layer__Application
		};

		public static final EcoreExecutorEnumerationLiteral _MLContractType__Classification = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_CONTRACT_TYPE.getEEnumLiteral("Classification"), Types._MLContractType, 0);
		public static final EcoreExecutorEnumerationLiteral _MLContractType__Clustering = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_CONTRACT_TYPE.getEEnumLiteral("Clustering"), Types._MLContractType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MLContractType = {
			_MLContractType__Classification,
			_MLContractType__Clustering
		};

		public static final EcoreExecutorEnumerationLiteral _Objective__Integrity = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.OBJECTIVE.getEEnumLiteral("Integrity"), Types._Objective, 0);
		public static final EcoreExecutorEnumerationLiteral _Objective__Confidentiality = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.OBJECTIVE.getEEnumLiteral("Confidentiality"), Types._Objective, 1);
		public static final EcoreExecutorEnumerationLiteral _Objective__Availability = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.OBJECTIVE.getEEnumLiteral("Availability"), Types._Objective, 2);
		public static final EcoreExecutorEnumerationLiteral _Objective__Accountability = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.OBJECTIVE.getEEnumLiteral("Accountability"), Types._Objective, 3);
		public static final EcoreExecutorEnumerationLiteral _Objective__Privacy = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.OBJECTIVE.getEEnumLiteral("Privacy"), Types._Objective, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Objective = {
			_Objective__Integrity,
			_Objective__Confidentiality,
			_Objective__Availability,
			_Objective__Accountability,
			_Objective__Privacy
		};

		public static final EcoreExecutorEnumerationLiteral _Priority__N = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.PRIORITY.getEEnumLiteral("N"), Types._Priority, 0);
		public static final EcoreExecutorEnumerationLiteral _Priority__L = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.PRIORITY.getEEnumLiteral("L"), Types._Priority, 1);
		public static final EcoreExecutorEnumerationLiteral _Priority__M = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.PRIORITY.getEEnumLiteral("M"), Types._Priority, 2);
		public static final EcoreExecutorEnumerationLiteral _Priority__H = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.PRIORITY.getEEnumLiteral("H"), Types._Priority, 3);
		public static final EcoreExecutorEnumerationLiteral _Priority__C = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.PRIORITY.getEEnumLiteral("C"), Types._Priority, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Priority = {
			_Priority__N,
			_Priority__L,
			_Priority__M,
			_Priority__H,
			_Priority__C
		};

		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Store = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Store"), Types._SecurityContractType, 0);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Comparator = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Comparator"), Types._SecurityContractType, 1);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Discarder = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Discarder"), Types._SecurityContractType, 2);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Joiner = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Joiner"), Types._SecurityContractType, 3);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Copier = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Copier"), Types._SecurityContractType, 4);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Splitter = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Splitter"), Types._SecurityContractType, 5);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Forward = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Forward"), Types._SecurityContractType, 6);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__EncryptOrHash = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("EncryptOrHash"), Types._SecurityContractType, 7);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Decrypt = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Decrypt"), Types._SecurityContractType, 8);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Authenticator = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Authenticator"), Types._SecurityContractType, 9);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Authoriser = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Authoriser"), Types._SecurityContractType, 10);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__Verifier = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("Verifier"), Types._SecurityContractType, 11);
		public static final EcoreExecutorEnumerationLiteral _SecurityContractType__User = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.SECURITY_CONTRACT_TYPE.getEEnumLiteral("User"), Types._SecurityContractType, 12);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SecurityContractType = {
			_SecurityContractType__Store,
			_SecurityContractType__Comparator,
			_SecurityContractType__Discarder,
			_SecurityContractType__Joiner,
			_SecurityContractType__Copier,
			_SecurityContractType__Splitter,
			_SecurityContractType__Forward,
			_SecurityContractType__EncryptOrHash,
			_SecurityContractType__Decrypt,
			_SecurityContractType__Authenticator,
			_SecurityContractType__Authoriser,
			_SecurityContractType__Verifier,
			_SecurityContractType__User
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AssetType.initLiterals(_AssetType);
			Types._Channel.initLiterals(_Channel);
			Types._Layer.initLiterals(_Layer);
			Types._MLContractType.initLiterals(_MLContractType);
			Types._Objective.initLiterals(_Objective);
			Types._Priority.initLiterals(_Priority);
			Types._SecurityContractType.initLiterals(_SecurityContractType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModelTables::EnumerationLiterals and all preceding sub-packages.
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
		new ModelTables();
	}

	private ModelTables() {
		super(ModelPackage.eNS_URI);
	}
}
