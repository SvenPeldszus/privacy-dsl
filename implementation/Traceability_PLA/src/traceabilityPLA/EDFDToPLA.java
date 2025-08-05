/**
 */
package traceabilityPLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.secdfd.model.EDFD;
import pla.PLA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDFD To PLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traceabilityPLA.EDFDToPLA#getPlatraces <em>Platraces</em>}</li>
 *   <li>{@link traceabilityPLA.EDFDToPLA#getEdfds <em>Edfds</em>}</li>
 *   <li>{@link traceabilityPLA.EDFDToPLA#getPla <em>Pla</em>}</li>
 * </ul>
 *
 * @see traceabilityPLA.TraceabilityPLAPackage#getEDFDToPLA()
 * @model
 * @generated
 */
public interface EDFDToPLA extends EObject {
	/**
	 * Returns the value of the '<em><b>Platraces</b></em>' containment reference list.
	 * The list contents are of type {@link traceabilityPLA.PLATrace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platraces</em>' containment reference list.
	 * @see traceabilityPLA.TraceabilityPLAPackage#getEDFDToPLA_Platraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<PLATrace> getPlatraces();

	/**
	 * Returns the value of the '<em><b>Edfds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edfds</em>' reference.
	 * @see #setEdfds(EDFD)
	 * @see traceabilityPLA.TraceabilityPLAPackage#getEDFDToPLA_Edfds()
	 * @model
	 * @generated
	 */
	EDFD getEdfds();

	/**
	 * Sets the value of the '{@link traceabilityPLA.EDFDToPLA#getEdfds <em>Edfds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edfds</em>' reference.
	 * @see #getEdfds()
	 * @generated
	 */
	void setEdfds(EDFD value);

	/**
	 * Returns the value of the '<em><b>Pla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pla</em>' reference.
	 * @see #setPla(PLA)
	 * @see traceabilityPLA.TraceabilityPLAPackage#getEDFDToPLA_Pla()
	 * @model
	 * @generated
	 */
	PLA getPla();

	/**
	 * Sets the value of the '{@link traceabilityPLA.EDFDToPLA#getPla <em>Pla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pla</em>' reference.
	 * @see #getPla()
	 * @generated
	 */
	void setPla(PLA value);

} // EDFDToPLA
