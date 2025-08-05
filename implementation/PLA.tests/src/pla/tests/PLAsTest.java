/**
 */
package pla.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pla.PLAs;
import pla.PlaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PL As</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLAsTest extends TestCase {

	/**
	 * The fixture for this PL As test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLAs fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PLAsTest.class);
	}

	/**
	 * Constructs a new PL As test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLAsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PL As test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PLAs fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PL As test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLAs getFixture() {
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
		setFixture(PlaFactory.eINSTANCE.createPLAs());
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

} //PLAsTest
