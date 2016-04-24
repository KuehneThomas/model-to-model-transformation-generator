/*
 * 
 */
package umlClassMetaModel.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class UmlClassMetaModelCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected umlClassMetaModel.diagram.part.UmlClassMetaModelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected umlClassMetaModel.diagram.part.UmlClassMetaModelCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(umlClassMetaModel.diagram.part.Messages.UmlClassMetaModelCreationWizardTitle);
		setDefaultPageImageDescriptor(umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewUmlClassMetaModelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new umlClassMetaModel.diagram.part.UmlClassMetaModelCreationWizardPage(
				"DiagramModelFile", getSelection(), "umlclassmetamodel_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(umlClassMetaModel.diagram.part.Messages.UmlClassMetaModelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(umlClassMetaModel.diagram.part.Messages.UmlClassMetaModelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new umlClassMetaModel.diagram.part.UmlClassMetaModelCreationWizardPage(
				"DomainModelFile", getSelection(), "umlclassmetamodel") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".umlclassmetamodel_diagram".length()); //$NON-NLS-1$
					setFileName(umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "umlclassmetamodel")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(umlClassMetaModel.diagram.part.Messages.UmlClassMetaModelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(umlClassMetaModel.diagram.part.Messages.UmlClassMetaModelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										umlClassMetaModel.diagram.part.Messages.UmlClassMetaModelCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								umlClassMetaModel.diagram.part.Messages.UmlClassMetaModelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				umlClassMetaModel.diagram.part.UmlClassMetaModelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
