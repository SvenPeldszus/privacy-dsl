/**
 */
package traceabilityPLA;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see traceabilityPLA.TraceabilityPLAFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPLAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceabilityPLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/traceabilityPLA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceabilityPLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPLAPackage eINSTANCE = traceabilityPLA.impl.TraceabilityPLAPackageImpl.init();

	/**
	 * The meta object id for the '{@link traceabilityPLA.impl.EDFDToPLAImpl <em>EDFD To PLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceabilityPLA.impl.EDFDToPLAImpl
	 * @see traceabilityPLA.impl.TraceabilityPLAPackageImpl#getEDFDToPLA()
	 * @generated
	 */
	int EDFD_TO_PLA = 0;

	/**
	 * The feature id for the '<em><b>Platraces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_PLA__PLATRACES = 0;

	/**
	 * The feature id for the '<em><b>Edfds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_PLA__EDFDS = 1;

	/**
	 * The feature id for the '<em><b>Pla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_PLA__PLA = 2;

	/**
	 * The number of structural features of the '<em>EDFD To PLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_PLA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EDFD To PLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_PLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link traceabilityPLA.impl.PLATraceImpl <em>PLA Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceabilityPLA.impl.PLATraceImpl
	 * @see traceabilityPLA.impl.TraceabilityPLAPackageImpl#getPLATrace()
	 * @generated
	 */
	int PLA_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Edfd Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLA_TRACE__EDFD_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Pla Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLA_TRACE__PLA_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>PLA Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLA_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PLA Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLA_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link traceabilityPLA.EDFDToPLA <em>EDFD To PLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDFD To PLA</em>'.
	 * @see traceabilityPLA.EDFDToPLA
	 * @generated
	 */
	EClass getEDFDToPLA();

	/**
	 * Returns the meta object for the containment reference list '{@link traceabilityPLA.EDFDToPLA#getPlatraces <em>Platraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platraces</em>'.
	 * @see traceabilityPLA.EDFDToPLA#getPlatraces()
	 * @see #getEDFDToPLA()
	 * @generated
	 */
	EReference getEDFDToPLA_Platraces();

	/**
	 * Returns the meta object for the reference '{@link traceabilityPLA.EDFDToPLA#getEdfds <em>Edfds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edfds</em>'.
	 * @see traceabilityPLA.EDFDToPLA#getEdfds()
	 * @see #getEDFDToPLA()
	 * @generated
	 */
	EReference getEDFDToPLA_Edfds();

	/**
	 * Returns the meta object for the reference '{@link traceabilityPLA.EDFDToPLA#getPla <em>Pla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pla</em>'.
	 * @see traceabilityPLA.EDFDToPLA#getPla()
	 * @see #getEDFDToPLA()
	 * @generated
	 */
	EReference getEDFDToPLA_Pla();

	/**
	 * Returns the meta object for class '{@link traceabilityPLA.PLATrace <em>PLA Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLA Trace</em>'.
	 * @see traceabilityPLA.PLATrace
	 * @generated
	 */
	EClass getPLATrace();

	/**
	 * Returns the meta object for the reference list '{@link traceabilityPLA.PLATrace#getEdfdElements <em>Edfd Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edfd Elements</em>'.
	 * @see traceabilityPLA.PLATrace#getEdfdElements()
	 * @see #getPLATrace()
	 * @generated
	 */
	EReference getPLATrace_EdfdElements();

	/**
	 * Returns the meta object for the reference list '{@link traceabilityPLA.PLATrace#getPlaElements <em>Pla Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pla Elements</em>'.
	 * @see traceabilityPLA.PLATrace#getPlaElements()
	 * @see #getPLATrace()
	 * @generated
	 */
	EReference getPLATrace_PlaElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityPLAFactory getTraceabilityPLAFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link traceabilityPLA.impl.EDFDToPLAImpl <em>EDFD To PLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceabilityPLA.impl.EDFDToPLAImpl
		 * @see traceabilityPLA.impl.TraceabilityPLAPackageImpl#getEDFDToPLA()
		 * @generated
		 */
		EClass EDFD_TO_PLA = eINSTANCE.getEDFDToPLA();

		/**
		 * The meta object literal for the '<em><b>Platraces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_TO_PLA__PLATRACES = eINSTANCE.getEDFDToPLA_Platraces();

		/**
		 * The meta object literal for the '<em><b>Edfds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_TO_PLA__EDFDS = eINSTANCE.getEDFDToPLA_Edfds();

		/**
		 * The meta object literal for the '<em><b>Pla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_TO_PLA__PLA = eINSTANCE.getEDFDToPLA_Pla();

		/**
		 * The meta object literal for the '{@link traceabilityPLA.impl.PLATraceImpl <em>PLA Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceabilityPLA.impl.PLATraceImpl
		 * @see traceabilityPLA.impl.TraceabilityPLAPackageImpl#getPLATrace()
		 * @generated
		 */
		EClass PLA_TRACE = eINSTANCE.getPLATrace();

		/**
		 * The meta object literal for the '<em><b>Edfd Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLA_TRACE__EDFD_ELEMENTS = eINSTANCE.getPLATrace_EdfdElements();

		/**
		 * The meta object literal for the '<em><b>Pla Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLA_TRACE__PLA_ELEMENTS = eINSTANCE.getPLATrace_PlaElements();

	}

} //TraceabilityPLAPackage
