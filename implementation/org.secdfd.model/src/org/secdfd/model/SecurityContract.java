/**
 */
package org.secdfd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.SecurityContract#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getSecurityContract()
 * @model
 * @generated
 */
public interface SecurityContract extends ContractBase {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute list.
	 * The list contents are of type {@link org.secdfd.model.SecurityContractType}.
	 * The literals are from the enumeration {@link org.secdfd.model.SecurityContractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute list.
	 * @see org.secdfd.model.SecurityContractType
	 * @see org.secdfd.model.ModelPackage#getSecurityContract_Task()
	 * @model
	 * @generated
	 */
	EList<SecurityContractType> getTask();

} // SecurityContract
