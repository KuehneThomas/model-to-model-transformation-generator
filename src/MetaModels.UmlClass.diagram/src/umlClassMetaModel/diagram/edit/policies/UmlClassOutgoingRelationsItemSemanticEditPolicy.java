/*
 * 
 */
package umlClassMetaModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class UmlClassOutgoingRelationsItemSemanticEditPolicy
		extends
		umlClassMetaModel.diagram.edit.policies.UmlClassMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UmlClassOutgoingRelationsItemSemanticEditPolicy() {
		super(
				umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassOutgoingRelations_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
