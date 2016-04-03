/*
 * 
 */
package umlClassMetaModel.diagram.part;

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
public class UmlClassMetaModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "MetaModels.UmlClass.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.MODEL_ID
					.equals(view.getType())) {
				return umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
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
				umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
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
		if (umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
				.getUmlPackage().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((umlClassMetaModel.UmlPackage) domainElement)) {
			return umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID;
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
		String containerModelID = umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
				.getModelID(containerView);
		if (!umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"umlClassMetaModel".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
			if (umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
					.getUmlClass().isSuperTypeOf(domainElement.eClass())) {
				return umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID;
			}
			if (umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
					.getUmlAssociation().isSuperTypeOf(domainElement.eClass())) {
				return umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
				.getModelID(containerView);
		if (!umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"umlClassMetaModel".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
			if (umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
			if (umlClassMetaModel.diagram.edit.parts.UmlClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
			if (umlClassMetaModel.diagram.edit.parts.UmlAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case umlClassMetaModel.diagram.edit.parts.UmlClassOutgoingRelationsEditPart.VISUAL_ID:
			if (umlClassMetaModel.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case umlClassMetaModel.diagram.edit.parts.UmlClassIncomingRelationsEditPart.VISUAL_ID:
			if (umlClassMetaModel.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(umlClassMetaModel.UmlPackage element) {
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
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
			return false;
		case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
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
			return umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
