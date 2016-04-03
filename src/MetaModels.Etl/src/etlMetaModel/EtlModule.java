/**
 */
package etlMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etl Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EtlModule#getMofClassesSource <em>Mof Classes Source</em>}</li>
 *   <li>{@link etlMetaModel.EtlModule#getMofAssociationsSource <em>Mof Associations Source</em>}</li>
 *   <li>{@link etlMetaModel.EtlModule#getMofClassesTarget <em>Mof Classes Target</em>}</li>
 *   <li>{@link etlMetaModel.EtlModule#getMofAssociationsTarget <em>Mof Associations Target</em>}</li>
 *   <li>{@link etlMetaModel.EtlModule#getPre <em>Pre</em>}</li>
 *   <li>{@link etlMetaModel.EtlModule#getTransformationRules <em>Transformation Rules</em>}</li>
 *   <li>{@link etlMetaModel.EtlModule#getPost <em>Post</em>}</li>
 *   <li>{@link etlMetaModel.EtlModule#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule()
 * @model
 * @generated
 */
public interface EtlModule extends EolLibraryModule {
	/**
	 * Returns the value of the '<em><b>Mof Classes Source</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.MofClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mof Classes Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mof Classes Source</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule_MofClassesSource()
	 * @model containment="true"
	 * @generated
	 */
	EList<MofClass> getMofClassesSource();

	/**
	 * Returns the value of the '<em><b>Mof Associations Source</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.MofAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mof Associations Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mof Associations Source</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule_MofAssociationsSource()
	 * @model containment="true"
	 * @generated
	 */
	EList<MofAssociation> getMofAssociationsSource();

	/**
	 * Returns the value of the '<em><b>Mof Classes Target</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.MofClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mof Classes Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mof Classes Target</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule_MofClassesTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<MofClass> getMofClassesTarget();

	/**
	 * Returns the value of the '<em><b>Mof Associations Target</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.MofAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mof Associations Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mof Associations Target</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule_MofAssociationsTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<MofAssociation> getMofAssociationsTarget();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(ErlNamedRule)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule_Pre()
	 * @model containment="true"
	 * @generated
	 */
	ErlNamedRule getPre();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlModule#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(ErlNamedRule value);

	/**
	 * Returns the value of the '<em><b>Transformation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.EtlTransformationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Rules</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule_TransformationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EtlTransformationRule> getTransformationRules();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(ErlNamedRule)
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule_Post()
	 * @model containment="true"
	 * @generated
	 */
	ErlNamedRule getPost();

	/**
	 * Sets the value of the '{@link etlMetaModel.EtlModule#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(ErlNamedRule value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.EolOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEtlModule_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EolOperation> getOperations();

} // EtlModule
