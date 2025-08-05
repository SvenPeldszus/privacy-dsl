/**
 */
package pla;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PL As</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pla.PLAs#getActors <em>Actors</em>}</li>
 *   <li>{@link pla.PLAs#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link pla.PLAs#getPersonalDataAssets <em>Personal Data Assets</em>}</li>
 * </ul>
 *
 * @see pla.PlaPackage#getPLAs()
 * @model
 * @generated
 */
public interface PLAs extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link pla.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see pla.PlaPackage#getPLAs_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Purposes</b></em>' containment reference list.
	 * The list contents are of type {@link pla.Purpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purposes</em>' containment reference list.
	 * @see pla.PlaPackage#getPLAs_Purposes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Purpose> getPurposes();

	/**
	 * Returns the value of the '<em><b>Personal Data Assets</b></em>' containment reference list.
	 * The list contents are of type {@link pla.PersonalDataAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Assets</em>' containment reference list.
	 * @see pla.PlaPackage#getPLAs_PersonalDataAssets()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonalDataAsset> getPersonalDataAssets();

} // PLAs
