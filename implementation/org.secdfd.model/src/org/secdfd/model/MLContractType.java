/**
 */
package org.secdfd.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ML Contract Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.secdfd.model.ModelPackage#getMLContractType()
 * @model
 * @generated
 */
public enum MLContractType implements Enumerator {
	/**
	 * The '<em><b>Classification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFICATION(0, "Classification", "Classification"),

	/**
	 * The '<em><b>Clustering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTERING(1, "Clustering", "Clustering"), /**
	 * The '<em><b>Decision Making</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_MAKING_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION_MAKING(2, "DecisionMaking", "DecisionMaking"), /**
	 * The '<em><b>Recommendation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	RECOMMENDATION(3, "Recommendation", "Recommendation"), /**
	 * The '<em><b>Prediction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDICTION_VALUE
	 * @generated
	 * @ordered
	 */
	PREDICTION(4, "Prediction", "Prediction"), /**
	 * The '<em><b>Dimensionality Reduction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIMENSIONALITY_REDUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	DIMENSIONALITY_REDUCTION(5, "DimensionalityReduction", "DimensionalityReduction"), /**
	 * The '<em><b>Data Generation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_GENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_GENERATION(6, "DataGeneration", "DataGeneration");

	/**
	 * The '<em><b>Classification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION
	 * @model name="Classification"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFICATION_VALUE = 0;

	/**
	 * The '<em><b>Clustering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING
	 * @model name="Clustering"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTERING_VALUE = 1;

	/**
	 * The '<em><b>Decision Making</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_MAKING
	 * @model name="DecisionMaking"
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_MAKING_VALUE = 2;

	/**
	 * The '<em><b>Recommendation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDATION
	 * @model name="Recommendation"
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_VALUE = 3;

	/**
	 * The '<em><b>Prediction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDICTION
	 * @model name="Prediction"
	 * @generated
	 * @ordered
	 */
	public static final int PREDICTION_VALUE = 4;

	/**
	 * The '<em><b>Dimensionality Reduction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIMENSIONALITY_REDUCTION
	 * @model name="DimensionalityReduction"
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONALITY_REDUCTION_VALUE = 5;

	/**
	 * The '<em><b>Data Generation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_GENERATION
	 * @model name="DataGeneration"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_GENERATION_VALUE = 6;

	/**
	 * An array of all the '<em><b>ML Contract Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MLContractType[] VALUES_ARRAY =
		new MLContractType[] {
			CLASSIFICATION,
			CLUSTERING,
			DECISION_MAKING,
			RECOMMENDATION,
			PREDICTION,
			DIMENSIONALITY_REDUCTION,
			DATA_GENERATION,
		};

	/**
	 * A public read-only list of all the '<em><b>ML Contract Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MLContractType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ML Contract Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLContractType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MLContractType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ML Contract Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLContractType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MLContractType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ML Contract Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLContractType get(int value) {
		switch (value) {
			case CLASSIFICATION_VALUE: return CLASSIFICATION;
			case CLUSTERING_VALUE: return CLUSTERING;
			case DECISION_MAKING_VALUE: return DECISION_MAKING;
			case RECOMMENDATION_VALUE: return RECOMMENDATION;
			case PREDICTION_VALUE: return PREDICTION;
			case DIMENSIONALITY_REDUCTION_VALUE: return DIMENSIONALITY_REDUCTION;
			case DATA_GENERATION_VALUE: return DATA_GENERATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MLContractType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MLContractType
