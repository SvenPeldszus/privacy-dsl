/**
 */
package org.secdfd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.Process#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Element {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link org.secdfd.model.ContractBase}.
	 * It is bidirectional and its opposite is '{@link org.secdfd.model.ContractBase#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see org.secdfd.model.ModelPackage#getProcess_Contract()
	 * @see org.secdfd.model.ContractBase#getProcess
	 * @model opposite="process" containment="true"
	 * @generated
	 */
	EList<ContractBase> getContract();

} // Process
