/**
 */
package pla.tests;

import junit.textui.TestRunner;

import pla.DataStorage;
import pla.PlaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Storage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataStorageTest extends ActorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataStorageTest.class);
	}

	/**
	 * Constructs a new Data Storage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStorageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Storage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataStorage getFixture() {
		return (DataStorage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlaFactory.eINSTANCE.createDataStorage());
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

} //DataStorageTest
