/**
 */
package org.secdfd.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.secdfd.model.MLResponsibility;
import org.secdfd.model.MLResponsibilityType;
import org.secdfd.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.impl.MLResponsibilityImpl#getMlAction <em>Ml Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLResponsibilityImpl extends ResponsibilityBaseImpl implements MLResponsibility {
	/**
	 * The cached value of the '{@link #getMlAction() <em>Ml Action</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlAction()
	 * @generated
	 * @ordered
	 */
	protected EList<MLResponsibilityType> mlAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ML_RESPONSIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MLResponsibilityType> getMlAction() {
		if (mlAction == null) {
			mlAction = new EDataTypeUniqueEList<MLResponsibilityType>(MLResponsibilityType.class, this, ModelPackage.ML_RESPONSIBILITY__ML_ACTION);
		}
		return mlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ML_RESPONSIBILITY__ML_ACTION:
				return getMlAction();
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
			case ModelPackage.ML_RESPONSIBILITY__ML_ACTION:
				getMlAction().clear();
				getMlAction().addAll((Collection<? extends MLResponsibilityType>)newValue);
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
			case ModelPackage.ML_RESPONSIBILITY__ML_ACTION:
				getMlAction().clear();
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
			case ModelPackage.ML_RESPONSIBILITY__ML_ACTION:
				return mlAction != null && !mlAction.isEmpty();
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
		result.append(" (mlAction: ");
		result.append(mlAction);
		result.append(')');
		return result.toString();
	}

} //MLResponsibilityImpl
