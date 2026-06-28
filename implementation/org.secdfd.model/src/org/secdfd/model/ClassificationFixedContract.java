/**
 */
package org.secdfd.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Fixed Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.ClassificationFixedContract#getPModel <em>PModel</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getClassificationFixedContract()
 * @model
 * @generated
 */
public interface ClassificationFixedContract extends ContractBase {
	/**
	 * Returns the value of the '<em><b>PModel</b></em>' attribute.
	 * The default value is <code>"L"</code>.
	 * The literals are from the enumeration {@link org.secdfd.model.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PModel</em>' attribute.
	 * @see org.secdfd.model.Level
	 * @see #setPModel(Level)
	 * @see org.secdfd.model.ModelPackage#getClassificationFixedContract_PModel()
	 * @model default="L"
	 * @generated
	 */
	Level getPModel();

	/**
	 * Sets the value of the '{@link org.secdfd.model.ClassificationFixedContract#getPModel <em>PModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PModel</em>' attribute.
	 * @see org.secdfd.model.Level
	 * @see #getPModel()
	 * @generated
	 */
	void setPModel(Level value);

} // ClassificationFixedContract
