/**
 */
package pla;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pla.Purpose#getName <em>Name</em>}</li>
 *   <li>{@link pla.Purpose#getPurposeText <em>Purpose Text</em>}</li>
 *   <li>{@link pla.Purpose#getActions <em>Actions</em>}</li>
 *   <li>{@link pla.Purpose#getIncomeAssets <em>Income Assets</em>}</li>
 *   <li>{@link pla.Purpose#getOutcomeAssets <em>Outcome Assets</em>}</li>
 * </ul>
 *
 * @see pla.PlaPackage#getPurpose()
 * @model
 * @generated
 */
public interface Purpose extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pla.PlaPackage#getPurpose_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pla.Purpose#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Purpose Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Text</em>' attribute.
	 * @see #setPurposeText(String)
	 * @see pla.PlaPackage#getPurpose_PurposeText()
	 * @model
	 * @generated
	 */
	String getPurposeText();

	/**
	 * Sets the value of the '{@link pla.Purpose#getPurposeText <em>Purpose Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Text</em>' attribute.
	 * @see #getPurposeText()
	 * @generated
	 */
	void setPurposeText(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute list.
	 * @see pla.PlaPackage#getPurpose_Actions()
	 * @model
	 * @generated
	 */
	EList<String> getActions();

	/**
	 * Returns the value of the '<em><b>Income Assets</b></em>' reference list.
	 * The list contents are of type {@link pla.PersonalDataAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income Assets</em>' reference list.
	 * @see pla.PlaPackage#getPurpose_IncomeAssets()
	 * @model
	 * @generated
	 */
	EList<PersonalDataAsset> getIncomeAssets();

	/**
	 * Returns the value of the '<em><b>Outcome Assets</b></em>' reference list.
	 * The list contents are of type {@link pla.PersonalDataAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome Assets</em>' reference list.
	 * @see pla.PlaPackage#getPurpose_OutcomeAssets()
	 * @model
	 * @generated
	 */
	EList<PersonalDataAsset> getOutcomeAssets();

} // Purpose
