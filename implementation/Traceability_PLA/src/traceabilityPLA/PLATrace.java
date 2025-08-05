/**
 */
package traceabilityPLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.secdfd.model.NamedEntity;

import pla.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLA Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traceabilityPLA.PLATrace#getEdfdElements <em>Edfd Elements</em>}</li>
 *   <li>{@link traceabilityPLA.PLATrace#getPlaElements <em>Pla Elements</em>}</li>
 * </ul>
 *
 * @see traceabilityPLA.TraceabilityPLAPackage#getPLATrace()
 * @model
 * @generated
 */
public interface PLATrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Edfd Elements</b></em>' reference list.
	 * The list contents are of type {@link org.secdfd.model.NamedEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edfd Elements</em>' reference list.
	 * @see traceabilityPLA.TraceabilityPLAPackage#getPLATrace_EdfdElements()
	 * @model
	 * @generated
	 */
	EList<NamedEntity> getEdfdElements();

	/**
	 * Returns the value of the '<em><b>Pla Elements</b></em>' reference list.
	 * The list contents are of type {@link pla.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pla Elements</em>' reference list.
	 * @see traceabilityPLA.TraceabilityPLAPackage#getPLATrace_PlaElements()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getPlaElements();

} // PLATrace
