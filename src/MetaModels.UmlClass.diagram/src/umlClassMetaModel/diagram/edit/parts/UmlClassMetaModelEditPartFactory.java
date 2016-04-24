/*
 * 
 */
package umlClassMetaModel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class UmlClassMetaModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getVisualID(view)) {

			case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart(
						view);

			case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.UmlClassEditPart(
						view);

			case umlClassMetaModel.diagram.edit.parts.UmlClassNameEditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.UmlClassNameEditPart(
						view);

			case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart(
						view);

			case umlClassMetaModel.diagram.edit.parts.UmlAssociationNameEditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.UmlAssociationNameEditPart(
						view);

			case umlClassMetaModel.diagram.edit.parts.UmlClassOutgoingRelationsEditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.UmlClassOutgoingRelationsEditPart(
						view);

			case umlClassMetaModel.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case umlClassMetaModel.diagram.edit.parts.UmlClassIncomingRelationsEditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.UmlClassIncomingRelationsEditPart(
						view);

			case umlClassMetaModel.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new umlClassMetaModel.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
