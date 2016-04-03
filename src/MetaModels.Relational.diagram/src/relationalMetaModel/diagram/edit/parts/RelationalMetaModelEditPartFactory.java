/*
 * 
 */
package relationalMetaModel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class RelationalMetaModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getVisualID(view)) {

			case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
				return new relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart(
						view);

			case relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID:
				return new relationalMetaModel.diagram.edit.parts.RelationalTableEditPart(
						view);

			case relationalMetaModel.diagram.edit.parts.RelationalTableNameEditPart.VISUAL_ID:
				return new relationalMetaModel.diagram.edit.parts.RelationalTableNameEditPart(
						view);

			case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
				return new relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart(
						view);

			case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyNameEditPart.VISUAL_ID:
				return new relationalMetaModel.diagram.edit.parts.RelationalForeignKeyNameEditPart(
						view);

			case relationalMetaModel.diagram.edit.parts.RelationalTableRelationalTableForeignKeysCompartmentEditPart.VISUAL_ID:
				return new relationalMetaModel.diagram.edit.parts.RelationalTableRelationalTableForeignKeysCompartmentEditPart(
						view);

			case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyReferencedTableEditPart.VISUAL_ID:
				return new relationalMetaModel.diagram.edit.parts.RelationalForeignKeyReferencedTableEditPart(
						view);

			case relationalMetaModel.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new relationalMetaModel.diagram.edit.parts.WrappingLabelEditPart(
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
