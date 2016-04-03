/**
 */
package etlMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Statement Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolStatementBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolStatementBlock()
 * @model
 * @generated
 */
public interface EolStatementBlock extends EolExpressionOrStatementBlock {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.EolStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEolStatementBlock_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EolStatement> getStatements();

} // EolStatementBlock
