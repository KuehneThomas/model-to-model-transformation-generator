/*
 * 
 */
package relationalMetaModel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RelationalMetaModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "MetaModels.Relational.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.MODEL_ID
					.equals(view.getType())) {
				return relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
				.getRelationalSchema().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((relationalMetaModel.RelationalSchema) domainElement)) {
			return relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getModelID(containerView);
		if (!relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"relationalMetaModel".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
			if (relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
					.getRelationalTable().isSuperTypeOf(domainElement.eClass())) {
				return relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID;
			}
			break;
		case relationalMetaModel.diagram.edit.parts.RelationalTableRelationalTableForeignKeysCompartmentEditPart.VISUAL_ID:
			if (relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
					.getRelationalForeignKey().isSuperTypeOf(
							domainElement.eClass())) {
				return relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getModelID(containerView);
		if (!relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"relationalMetaModel".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
			if (relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID:
			if (relationalMetaModel.diagram.edit.parts.RelationalTableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (relationalMetaModel.diagram.edit.parts.RelationalTableRelationalTableForeignKeysCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
			if (relationalMetaModel.diagram.edit.parts.RelationalForeignKeyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case relationalMetaModel.diagram.edit.parts.RelationalTableRelationalTableForeignKeysCompartmentEditPart.VISUAL_ID:
			if (relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyReferencedTableEditPart.VISUAL_ID:
			if (relationalMetaModel.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			relationalMetaModel.RelationalSchema element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case relationalMetaModel.diagram.edit.parts.RelationalTableRelationalTableForeignKeysCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
			return false;
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
