/**
 */
package org.secdfd.model.tests;

import junit.textui.TestRunner;

import org.secdfd.model.ContractBase;
import org.secdfd.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contract Base</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class ContractBaseTest extends NamedEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContractBaseTest.class);
	}

	/**
	 * The fixture for this Contract Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractBase fixture = null;

	/**
	 * Constructs a new Contract Base test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractBaseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Contract Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ContractBase fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Contract Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractBase getFixture() {
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
		// ContractBase is abstract, use SecurityContract instead
		setFixture(ModelFactory.eINSTANCE.createSecurityContract());
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

} //ContractBaseTest

