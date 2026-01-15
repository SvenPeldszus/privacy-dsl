/**
 */
package org.secdfd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.ContractBase#getIncomeassets <em>Incomeassets</em>}</li>
 *   <li>{@link org.secdfd.model.ContractBase#getOutcomeassets <em>Outcomeassets</em>}</li>
 *   <li>{@link org.secdfd.model.ContractBase#getProcess <em>Process</em>}</li>
 *   <li>{@link org.secdfd.model.ContractBase#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getContractBase()
 * @model abstract="true"
 * @generated
 */
public interface ContractBase extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Incomeassets</b></em>' reference list.
	 * The list contents are of type {@link org.secdfd.model.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomeassets</em>' reference list.
	 * @see org.secdfd.model.ModelPackage#getContractBase_Incomeassets()
	 * @model
	 * @generated
	 */
	EList<Asset> getIncomeassets();

	/**
	 * Returns the value of the '<em><b>Outcomeassets</b></em>' reference list.
	 * The list contents are of type {@link org.secdfd.model.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcomeassets</em>' reference list.
	 * @see org.secdfd.model.ModelPackage#getContractBase_Outcomeassets()
	 * @model
	 * @generated
	 */
	EList<Asset> getOutcomeassets();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.secdfd.model.Process#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(org.secdfd.model.Process)
	 * @see org.secdfd.model.ModelPackage#getContractBase_Process()
	 * @see org.secdfd.model.Process#getContract
	 * @model opposite="contract" transient="false"
	 * @generated
	 */
	org.secdfd.model.Process getProcess();

	/**
	 * Sets the value of the '{@link org.secdfd.model.ContractBase#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.secdfd.model.Process value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute list.
	 * The list contents are of type {@link org.secdfd.model.ContractType}.
	 * The literals are from the enumeration {@link org.secdfd.model.ContractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute list.
	 * @see org.secdfd.model.ContractType
	 * @see org.secdfd.model.ModelPackage#getContractBase_Task()
	 * @model
	 * @generated
	 */
	EList<ContractType> getTask();

} // ContractBase
