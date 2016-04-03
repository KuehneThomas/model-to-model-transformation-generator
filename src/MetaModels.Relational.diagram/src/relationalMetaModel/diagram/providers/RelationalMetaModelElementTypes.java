/*
 * 
 */
package relationalMetaModel.diagram.providers;

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
public class RelationalMetaModelElementTypes {

	/**
	 * @generated
	 */
	private RelationalMetaModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType RelationalSchema_1000 = getElementType("MetaModels.Relational.diagram.RelationalSchema_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationalTable_2001 = getElementType("MetaModels.Relational.diagram.RelationalTable_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationalForeignKey_3001 = getElementType("MetaModels.Relational.diagram.RelationalForeignKey_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationalForeignKeyReferencedTable_4001 = getElementType("MetaModels.Relational.diagram.RelationalForeignKeyReferencedTable_4001"); //$NON-NLS-1$

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

			elements.put(RelationalSchema_1000,
					relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
							.getRelationalSchema());

			elements.put(RelationalTable_2001,
					relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
							.getRelationalTable());

			elements.put(RelationalForeignKey_3001,
					relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
							.getRelationalForeignKey());

			elements.put(RelationalForeignKeyReferencedTable_4001,
					relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
							.getRelationalForeignKey_ReferencedTable());
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
			KNOWN_ELEMENT_TYPES.add(RelationalSchema_1000);
			KNOWN_ELEMENT_TYPES.add(RelationalTable_2001);
			KNOWN_ELEMENT_TYPES.add(RelationalForeignKey_3001);
			KNOWN_ELEMENT_TYPES.add(RelationalForeignKeyReferencedTable_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
			return RelationalSchema_1000;
		case relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID:
			return RelationalTable_2001;
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
			return RelationalForeignKey_3001;
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyReferencedTableEditPart.VISUAL_ID:
			return RelationalForeignKeyReferencedTable_4001;
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
			return relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
