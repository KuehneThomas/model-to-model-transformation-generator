/*
 * 
 */
package relationalMetaModel.diagram.preferences;

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
		relationalMetaModel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		relationalMetaModel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		relationalMetaModel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		relationalMetaModel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		relationalMetaModel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return relationalMetaModel.diagram.part.RelationalMetaModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
