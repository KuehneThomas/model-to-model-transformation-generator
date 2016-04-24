/**
 */
package etlMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etl Transformation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getName <em>Name</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getGuardName <em>Guard Name</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getExtendsRules <em>Extends Rules</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getSourceParameter <em>Source Parameter</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getTargetParameters <em>Target Parameters</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getGuard <em>Guard</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getBody <em>Body</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getAbstractt <em>Abstractt</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getLazy <em>Lazy</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getPrimary <em>Primary</em>}</li>
 *   <li>{@link etlMetaModel.EtlTransformationRule#getGreedy <em>Greedy</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule()
 * @model
 * @generated
 */
public interface EtlTransformationRule extends EObject {
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
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Name</em>' attribute.
	 * @see #setGuardName(String)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_GuardName()
	 * @model
	 * @generated
	 */
	String getGuardName();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getGuardName <em>Guard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Name</em>' attribute.
	 * @see #getGuardName()
	 * @generated
	 */
	void setGuardName(String value);

	/**
	 * Returns the value of the '<em><b>Extends Rules</b></em>' reference list.
	 * The list contents are of type {@link etlMetaModel.EtlTransformationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Rules</em>' reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_ExtendsRules()
	 * @model
	 * @generated
	 */
	EList<EtlTransformationRule> getExtendsRules();

	/**
	 * Returns the value of the '<em><b>Source Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Parameter</em>' containment reference.
	 * @see #setSourceParameter(EolMofClassFormalParameter)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_SourceParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolMofClassFormalParameter getSourceParameter();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getSourceParameter <em>Source Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Parameter</em>' containment reference.
	 * @see #getSourceParameter()
	 * @generated
	 */
	void setSourceParameter(EolMofClassFormalParameter value);

	/**
	 * Returns the value of the '<em><b>Target Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.EolMofClassFormalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Parameters</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_TargetParameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EolMofClassFormalParameter> getTargetParameters();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_Guard()
	 * @model containment="true"
	 * @generated
	 */
	EolLogicalExpression getGuard();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(EolLogicalExpression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(EolStatementBlock)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_Body()
	 * @model containment="true"
	 * @generated
	 */
	EolStatementBlock getBody();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(EolStatementBlock value);

	/**
	 * Returns the value of the '<em><b>Abstractt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractt</em>' attribute.
	 * @see #setAbstractt(Boolean)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_Abstractt()
	 * @model
	 * @generated
	 */
	Boolean getAbstractt();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getAbstractt <em>Abstractt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstractt</em>' attribute.
	 * @see #getAbstractt()
	 * @generated
	 */
	void setAbstractt(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see #setLazy(Boolean)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_Lazy()
	 * @model
	 * @generated
	 */
	Boolean getLazy();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see #getLazy()
	 * @generated
	 */
	void setLazy(Boolean value);

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' attribute.
	 * @see #setPrimary(Boolean)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_Primary()
	 * @model
	 * @generated
	 */
	Boolean getPrimary();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getPrimary <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' attribute.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Greedy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greedy</em>' attribute.
	 * @see #setGreedy(Boolean)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlTransformationRule_Greedy()
	 * @model
	 * @generated
	 */
	Boolean getGreedy();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlTransformationRule#getGreedy <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greedy</em>' attribute.
	 * @see #getGreedy()
	 * @generated
	 */
	void setGreedy(Boolean value);

} // EtlTransformationRule
