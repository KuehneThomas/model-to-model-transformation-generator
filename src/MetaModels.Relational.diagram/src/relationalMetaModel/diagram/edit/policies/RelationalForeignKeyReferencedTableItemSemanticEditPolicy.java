/*
 * 
 */
package relationalMetaModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class RelationalForeignKeyReferencedTableItemSemanticEditPolicy
		extends
		relationalMetaModel.diagram.edit.policies.RelationalMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationalForeignKeyReferencedTableItemSemanticEditPolicy() {
		super(
				relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKeyReferencedTable_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
