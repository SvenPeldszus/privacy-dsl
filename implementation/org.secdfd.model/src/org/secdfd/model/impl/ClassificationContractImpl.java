/**
 */
package org.secdfd.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.secdfd.model.ClassificationContract;
import org.secdfd.model.ModelPackage;
import org.secdfd.model.Priority;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.impl.ClassificationContractImpl#getPClass <em>PClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassificationContractImpl extends ContractBaseImpl implements ClassificationContract {
	/**
	 * The default value of the '{@link #getPClass() <em>PClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPClass()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PCLASS_EDEFAULT = Priority.L;

	/**
	 * The cached value of the '{@link #getPClass() <em>PClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPClass()
	 * @generated
	 * @ordered
	 */
	protected Priority pClass = PCLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CLASSIFICATION_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Priority getPClass() {
		return pClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPClass(Priority newPClass) {
		Priority oldPClass = pClass;
		pClass = newPClass == null ? PCLASS_EDEFAULT : newPClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLASSIFICATION_CONTRACT__PCLASS, oldPClass, pClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CLASSIFICATION_CONTRACT__PCLASS:
				return getPClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.CLASSIFICATION_CONTRACT__PCLASS:
				setPClass((Priority)newValue);
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
			case ModelPackage.CLASSIFICATION_CONTRACT__PCLASS:
				setPClass(PCLASS_EDEFAULT);
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
			case ModelPackage.CLASSIFICATION_CONTRACT__PCLASS:
				return pClass != PCLASS_EDEFAULT;
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
		result.append(" (PClass: ");
		result.append(pClass);
		result.append(')');
		return result.toString();
	}

} //ClassificationContractImpl
