/**
 */
package etlMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mof Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.MofAssociation#getMemberEnds <em>Member Ends</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getMofAssociation()
 * @model
 * @generated
 */
public interface MofAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Member Ends</b></em>' reference list.
	 * The list contents are of type {@link etlMetaModel.MofProperty}.
	 * It is bidirectional and its opposite is '{@link etlMetaModel.MofProperty#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Ends</em>' reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getMofAssociation_MemberEnds()
	 * @see etlMetaModel.MofProperty#getAssociation
	 * @model opposite="association" lower="2"
	 * @generated
	 */
	EList<MofProperty> getMemberEnds();

} // MofAssociation
