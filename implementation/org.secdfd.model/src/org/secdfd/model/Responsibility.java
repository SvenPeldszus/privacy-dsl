/**
 */
package org.secdfd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.Responsibility#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getResponsibility()
 * @model
 * @generated
 */
public interface Responsibility extends ResponsibilityBase {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute list.
	 * The list contents are of type {@link org.secdfd.model.ResponsibilityType}.
	 * The literals are from the enumeration {@link org.secdfd.model.ResponsibilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute list.
	 * @see org.secdfd.model.ResponsibilityType
	 * @see org.secdfd.model.ModelPackage#getResponsibility_Action()
	 * @model
	 * @generated
	 */
	EList<ResponsibilityType> getAction();

} // Responsibility
