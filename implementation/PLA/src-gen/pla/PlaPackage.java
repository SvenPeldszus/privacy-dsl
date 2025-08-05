/**
 */
package pla;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pla.PlaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface PlaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pla";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pla";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pla";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlaPackage eINSTANCE = pla.impl.PlaPackageImpl.init();

	/**
	 * The meta object id for the '{@link pla.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.Identifiable
	 * @see pla.impl.PlaPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pla.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.impl.ActorImpl
	 * @see pla.impl.PlaPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTACT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ADDRESS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pla.impl.ThirdPartyImpl <em>Third Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.impl.ThirdPartyImpl
	 * @see pla.impl.PlaPackageImpl#getThirdParty()
	 * @generated
	 */
	int THIRD_PARTY = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY__ID = ACTOR__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY__NUMBER = ACTOR__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY__CONTACT = ACTOR__CONTACT;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY__ADDRESS = ACTOR__ADDRESS;

	/**
	 * The number of structural features of the '<em>Third Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Third Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pla.impl.DataStorageImpl <em>Data Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.impl.DataStorageImpl
	 * @see pla.impl.PlaPackageImpl#getDataStorage()
	 * @generated
	 */
	int DATA_STORAGE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__ID = ACTOR__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__NUMBER = ACTOR__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__CONTACT = ACTOR__CONTACT;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__ADDRESS = ACTOR__ADDRESS;

	/**
	 * The number of structural features of the '<em>Data Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pla.impl.PersonalDataAssetImpl <em>Personal Data Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.impl.PersonalDataAssetImpl
	 * @see pla.impl.PlaPackageImpl#getPersonalDataAsset()
	 * @generated
	 */
	int PERSONAL_DATA_ASSET = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_ASSET__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_ASSET__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_ASSET__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_ASSET__TYPE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Privacy Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_ASSET__PRIVACY_LABEL = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Legal Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_ASSET__LEGAL_BASIS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Personal Data Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_ASSET_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Personal Data Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_ASSET_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pla.impl.PurposeImpl <em>Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.impl.PurposeImpl
	 * @see pla.impl.PlaPackageImpl#getPurpose()
	 * @generated
	 */
	int PURPOSE = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purpose Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__PURPOSE_TEXT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__ACTIONS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Income Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__INCOME_ASSETS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outcome Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__OUTCOME_ASSETS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pla.impl.PLAsImpl <em>PL As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.impl.PLAsImpl
	 * @see pla.impl.PlaPackageImpl#getPLAs()
	 * @generated
	 */
	int PL_AS = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_AS__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_AS__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_AS__ACTORS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purposes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_AS__PURPOSES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Personal Data Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_AS__PERSONAL_DATA_ASSETS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PL As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_AS_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PL As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_AS_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pla.impl.PLAImpl <em>PLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.impl.PLAImpl
	 * @see pla.impl.PlaPackageImpl#getPLA()
	 * @generated
	 */
	int PLA = 7;

	/**
	 * The feature id for the '<em><b>Plas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLA__PLAS = 0;

	/**
	 * The number of structural features of the '<em>PLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLA_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link pla.LegalBasis <em>Legal Basis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pla.LegalBasis
	 * @see pla.impl.PlaPackageImpl#getLegalBasis()
	 * @generated
	 */
	int LEGAL_BASIS = 8;


	/**
	 * Returns the meta object for class '{@link pla.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see pla.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link pla.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pla.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the attribute '{@link pla.Actor#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see pla.Actor#getContact()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Contact();

	/**
	 * Returns the meta object for the attribute '{@link pla.Actor#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see pla.Actor#getAddress()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Address();

	/**
	 * Returns the meta object for class '{@link pla.ThirdParty <em>Third Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third Party</em>'.
	 * @see pla.ThirdParty
	 * @generated
	 */
	EClass getThirdParty();

	/**
	 * Returns the meta object for class '{@link pla.DataStorage <em>Data Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Storage</em>'.
	 * @see pla.DataStorage
	 * @generated
	 */
	EClass getDataStorage();

	/**
	 * Returns the meta object for class '{@link pla.PersonalDataAsset <em>Personal Data Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data Asset</em>'.
	 * @see pla.PersonalDataAsset
	 * @generated
	 */
	EClass getPersonalDataAsset();

	/**
	 * Returns the meta object for the attribute '{@link pla.PersonalDataAsset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pla.PersonalDataAsset#getName()
	 * @see #getPersonalDataAsset()
	 * @generated
	 */
	EAttribute getPersonalDataAsset_Name();

	/**
	 * Returns the meta object for the attribute '{@link pla.PersonalDataAsset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pla.PersonalDataAsset#getType()
	 * @see #getPersonalDataAsset()
	 * @generated
	 */
	EAttribute getPersonalDataAsset_Type();

	/**
	 * Returns the meta object for the attribute '{@link pla.PersonalDataAsset#getPrivacyLabel <em>Privacy Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privacy Label</em>'.
	 * @see pla.PersonalDataAsset#getPrivacyLabel()
	 * @see #getPersonalDataAsset()
	 * @generated
	 */
	EAttribute getPersonalDataAsset_PrivacyLabel();

	/**
	 * Returns the meta object for the attribute '{@link pla.PersonalDataAsset#getLegalBasis <em>Legal Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legal Basis</em>'.
	 * @see pla.PersonalDataAsset#getLegalBasis()
	 * @see #getPersonalDataAsset()
	 * @generated
	 */
	EAttribute getPersonalDataAsset_LegalBasis();

	/**
	 * Returns the meta object for class '{@link pla.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose</em>'.
	 * @see pla.Purpose
	 * @generated
	 */
	EClass getPurpose();

	/**
	 * Returns the meta object for the attribute '{@link pla.Purpose#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pla.Purpose#getName()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_Name();

	/**
	 * Returns the meta object for the attribute '{@link pla.Purpose#getPurposeText <em>Purpose Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose Text</em>'.
	 * @see pla.Purpose#getPurposeText()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_PurposeText();

	/**
	 * Returns the meta object for the attribute list '{@link pla.Purpose#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see pla.Purpose#getActions()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_Actions();

	/**
	 * Returns the meta object for the reference list '{@link pla.Purpose#getIncomeAssets <em>Income Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Income Assets</em>'.
	 * @see pla.Purpose#getIncomeAssets()
	 * @see #getPurpose()
	 * @generated
	 */
	EReference getPurpose_IncomeAssets();

	/**
	 * Returns the meta object for the reference list '{@link pla.Purpose#getOutcomeAssets <em>Outcome Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outcome Assets</em>'.
	 * @see pla.Purpose#getOutcomeAssets()
	 * @see #getPurpose()
	 * @generated
	 */
	EReference getPurpose_OutcomeAssets();

	/**
	 * Returns the meta object for class '{@link pla.PLAs <em>PL As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PL As</em>'.
	 * @see pla.PLAs
	 * @generated
	 */
	EClass getPLAs();

	/**
	 * Returns the meta object for the containment reference list '{@link pla.PLAs#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see pla.PLAs#getActors()
	 * @see #getPLAs()
	 * @generated
	 */
	EReference getPLAs_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link pla.PLAs#getPurposes <em>Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Purposes</em>'.
	 * @see pla.PLAs#getPurposes()
	 * @see #getPLAs()
	 * @generated
	 */
	EReference getPLAs_Purposes();

	/**
	 * Returns the meta object for the containment reference list '{@link pla.PLAs#getPersonalDataAssets <em>Personal Data Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personal Data Assets</em>'.
	 * @see pla.PLAs#getPersonalDataAssets()
	 * @see #getPLAs()
	 * @generated
	 */
	EReference getPLAs_PersonalDataAssets();

	/**
	 * Returns the meta object for class '{@link pla.PLA <em>PLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLA</em>'.
	 * @see pla.PLA
	 * @generated
	 */
	EClass getPLA();

	/**
	 * Returns the meta object for the containment reference list '{@link pla.PLA#getPlas <em>Plas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plas</em>'.
	 * @see pla.PLA#getPlas()
	 * @see #getPLA()
	 * @generated
	 */
	EReference getPLA_Plas();

	/**
	 * Returns the meta object for enum '{@link pla.LegalBasis <em>Legal Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legal Basis</em>'.
	 * @see pla.LegalBasis
	 * @generated
	 */
	EEnum getLegalBasis();

	/**
	 * Returns the meta object for class '{@link pla.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see pla.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link pla.Identifiable#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pla.Identifiable#getID()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_ID();

	/**
	 * Returns the meta object for the attribute '{@link pla.Identifiable#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see pla.Identifiable#getNumber()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Number();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlaFactory getPlaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pla.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.impl.ActorImpl
		 * @see pla.impl.PlaPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__CONTACT = eINSTANCE.getActor_Contact();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ADDRESS = eINSTANCE.getActor_Address();

		/**
		 * The meta object literal for the '{@link pla.impl.ThirdPartyImpl <em>Third Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.impl.ThirdPartyImpl
		 * @see pla.impl.PlaPackageImpl#getThirdParty()
		 * @generated
		 */
		EClass THIRD_PARTY = eINSTANCE.getThirdParty();

		/**
		 * The meta object literal for the '{@link pla.impl.DataStorageImpl <em>Data Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.impl.DataStorageImpl
		 * @see pla.impl.PlaPackageImpl#getDataStorage()
		 * @generated
		 */
		EClass DATA_STORAGE = eINSTANCE.getDataStorage();

		/**
		 * The meta object literal for the '{@link pla.impl.PersonalDataAssetImpl <em>Personal Data Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.impl.PersonalDataAssetImpl
		 * @see pla.impl.PlaPackageImpl#getPersonalDataAsset()
		 * @generated
		 */
		EClass PERSONAL_DATA_ASSET = eINSTANCE.getPersonalDataAsset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA_ASSET__NAME = eINSTANCE.getPersonalDataAsset_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA_ASSET__TYPE = eINSTANCE.getPersonalDataAsset_Type();

		/**
		 * The meta object literal for the '<em><b>Privacy Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA_ASSET__PRIVACY_LABEL = eINSTANCE.getPersonalDataAsset_PrivacyLabel();

		/**
		 * The meta object literal for the '<em><b>Legal Basis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA_ASSET__LEGAL_BASIS = eINSTANCE.getPersonalDataAsset_LegalBasis();

		/**
		 * The meta object literal for the '{@link pla.impl.PurposeImpl <em>Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.impl.PurposeImpl
		 * @see pla.impl.PlaPackageImpl#getPurpose()
		 * @generated
		 */
		EClass PURPOSE = eINSTANCE.getPurpose();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__NAME = eINSTANCE.getPurpose_Name();

		/**
		 * The meta object literal for the '<em><b>Purpose Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__PURPOSE_TEXT = eINSTANCE.getPurpose_PurposeText();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__ACTIONS = eINSTANCE.getPurpose_Actions();

		/**
		 * The meta object literal for the '<em><b>Income Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURPOSE__INCOME_ASSETS = eINSTANCE.getPurpose_IncomeAssets();

		/**
		 * The meta object literal for the '<em><b>Outcome Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURPOSE__OUTCOME_ASSETS = eINSTANCE.getPurpose_OutcomeAssets();

		/**
		 * The meta object literal for the '{@link pla.impl.PLAsImpl <em>PL As</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.impl.PLAsImpl
		 * @see pla.impl.PlaPackageImpl#getPLAs()
		 * @generated
		 */
		EClass PL_AS = eINSTANCE.getPLAs();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PL_AS__ACTORS = eINSTANCE.getPLAs_Actors();

		/**
		 * The meta object literal for the '<em><b>Purposes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PL_AS__PURPOSES = eINSTANCE.getPLAs_Purposes();

		/**
		 * The meta object literal for the '<em><b>Personal Data Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PL_AS__PERSONAL_DATA_ASSETS = eINSTANCE.getPLAs_PersonalDataAssets();

		/**
		 * The meta object literal for the '{@link pla.impl.PLAImpl <em>PLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.impl.PLAImpl
		 * @see pla.impl.PlaPackageImpl#getPLA()
		 * @generated
		 */
		EClass PLA = eINSTANCE.getPLA();

		/**
		 * The meta object literal for the '<em><b>Plas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLA__PLAS = eINSTANCE.getPLA_Plas();

		/**
		 * The meta object literal for the '{@link pla.LegalBasis <em>Legal Basis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.LegalBasis
		 * @see pla.impl.PlaPackageImpl#getLegalBasis()
		 * @generated
		 */
		EEnum LEGAL_BASIS = eINSTANCE.getLegalBasis();

		/**
		 * The meta object literal for the '{@link pla.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pla.Identifiable
		 * @see pla.impl.PlaPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_ID();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NUMBER = eINSTANCE.getIdentifiable_Number();

	}

} //PlaPackage
