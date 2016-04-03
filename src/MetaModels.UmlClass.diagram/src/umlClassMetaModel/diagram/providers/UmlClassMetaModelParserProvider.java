/*
 * 
 */
package umlClassMetaModel.diagram.providers;

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
public class UmlClassMetaModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser umlClassName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getUmlClassName_5001Parser() {
		if (umlClassName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
					.getUmlClass_Name() };
			umlClassMetaModel.diagram.parsers.MessageFormatParser parser = new umlClassMetaModel.diagram.parsers.MessageFormatParser(
					features);
			umlClassName_5001Parser = parser;
		}
		return umlClassName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser umlAssociationName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getUmlAssociationName_5002Parser() {
		if (umlAssociationName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { umlClassMetaModel.UmlClassMetaModelPackage.eINSTANCE
					.getUmlAssociation_Name() };
			umlClassMetaModel.diagram.parsers.MessageFormatParser parser = new umlClassMetaModel.diagram.parsers.MessageFormatParser(
					features);
			umlAssociationName_5002Parser = parser;
		}
		return umlAssociationName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case umlClassMetaModel.diagram.edit.parts.UmlClassNameEditPart.VISUAL_ID:
			return getUmlClassName_5001Parser();
		case umlClassMetaModel.diagram.edit.parts.UmlAssociationNameEditPart.VISUAL_ID:
			return getUmlAssociationName_5002Parser();
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
			return getParser(umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(umlClassMetaModel.diagram.part.UmlClassMetaModelVisualIDRegistry
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
			if (umlClassMetaModel.diagram.providers.UmlClassMetaModelElementTypes
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
