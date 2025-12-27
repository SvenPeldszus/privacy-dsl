/**
 */
package org.secdfd.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Generation Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.secdfd.model.ModelPackage#getDataGenerationDirection()
 * @model
 * @generated
 */
public enum DataGenerationDirection implements Enumerator {
	/**
	 * The '<em><b>REDUCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCE_VALUE
	 * @generated
	 * @ordered
	 */
	REDUCE(0, "REDUCE", "REDUCE"),

	/**
	 * The '<em><b>PRESERVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVE(1, "PRESERVE", "PRESERVE"),

	/**
	 * The '<em><b>ELEVATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATE_VALUE
	 * @generated
	 * @ordered
	 */
	ELEVATE(2, "ELEVATE", "ELEVATE");

	/**
	 * The '<em><b>REDUCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDUCE_VALUE = 0;

	/**
	 * The '<em><b>PRESERVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVE_VALUE = 1;

	/**
	 * The '<em><b>ELEVATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELEVATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Data Generation Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataGenerationDirection[] VALUES_ARRAY =
		new DataGenerationDirection[] {
			REDUCE,
			PRESERVE,
			ELEVATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Generation Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataGenerationDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Generation Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataGenerationDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataGenerationDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Generation Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataGenerationDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataGenerationDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Generation Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataGenerationDirection get(int value) {
		switch (value) {
			case REDUCE_VALUE: return REDUCE;
			case PRESERVE_VALUE: return PRESERVE;
			case ELEVATE_VALUE: return ELEVATE;
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
	private DataGenerationDirection(int value, String name, String literal) {
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
	
} //DataGenerationDirection
