/**
 */
package org.secdfd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.MLContract#getMLTask <em>ML Task</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getMLContract()
 * @model
 * @generated
 */
public interface MLContract extends ContractBase {
	/**
	 * Returns the value of the '<em><b>ML Task</b></em>' attribute list.
	 * The list contents are of type {@link org.secdfd.model.MLContractType}.
	 * The literals are from the enumeration {@link org.secdfd.model.MLContractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ML Task</em>' attribute list.
	 * @see org.secdfd.model.MLContractType
	 * @see org.secdfd.model.ModelPackage#getMLContract_MLTask()
	 * @model
	 * @generated
	 */
	EList<MLContractType> getMLTask();

} // MLContract
