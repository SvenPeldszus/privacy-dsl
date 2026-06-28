/**
 */
package org.secdfd.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.secdfd.model.ClassificationFixedContract;
import org.secdfd.model.Level;
import org.secdfd.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Fixed Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.impl.ClassificationFixedContractImpl#getPModel <em>PModel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassificationFixedContractImpl extends ContractBaseImpl implements ClassificationFixedContract {
	/**
	 * The default value of the '{@link #getPModel() <em>PModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPModel()
	 * @generated
	 * @ordered
	 */
	protected static final Level PMODEL_EDEFAULT = Level.L;

	/**
	 * The cached value of the '{@link #getPModel() <em>PModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPModel()
	 * @generated
	 * @ordered
	 */
	protected Level pModel = PMODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationFixedContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CLASSIFICATION_FIXED_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getPModel() {
		return pModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPModel(Level newPModel) {
		Level oldPModel = pModel;
		pModel = newPModel == null ? PMODEL_EDEFAULT : newPModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLASSIFICATION_FIXED_CONTRACT__PMODEL, oldPModel, pModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CLASSIFICATION_FIXED_CONTRACT__PMODEL:
				return getPModel();
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
			case ModelPackage.CLASSIFICATION_FIXED_CONTRACT__PMODEL:
				setPModel((Level)newValue);
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
			case ModelPackage.CLASSIFICATION_FIXED_CONTRACT__PMODEL:
				setPModel(PMODEL_EDEFAULT);
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
			case ModelPackage.CLASSIFICATION_FIXED_CONTRACT__PMODEL:
				return pModel != PMODEL_EDEFAULT;
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
		result.append(" (PModel: ");
		result.append(pModel);
		result.append(')');
		return result.toString();
	}

} //ClassificationFixedContractImpl
