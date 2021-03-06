/*
 * 
 */
package umlClassMetaModel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class UmlClassOutgoingRelationsReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public UmlClassOutgoingRelationsReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof umlClassMetaModel.UmlClass) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof umlClassMetaModel.UmlAssociation && newEnd instanceof umlClassMetaModel.UmlClass)) {
			return false;
		}
		return umlClassMetaModel.diagram.edit.policies.UmlClassMetaModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistUmlClassOutgoingRelations_4001(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof umlClassMetaModel.UmlAssociation && newEnd instanceof umlClassMetaModel.UmlAssociation)) {
			return false;
		}
		return umlClassMetaModel.diagram.edit.policies.UmlClassMetaModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistUmlClassOutgoingRelations_4001(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getOutgoingRelations().remove(getOldTarget());
		getNewSource().getOutgoingRelations().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getOutgoingRelations().remove(getOldTarget());
		getOldSource().getOutgoingRelations().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected umlClassMetaModel.UmlClass getOldSource() {
		return (umlClassMetaModel.UmlClass) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected umlClassMetaModel.UmlClass getNewSource() {
		return (umlClassMetaModel.UmlClass) newEnd;
	}

	/**
	 * @generated
	 */
	protected umlClassMetaModel.UmlAssociation getOldTarget() {
		return (umlClassMetaModel.UmlAssociation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected umlClassMetaModel.UmlAssociation getNewTarget() {
		return (umlClassMetaModel.UmlAssociation) newEnd;
	}
}
