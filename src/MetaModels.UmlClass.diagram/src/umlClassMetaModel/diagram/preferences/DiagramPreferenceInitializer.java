/*
 * 
 */
package umlClassMetaModel.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		umlClassMetaModel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		umlClassMetaModel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		umlClassMetaModel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		umlClassMetaModel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		umlClassMetaModel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
