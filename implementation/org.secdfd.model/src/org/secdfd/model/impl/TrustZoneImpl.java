/**
 */
package org.secdfd.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.secdfd.model.AttackerProfile;
import org.secdfd.model.Element;
import org.secdfd.model.ModelPackage;
import org.secdfd.model.TrustFactor;
import org.secdfd.model.TrustZone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.impl.TrustZoneImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.secdfd.model.impl.TrustZoneImpl#getSubzones <em>Subzones</em>}</li>
 *   <li>{@link org.secdfd.model.impl.TrustZoneImpl#getAttackerprofile <em>Attackerprofile</em>}</li>
 *   <li>{@link org.secdfd.model.impl.TrustZoneImpl#getTrustFactor <em>Trust Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrustZoneImpl extends ElementImpl implements TrustZone {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getSubzones() <em>Subzones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubzones()
	 * @generated
	 * @ordered
	 */
	protected EList<TrustZone> subzones;

	/**
	 * The cached value of the '{@link #getAttackerprofile() <em>Attackerprofile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerprofile()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackerProfile> attackerprofile;

	/**
	 * The default value of the '{@link #getTrustFactor() <em>Trust Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustFactor()
	 * @generated
	 * @ordered
	 */
	protected static final TrustFactor TRUST_FACTOR_EDEFAULT = TrustFactor.WEAK;

	/**
	 * The cached value of the '{@link #getTrustFactor() <em>Trust Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustFactor()
	 * @generated
	 * @ordered
	 */
	protected TrustFactor trustFactor = TRUST_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TRUST_ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<Element>(Element.class, this, ModelPackage.TRUST_ZONE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrustZone> getSubzones() {
		if (subzones == null) {
			subzones = new EObjectContainmentEList<TrustZone>(TrustZone.class, this, ModelPackage.TRUST_ZONE__SUBZONES);
		}
		return subzones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackerProfile> getAttackerprofile() {
		if (attackerprofile == null) {
			attackerprofile = new EObjectContainmentEList<AttackerProfile>(AttackerProfile.class, this, ModelPackage.TRUST_ZONE__ATTACKERPROFILE);
		}
		return attackerprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrustFactor getTrustFactor() {
		return trustFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrustFactor(TrustFactor newTrustFactor) {
		TrustFactor oldTrustFactor = trustFactor;
		trustFactor = newTrustFactor == null ? TRUST_FACTOR_EDEFAULT : newTrustFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRUST_ZONE__TRUST_FACTOR, oldTrustFactor, trustFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TRUST_ZONE__SUBZONES:
				return ((InternalEList<?>)getSubzones()).basicRemove(otherEnd, msgs);
			case ModelPackage.TRUST_ZONE__ATTACKERPROFILE:
				return ((InternalEList<?>)getAttackerprofile()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.TRUST_ZONE__ELEMENTS:
				return getElements();
			case ModelPackage.TRUST_ZONE__SUBZONES:
				return getSubzones();
			case ModelPackage.TRUST_ZONE__ATTACKERPROFILE:
				return getAttackerprofile();
			case ModelPackage.TRUST_ZONE__TRUST_FACTOR:
				return getTrustFactor();
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
			case ModelPackage.TRUST_ZONE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case ModelPackage.TRUST_ZONE__SUBZONES:
				getSubzones().clear();
				getSubzones().addAll((Collection<? extends TrustZone>)newValue);
				return;
			case ModelPackage.TRUST_ZONE__ATTACKERPROFILE:
				getAttackerprofile().clear();
				getAttackerprofile().addAll((Collection<? extends AttackerProfile>)newValue);
				return;
			case ModelPackage.TRUST_ZONE__TRUST_FACTOR:
				setTrustFactor((TrustFactor)newValue);
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
			case ModelPackage.TRUST_ZONE__ELEMENTS:
				getElements().clear();
				return;
			case ModelPackage.TRUST_ZONE__SUBZONES:
				getSubzones().clear();
				return;
			case ModelPackage.TRUST_ZONE__ATTACKERPROFILE:
				getAttackerprofile().clear();
				return;
			case ModelPackage.TRUST_ZONE__TRUST_FACTOR:
				setTrustFactor(TRUST_FACTOR_EDEFAULT);
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
			case ModelPackage.TRUST_ZONE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ModelPackage.TRUST_ZONE__SUBZONES:
				return subzones != null && !subzones.isEmpty();
			case ModelPackage.TRUST_ZONE__ATTACKERPROFILE:
				return attackerprofile != null && !attackerprofile.isEmpty();
			case ModelPackage.TRUST_ZONE__TRUST_FACTOR:
				return trustFactor != TRUST_FACTOR_EDEFAULT;
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
		result.append(" (TrustFactor: ");
		result.append(trustFactor);
		result.append(')');
		return result.toString();
	}

} //TrustZoneImpl
