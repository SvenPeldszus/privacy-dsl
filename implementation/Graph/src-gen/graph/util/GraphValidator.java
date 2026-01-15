/**
 */
package graph.util;

import graph.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see graph.GraphPackage
 * @generated
 */
public class GraphValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GraphValidator INSTANCE = new GraphValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "graph";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Privacy Policy Violation Strong' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__PRIVACY_POLICY_VIOLATION_STRONG = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Privacy Policy Violation Weak' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__PRIVACY_POLICY_VIOLATION_WEAK = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Prediction Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__PREDICTION_SEMANTIC_CONSTRAINT = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Copier Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__COPIER_SEMANTIC_CONSTRAINT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Clustering Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__CLUSTERING_SEMANTIC_CONSTRAINT = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Verifier Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__VERIFIER_SEMANTIC_CONSTRAINT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Generation Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__DATA_GENERATION_SEMANTIC_CONSTRAINT = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dimensionality Reduction Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__DIMENSIONALITY_REDUCTION_SEMANTIC_CONSTRAINT = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Business Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__BUSINESS_SEMANTIC_CONSTRAINT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Recommendation Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__RECOMMENDATION_SEMANTIC_CONSTRAINT = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encrypt Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__ENCRYPT_SEMANTIC_CONSTRAINT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Joiner Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__JOINER_SEMANTIC_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Decrypt Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__DECRYPT_SEMANTIC_CONSTRAINT = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Store Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__STORE_SEMANTIC_CONSTRAINT = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Comparator Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__COMPARATOR_SEMANTIC_CONSTRAINT = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Discarder Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__DISCARDER_SEMANTIC_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attacker Observation Violation' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__ATTACKER_OBSERVATION_VIOLATION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Decision Making Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__DECISION_MAKING_SEMANTIC_CONSTRAINT = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Splitter Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__SPLITTER_SEMANTIC_CONSTRAINT = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Forward Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__FORWARD_SEMANTIC_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Authenticator Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__AUTHENTICATOR_SEMANTIC_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Classification Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__CLASSIFICATION_SEMANTIC_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__USER_SEMANTIC_CONSTRAINT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Privacy Policy Violation Medium' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__PRIVACY_POLICY_VIOLATION_MEDIUM = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 24;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GraphPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GraphPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case GraphPackage.IDENTIFIABLE:
				return validateIdentifiable((Identifiable)value, diagnostics, context);
			case GraphPackage.GRAPH_ASSET:
				return validateGraphAsset((GraphAsset)value, diagnostics, context);
			case GraphPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case GraphPackage.SUBGRAPHS:
				return validateSubgraphs((Subgraphs)value, diagnostics, context);
			case GraphPackage.NODE_RESPONSIBILITY:
				return validateNodeResponsibility((NodeResponsibility)value, diagnostics, context);
			case GraphPackage.GRAPH:
				return validateGraph((Graph)value, diagnostics, context);
			case GraphPackage.SECURITY_LABEL:
				return validateSecurityLabel((SecurityLabel)value, diagnostics, context);
			case GraphPackage.ASSET_LABEL:
				return validateAssetLabel((AssetLabel)value, diagnostics, context);
			case GraphPackage.EDGE_LABEL:
				return validateEdgeLabel((EdgeLabel)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiable(Identifiable identifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphAsset(GraphAsset graphAsset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphAsset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ComparatorSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_PrivacyPolicyViolationStrong(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_PrivacyPolicyViolationWeak(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ClassificationSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_JoinerSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_DiscarderSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_AuthenticatorSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ForwardSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UserSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_PrivacyPolicyViolationMedium(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_EncryptSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_VerifierSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_AttackerObservationViolation(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ClusteringSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_CopierSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_DimensionalityReductionSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_RecommendationSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_SplitterSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_BusinessSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_DecryptSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_DecisionMakingSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_PredictionSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_DataGenerationSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_StoreSemanticConstraint(node, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UserSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_UserSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.UserSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the PrivacyPolicyViolationMedium constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_PrivacyPolicyViolationMedium(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.PrivacyPolicyViolationMedium(diagnostics, context);
	}

	/**
	 * Validates the CopierSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_CopierSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.CopierSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the ClusteringSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ClusteringSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.ClusteringSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the VerifierSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_VerifierSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.VerifierSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the DataGenerationSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DataGenerationSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.DataGenerationSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the DimensionalityReductionSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DimensionalityReductionSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.DimensionalityReductionSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the BusinessSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_BusinessSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.BusinessSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the RecommendationSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_RecommendationSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.RecommendationSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the EncryptSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_EncryptSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.EncryptSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the JoinerSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_JoinerSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.JoinerSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the DecryptSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DecryptSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.DecryptSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the StoreSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_StoreSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.StoreSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the ComparatorSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ComparatorSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.ComparatorSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the PrivacyPolicyViolationStrong constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_PrivacyPolicyViolationStrong(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.PrivacyPolicyViolationStrong(diagnostics, context);
	}

	/**
	 * Validates the PrivacyPolicyViolationWeak constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_PrivacyPolicyViolationWeak(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.PrivacyPolicyViolationWeak(diagnostics, context);
	}

	/**
	 * Validates the PredictionSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_PredictionSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.PredictionSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the DiscarderSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DiscarderSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.DiscarderSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the AttackerObservationViolation constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_AttackerObservationViolation(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.AttackerObservationViolation(diagnostics, context);
	}

	/**
	 * Validates the DecisionMakingSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DecisionMakingSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.DecisionMakingSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the SplitterSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_SplitterSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.SplitterSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the ForwardSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ForwardSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.ForwardSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the AuthenticatorSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_AuthenticatorSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.AuthenticatorSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the ClassificationSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ClassificationSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.ClassificationSemanticConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubgraphs(Subgraphs subgraphs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subgraphs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeResponsibility(NodeResponsibility nodeResponsibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeResponsibility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraph(Graph graph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityLabel(SecurityLabel securityLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssetLabel(AssetLabel assetLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assetLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeLabel(EdgeLabel edgeLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edgeLabel, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GraphValidator
