/**
 */
package pla;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Data Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pla.PersonalDataAsset#getName <em>Name</em>}</li>
 *   <li>{@link pla.PersonalDataAsset#getType <em>Type</em>}</li>
 *   <li>{@link pla.PersonalDataAsset#getPrivacyLabel <em>Privacy Label</em>}</li>
 *   <li>{@link pla.PersonalDataAsset#getLegalBasis <em>Legal Basis</em>}</li>
 *   <li>{@link pla.PersonalDataAsset#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link pla.PersonalDataAsset#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see pla.PlaPackage#getPersonalDataAsset()
 * @model
 * @generated
 */
public interface PersonalDataAsset extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pla.PlaPackage#getPersonalDataAsset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pla.PersonalDataAsset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see pla.PlaPackage#getPersonalDataAsset_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pla.PersonalDataAsset#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Privacy Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacy Label</em>' attribute.
	 * @see #setPrivacyLabel(String)
	 * @see pla.PlaPackage#getPersonalDataAsset_PrivacyLabel()
	 * @model
	 * @generated
	 */
	String getPrivacyLabel();

	/**
	 * Sets the value of the '{@link pla.PersonalDataAsset#getPrivacyLabel <em>Privacy Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy Label</em>' attribute.
	 * @see #getPrivacyLabel()
	 * @generated
	 */
	void setPrivacyLabel(String value);

	/**
	 * Returns the value of the '<em><b>Legal Basis</b></em>' attribute.
	 * The literals are from the enumeration {@link pla.LegalBasis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Basis</em>' attribute.
	 * @see pla.LegalBasis
	 * @see #setLegalBasis(LegalBasis)
	 * @see pla.PlaPackage#getPersonalDataAsset_LegalBasis()
	 * @model required="true"
	 * @generated
	 */
	LegalBasis getLegalBasis();

	/**
	 * Sets the value of the '{@link pla.PersonalDataAsset#getLegalBasis <em>Legal Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Basis</em>' attribute.
	 * @see pla.LegalBasis
	 * @see #getLegalBasis()
	 * @generated
	 */
	void setLegalBasis(LegalBasis value);

	/**
	 * Returns the value of the '<em><b>Purposes</b></em>' reference list.
	 * The list contents are of type {@link pla.Purpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purposes</em>' reference list.
	 * @see pla.PlaPackage#getPersonalDataAsset_Purposes()
	 * @model
	 * @generated
	 */
	EList<Purpose> getPurposes();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link pla.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see pla.PlaPackage#getPersonalDataAsset_Actors()
	 * @model
	 * @generated
	 */
	EList<Actor> getActors();

} // PersonalDataAsset
