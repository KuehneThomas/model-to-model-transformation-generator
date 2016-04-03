/*
 * 
 */
package relationalMetaModel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class RelationalMetaModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem) {
			relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem item = (relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
