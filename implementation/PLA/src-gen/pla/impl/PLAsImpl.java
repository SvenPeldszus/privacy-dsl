/**
 */
package pla.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pla.Actor;
import pla.PLAs;
import pla.PersonalDataAsset;
import pla.PlaPackage;
import pla.Purpose;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PL As</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pla.impl.PLAsImpl#getID <em>ID</em>}</li>
 *   <li>{@link pla.impl.PLAsImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link pla.impl.PLAsImpl#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link pla.impl.PLAsImpl#getPersonalDataAssets <em>Personal Data Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PLAsImpl extends MinimalEObjectImpl.Container implements PLAs {
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
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getPurposes() <em>Purposes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Purpose> purposes;

	/**
	 * The cached value of the '{@link #getPersonalDataAssets() <em>Personal Data Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalDataAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonalDataAsset> personalDataAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLAsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaPackage.Literals.PL_AS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PL_AS__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, PlaPackage.PL_AS__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Purpose> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectContainmentEList<Purpose>(Purpose.class, this, PlaPackage.PL_AS__PURPOSES);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonalDataAsset> getPersonalDataAssets() {
		if (personalDataAssets == null) {
			personalDataAssets = new EObjectContainmentEList<PersonalDataAsset>(PersonalDataAsset.class, this, PlaPackage.PL_AS__PERSONAL_DATA_ASSETS);
		}
		return personalDataAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaPackage.PL_AS__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case PlaPackage.PL_AS__PURPOSES:
				return ((InternalEList<?>)getPurposes()).basicRemove(otherEnd, msgs);
			case PlaPackage.PL_AS__PERSONAL_DATA_ASSETS:
				return ((InternalEList<?>)getPersonalDataAssets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaPackage.PL_AS__ID:
				return getID();
			case PlaPackage.PL_AS__ACTORS:
				return getActors();
			case PlaPackage.PL_AS__PURPOSES:
				return getPurposes();
			case PlaPackage.PL_AS__PERSONAL_DATA_ASSETS:
				return getPersonalDataAssets();
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
			case PlaPackage.PL_AS__ID:
				setID((String)newValue);
				return;
			case PlaPackage.PL_AS__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case PlaPackage.PL_AS__PURPOSES:
				getPurposes().clear();
				getPurposes().addAll((Collection<? extends Purpose>)newValue);
				return;
			case PlaPackage.PL_AS__PERSONAL_DATA_ASSETS:
				getPersonalDataAssets().clear();
				getPersonalDataAssets().addAll((Collection<? extends PersonalDataAsset>)newValue);
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
			case PlaPackage.PL_AS__ID:
				setID(ID_EDEFAULT);
				return;
			case PlaPackage.PL_AS__ACTORS:
				getActors().clear();
				return;
			case PlaPackage.PL_AS__PURPOSES:
				getPurposes().clear();
				return;
			case PlaPackage.PL_AS__PERSONAL_DATA_ASSETS:
				getPersonalDataAssets().clear();
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
			case PlaPackage.PL_AS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PlaPackage.PL_AS__ACTORS:
				return actors != null && !actors.isEmpty();
			case PlaPackage.PL_AS__PURPOSES:
				return purposes != null && !purposes.isEmpty();
			case PlaPackage.PL_AS__PERSONAL_DATA_ASSETS:
				return personalDataAssets != null && !personalDataAssets.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PLAsImpl
