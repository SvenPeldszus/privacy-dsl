/**
 */
package pla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Legal Basis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pla.PlaPackage#getLegalBasis()
 * @model
 * @generated
 */
public enum LegalBasis implements Enumerator {
	/**
	 * The '<em><b>Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENT(0, "Consent", "Consent"),

	/**
	 * The '<em><b>Contract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT(1, "Contract", "Contract"),

	/**
	 * The '<em><b>Legal Obligation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_OBLIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	LEGAL_OBLIGATION(2, "LegalObligation", "LegalObligation"),

	/**
	 * The '<em><b>Legitimate Interest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGITIMATE_INTEREST_VALUE
	 * @generated
	 * @ordered
	 */
	LEGITIMATE_INTEREST(3, "LegitimateInterest", "LegitimateInterest"),

	/**
	 * The '<em><b>Vital Interest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VITAL_INTEREST_VALUE
	 * @generated
	 * @ordered
	 */
	VITAL_INTEREST(4, "VitalInterest", "VitalInterest"),

	/**
	 * The '<em><b>Public Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_TASK(5, "PublicTask", "PublicTask");

	/**
	 * The '<em><b>Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENT
	 * @model name="Consent"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENT_VALUE = 0;

	/**
	 * The '<em><b>Contract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT
	 * @model name="Contract"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_VALUE = 1;

	/**
	 * The '<em><b>Legal Obligation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_OBLIGATION
	 * @model name="LegalObligation"
	 * @generated
	 * @ordered
	 */
	public static final int LEGAL_OBLIGATION_VALUE = 2;

	/**
	 * The '<em><b>Legitimate Interest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGITIMATE_INTEREST
	 * @model name="LegitimateInterest"
	 * @generated
	 * @ordered
	 */
	public static final int LEGITIMATE_INTEREST_VALUE = 3;

	/**
	 * The '<em><b>Vital Interest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VITAL_INTEREST
	 * @model name="VitalInterest"
	 * @generated
	 * @ordered
	 */
	public static final int VITAL_INTEREST_VALUE = 4;

	/**
	 * The '<em><b>Public Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_TASK
	 * @model name="PublicTask"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_TASK_VALUE = 5;

	/**
	 * An array of all the '<em><b>Legal Basis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LegalBasis[] VALUES_ARRAY =
		new LegalBasis[] {
			CONSENT,
			CONTRACT,
			LEGAL_OBLIGATION,
			LEGITIMATE_INTEREST,
			VITAL_INTEREST,
			PUBLIC_TASK,
		};

	/**
	 * A public read-only list of all the '<em><b>Legal Basis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LegalBasis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Legal Basis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegalBasis get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LegalBasis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Legal Basis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegalBasis getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LegalBasis result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Legal Basis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegalBasis get(int value) {
		switch (value) {
			case CONSENT_VALUE: return CONSENT;
			case CONTRACT_VALUE: return CONTRACT;
			case LEGAL_OBLIGATION_VALUE: return LEGAL_OBLIGATION;
			case LEGITIMATE_INTEREST_VALUE: return LEGITIMATE_INTEREST;
			case VITAL_INTEREST_VALUE: return VITAL_INTEREST;
			case PUBLIC_TASK_VALUE: return PUBLIC_TASK;
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
	private LegalBasis(int value, String name, String literal) {
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
	
} //LegalBasis
