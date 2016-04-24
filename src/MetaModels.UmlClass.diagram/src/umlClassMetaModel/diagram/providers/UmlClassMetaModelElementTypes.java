/*
 * 
 */
package umlClassMetaModel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class UmlClassMetaModelElementTypes {

	/**
	 * @generated
	 */
	private UmlClassMetaModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType UmlPackage_1000 = getElementType("MetaModels.UmlClass.diagram.UmlPackage_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UmlClass_2001 = getElementType("MetaModels.UmlClass.diagram.UmlClass_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UmlAssociation_2002 = getElementType("MetaModels.UmlClass.diagram.UmlAssociation_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UmlClassOutgoingRelations_4001 = getElementType("MetaModels.UmlClass.diagram.UmlClassOutgoingRelations_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UmlClassIncomingRelations_4002 = getElementType("MetaModels.UmlClass.diagram.UmlClassIncomingRelations_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UmlPackage_1000,
					umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
							.getUmlPackage());

			elements.put(UmlClass_2001,
					umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
							.getUmlClass());

			elements.put(UmlAssociation_2002,
					umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
							.getUmlAssociation());

			elements.put(UmlClassOutgoingRelations_4001,
					umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
							.getUmlClass_OutgoingRelations());

			elements.put(UmlClassIncomingRelations_4002,
					umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
							.getUmlClass_IncomingRelations());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UmlPackage_1000);
			KNOWN_ELEMENT_TYPES.add(UmlClass_2001);
			KNOWN_ELEMENT_TYPES.add(UmlAssociation_2002);
			KNOWN_ELEMENT_TYPES.add(UmlClassOutgoingRelations_4001);
			KNOWN_ELEMENT_TYPES.add(UmlClassIncomingRelations_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
			return UmlPackage_1000;
		case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
			return UmlClass_2001;
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
			return UmlAssociation_2002;
		case umlClassMetaModel.diagram.edit.parts.UmlClassOutgoingRelationsEditPart.VISUAL_ID:
			return UmlClassOutgoingRelations_4001;
		case umlClassMetaModel.diagram.edit.parts.UmlClassIncomingRelationsEditPart.VISUAL_ID:
			return UmlClassIncomingRelations_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
