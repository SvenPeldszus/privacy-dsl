/**
 */
package org.secdfd.model;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constraint_ml_responsibility'"
 * @generated
 */
public interface MLResponsibility extends Responsibility {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'MLResponsibility can only be used when ML is selected as a ResponsibilityType in Action.\',\n\tstatus : Boolean = \n\t\t\tself.Action-&gt;includes(ResponsibilityType::ML)\n}.status'"
	 * @generated
	 */
	boolean constraint_ml_responsibility(DiagnosticChain diagnostics, Map<Object, Object> context);

} // MLResponsibility
