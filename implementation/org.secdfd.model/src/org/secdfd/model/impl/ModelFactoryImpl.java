/**
 */
package org.secdfd.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.secdfd.model.Asset;
import org.secdfd.model.AssetType;
import org.secdfd.model.Assumption;
import org.secdfd.model.AttackerProfile;
import org.secdfd.model.Channel;
import org.secdfd.model.ClassificationFixedContract;
import org.secdfd.model.ClassificationVariableContract;
import org.secdfd.model.ClusteringContract;
import org.secdfd.model.ContractType;
import org.secdfd.model.DataStore;
import org.secdfd.model.EDFD;
import org.secdfd.model.ExternalEntity;
import org.secdfd.model.Flow;
import org.secdfd.model.Layer;
import org.secdfd.model.Level;
import org.secdfd.model.ModelFactory;
import org.secdfd.model.ModelPackage;
import org.secdfd.model.Objective;
import org.secdfd.model.SecurityContract;
import org.secdfd.model.TransformationContract;
import org.secdfd.model.TrustFactor;
import org.secdfd.model.TrustZone;
import org.secdfd.model.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.ASSET: return createAsset();
			case ModelPackage.PROCESS: return createProcess();
			case ModelPackage.EDFD: return createEDFD();
			case ModelPackage.DATA_STORE: return createDataStore();
			case ModelPackage.FLOW: return createFlow();
			case ModelPackage.EXTERNAL_ENTITY: return createExternalEntity();
			case ModelPackage.VALUE: return createValue();
			case ModelPackage.ASSUMPTION: return createAssumption();
			case ModelPackage.ATTACKER_PROFILE: return createAttackerProfile();
			case ModelPackage.TRUST_ZONE: return createTrustZone();
			case ModelPackage.SECURITY_CONTRACT: return createSecurityContract();
			case ModelPackage.CLASSIFICATION_FIXED_CONTRACT: return createClassificationFixedContract();
			case ModelPackage.CLUSTERING_CONTRACT: return createClusteringContract();
			case ModelPackage.CLASSIFICATION_VARIABLE_CONTRACT: return createClassificationVariableContract();
			case ModelPackage.TRANSFORMATION_CONTRACT: return createTransformationContract();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case ModelPackage.TRUST_FACTOR:
				return createTrustFactorFromString(eDataType, initialValue);
			case ModelPackage.CHANNEL:
				return createChannelFromString(eDataType, initialValue);
			case ModelPackage.CONTRACT_TYPE:
				return createContractTypeFromString(eDataType, initialValue);
			case ModelPackage.OBJECTIVE:
				return createObjectiveFromString(eDataType, initialValue);
			case ModelPackage.LAYER:
				return createLayerFromString(eDataType, initialValue);
			case ModelPackage.ASSET_TYPE:
				return createAssetTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case ModelPackage.TRUST_FACTOR:
				return convertTrustFactorToString(eDataType, instanceValue);
			case ModelPackage.CHANNEL:
				return convertChannelToString(eDataType, instanceValue);
			case ModelPackage.CONTRACT_TYPE:
				return convertContractTypeToString(eDataType, instanceValue);
			case ModelPackage.OBJECTIVE:
				return convertObjectiveToString(eDataType, instanceValue);
			case ModelPackage.LAYER:
				return convertLayerToString(eDataType, instanceValue);
			case ModelPackage.ASSET_TYPE:
				return convertAssetTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.secdfd.model.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDFD createEDFD() {
		EDFDImpl edfd = new EDFDImpl();
		return edfd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStore createDataStore() {
		DataStoreImpl dataStore = new DataStoreImpl();
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalEntity createExternalEntity() {
		ExternalEntityImpl externalEntity = new ExternalEntityImpl();
		return externalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackerProfile createAttackerProfile() {
		AttackerProfileImpl attackerProfile = new AttackerProfileImpl();
		return attackerProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrustZone createTrustZone() {
		TrustZoneImpl trustZone = new TrustZoneImpl();
		return trustZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityContract createSecurityContract() {
		SecurityContractImpl securityContract = new SecurityContractImpl();
		return securityContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationFixedContract createClassificationFixedContract() {
		ClassificationFixedContractImpl classificationFixedContract = new ClassificationFixedContractImpl();
		return classificationFixedContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClusteringContract createClusteringContract() {
		ClusteringContractImpl clusteringContract = new ClusteringContractImpl();
		return clusteringContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationVariableContract createClassificationVariableContract() {
		ClassificationVariableContractImpl classificationVariableContract = new ClassificationVariableContractImpl();
		return classificationVariableContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationContract createTransformationContract() {
		TransformationContractImpl transformationContract = new TransformationContractImpl();
		return transformationContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustFactor createTrustFactorFromString(EDataType eDataType, String initialValue) {
		TrustFactor result = TrustFactor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrustFactorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannelFromString(EDataType eDataType, String initialValue) {
		Channel result = Channel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractType createContractTypeFromString(EDataType eDataType, String initialValue) {
		ContractType result = ContractType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjectiveFromString(EDataType eDataType, String initialValue) {
		Objective result = Objective.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayerFromString(EDataType eDataType, String initialValue) {
		Layer result = Layer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType createAssetTypeFromString(EDataType eDataType, String initialValue) {
		AssetType result = AssetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
