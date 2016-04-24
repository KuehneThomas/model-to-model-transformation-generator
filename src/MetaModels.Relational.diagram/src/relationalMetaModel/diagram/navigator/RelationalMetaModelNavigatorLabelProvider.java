/*
 * 
 */
package relationalMetaModel.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class RelationalMetaModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem
				&& !isOwnView(((relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorGroup) {
			relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorGroup group = (relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorGroup) element;
			return relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem) {
			relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem navigatorItem = (relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?relationalMetaModel?RelationalSchema", relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalSchema_1000); //$NON-NLS-1$
		case relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?relationalMetaModel?RelationalTable", relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalTable_2001); //$NON-NLS-1$
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?relationalMetaModel?RelationalForeignKey", relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKey_3001); //$NON-NLS-1$
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyReferencedTableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?relationalMetaModel?RelationalForeignKey?ReferencedTable", relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKeyReferencedTable_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
						.isKnownElementType(elementType)) {
			image = relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorGroup) {
			relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorGroup group = (relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem) {
			relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem navigatorItem = (relationalMetaModel.diagram.navigator.RelationalMetaModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
			return getRelationalSchema_1000Text(view);
		case relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID:
			return getRelationalTable_2001Text(view);
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
			return getRelationalForeignKey_3001Text(view);
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyReferencedTableEditPart.VISUAL_ID:
			return getRelationalForeignKeyReferencedTable_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRelationalSchema_1000Text(View view) {
		relationalMetaModel.RelationalSchema domainModelElement = (relationalMetaModel.RelationalSchema) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationalTable_2001Text(View view) {
		IParser parser = relationalMetaModel.diagram.providers.RelationalMetaModelParserProvider
				.getParser(
						relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalTable_2001,
						view.getElement() != null ? view.getElement() : view,
						relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
								.getType(relationalMetaModel.diagram.edit.parts.RelationalTableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationalForeignKey_3001Text(View view) {
		IParser parser = relationalMetaModel.diagram.providers.RelationalMetaModelParserProvider
				.getParser(
						relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKey_3001,
						view.getElement() != null ? view.getElement() : view,
						relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
								.getType(relationalMetaModel.diagram.edit.parts.RelationalForeignKeyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationalForeignKeyReferencedTable_4001Text(View view) {
		IParser parser = relationalMetaModel.diagram.providers.RelationalMetaModelParserProvider
				.getParser(
						relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKeyReferencedTable_4001,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.MODEL_ID
				.equals(relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
						.getModelID(view));
	}

}
