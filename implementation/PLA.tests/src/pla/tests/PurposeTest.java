/**
 */
package pla.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pla.PlaFactory;
import pla.Purpose;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Purpose</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PurposeTest extends TestCase {

	/**
	 * The fixture for this Purpose test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Purpose fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PurposeTest.class);
	}

	/**
	 * Constructs a new Purpose test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Purpose test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Purpose fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Purpose test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Purpose getFixture() {
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
		setFixture(PlaFactory.eINSTANCE.createPurpose());
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

} //PurposeTest
