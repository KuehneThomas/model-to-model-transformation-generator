/**
 */
package etlMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Eol Additive Comparison Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see etlMetaModel.EtlMetaModelPackage#getEolAdditiveComparisonOperator()
 * @model
 * @generated
 */
public enum EolAdditiveComparisonOperator implements Enumerator {
	/**
	 * The '<em><b>Not Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL(0, "notEqual", "notEqual"),

	/**
	 * The '<em><b>Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(1, "greaterThan", "greaterThan"),

	/**
	 * The '<em><b>Smaller Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLER_THAN(2, "smallerThan", "smallerThan"),

	/**
	 * The '<em><b>Greater Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_OR_EQUAL(3, "greaterOrEqual", "greaterOrEqual"),

	/**
	 * The '<em><b>Smaller Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLER_OR_EQUAL(4, "smallerOrEqual", "smallerOrEqual");

	/**
	 * The '<em><b>Not Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL
	 * @model name="notEqual"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN
	 * @model name="greaterThan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 1;

	/**
	 * The '<em><b>Smaller Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smaller Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLER_THAN
	 * @model name="smallerThan"
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_THAN_VALUE = 2;

	/**
	 * The '<em><b>Greater Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Or Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL
	 * @model name="greaterOrEqual"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_OR_EQUAL_VALUE = 3;

	/**
	 * The '<em><b>Smaller Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smaller Or Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLER_OR_EQUAL
	 * @model name="smallerOrEqual"
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_OR_EQUAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Eol Additive Comparison Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EolAdditiveComparisonOperator[] VALUES_ARRAY =
		new EolAdditiveComparisonOperator[] {
			NOT_EQUAL,
			GREATER_THAN,
			SMALLER_THAN,
			GREATER_OR_EQUAL,
			SMALLER_OR_EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Eol Additive Comparison Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EolAdditiveComparisonOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eol Additive Comparison Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EolAdditiveComparisonOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EolAdditiveComparisonOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eol Additive Comparison Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EolAdditiveComparisonOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EolAdditiveComparisonOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eol Additive Comparison Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EolAdditiveComparisonOperator get(int value) {
		switch (value) {
			case NOT_EQUAL_VALUE: return NOT_EQUAL;
			case GREATER_THAN_VALUE: return GREATER_THAN;
			case SMALLER_THAN_VALUE: return SMALLER_THAN;
			case GREATER_OR_EQUAL_VALUE: return GREATER_OR_EQUAL;
			case SMALLER_OR_EQUAL_VALUE: return SMALLER_OR_EQUAL;
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
	private EolAdditiveComparisonOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //EolAdditiveComparisonOperator
