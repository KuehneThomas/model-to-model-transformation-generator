/*
 * 
 */
package relationalMetaModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RelationalTableRelationalTableForeignKeysCompartmentItemSemanticEditPolicy
		extends
		relationalMetaModel.diagram.edit.policies.RelationalMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationalTableRelationalTableForeignKeysCompartmentItemSemanticEditPolicy() {
		super(
				relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalTable_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKey_3001 == req
				.getElementType()) {
			return getGEFWrapper(new relationalMetaModel.diagram.edit.commands.RelationalForeignKeyCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
