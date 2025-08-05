/**
 */
package pla;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pla.PlaPackage
 * @generated
 */
public interface PlaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlaFactory eINSTANCE = pla.impl.PlaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Third Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Third Party</em>'.
	 * @generated
	 */
	ThirdParty createThirdParty();

	/**
	 * Returns a new object of class '<em>Data Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Storage</em>'.
	 * @generated
	 */
	DataStorage createDataStorage();

	/**
	 * Returns a new object of class '<em>Personal Data Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personal Data Asset</em>'.
	 * @generated
	 */
	PersonalDataAsset createPersonalDataAsset();

	/**
	 * Returns a new object of class '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose</em>'.
	 * @generated
	 */
	Purpose createPurpose();

	/**
	 * Returns a new object of class '<em>PL As</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PL As</em>'.
	 * @generated
	 */
	PLAs createPLAs();

	/**
	 * Returns a new object of class '<em>PLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLA</em>'.
	 * @generated
	 */
	PLA createPLA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlaPackage getPlaPackage();

} //PlaFactory
