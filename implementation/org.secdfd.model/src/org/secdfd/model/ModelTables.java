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
	public static final /*@NonInvalid*/ ClassId CLSSid_EDFD = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("EDFD", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Flow = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Flow", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MLResponsibility = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("MLResponsibility", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Process = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Process", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Responsibility = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Responsibility", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TrustZone = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("TrustZone", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Value = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("Value", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = ModelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_AssetType = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("AssetType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Channel = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Channel");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Layer = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Layer");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MLResponsibilityType = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("MLResponsibilityType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Objective = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Objective");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Priority = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("Priority");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ResponsibilityType = ModelTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getEnumerationId("ResponsibilityType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ String STR_MLResponsibility_32_can_32_only_32_be_32_used_32_when_32_ML_32_is_32_selected_32_as_32_a_32_Respo = "MLResponsibility can only be used when ML is selected as a ResponsibilityType in Action.";
	public static final /*@NonInvalid*/ String STR_Privacy_32_as_32_objective_32_can_32_only_32_have_32_a_32_high_32_or_32_low_32_priority = "Privacy as objective can only have a high or low priority.";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Asset = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_Asset, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Element = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_Element, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Flow = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_Flow, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Responsibility = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_Responsibility, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TrustZone = TypeId.BAG.getSpecializedId(ModelTables.CLSSid_TrustZone, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_H = ModelTables.ENUMid_Priority.getEnumerationLiteralId("H");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_L = ModelTables.ENUMid_Priority.getEnumerationLiteralId("L");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ML = ModelTables.ENUMid_ResponsibilityType.getEnumerationLiteralId("ML");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Privacy = ModelTables.ENUMid_Objective.getEnumerationLiteralId("Privacy");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Asset = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Asset, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Assumption = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Assumption, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AttackerProfile = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_AttackerProfile, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Element, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element_0 = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Element, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Flow = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Flow, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Responsibility = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Responsibility, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TrustZone = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_TrustZone, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Value = TypeId.ORDERED_SET.getSpecializedId(ModelTables.CLSSid_Value, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_MLResponsibilityType = TypeId.ORDERED_SET.getSpecializedId(ModelTables.ENUMid_MLResponsibilityType, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_Objective = TypeId.ORDERED_SET.getSpecializedId(ModelTables.ENUMid_Objective, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_ResponsibilityType = TypeId.ORDERED_SET.getSpecializedId(ModelTables.ENUMid_ResponsibilityType, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
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
		public static final EcoreExecutorType _DataStore = new EcoreExecutorType(ModelPackage.Literals.DATA_STORE, PACKAGE, 0);
		public static final EcoreExecutorType _EDFD = new EcoreExecutorType(ModelPackage.Literals.EDFD, PACKAGE, 0);
		public static final EcoreExecutorType _Element = new EcoreExecutorType(ModelPackage.Literals.ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ExternalEntity = new EcoreExecutorType(ModelPackage.Literals.EXTERNAL_ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _Flow = new EcoreExecutorType(ModelPackage.Literals.FLOW, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Layer = new EcoreExecutorEnumeration(ModelPackage.Literals.LAYER, PACKAGE, 0);
		public static final EcoreExecutorType _MLResponsibility = new EcoreExecutorType(ModelPackage.Literals.ML_RESPONSIBILITY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MLResponsibilityType = new EcoreExecutorEnumeration(ModelPackage.Literals.ML_RESPONSIBILITY_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _NamedEntity = new EcoreExecutorType(ModelPackage.Literals.NAMED_ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Objective = new EcoreExecutorEnumeration(ModelPackage.Literals.OBJECTIVE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Priority = new EcoreExecutorEnumeration(ModelPackage.Literals.PRIORITY, PACKAGE, 0);
		public static final EcoreExecutorType _Process = new EcoreExecutorType(ModelPackage.Literals.PROCESS, PACKAGE, 0);
		public static final EcoreExecutorType _Responsibility = new EcoreExecutorType(ModelPackage.Literals.RESPONSIBILITY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ResponsibilityType = new EcoreExecutorEnumeration(ModelPackage.Literals.RESPONSIBILITY_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _TrustZone = new EcoreExecutorType(ModelPackage.Literals.TRUST_ZONE, PACKAGE, 0);
		public static final EcoreExecutorType _Value = new EcoreExecutorType(ModelPackage.Literals.VALUE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Asset,
			_AssetType,
			_Assumption,
			_AttackerProfile,
			_Channel,
			_DataStore,
			_EDFD,
			_Element,
			_ExternalEntity,
			_Flow,
			_Layer,
			_MLResponsibility,
			_MLResponsibilityType,
			_NamedEntity,
			_Objective,
			_Priority,
			_Process,
			_Responsibility,
			_ResponsibilityType,
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

		private static final ExecutorFragment _DataStore__DataStore = new ExecutorFragment(Types._DataStore, ModelTables.Types._DataStore);
		private static final ExecutorFragment _DataStore__Element = new ExecutorFragment(Types._DataStore, ModelTables.Types._Element);
		private static final ExecutorFragment _DataStore__NamedEntity = new ExecutorFragment(Types._DataStore, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _DataStore__OclAny = new ExecutorFragment(Types._DataStore, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataStore__OclElement = new ExecutorFragment(Types._DataStore, OCLstdlibTables.Types._OclElement);

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

		private static final ExecutorFragment _MLResponsibility__MLResponsibility = new ExecutorFragment(Types._MLResponsibility, ModelTables.Types._MLResponsibility);
		private static final ExecutorFragment _MLResponsibility__NamedEntity = new ExecutorFragment(Types._MLResponsibility, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _MLResponsibility__OclAny = new ExecutorFragment(Types._MLResponsibility, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MLResponsibility__OclElement = new ExecutorFragment(Types._MLResponsibility, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MLResponsibility__Responsibility = new ExecutorFragment(Types._MLResponsibility, ModelTables.Types._Responsibility);

		private static final ExecutorFragment _MLResponsibilityType__MLResponsibilityType = new ExecutorFragment(Types._MLResponsibilityType, ModelTables.Types._MLResponsibilityType);
		private static final ExecutorFragment _MLResponsibilityType__OclAny = new ExecutorFragment(Types._MLResponsibilityType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MLResponsibilityType__OclElement = new ExecutorFragment(Types._MLResponsibilityType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MLResponsibilityType__OclEnumeration = new ExecutorFragment(Types._MLResponsibilityType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MLResponsibilityType__OclType = new ExecutorFragment(Types._MLResponsibilityType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _NamedEntity__NamedEntity = new ExecutorFragment(Types._NamedEntity, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _NamedEntity__OclAny = new ExecutorFragment(Types._NamedEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedEntity__OclElement = new ExecutorFragment(Types._NamedEntity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Objective__Objective = new ExecutorFragment(Types._Objective, ModelTables.Types._Objective);
		private static final ExecutorFragment _Objective__OclAny = new ExecutorFragment(Types._Objective, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Objective__OclElement = new ExecutorFragment(Types._Objective, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Objective__OclEnumeration = new ExecutorFragment(Types._Objective, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Objective__OclType = new ExecutorFragment(Types._Objective, OCLstdlibTables.Types._OclType);

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

		private static final ExecutorFragment _Responsibility__NamedEntity = new ExecutorFragment(Types._Responsibility, ModelTables.Types._NamedEntity);
		private static final ExecutorFragment _Responsibility__OclAny = new ExecutorFragment(Types._Responsibility, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Responsibility__OclElement = new ExecutorFragment(Types._Responsibility, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Responsibility__Responsibility = new ExecutorFragment(Types._Responsibility, ModelTables.Types._Responsibility);

		private static final ExecutorFragment _ResponsibilityType__OclAny = new ExecutorFragment(Types._ResponsibilityType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ResponsibilityType__OclElement = new ExecutorFragment(Types._ResponsibilityType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ResponsibilityType__OclEnumeration = new ExecutorFragment(Types._ResponsibilityType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ResponsibilityType__OclType = new ExecutorFragment(Types._ResponsibilityType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _ResponsibilityType__ResponsibilityType = new ExecutorFragment(Types._ResponsibilityType, ModelTables.Types._ResponsibilityType);

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
		public static final ExecutorProperty _Asset__EDFD__asset = new ExecutorPropertyWithImplementation("EDFD", Types._Asset, 4, new EcoreLibraryOppositeProperty(ModelPackage.Literals.EDFD__ASSET));
		public static final ExecutorProperty _Asset__Element__assets = new ExecutorPropertyWithImplementation("Element", Types._Asset, 5, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ELEMENT__ASSETS));
		public static final ExecutorProperty _Asset__Responsibility__incomeassets = new ExecutorPropertyWithImplementation("Responsibility", Types._Asset, 6, new EcoreLibraryOppositeProperty(ModelPackage.Literals.RESPONSIBILITY__INCOMEASSETS));
		public static final ExecutorProperty _Asset__Responsibility__outcomeassets = new ExecutorPropertyWithImplementation("Responsibility", Types._Asset, 7, new EcoreLibraryOppositeProperty(ModelPackage.Literals.RESPONSIBILITY__OUTCOMEASSETS));

		public static final ExecutorProperty _Assumption__Layer = new EcoreExecutorProperty(ModelPackage.Literals.ASSUMPTION__LAYER, Types._Assumption, 0);
		public static final ExecutorProperty _Assumption__Objective = new EcoreExecutorProperty(ModelPackage.Literals.ASSUMPTION__OBJECTIVE, Types._Assumption, 1);
		public static final ExecutorProperty _Assumption__Element__assumption = new ExecutorPropertyWithImplementation("Element", Types._Assumption, 2, new EcoreLibraryOppositeProperty(ModelPackage.Literals.ELEMENT__ASSUMPTION));

		public static final ExecutorProperty _AttackerProfile__Observation = new EcoreExecutorProperty(ModelPackage.Literals.ATTACKER_PROFILE__OBSERVATION, Types._AttackerProfile, 0);
		public static final ExecutorProperty _AttackerProfile__TrustZone__attackerprofile = new ExecutorPropertyWithImplementation("TrustZone", Types._AttackerProfile, 1, new EcoreLibraryOppositeProperty(ModelPackage.Literals.TRUST_ZONE__ATTACKERPROFILE));

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

		public static final ExecutorProperty _MLResponsibility__mlAction = new EcoreExecutorProperty(ModelPackage.Literals.ML_RESPONSIBILITY__ML_ACTION, Types._MLResponsibility, 0);

		public static final ExecutorProperty _NamedEntity__name = new EcoreExecutorProperty(ModelPackage.Literals.NAMED_ENTITY__NAME, Types._NamedEntity, 0);
		public static final ExecutorProperty _NamedEntity__number = new EcoreExecutorProperty(ModelPackage.Literals.NAMED_ENTITY__NUMBER, Types._NamedEntity, 1);

		public static final ExecutorProperty _Process__responsibility = new EcoreExecutorProperty(ModelPackage.Literals.PROCESS__RESPONSIBILITY, Types._Process, 0);

		public static final ExecutorProperty _Responsibility__Action = new EcoreExecutorProperty(ModelPackage.Literals.RESPONSIBILITY__ACTION, Types._Responsibility, 0);
		public static final ExecutorProperty _Responsibility__incomeassets = new EcoreExecutorProperty(ModelPackage.Literals.RESPONSIBILITY__INCOMEASSETS, Types._Responsibility, 1);
		public static final ExecutorProperty _Responsibility__outcomeassets = new EcoreExecutorProperty(ModelPackage.Literals.RESPONSIBILITY__OUTCOMEASSETS, Types._Responsibility, 2);
		public static final ExecutorProperty _Responsibility__process = new EcoreExecutorProperty(ModelPackage.Literals.RESPONSIBILITY__PROCESS, Types._Responsibility, 3);

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

		private static final ExecutorFragment /*@NonNull*/ [] _DataStore =
			{
				Fragments._DataStore__OclAny /* 0 */,
				Fragments._DataStore__OclElement /* 1 */,
				Fragments._DataStore__NamedEntity /* 2 */,
				Fragments._DataStore__Element /* 3 */,
				Fragments._DataStore__DataStore /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataStore = { 1,1,1,1,1 };

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

		private static final ExecutorFragment /*@NonNull*/ [] _MLResponsibility =
			{
				Fragments._MLResponsibility__OclAny /* 0 */,
				Fragments._MLResponsibility__OclElement /* 1 */,
				Fragments._MLResponsibility__NamedEntity /* 2 */,
				Fragments._MLResponsibility__Responsibility /* 3 */,
				Fragments._MLResponsibility__MLResponsibility /* 4 */
			};
		private static final int /*@NonNull*/ [] __MLResponsibility = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MLResponsibilityType =
			{
				Fragments._MLResponsibilityType__OclAny /* 0 */,
				Fragments._MLResponsibilityType__OclElement /* 1 */,
				Fragments._MLResponsibilityType__OclType /* 2 */,
				Fragments._MLResponsibilityType__OclEnumeration /* 3 */,
				Fragments._MLResponsibilityType__MLResponsibilityType /* 4 */
			};
		private static final int /*@NonNull*/ [] __MLResponsibilityType = { 1,1,1,1,1 };

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

		private static final ExecutorFragment /*@NonNull*/ [] _Responsibility =
			{
				Fragments._Responsibility__OclAny /* 0 */,
				Fragments._Responsibility__OclElement /* 1 */,
				Fragments._Responsibility__NamedEntity /* 2 */,
				Fragments._Responsibility__Responsibility /* 3 */
			};
		private static final int /*@NonNull*/ [] __Responsibility = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ResponsibilityType =
			{
				Fragments._ResponsibilityType__OclAny /* 0 */,
				Fragments._ResponsibilityType__OclElement /* 1 */,
				Fragments._ResponsibilityType__OclType /* 2 */,
				Fragments._ResponsibilityType__OclEnumeration /* 3 */,
				Fragments._ResponsibilityType__ResponsibilityType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ResponsibilityType = { 1,1,1,1,1 };

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
			Types._DataStore.initFragments(_DataStore, __DataStore);
			Types._EDFD.initFragments(_EDFD, __EDFD);
			Types._Element.initFragments(_Element, __Element);
			Types._ExternalEntity.initFragments(_ExternalEntity, __ExternalEntity);
			Types._Flow.initFragments(_Flow, __Flow);
			Types._Layer.initFragments(_Layer, __Layer);
			Types._MLResponsibility.initFragments(_MLResponsibility, __MLResponsibility);
			Types._MLResponsibilityType.initFragments(_MLResponsibilityType, __MLResponsibilityType);
			Types._NamedEntity.initFragments(_NamedEntity, __NamedEntity);
			Types._Objective.initFragments(_Objective, __Objective);
			Types._Priority.initFragments(_Priority, __Priority);
			Types._Process.initFragments(_Process, __Process);
			Types._Responsibility.initFragments(_Responsibility, __Responsibility);
			Types._ResponsibilityType.initFragments(_ResponsibilityType, __ResponsibilityType);
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

		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibility__MLResponsibility = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibility__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibility__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibility__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibility__Responsibility = {};

		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibilityType__MLResponsibilityType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibilityType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibilityType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibilityType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MLResponsibilityType__OclType = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Responsibility__Responsibility = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Responsibility__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Responsibility__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Responsibility__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ResponsibilityType__ResponsibilityType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ResponsibilityType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ResponsibilityType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ResponsibilityType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ResponsibilityType__OclType = {
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

			Fragments._DataStore__DataStore.initOperations(_DataStore__DataStore);
			Fragments._DataStore__Element.initOperations(_DataStore__Element);
			Fragments._DataStore__NamedEntity.initOperations(_DataStore__NamedEntity);
			Fragments._DataStore__OclAny.initOperations(_DataStore__OclAny);
			Fragments._DataStore__OclElement.initOperations(_DataStore__OclElement);

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

			Fragments._MLResponsibility__MLResponsibility.initOperations(_MLResponsibility__MLResponsibility);
			Fragments._MLResponsibility__NamedEntity.initOperations(_MLResponsibility__NamedEntity);
			Fragments._MLResponsibility__OclAny.initOperations(_MLResponsibility__OclAny);
			Fragments._MLResponsibility__OclElement.initOperations(_MLResponsibility__OclElement);
			Fragments._MLResponsibility__Responsibility.initOperations(_MLResponsibility__Responsibility);

			Fragments._MLResponsibilityType__MLResponsibilityType.initOperations(_MLResponsibilityType__MLResponsibilityType);
			Fragments._MLResponsibilityType__OclAny.initOperations(_MLResponsibilityType__OclAny);
			Fragments._MLResponsibilityType__OclElement.initOperations(_MLResponsibilityType__OclElement);
			Fragments._MLResponsibilityType__OclEnumeration.initOperations(_MLResponsibilityType__OclEnumeration);
			Fragments._MLResponsibilityType__OclType.initOperations(_MLResponsibilityType__OclType);

			Fragments._NamedEntity__NamedEntity.initOperations(_NamedEntity__NamedEntity);
			Fragments._NamedEntity__OclAny.initOperations(_NamedEntity__OclAny);
			Fragments._NamedEntity__OclElement.initOperations(_NamedEntity__OclElement);

			Fragments._Objective__Objective.initOperations(_Objective__Objective);
			Fragments._Objective__OclAny.initOperations(_Objective__OclAny);
			Fragments._Objective__OclElement.initOperations(_Objective__OclElement);
			Fragments._Objective__OclEnumeration.initOperations(_Objective__OclEnumeration);
			Fragments._Objective__OclType.initOperations(_Objective__OclType);

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

			Fragments._Responsibility__NamedEntity.initOperations(_Responsibility__NamedEntity);
			Fragments._Responsibility__OclAny.initOperations(_Responsibility__OclAny);
			Fragments._Responsibility__OclElement.initOperations(_Responsibility__OclElement);
			Fragments._Responsibility__Responsibility.initOperations(_Responsibility__Responsibility);

			Fragments._ResponsibilityType__OclAny.initOperations(_ResponsibilityType__OclAny);
			Fragments._ResponsibilityType__OclElement.initOperations(_ResponsibilityType__OclElement);
			Fragments._ResponsibilityType__OclEnumeration.initOperations(_ResponsibilityType__OclEnumeration);
			Fragments._ResponsibilityType__OclType.initOperations(_ResponsibilityType__OclType);
			Fragments._ResponsibilityType__ResponsibilityType.initOperations(_ResponsibilityType__ResponsibilityType);

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

		private static final ExecutorProperty /*@NonNull*/ [] _MLResponsibility = {
			ModelTables.Properties._Responsibility__Action,
			ModelTables.Properties._Responsibility__incomeassets,
			ModelTables.Properties._MLResponsibility__mlAction,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Responsibility__outcomeassets,
			ModelTables.Properties._Responsibility__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MLResponsibilityType = {
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

		private static final ExecutorProperty /*@NonNull*/ [] _Responsibility = {
			ModelTables.Properties._Responsibility__Action,
			ModelTables.Properties._Responsibility__incomeassets,
			ModelTables.Properties._NamedEntity__name,
			ModelTables.Properties._NamedEntity__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ModelTables.Properties._Responsibility__outcomeassets,
			ModelTables.Properties._Responsibility__process
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ResponsibilityType = {
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
			Fragments._DataStore__DataStore.initProperties(_DataStore);
			Fragments._EDFD__EDFD.initProperties(_EDFD);
			Fragments._Element__Element.initProperties(_Element);
			Fragments._ExternalEntity__ExternalEntity.initProperties(_ExternalEntity);
			Fragments._Flow__Flow.initProperties(_Flow);
			Fragments._Layer__Layer.initProperties(_Layer);
			Fragments._MLResponsibility__MLResponsibility.initProperties(_MLResponsibility);
			Fragments._MLResponsibilityType__MLResponsibilityType.initProperties(_MLResponsibilityType);
			Fragments._NamedEntity__NamedEntity.initProperties(_NamedEntity);
			Fragments._Objective__Objective.initProperties(_Objective);
			Fragments._Priority__Priority.initProperties(_Priority);
			Fragments._Process__Process.initProperties(_Process);
			Fragments._Responsibility__Responsibility.initProperties(_Responsibility);
			Fragments._ResponsibilityType__ResponsibilityType.initProperties(_ResponsibilityType);
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

		public static final EcoreExecutorEnumerationLiteral _MLResponsibilityType__Classification = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_RESPONSIBILITY_TYPE.getEEnumLiteral("Classification"), Types._MLResponsibilityType, 0);
		public static final EcoreExecutorEnumerationLiteral _MLResponsibilityType__DecisionMaking = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_RESPONSIBILITY_TYPE.getEEnumLiteral("DecisionMaking"), Types._MLResponsibilityType, 1);
		public static final EcoreExecutorEnumerationLiteral _MLResponsibilityType__Regression = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_RESPONSIBILITY_TYPE.getEEnumLiteral("Regression"), Types._MLResponsibilityType, 2);
		public static final EcoreExecutorEnumerationLiteral _MLResponsibilityType__Clustering = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_RESPONSIBILITY_TYPE.getEEnumLiteral("Clustering"), Types._MLResponsibilityType, 3);
		public static final EcoreExecutorEnumerationLiteral _MLResponsibilityType__AnomalyDetection = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_RESPONSIBILITY_TYPE.getEEnumLiteral("AnomalyDetection"), Types._MLResponsibilityType, 4);
		public static final EcoreExecutorEnumerationLiteral _MLResponsibilityType__NaturalLanguageProcessing = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_RESPONSIBILITY_TYPE.getEEnumLiteral("NaturalLanguageProcessing"), Types._MLResponsibilityType, 5);
		public static final EcoreExecutorEnumerationLiteral _MLResponsibilityType__ComputerVision = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.ML_RESPONSIBILITY_TYPE.getEEnumLiteral("ComputerVision"), Types._MLResponsibilityType, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MLResponsibilityType = {
			_MLResponsibilityType__Classification,
			_MLResponsibilityType__DecisionMaking,
			_MLResponsibilityType__Regression,
			_MLResponsibilityType__Clustering,
			_MLResponsibilityType__AnomalyDetection,
			_MLResponsibilityType__NaturalLanguageProcessing,
			_MLResponsibilityType__ComputerVision
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

		public static final EcoreExecutorEnumerationLiteral _Priority__H = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.PRIORITY.getEEnumLiteral("H"), Types._Priority, 0);
		public static final EcoreExecutorEnumerationLiteral _Priority__M = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.PRIORITY.getEEnumLiteral("M"), Types._Priority, 1);
		public static final EcoreExecutorEnumerationLiteral _Priority__L = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.PRIORITY.getEEnumLiteral("L"), Types._Priority, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Priority = {
			_Priority__H,
			_Priority__M,
			_Priority__L
		};

		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Store = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Store"), Types._ResponsibilityType, 0);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Comparator = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Comparator"), Types._ResponsibilityType, 1);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Discarder = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Discarder"), Types._ResponsibilityType, 2);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Joiner = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Joiner"), Types._ResponsibilityType, 3);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Copier = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Copier"), Types._ResponsibilityType, 4);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Splitter = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Splitter"), Types._ResponsibilityType, 5);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Forward = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Forward"), Types._ResponsibilityType, 6);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__EncryptOrHash = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("EncryptOrHash"), Types._ResponsibilityType, 7);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Decrypt = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Decrypt"), Types._ResponsibilityType, 8);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Authenticator = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Authenticator"), Types._ResponsibilityType, 9);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Authoriser = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Authoriser"), Types._ResponsibilityType, 10);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__Verifier = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("Verifier"), Types._ResponsibilityType, 11);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__User = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("User"), Types._ResponsibilityType, 12);
		public static final EcoreExecutorEnumerationLiteral _ResponsibilityType__ML = new EcoreExecutorEnumerationLiteral(ModelPackage.Literals.RESPONSIBILITY_TYPE.getEEnumLiteral("ML"), Types._ResponsibilityType, 13);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ResponsibilityType = {
			_ResponsibilityType__Store,
			_ResponsibilityType__Comparator,
			_ResponsibilityType__Discarder,
			_ResponsibilityType__Joiner,
			_ResponsibilityType__Copier,
			_ResponsibilityType__Splitter,
			_ResponsibilityType__Forward,
			_ResponsibilityType__EncryptOrHash,
			_ResponsibilityType__Decrypt,
			_ResponsibilityType__Authenticator,
			_ResponsibilityType__Authoriser,
			_ResponsibilityType__Verifier,
			_ResponsibilityType__User,
			_ResponsibilityType__ML
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AssetType.initLiterals(_AssetType);
			Types._Channel.initLiterals(_Channel);
			Types._Layer.initLiterals(_Layer);
			Types._MLResponsibilityType.initLiterals(_MLResponsibilityType);
			Types._Objective.initLiterals(_Objective);
			Types._Priority.initLiterals(_Priority);
			Types._ResponsibilityType.initLiterals(_ResponsibilityType);

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
