/**
 */
package org.secdfd.model.tests;

import junit.textui.TestRunner;

import org.secdfd.model.ClassificationFixedContract;
import org.secdfd.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classification Fixed Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassificationFixedContractTest extends ContractBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassificationFixedContractTest.class);
	}

	/**
	 * Constructs a new Classification Fixed Contract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationFixedContractTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Classification Fixed Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClassificationFixedContract getFixture() {
		return (ClassificationFixedContract)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createClassificationFixedContract());
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

} //ClassificationFixedContractTest
