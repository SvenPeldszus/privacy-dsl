/**
 */
package org.secdfd.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.ClassificationContract#getPClass <em>PClass</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getClassificationContract()
 * @model
 * @generated
 */
public interface ClassificationContract extends ContractBase {
	/**
	 * Returns the value of the '<em><b>PClass</b></em>' attribute.
	 * The default value is <code>"L"</code>.
	 * The literals are from the enumeration {@link org.secdfd.model.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PClass</em>' attribute.
	 * @see org.secdfd.model.Level
	 * @see #setPClass(Level)
	 * @see org.secdfd.model.ModelPackage#getClassificationContract_PClass()
	 * @model default="L"
	 * @generated
	 */
	Level getPClass();

	/**
	 * Sets the value of the '{@link org.secdfd.model.ClassificationContract#getPClass <em>PClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PClass</em>' attribute.
	 * @see org.secdfd.model.Level
	 * @see #getPClass()
	 * @generated
	 */
	void setPClass(Level value);

} // ClassificationContract
