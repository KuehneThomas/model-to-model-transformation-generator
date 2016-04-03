/**
 */
package etlMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mof Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.MofClass#getOwnedProperties <em>Owned Properties</em>}</li>
 *   <li>{@link etlMetaModel.MofClass#getSuperclasses <em>Superclasses</em>}</li>
 *   <li>{@link etlMetaModel.MofClass#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getMofClass()
 * @model
 * @generated
 */
public interface MofClass extends MofType {
	/**
	 * Returns the value of the '<em><b>Owned Properties</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.MofProperty}.
	 * It is bidirectional and its opposite is '{@link etlMetaModel.MofProperty#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Properties</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getMofClass_OwnedProperties()
	 * @see etlMetaModel.MofProperty#getClazz
	 * @model opposite="clazz" containment="true"
	 * @generated
	 */
	EList<MofProperty> getOwnedProperties();

	/**
	 * Returns the value of the '<em><b>Superclasses</b></em>' reference list.
	 * The list contents are of type {@link etlMetaModel.MofClass}.
	 * It is bidirectional and its opposite is '{@link etlMetaModel.MofClass#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclasses</em>' reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getMofClass_Superclasses()
	 * @see etlMetaModel.MofClass#getClazz
	 * @model opposite="clazz"
	 * @generated
	 */
	EList<MofClass> getSuperclasses();

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' reference list.
	 * The list contents are of type {@link etlMetaModel.MofClass}.
	 * It is bidirectional and its opposite is '{@link etlMetaModel.MofClass#getSuperclasses <em>Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getMofClass_Clazz()
	 * @see etlMetaModel.MofClass#getSuperclasses
	 * @model opposite="superclasses"
	 * @generated
	 */
	EList<MofClass> getClazz();

} // MofClass
