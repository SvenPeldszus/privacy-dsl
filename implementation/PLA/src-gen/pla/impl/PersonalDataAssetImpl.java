/**
 */
package pla.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import pla.Actor;
import pla.LegalBasis;
import pla.PersonalDataAsset;
import pla.PlaPackage;
import pla.Purpose;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Data Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pla.impl.PersonalDataAssetImpl#getID <em>ID</em>}</li>
 *   <li>{@link pla.impl.PersonalDataAssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link pla.impl.PersonalDataAssetImpl#getType <em>Type</em>}</li>
 *   <li>{@link pla.impl.PersonalDataAssetImpl#getPrivacyLabel <em>Privacy Label</em>}</li>
 *   <li>{@link pla.impl.PersonalDataAssetImpl#getLegalBasis <em>Legal Basis</em>}</li>
 *   <li>{@link pla.impl.PersonalDataAssetImpl#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link pla.impl.PersonalDataAssetImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalDataAssetImpl extends MinimalEObjectImpl.Container implements PersonalDataAsset {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivacyLabel() <em>Privacy Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVACY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivacyLabel() <em>Privacy Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyLabel()
	 * @generated
	 * @ordered
	 */
	protected String privacyLabel = PRIVACY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegalBasis() <em>Legal Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalBasis()
	 * @generated
	 * @ordered
	 */
	protected static final LegalBasis LEGAL_BASIS_EDEFAULT = LegalBasis.CONSENT;

	/**
	 * The cached value of the '{@link #getLegalBasis() <em>Legal Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalBasis()
	 * @generated
	 * @ordered
	 */
	protected LegalBasis legalBasis = LEGAL_BASIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPurposes() <em>Purposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Purpose> purposes;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaPackage.Literals.PERSONAL_DATA_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PERSONAL_DATA_ASSET__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PERSONAL_DATA_ASSET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PERSONAL_DATA_ASSET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivacyLabel() {
		return privacyLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivacyLabel(String newPrivacyLabel) {
		String oldPrivacyLabel = privacyLabel;
		privacyLabel = newPrivacyLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PERSONAL_DATA_ASSET__PRIVACY_LABEL, oldPrivacyLabel, privacyLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalBasis getLegalBasis() {
		return legalBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegalBasis(LegalBasis newLegalBasis) {
		LegalBasis oldLegalBasis = legalBasis;
		legalBasis = newLegalBasis == null ? LEGAL_BASIS_EDEFAULT : newLegalBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PERSONAL_DATA_ASSET__LEGAL_BASIS, oldLegalBasis, legalBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Purpose> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectResolvingEList<Purpose>(Purpose.class, this, PlaPackage.PERSONAL_DATA_ASSET__PURPOSES);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectResolvingEList<Actor>(Actor.class, this, PlaPackage.PERSONAL_DATA_ASSET__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaPackage.PERSONAL_DATA_ASSET__ID:
				return getID();
			case PlaPackage.PERSONAL_DATA_ASSET__NAME:
				return getName();
			case PlaPackage.PERSONAL_DATA_ASSET__TYPE:
				return getType();
			case PlaPackage.PERSONAL_DATA_ASSET__PRIVACY_LABEL:
				return getPrivacyLabel();
			case PlaPackage.PERSONAL_DATA_ASSET__LEGAL_BASIS:
				return getLegalBasis();
			case PlaPackage.PERSONAL_DATA_ASSET__PURPOSES:
				return getPurposes();
			case PlaPackage.PERSONAL_DATA_ASSET__ACTORS:
				return getActors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlaPackage.PERSONAL_DATA_ASSET__ID:
				setID((String)newValue);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__NAME:
				setName((String)newValue);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__TYPE:
				setType((String)newValue);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__PRIVACY_LABEL:
				setPrivacyLabel((String)newValue);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__LEGAL_BASIS:
				setLegalBasis((LegalBasis)newValue);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__PURPOSES:
				getPurposes().clear();
				getPurposes().addAll((Collection<? extends Purpose>)newValue);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlaPackage.PERSONAL_DATA_ASSET__ID:
				setID(ID_EDEFAULT);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__PRIVACY_LABEL:
				setPrivacyLabel(PRIVACY_LABEL_EDEFAULT);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__LEGAL_BASIS:
				setLegalBasis(LEGAL_BASIS_EDEFAULT);
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__PURPOSES:
				getPurposes().clear();
				return;
			case PlaPackage.PERSONAL_DATA_ASSET__ACTORS:
				getActors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlaPackage.PERSONAL_DATA_ASSET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PlaPackage.PERSONAL_DATA_ASSET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PlaPackage.PERSONAL_DATA_ASSET__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case PlaPackage.PERSONAL_DATA_ASSET__PRIVACY_LABEL:
				return PRIVACY_LABEL_EDEFAULT == null ? privacyLabel != null : !PRIVACY_LABEL_EDEFAULT.equals(privacyLabel);
			case PlaPackage.PERSONAL_DATA_ASSET__LEGAL_BASIS:
				return legalBasis != LEGAL_BASIS_EDEFAULT;
			case PlaPackage.PERSONAL_DATA_ASSET__PURPOSES:
				return purposes != null && !purposes.isEmpty();
			case PlaPackage.PERSONAL_DATA_ASSET__ACTORS:
				return actors != null && !actors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", privacyLabel: ");
		result.append(privacyLabel);
		result.append(", legalBasis: ");
		result.append(legalBasis);
		result.append(')');
		return result.toString();
	}

} //PersonalDataAssetImpl
