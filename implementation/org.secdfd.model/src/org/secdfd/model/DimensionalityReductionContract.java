/**
 */
package org.secdfd.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensionality Reduction Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.DimensionalityReductionContract#getK <em>K</em>}</li>
 * </ul>
 *
 * @see org.secdfd.model.ModelPackage#getDimensionalityReductionContract()
 * @model
 * @generated
 */
public interface DimensionalityReductionContract extends ContractBase {
	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(int)
	 * @see org.secdfd.model.ModelPackage#getDimensionalityReductionContract_K()
	 * @model default="0"
	 * @generated
	 */
	int getK();

	/**
	 * Sets the value of the '{@link org.secdfd.model.DimensionalityReductionContract#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(int value);

} // DimensionalityReductionContract
