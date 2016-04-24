/**
 */
package etlMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolOperation#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link etlMetaModel.EolOperation#getName <em>Name</em>}</li>
 *   <li>{@link etlMetaModel.EolOperation#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link etlMetaModel.EolOperation#getContext <em>Context</em>}</li>
 *   <li>{@link etlMetaModel.EolOperation#getBody <em>Body</em>}</li>
 *   <li>{@link etlMetaModel.EolOperation#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolOperation()
 * @model
 * @generated
 */
public interface EolOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.EolAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEolOperation_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EolAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.EolFormalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEolOperation_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<EolFormalParameter> getFormalParameters();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(EolType)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolOperation_Context()
	 * @model containment="true"
	 * @generated
	 */
	EolType getContext();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolOperation#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(EolType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(EolStatement)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolOperation_Body()
	 * @model containment="true"
	 * @generated
	 */
	EolStatement getBody();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolOperation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(EolStatement value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(EolType)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolOperation_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	EolType getReturnType();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolOperation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(EolType value);

} // EolOperation
