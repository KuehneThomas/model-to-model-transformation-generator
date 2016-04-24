/*
 * 
 */
package umlClassMetaModel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class UmlClassMetaModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
			return getUmlPackage_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelNodeDescriptor> getUmlPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		umlClassMetaModel.UmlPackage modelElement = (umlClassMetaModel.UmlPackage) view
				.getElement();
		LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelNodeDescriptor> result = new LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClasses().iterator(); it
				.hasNext();) {
			umlClassMetaModel.UmlClass childElement = (umlClassMetaModel.UmlClass) it
					.next();
			int visualID = umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID) {
				result.add(new umlClassMetaModel.diagram.part.UmlClassMetaModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAssociations().iterator(); it
				.hasNext();) {
			umlClassMetaModel.UmlAssociation childElement = (umlClassMetaModel.UmlAssociation) it
					.next();
			int visualID = umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID) {
				result.add(new umlClassMetaModel.diagram.part.UmlClassMetaModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case umlClassMetaModel.diagram.edit.parts.UmlPackageEditPart.VISUAL_ID:
			return getUmlPackage_1000ContainedLinks(view);
		case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
			return getUmlClass_2001ContainedLinks(view);
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
			return getUmlAssociation_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
			return getUmlClass_2001IncomingLinks(view);
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
			return getUmlAssociation_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case umlClassMetaModel.diagram.edit.parts.UmlClassEditPart.VISUAL_ID:
			return getUmlClass_2001OutgoingLinks(view);
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationEditPart.VISUAL_ID:
			return getUmlAssociation_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getUmlPackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getUmlClass_2001ContainedLinks(
			View view) {
		umlClassMetaModel.UmlClass modelElement = (umlClassMetaModel.UmlClass) view
				.getElement();
		LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> result = new LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_UmlClass_OutgoingRelations_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_UmlClass_IncomingRelations_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getUmlAssociation_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getUmlClass_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getUmlAssociation_2002IncomingLinks(
			View view) {
		umlClassMetaModel.UmlAssociation modelElement = (umlClassMetaModel.UmlAssociation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> result = new LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_UmlClass_OutgoingRelations_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_UmlClass_IncomingRelations_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getUmlClass_2001OutgoingLinks(
			View view) {
		umlClassMetaModel.UmlClass modelElement = (umlClassMetaModel.UmlClass) view
				.getElement();
		LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> result = new LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_UmlClass_OutgoingRelations_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_UmlClass_IncomingRelations_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getUmlAssociation_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getIncomingFeatureModelFacetLinks_UmlClass_OutgoingRelations_4001(
			umlClassMetaModel.UmlAssociation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> result = new LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
					.getUmlClass_OutgoingRelations()) {
				result.add(new umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor(
						setting.getEObject(),
						target,
						umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassOutgoingRelations_4001,
						umlClassMetaModel.diagram.edit.parts.UmlClassOutgoingRelationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getIncomingFeatureModelFacetLinks_UmlClass_IncomingRelations_4002(
			umlClassMetaModel.UmlAssociation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> result = new LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
					.getUmlClass_IncomingRelations()) {
				result.add(new umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor(
						setting.getEObject(),
						target,
						umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassIncomingRelations_4002,
						umlClassMetaModel.diagram.edit.parts.UmlClassIncomingRelationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_UmlClass_OutgoingRelations_4001(
			umlClassMetaModel.UmlClass source) {
		LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> result = new LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getOutgoingRelations()
				.iterator(); destinations.hasNext();) {
			umlClassMetaModel.UmlAssociation destination = (umlClassMetaModel.UmlAssociation) destinations
					.next();
			result.add(new umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor(
					source,
					destination,
					umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassOutgoingRelations_4001,
					umlClassMetaModel.diagram.edit.parts.UmlClassOutgoingRelationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_UmlClass_IncomingRelations_4002(
			umlClassMetaModel.UmlClass source) {
		LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> result = new LinkedList<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getIncomingRelations()
				.iterator(); destinations.hasNext();) {
			umlClassMetaModel.UmlAssociation destination = (umlClassMetaModel.UmlAssociation) destinations
					.next();
			result.add(new umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor(
					source,
					destination,
					umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassIncomingRelations_4002,
					umlClassMetaModel.diagram.edit.parts.UmlClassIncomingRelationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<umlClassMetaModel.diagram.part.UmlClassMetaModelNodeDescriptor> getSemanticChildren(
				View view) {
			return UmlClassMetaModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getContainedLinks(
				View view) {
			return UmlClassMetaModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getIncomingLinks(
				View view) {
			return UmlClassMetaModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<umlClassMetaModel.diagram.part.UmlClassMetaModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return UmlClassMetaModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
