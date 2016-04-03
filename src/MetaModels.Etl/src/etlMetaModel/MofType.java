/**
 */
package etlMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mof Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.MofType#getTypedElements <em>Typed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getMofType()
 * @model
 * @generated
 */
public interface MofType extends MofNamedElement {
	/**
	 * Returns the value of the '<em><b>Typed Elements</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.MofTypedElement}.
	 * It is bidirectional and its opposite is '{@link etlMetaModel.MofTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Elements</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getMofType_TypedElements()
	 * @see etlMetaModel.MofTypedElement#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<MofTypedElement> getTypedElements();

} // MofType
