/**
 */
package org.secdfd.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ML Responsibility Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.secdfd.model.ModelPackage#getMLResponsibilityType()
 * @model
 * @generated
 */
public enum MLResponsibilityType implements Enumerator {
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
	 * The '<em><b>Decision Making</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_MAKING_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION_MAKING(1, "DecisionMaking", "Decision-Making"),

	/**
	 * The '<em><b>Regression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REGRESSION(2, "Regression", "Regression"),

	/**
	 * The '<em><b>Clustering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTERING(3, "Clustering", "Clustering"),

	/**
	 * The '<em><b>Anomaly Detection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANOMALY_DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	ANOMALY_DETECTION(4, "AnomalyDetection", "AnomalyDetection"),

	/**
	 * The '<em><b>Natural Language Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATURAL_LANGUAGE_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	NATURAL_LANGUAGE_PROCESSING(5, "NaturalLanguageProcessing", "Natural-Language-Processing"),

	/**
	 * The '<em><b>Computer Vision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_VISION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTER_VISION(6, "ComputerVision", "Computer-Vision");

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
	 * The '<em><b>Decision Making</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_MAKING
	 * @model name="DecisionMaking" literal="Decision-Making"
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_MAKING_VALUE = 1;

	/**
	 * The '<em><b>Regression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION
	 * @model name="Regression"
	 * @generated
	 * @ordered
	 */
	public static final int REGRESSION_VALUE = 2;

	/**
	 * The '<em><b>Clustering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING
	 * @model name="Clustering"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTERING_VALUE = 3;

	/**
	 * The '<em><b>Anomaly Detection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANOMALY_DETECTION
	 * @model name="AnomalyDetection"
	 * @generated
	 * @ordered
	 */
	public static final int ANOMALY_DETECTION_VALUE = 4;

	/**
	 * The '<em><b>Natural Language Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATURAL_LANGUAGE_PROCESSING
	 * @model name="NaturalLanguageProcessing" literal="Natural-Language-Processing"
	 * @generated
	 * @ordered
	 */
	public static final int NATURAL_LANGUAGE_PROCESSING_VALUE = 5;

	/**
	 * The '<em><b>Computer Vision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_VISION
	 * @model name="ComputerVision" literal="Computer-Vision"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTER_VISION_VALUE = 6;

	/**
	 * An array of all the '<em><b>ML Responsibility Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MLResponsibilityType[] VALUES_ARRAY =
		new MLResponsibilityType[] {
			CLASSIFICATION,
			DECISION_MAKING,
			REGRESSION,
			CLUSTERING,
			ANOMALY_DETECTION,
			NATURAL_LANGUAGE_PROCESSING,
			COMPUTER_VISION,
		};

	/**
	 * A public read-only list of all the '<em><b>ML Responsibility Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MLResponsibilityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ML Responsibility Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLResponsibilityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MLResponsibilityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ML Responsibility Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLResponsibilityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MLResponsibilityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ML Responsibility Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLResponsibilityType get(int value) {
		switch (value) {
			case CLASSIFICATION_VALUE: return CLASSIFICATION;
			case DECISION_MAKING_VALUE: return DECISION_MAKING;
			case REGRESSION_VALUE: return REGRESSION;
			case CLUSTERING_VALUE: return CLUSTERING;
			case ANOMALY_DETECTION_VALUE: return ANOMALY_DETECTION;
			case NATURAL_LANGUAGE_PROCESSING_VALUE: return NATURAL_LANGUAGE_PROCESSING;
			case COMPUTER_VISION_VALUE: return COMPUTER_VISION;
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
	private MLResponsibilityType(int value, String name, String literal) {
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
	
} //MLResponsibilityType
