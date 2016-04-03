/*
 * 
 */
package umlClassMetaModel.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class UmlClassMetaModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				umlClassMetaModel.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createUmlAssociation1CreationTool());
		paletteContainer.add(createUmlClass2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				umlClassMetaModel.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createIncomingRelations1CreationTool());
		paletteContainer.add(createOutgoingRelations2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUmlAssociation1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				umlClassMetaModel.diagram.part.Messages.UmlAssociation1CreationTool_title,
				umlClassMetaModel.diagram.part.Messages.UmlAssociation1CreationTool_desc,
				Collections
						.singletonList(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlAssociation_2002));
		entry.setId("createUmlAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
				.getImageDescriptor(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlAssociation_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUmlClass2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				umlClassMetaModel.diagram.part.Messages.UmlClass2CreationTool_title,
				umlClassMetaModel.diagram.part.Messages.UmlClass2CreationTool_desc,
				Collections
						.singletonList(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClass_2001));
		entry.setId("createUmlClass2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
				.getImageDescriptor(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClass_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIncomingRelations1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				umlClassMetaModel.diagram.part.Messages.IncomingRelations1CreationTool_title,
				umlClassMetaModel.diagram.part.Messages.IncomingRelations1CreationTool_desc,
				Collections
						.singletonList(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassIncomingRelations_4002));
		entry.setId("createIncomingRelations1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
				.getImageDescriptor(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassIncomingRelations_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutgoingRelations2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				umlClassMetaModel.diagram.part.Messages.OutgoingRelations2CreationTool_title,
				umlClassMetaModel.diagram.part.Messages.OutgoingRelations2CreationTool_desc,
				Collections
						.singletonList(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassOutgoingRelations_4001));
		entry.setId("createOutgoingRelations2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
				.getImageDescriptor(umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes.UmlClassOutgoingRelations_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
