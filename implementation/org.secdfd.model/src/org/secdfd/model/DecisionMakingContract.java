/**
 */
package org.secdfd.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Making Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.DecisionMakingContract#getPAction <em>PAction</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getDecisionMakingContract()
 * @model
 * @generated
 */
public interface DecisionMakingContract extends ContractBase {
	/**
	 * Returns the value of the '<em><b>PAction</b></em>' attribute.
	 * The default value is <code>"L"</code>.
	 * The literals are from the enumeration {@link org.secdfd.model.Priority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PAction</em>' attribute.
	 * @see org.secdfd.model.Priority
	 * @see #setPAction(Priority)
	 * @see org.secdfd.model.ModelPackage#getDecisionMakingContract_PAction()
	 * @model default="L"
	 * @generated
	 */
	Priority getPAction();

	/**
	 * Sets the value of the '{@link org.secdfd.model.DecisionMakingContract#getPAction <em>PAction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PAction</em>' attribute.
	 * @see org.secdfd.model.Priority
	 * @see #getPAction()
	 * @generated
	 */
	void setPAction(Priority value);

} // DecisionMakingContract
