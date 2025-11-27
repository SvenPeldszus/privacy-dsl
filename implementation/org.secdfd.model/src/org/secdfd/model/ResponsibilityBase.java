/**
 */
package org.secdfd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsibility Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.ResponsibilityBase#getIncomeassets <em>Incomeassets</em>}</li>
 *   <li>{@link org.secdfd.model.ResponsibilityBase#getOutcomeassets <em>Outcomeassets</em>}</li>
 *   <li>{@link org.secdfd.model.ResponsibilityBase#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getResponsibilityBase()
 * @model abstract="true"
 * @generated
 */
public interface ResponsibilityBase extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Incomeassets</b></em>' reference list.
	 * The list contents are of type {@link org.secdfd.model.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomeassets</em>' reference list.
	 * @see org.secdfd.model.ModelPackage#getResponsibilityBase_Incomeassets()
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
	 * @see org.secdfd.model.ModelPackage#getResponsibilityBase_Outcomeassets()
	 * @model
	 * @generated
	 */
	EList<Asset> getOutcomeassets();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.secdfd.model.Process#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(org.secdfd.model.Process)
	 * @see org.secdfd.model.ModelPackage#getResponsibilityBase_Process()
	 * @see org.secdfd.model.Process#getResponsibility
	 * @model opposite="responsibility" transient="false"
	 * @generated
	 */
	org.secdfd.model.Process getProcess();

	/**
	 * Sets the value of the '{@link org.secdfd.model.ResponsibilityBase#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.secdfd.model.Process value);

} // ResponsibilityBase
