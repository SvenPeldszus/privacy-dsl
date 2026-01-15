/**
 */
package org.secdfd.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Generation Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.DataGenerationContract#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.secdfd.model.DataGenerationContract#getK <em>K</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getDataGenerationContract()
 * @model
 * @generated
 */
public interface DataGenerationContract extends ContractBase {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"PRESERVE"</code>.
	 * The literals are from the enumeration {@link org.secdfd.model.DataGenerationDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.secdfd.model.DataGenerationDirection
	 * @see #setDirection(DataGenerationDirection)
	 * @see org.secdfd.model.ModelPackage#getDataGenerationContract_Direction()
	 * @model default="PRESERVE"
	 * @generated
	 */
	DataGenerationDirection getDirection();

	/**
	 * Sets the value of the '{@link org.secdfd.model.DataGenerationContract#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.secdfd.model.DataGenerationDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DataGenerationDirection value);

	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(int)
	 * @see org.secdfd.model.ModelPackage#getDataGenerationContract_K()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getK();

	/**
	 * Sets the value of the '{@link org.secdfd.model.DataGenerationContract#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(int value);

} // DataGenerationContract
