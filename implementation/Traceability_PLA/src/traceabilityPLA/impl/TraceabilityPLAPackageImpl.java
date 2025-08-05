/**
 */
package traceabilityPLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.secdfd.model.ModelPackage;

import pla.PlaPackage;

import traceabilityPLA.EDFDToPLA;
import traceabilityPLA.PLATrace;
import traceabilityPLA.TraceabilityPLAFactory;
import traceabilityPLA.TraceabilityPLAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityPLAPackageImpl extends EPackageImpl implements TraceabilityPLAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edfdToPLAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plaTraceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see traceabilityPLA.TraceabilityPLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraceabilityPLAPackageImpl() {
		super(eNS_URI, TraceabilityPLAFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TraceabilityPLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraceabilityPLAPackage init() {
		if (isInited) return (TraceabilityPLAPackage)EPackage.Registry.INSTANCE.getEPackage(TraceabilityPLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTraceabilityPLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TraceabilityPLAPackageImpl theTraceabilityPLAPackage = registeredTraceabilityPLAPackage instanceof TraceabilityPLAPackageImpl ? (TraceabilityPLAPackageImpl)registeredTraceabilityPLAPackage : new TraceabilityPLAPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();
		PlaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTraceabilityPLAPackage.createPackageContents();

		// Initialize created meta-data
		theTraceabilityPLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraceabilityPLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraceabilityPLAPackage.eNS_URI, theTraceabilityPLAPackage);
		return theTraceabilityPLAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDFDToPLA() {
		return edfdToPLAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEDFDToPLA_Platraces() {
		return (EReference)edfdToPLAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEDFDToPLA_Edfds() {
		return (EReference)edfdToPLAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEDFDToPLA_Pla() {
		return (EReference)edfdToPLAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPLATrace() {
		return plaTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPLATrace_EdfdElements() {
		return (EReference)plaTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPLATrace_PlaElements() {
		return (EReference)plaTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraceabilityPLAFactory getTraceabilityPLAFactory() {
		return (TraceabilityPLAFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		edfdToPLAEClass = createEClass(EDFD_TO_PLA);
		createEReference(edfdToPLAEClass, EDFD_TO_PLA__PLATRACES);
		createEReference(edfdToPLAEClass, EDFD_TO_PLA__EDFDS);
		createEReference(edfdToPLAEClass, EDFD_TO_PLA__PLA);

		plaTraceEClass = createEClass(PLA_TRACE);
		createEReference(plaTraceEClass, PLA_TRACE__EDFD_ELEMENTS);
		createEReference(plaTraceEClass, PLA_TRACE__PLA_ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		PlaPackage thePlaPackage = (PlaPackage)EPackage.Registry.INSTANCE.getEPackage(PlaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(edfdToPLAEClass, EDFDToPLA.class, "EDFDToPLA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDFDToPLA_Platraces(), this.getPLATrace(), null, "platraces", null, 0, -1, EDFDToPLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDFDToPLA_Edfds(), theModelPackage.getEDFD(), null, "edfds", null, 0, 1, EDFDToPLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDFDToPLA_Pla(), thePlaPackage.getPLA(), null, "pla", null, 0, 1, EDFDToPLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plaTraceEClass, PLATrace.class, "PLATrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPLATrace_EdfdElements(), theModelPackage.getNamedEntity(), null, "edfdElements", null, 0, -1, PLATrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPLATrace_PlaElements(), thePlaPackage.getIdentifiable(), null, "plaElements", null, 0, -1, PLATrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TraceabilityPLAPackageImpl
