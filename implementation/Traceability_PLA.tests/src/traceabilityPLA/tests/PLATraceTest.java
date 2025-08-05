/**
 */
package traceabilityPLA.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import traceabilityPLA.PLATrace;
import traceabilityPLA.TraceabilityPLAFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PLA Trace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLATraceTest extends TestCase {

	/**
	 * The fixture for this PLA Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLATrace fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PLATraceTest.class);
	}

	/**
	 * Constructs a new PLA Trace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLATraceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PLA Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PLATrace fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PLA Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLATrace getFixture() {
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
		setFixture(TraceabilityPLAFactory.eINSTANCE.createPLATrace());
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

} //PLATraceTest
