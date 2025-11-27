/**
 */
package org.secdfd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.MLResponsibility#getMlAction <em>Ml Action</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getMLResponsibility()
 * @model
 * @generated
 */
public interface MLResponsibility extends ResponsibilityBase {
	/**
	 * Returns the value of the '<em><b>Ml Action</b></em>' attribute list.
	 * The list contents are of type {@link org.secdfd.model.MLResponsibilityType}.
	 * The literals are from the enumeration {@link org.secdfd.model.MLResponsibilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ml Action</em>' attribute list.
	 * @see org.secdfd.model.MLResponsibilityType
	 * @see org.secdfd.model.ModelPackage#getMLResponsibility_MlAction()
	 * @model
	 * @generated
	 */
	EList<MLResponsibilityType> getMlAction();

} // MLResponsibility
