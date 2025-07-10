/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link graph.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link graph.Edge#getGraphassets <em>Graphassets</em>}</li>
 *   <li>{@link graph.Edge#isVisited <em>Visited</em>}</li>
 *   <li>{@link graph.Edge#getEdgelabel <em>Edgelabel</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link graph.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see graph.GraphPackage#getEdge_Target()
	 * @model
	 * @generated
	 */
	EList<Node> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see graph.GraphPackage#getEdge_Source()
	 * @model
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link graph.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Graphassets</b></em>' reference list.
	 * The list contents are of type {@link graph.GraphAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphassets</em>' reference list.
	 * @see graph.GraphPackage#getEdge_Graphassets()
	 * @model
	 * @generated
	 */
	EList<GraphAsset> getGraphassets();

	/**
	 * Returns the value of the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visited</em>' attribute.
	 * @see #setVisited(boolean)
	 * @see graph.GraphPackage#getEdge_Visited()
	 * @model required="true"
	 * @generated
	 */
	boolean isVisited();

	/**
	 * Sets the value of the '{@link graph.Edge#isVisited <em>Visited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visited</em>' attribute.
	 * @see #isVisited()
	 * @generated
	 */
	void setVisited(boolean value);

	/**
	 * Returns the value of the '<em><b>Edgelabel</b></em>' containment reference list.
	 * The list contents are of type {@link graph.EdgeLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edgelabel</em>' containment reference list.
	 * @see graph.GraphPackage#getEdge_Edgelabel()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdgeLabel> getEdgelabel();

} // Edge
