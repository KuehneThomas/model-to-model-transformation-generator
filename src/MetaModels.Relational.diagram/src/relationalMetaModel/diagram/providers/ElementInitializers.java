/*
 * 
 */
package relationalMetaModel.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
