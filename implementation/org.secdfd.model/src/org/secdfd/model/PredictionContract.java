/**
 */
package org.secdfd.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prediction Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.PredictionContract#isS <em>S</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getPredictionContract()
 * @model
 * @generated
 */
public interface PredictionContract extends ContractBase {
	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see #setS(boolean)
	 * @see org.secdfd.model.ModelPackage#getPredictionContract_S()
	 * @model default="false"
	 * @generated
	 */
	boolean isS();

	/**
	 * Sets the value of the '{@link org.secdfd.model.PredictionContract#isS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #isS()
	 * @generated
	 */
	void setS(boolean value);

} // PredictionContract
