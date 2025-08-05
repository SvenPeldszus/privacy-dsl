/**
 */
package pla.tests;

import junit.textui.TestRunner;

import pla.PlaFactory;
import pla.ThirdParty;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Third Party</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThirdPartyTest extends ActorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThirdPartyTest.class);
	}

	/**
	 * Constructs a new Third Party test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThirdPartyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Third Party test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThirdParty getFixture() {
		return (ThirdParty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlaFactory.eINSTANCE.createThirdParty());
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

} //ThirdPartyTest
