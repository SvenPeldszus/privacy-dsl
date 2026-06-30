/**
 */
package org.secdfd.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Variable Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.ClassificationVariableContract#getCatalog <em>Catalog</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getClassificationVariableContract()
 * @model
 * @generated
 */
public interface ClassificationVariableContract extends ContractBase {

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' reference list.
	 * The list contents are of type {@link org.secdfd.model.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' reference list.
	 * @see org.secdfd.model.ModelPackage#getClassificationVariableContract_Catalog()
	 * @model
	 * @generated
	 */
	EList<Asset> getCatalog();
} // ClassificationVariableContract
