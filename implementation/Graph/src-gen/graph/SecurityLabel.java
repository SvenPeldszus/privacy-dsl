/**
 */
package graph;

import org.eclipse.emf.ecore.EObject;

import org.secdfd.model.Objective;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.SecurityLabel#getObjective <em>Objective</em>}</li>
 *   <li>{@link graph.SecurityLabel#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getSecurityLabel()
 * @model abstract="true"
 * @generated
 */
public interface SecurityLabel extends EObject {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' attribute.
	 * The default value is <code>"Integrity"</code>.
	 * The literals are from the enumeration {@link org.secdfd.model.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' attribute.
	 * @see org.secdfd.model.Objective
	 * @see #setObjective(Objective)
	 * @see graph.GraphPackage#getSecurityLabel_Objective()
	 * @model default="Integrity" required="true"
	 * @generated
	 */
	Objective getObjective();

	/**
	 * Sets the value of the '{@link graph.SecurityLabel#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see org.secdfd.model.Objective
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(Objective value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see graph.GraphPackage#getSecurityLabel_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link graph.SecurityLabel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // SecurityLabel
