/**
 */
package pla;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pla.PLA#getPlas <em>Plas</em>}</li>
 * </ul>
 *
 * @see pla.PlaPackage#getPLA()
 * @model
 * @generated
 */
public interface PLA extends EObject {
	/**
	 * Returns the value of the '<em><b>Plas</b></em>' containment reference list.
	 * The list contents are of type {@link pla.PLAs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plas</em>' containment reference list.
	 * @see pla.PlaPackage#getPLA_Plas()
	 * @model containment="true"
	 * @generated
	 */
	EList<PLAs> getPlas();

} // PLA
