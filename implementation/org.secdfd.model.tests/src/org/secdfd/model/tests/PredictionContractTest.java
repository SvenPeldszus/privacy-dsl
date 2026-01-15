/**
 */
package org.secdfd.model.tests;

import junit.textui.TestRunner;

import org.secdfd.model.ModelFactory;
import org.secdfd.model.PredictionContract;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prediction Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredictionContractTest extends ContractBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PredictionContractTest.class);
	}

	/**
	 * Constructs a new Prediction Contract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictionContractTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prediction Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PredictionContract getFixture() {
		return (PredictionContract)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createPredictionContract());
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

} //PredictionContractTest
