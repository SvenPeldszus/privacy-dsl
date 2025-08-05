/**
 */
package pla;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDPR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pla.GDPR#getPla <em>Pla</em>}</li>
 * </ul>
 *
 * @see pla.PlaPackage#getGDPR()
 * @model
 * @generated
 */
public interface GDPR extends EObject {
	/**
	 * Returns the value of the '<em><b>Pla</b></em>' containment reference list.
	 * The list contents are of type {@link pla.PLA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pla</em>' containment reference list.
	 * @see pla.PlaPackage#getGDPR_Pla()
	 * @model containment="true"
	 * @generated
	 */
	EList<PLA> getPla();

} // GDPR
