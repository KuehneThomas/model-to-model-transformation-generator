/*
 * 
 */
package relationalMetaModel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RelationalMetaModelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser relationalTableName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getRelationalTableName_5002Parser() {
		if (relationalTableName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
					.getRelationalTable_Name() };
			relationalMetaModel.diagram.parsers.MessageFormatParser parser = new relationalMetaModel.diagram.parsers.MessageFormatParser(
					features);
			relationalTableName_5002Parser = parser;
		}
		return relationalTableName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationalForeignKeyName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getRelationalForeignKeyName_5001Parser() {
		if (relationalForeignKeyName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { relationalMetaModel.RelationalMetaModelPackage.eINSTANCE
					.getRelationalForeignKey_Name() };
			relationalMetaModel.diagram.parsers.MessageFormatParser parser = new relationalMetaModel.diagram.parsers.MessageFormatParser(
					features);
			relationalForeignKeyName_5001Parser = parser;
		}
		return relationalForeignKeyName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case relationalMetaModel.diagram.edit.parts.RelationalTableNameEditPart.VISUAL_ID:
			return getRelationalTableName_5002Parser();
		case relationalMetaModel.diagram.edit.parts.RelationalForeignKeyNameEditPart.VISUAL_ID:
			return getRelationalForeignKeyName_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(relationalMetaModel.diagram.part.RelationalMetaModelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (relationalMetaModel.diagram.providers.RelationalMetaModelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
