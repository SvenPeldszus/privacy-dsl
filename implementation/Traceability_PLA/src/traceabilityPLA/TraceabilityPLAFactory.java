/**
 */
package traceabilityPLA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see traceabilityPLA.TraceabilityPLAPackage
 * @generated
 */
public interface TraceabilityPLAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPLAFactory eINSTANCE = traceabilityPLA.impl.TraceabilityPLAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EDFD To PLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDFD To PLA</em>'.
	 * @generated
	 */
	EDFDToPLA createEDFDToPLA();

	/**
	 * Returns a new object of class '<em>PLA Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLA Trace</em>'.
	 * @generated
	 */
	PLATrace createPLATrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TraceabilityPLAPackage getTraceabilityPLAPackage();

} //TraceabilityPLAFactory
