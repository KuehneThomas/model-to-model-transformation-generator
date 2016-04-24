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
public class UmlClassIncomingRelationsItemSemanticEditPolicy
		extends
		umlClassMetaModel.diagram.edit.policies.UmlClassMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UmlClassIncomingRelationsItemSemanticEditPolicy() {
		super(
				umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassIncomingRelations_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
