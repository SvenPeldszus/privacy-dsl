/**
 */
package graph;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.NodeResponsibility#getContractTypes <em>Contract Types</em>}</li>
 *   <li>{@link graph.NodeResponsibility#getOutgoingassets <em>Outgoingassets</em>}</li>
 *   <li>{@link graph.NodeResponsibility#getIncomingassets <em>Incomingassets</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getNodeResponsibility()
 * @model
 * @generated
 */
public interface NodeResponsibility extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Contract Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract Types</em>' attribute list.
	 * @see graph.GraphPackage#getNodeResponsibility_ContractTypes()
	 * @model
	 * @generated
	 */
	EList<String> getContractTypes();

	/**
	 * Returns the value of the '<em><b>Outgoingassets</b></em>' reference list.
	 * The list contents are of type {@link graph.GraphAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoingassets</em>' reference list.
	 * @see graph.GraphPackage#getNodeResponsibility_Outgoingassets()
	 * @model
	 * @generated
	 */
	EList<GraphAsset> getOutgoingassets();

	/**
	 * Returns the value of the '<em><b>Incomingassets</b></em>' reference list.
	 * The list contents are of type {@link graph.GraphAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomingassets</em>' reference list.
	 * @see graph.GraphPackage#getNodeResponsibility_Incomingassets()
	 * @model
	 * @generated
	 */
	EList<GraphAsset> getIncomingassets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.incomingassets.assetlabel.level-&gt;max()'"
	 * @generated
	 */
	BigInteger findMostRestrictiveLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.incomingassets.assetlabel.level-&gt;min()'"
	 * @generated
	 */
	BigInteger findLeastRestrictiveLabel();

} // NodeResponsibility
