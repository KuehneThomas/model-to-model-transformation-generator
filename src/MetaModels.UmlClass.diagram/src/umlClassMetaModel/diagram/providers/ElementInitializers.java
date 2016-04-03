/*
 * 
 */
package umlClassMetaModel.diagram.providers;

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
		ElementInitializers cached = umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
