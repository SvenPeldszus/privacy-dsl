/**
 */
package pla.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pla.PLA;
import pla.PlaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PLA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLATest extends TestCase {

	/**
	 * The fixture for this PLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLA fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PLATest.class);
	}

	/**
	 * Constructs a new PLA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLATest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PLA fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLA getFixture() {
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
		setFixture(PlaFactory.eINSTANCE.createPLA());
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

} //PLATest
