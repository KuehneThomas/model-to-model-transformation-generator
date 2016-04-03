/*
 * 
 */
package relationalMetaModel.diagram.part;

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
public class RelationalMetaModelPaletteFactory {

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
				relationalMetaModel.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createRelationalForeignKey1CreationTool());
		paletteContainer.add(createRelationalTable2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				relationalMetaModel.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createReferencedTable1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationalForeignKey1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				relationalMetaModel.diagram.part.Messages.RelationalForeignKey1CreationTool_title,
				relationalMetaModel.diagram.part.Messages.RelationalForeignKey1CreationTool_desc,
				Collections
						.singletonList(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKey_3001));
		entry.setId("createRelationalForeignKey1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
				.getImageDescriptor(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKey_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationalTable2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				relationalMetaModel.diagram.part.Messages.RelationalTable2CreationTool_title,
				relationalMetaModel.diagram.part.Messages.RelationalTable2CreationTool_desc,
				Collections
						.singletonList(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalTable_2001));
		entry.setId("createRelationalTable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
				.getImageDescriptor(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalTable_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReferencedTable1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				relationalMetaModel.diagram.part.Messages.ReferencedTable1CreationTool_title,
				relationalMetaModel.diagram.part.Messages.ReferencedTable1CreationTool_desc,
				Collections
						.singletonList(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKeyReferencedTable_4001));
		entry.setId("createReferencedTable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
				.getImageDescriptor(relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes.RelationalForeignKeyReferencedTable_4001));
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
