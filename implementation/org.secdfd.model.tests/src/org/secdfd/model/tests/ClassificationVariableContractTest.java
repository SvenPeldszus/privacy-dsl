/**
 */
package org.secdfd.model.tests;

import junit.textui.TestRunner;

import org.secdfd.model.ClassificationVariableContract;
import org.secdfd.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classification Variable Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassificationVariableContractTest extends ContractBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassificationVariableContractTest.class);
	}

	/**
	 * Constructs a new Classification Variable Contract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationVariableContractTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Classification Variable Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClassificationVariableContract getFixture() {
		return (ClassificationVariableContract)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createClassificationVariableContract());
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

} //ClassificationVariableContractTest
