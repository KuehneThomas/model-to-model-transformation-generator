/*
 * 
 */
package umlClassMetaModel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class UmlClassMetaModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem) {
			umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem item = (umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
