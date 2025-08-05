/**
 */
package traceabilityPLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import traceabilityPLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityPLAFactoryImpl extends EFactoryImpl implements TraceabilityPLAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceabilityPLAFactory init() {
		try {
			TraceabilityPLAFactory theTraceabilityPLAFactory = (TraceabilityPLAFactory)EPackage.Registry.INSTANCE.getEFactory(TraceabilityPLAPackage.eNS_URI);
			if (theTraceabilityPLAFactory != null) {
				return theTraceabilityPLAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceabilityPLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityPLAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TraceabilityPLAPackage.EDFD_TO_PLA: return createEDFDToPLA();
			case TraceabilityPLAPackage.PLA_TRACE: return createPLATrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDFDToPLA createEDFDToPLA() {
		EDFDToPLAImpl edfdToPLA = new EDFDToPLAImpl();
		return edfdToPLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PLATrace createPLATrace() {
		PLATraceImpl plaTrace = new PLATraceImpl();
		return plaTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraceabilityPLAPackage getTraceabilityPLAPackage() {
		return (TraceabilityPLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraceabilityPLAPackage getPackage() {
		return TraceabilityPLAPackage.eINSTANCE;
	}

} //TraceabilityPLAFactoryImpl
