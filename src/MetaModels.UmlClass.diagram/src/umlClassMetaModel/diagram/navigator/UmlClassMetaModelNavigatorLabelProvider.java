/*
 * 
 */
package umlClassMetaModel.diagram.navigator;

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
public class UmlClassMetaModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem
				&& !isOwnView(((umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem) element)
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
		if (element instanceof umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorGroup) {
			umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorGroup group = (umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorGroup) element;
			return umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem) {
			umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem navigatorItem = (umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem) element;
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
		switch (umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?umlClassMetaModel?UmlPackage", umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlPackage_1000); //$NON-NLS-1$
		case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?umlClassMetaModel?UmlClass", umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClass_2001); //$NON-NLS-1$
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?umlClassMetaModel?UmlAssociation", umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlAssociation_2002); //$NON-NLS-1$
		case umlClassMetaModel.diagram.edit.parts.UmlClassOutgoingRelationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?umlClassMetaModel?UmlClass?outgoingRelations", umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassOutgoingRelations_4001); //$NON-NLS-1$
		case umlClassMetaModel.diagram.edit.parts.UmlClassIncomingRelationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?umlClassMetaModel?UmlClass?incomingRelations", umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassIncomingRelations_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
						.isKnownElementType(elementType)) {
			image = umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
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
		if (element instanceof umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorGroup) {
			umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorGroup group = (umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem) {
			umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem navigatorItem = (umlClassMetaModel.diagram.navigator.UmlClassMetaModelNavigatorItem) element;
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
		switch (umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
			return getUmlPackage_1000Text(view);
		case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
			return getUmlClass_2001Text(view);
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
			return getUmlAssociation_2002Text(view);
		case umlClassMetaModel.diagram.edit.parts.UmlClassOutgoingRelationsEditPart.VISUAL_ID:
			return getUmlClassOutgoingRelations_4001Text(view);
		case umlClassMetaModel.diagram.edit.parts.UmlClassIncomingRelationsEditPart.VISUAL_ID:
			return getUmlClassIncomingRelations_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getUmlPackage_1000Text(View view) {
		umlClassMetaModel.UmlPackage domainModelElement = (umlClassMetaModel.UmlPackage) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUmlClass_2001Text(View view) {
		IParser parser = umlClassMetaModel.diagram.providers.UmlClassMetaModelParserProvider
				.getParser(
						umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClass_2001,
						view.getElement() != null ? view.getElement() : view,
						umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
								.getType(umlClassMetaModel.diagram.edit.parts.UmlClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUmlAssociation_2002Text(View view) {
		IParser parser = umlClassMetaModel.diagram.providers.UmlClassMetaModelParserProvider
				.getParser(
						umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlAssociation_2002,
						view.getElement() != null ? view.getElement() : view,
						umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
								.getType(umlClassMetaModel.diagram.edit.parts.UmlAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUmlClassOutgoingRelations_4001Text(View view) {
		IParser parser = umlClassMetaModel.diagram.providers.UmlClassMetaModelParserProvider
				.getParser(
						umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassOutgoingRelations_4001,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUmlClassIncomingRelations_4002Text(View view) {
		IParser parser = umlClassMetaModel.diagram.providers.UmlClassMetaModelParserProvider
				.getParser(
						umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassIncomingRelations_4002,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
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
		return umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.MODEL_ID
				.equals(umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
						.getModelID(view));
	}

}
