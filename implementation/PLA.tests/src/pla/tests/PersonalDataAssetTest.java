/**
 */
package pla.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pla.PersonalDataAsset;
import pla.PlaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Personal Data Asset</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonalDataAssetTest extends TestCase {

	/**
	 * The fixture for this Personal Data Asset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataAsset fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersonalDataAssetTest.class);
	}

	/**
	 * Constructs a new Personal Data Asset test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataAssetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Personal Data Asset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PersonalDataAsset fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Personal Data Asset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataAsset getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlaFactory.eINSTANCE.createPersonalDataAsset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PersonalDataAssetTest
