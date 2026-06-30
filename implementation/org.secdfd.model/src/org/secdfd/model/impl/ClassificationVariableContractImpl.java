/**
 */
package org.secdfd.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.secdfd.model.Asset;
import org.secdfd.model.ClassificationVariableContract;
import org.secdfd.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Variable Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.impl.ClassificationVariableContractImpl#getCatalog <em>Catalog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassificationVariableContractImpl extends ContractBaseImpl implements ClassificationVariableContract {
	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> catalog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationVariableContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CLASSIFICATION_VARIABLE_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getCatalog() {
		if (catalog == null) {
			catalog = new EObjectResolvingEList<Asset>(Asset.class, this, ModelPackage.CLASSIFICATION_VARIABLE_CONTRACT__CATALOG);
		}
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CLASSIFICATION_VARIABLE_CONTRACT__CATALOG:
				return getCatalog();
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
			case ModelPackage.CLASSIFICATION_VARIABLE_CONTRACT__CATALOG:
				getCatalog().clear();
				getCatalog().addAll((Collection<? extends Asset>)newValue);
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
			case ModelPackage.CLASSIFICATION_VARIABLE_CONTRACT__CATALOG:
				getCatalog().clear();
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
			case ModelPackage.CLASSIFICATION_VARIABLE_CONTRACT__CATALOG:
				return catalog != null && !catalog.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassificationVariableContractImpl
