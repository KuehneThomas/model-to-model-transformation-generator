/*
 * 
 */
package relationalMetaModel.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class RelationalMetaModelEditPartProvider extends
		DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public RelationalMetaModelEditPartProvider() {
		super(
				new relationalMetaModel.diagram.edit.parts.RelationalMetaModelEditPartFactory(),
				relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry.TYPED_INSTANCE,
				relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.MODEL_ID);
	}

}
