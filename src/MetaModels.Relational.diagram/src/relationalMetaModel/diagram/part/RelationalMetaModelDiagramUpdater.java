/*
 * 
 */
package relationalMetaModel.diagram.part;

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
public class RelationalMetaModelDiagramUpdater {

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
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
			return getRelationalSchema_1000SemanticChildren(view);
		case relationalMetaModel.diagram.edit.parts.RelationalTableRelationalTableForeignKeysCompartmentEditPart.VISUAL_ID:
			return getRelationalTableRelationalTableForeignKeysCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor> getRelationalSchema_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		relationalMetaModel.RelationalSchema modelElement = (relationalMetaModel.RelationalSchema) view
				.getElement();
		LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor> result = new LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTables().iterator(); it.hasNext();) {
			relationalMetaModel.RelationalTable childElement = (relationalMetaModel.RelationalTable) it
					.next();
			int visualID = relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID) {
				result.add(new relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor> getRelationalTableRelationalTableForeignKeysCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		relationalMetaModel.RelationalTable modelElement = (relationalMetaModel.RelationalTable) containerView
				.getElement();
		LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor> result = new LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForeignKeys().iterator(); it
				.hasNext();) {
			relationalMetaModel.RelationalForeignKey childElement = (relationalMetaModel.RelationalForeignKey) it
					.next();
			int visualID = relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID) {
				result.add(new relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case relationalMetaModel.diagram.edit.parts.RelationalSchemaEditPart.VISUAL_ID:
			return getRelationalSchema_1000ContainedLinks(view);
		case relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID:
			return getRelationalTable_2001ContainedLinks(view);
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
			return getRelationalForeignKey_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID:
			return getRelationalTable_2001IncomingLinks(view);
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
			return getRelationalForeignKey_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case relationalMetaModel.diagram.edit.parts.RelationalTableEditPart.VISUAL_ID:
			return getRelationalTable_2001OutgoingLinks(view);
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyEditPart.VISUAL_ID:
			return getRelationalForeignKey_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getRelationalSchema_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getRelationalTable_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getRelationalForeignKey_3001ContainedLinks(
			View view) {
		relationalMetaModel.RelationalForeignKey modelElement = (relationalMetaModel.RelationalForeignKey) view
				.getElement();
		LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> result = new LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RelationalForeignKey_ReferencedTable_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getRelationalTable_2001IncomingLinks(
			View view) {
		relationalMetaModel.RelationalTable modelElement = (relationalMetaModel.RelationalTable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> result = new LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RelationalForeignKey_ReferencedTable_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getRelationalForeignKey_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getRelationalTable_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getRelationalForeignKey_3001OutgoingLinks(
			View view) {
		relationalMetaModel.RelationalForeignKey modelElement = (relationalMetaModel.RelationalForeignKey) view
				.getElement();
		LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> result = new LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RelationalForeignKey_ReferencedTable_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getIncomingFeatureModelFacetLinks_RelationalForeignKey_ReferencedTable_4001(
			relationalMetaModel.RelationalTable target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> result = new LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
					.getRelationalForeignKey_ReferencedTable()) {
				result.add(new relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor(
						setting.getEObject(),
						target,
						relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKeyReferencedTable_4001,
						relationalMetaModel.diagram.edit.parts.RelationalForeignKeyReferencedTableEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_RelationalForeignKey_ReferencedTable_4001(
			relationalMetaModel.RelationalForeignKey source) {
		LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> result = new LinkedList<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor>();
		relationalMetaModel.RelationalTable destination = source
				.getReferencedTable();
		if (destination == null) {
			return result;
		}
		result.add(new relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor(
				source,
				destination,
				relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKeyReferencedTable_4001,
				relationalMetaModel.diagram.edit.parts.RelationalForeignKeyReferencedTableEditPart.VISUAL_ID));
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
		public List<relationalMetaModel.diagram.part.RelationalMetaModelNodeDescriptor> getSemanticChildren(
				View view) {
			return RelationalMetaModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getContainedLinks(
				View view) {
			return RelationalMetaModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getIncomingLinks(
				View view) {
			return RelationalMetaModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<relationalMetaModel.diagram.part.RelationalMetaModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return RelationalMetaModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
