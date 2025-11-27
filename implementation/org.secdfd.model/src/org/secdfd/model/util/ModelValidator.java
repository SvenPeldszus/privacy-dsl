/**
 */
package org.secdfd.model.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.secdfd.model.Asset;
import org.secdfd.model.AssetType;
import org.secdfd.model.Assumption;
import org.secdfd.model.AttackerProfile;
import org.secdfd.model.Channel;
import org.secdfd.model.DataStore;
import org.secdfd.model.EDFD;
import org.secdfd.model.Element;
import org.secdfd.model.ExternalEntity;
import org.secdfd.model.Flow;
import org.secdfd.model.Layer;
import org.secdfd.model.MLResponsibility;
import org.secdfd.model.MLResponsibilityType;
import org.secdfd.model.ModelPackage;
import org.secdfd.model.NamedEntity;
import org.secdfd.model.Objective;
import org.secdfd.model.Priority;
import org.secdfd.model.Responsibility;
import org.secdfd.model.ResponsibilityBase;
import org.secdfd.model.ResponsibilityType;
import org.secdfd.model.TrustZone;
import org.secdfd.model.Value;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.secdfd.model.ModelPackage
 * @generated
 */
public class ModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelValidator INSTANCE = new ModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.secdfd.model";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint 1' of 'Value'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE__CONSTRAINT_1 = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ModelPackage.ASSET:
				return validateAsset((Asset)value, diagnostics, context);
			case ModelPackage.PROCESS:
				return validateProcess((org.secdfd.model.Process)value, diagnostics, context);
			case ModelPackage.EDFD:
				return validateEDFD((EDFD)value, diagnostics, context);
			case ModelPackage.DATA_STORE:
				return validateDataStore((DataStore)value, diagnostics, context);
			case ModelPackage.FLOW:
				return validateFlow((Flow)value, diagnostics, context);
			case ModelPackage.EXTERNAL_ENTITY:
				return validateExternalEntity((ExternalEntity)value, diagnostics, context);
			case ModelPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case ModelPackage.NAMED_ENTITY:
				return validateNamedEntity((NamedEntity)value, diagnostics, context);
			case ModelPackage.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case ModelPackage.ASSUMPTION:
				return validateAssumption((Assumption)value, diagnostics, context);
			case ModelPackage.ATTACKER_PROFILE:
				return validateAttackerProfile((AttackerProfile)value, diagnostics, context);
			case ModelPackage.TRUST_ZONE:
				return validateTrustZone((TrustZone)value, diagnostics, context);
			case ModelPackage.RESPONSIBILITY_BASE:
				return validateResponsibilityBase((ResponsibilityBase)value, diagnostics, context);
			case ModelPackage.RESPONSIBILITY:
				return validateResponsibility((Responsibility)value, diagnostics, context);
			case ModelPackage.ML_RESPONSIBILITY:
				return validateMLResponsibility((MLResponsibility)value, diagnostics, context);
			case ModelPackage.PRIORITY:
				return validatePriority((Priority)value, diagnostics, context);
			case ModelPackage.CHANNEL:
				return validateChannel((Channel)value, diagnostics, context);
			case ModelPackage.RESPONSIBILITY_TYPE:
				return validateResponsibilityType((ResponsibilityType)value, diagnostics, context);
			case ModelPackage.OBJECTIVE:
				return validateObjective((Objective)value, diagnostics, context);
			case ModelPackage.LAYER:
				return validateLayer((Layer)value, diagnostics, context);
			case ModelPackage.ASSET_TYPE:
				return validateAssetType((AssetType)value, diagnostics, context);
			case ModelPackage.ML_RESPONSIBILITY_TYPE:
				return validateMLResponsibilityType((MLResponsibilityType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsset(Asset asset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(org.secdfd.model.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(process, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDFD(EDFD edfd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edfd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStore(DataStore dataStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlow(Flow flow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalEntity(ExternalEntity externalEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedEntity(NamedEntity namedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(value, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(value, diagnostics, context);
		if (result || diagnostics != null) result &= validateValue_constraint_1(value, diagnostics, context);
		return result;
	}

	/**
	 * Validates the constraint_1 constraint of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue_constraint_1(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return value.constraint_1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssumption(Assumption assumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assumption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackerProfile(AttackerProfile attackerProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attackerProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrustZone(TrustZone trustZone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trustZone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibilityBase(ResponsibilityBase responsibilityBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibilityBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibility(Responsibility responsibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMLResponsibility(MLResponsibility mlResponsibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mlResponsibility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority(Priority priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibilityType(ResponsibilityType responsibilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjective(Objective objective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayer(Layer layer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssetType(AssetType assetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMLResponsibilityType(MLResponsibilityType mlResponsibilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ModelValidator
