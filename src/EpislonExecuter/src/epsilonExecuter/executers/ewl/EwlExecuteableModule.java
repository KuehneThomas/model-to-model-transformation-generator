package epsilonExecuter.executers.ewl;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.ewl.EwlModule;
import org.eclipse.epsilon.ewl.EwlWizard;

class EwlExecuteableModule extends EwlModule implements IEolExecutableModule {

	public Boolean applicableTo(EObject element) throws EolRuntimeException {
		for (EwlWizard wizard : templates) {
			if (wizard.appliesTo(element, context)) {
				return true;
			}
		}
		return false;
	}

	public Object execute() throws EolRuntimeException {
		return execute((Map<String, Object>) null);
	}

	public Object execute(Map<String, Object> variables) throws EolRuntimeException {
		prepareContext(getContext(), variables);

		IModel model = this.getContext().getModelRepository().getModelByName("Model");

		for (EObject eObject : model.allContents().toArray(new EObject[0])) {
			for (EwlWizard wizard : templates) {
				if (wizard.appliesTo(eObject, context)) {
					wizard.process(eObject, getContext());
				}
			}
		}

		return getContext();
	}

	public Object execute(EObject eObject, Map<String, Object> variables) throws EolRuntimeException {
		prepareContext(getContext(), variables);

		for (EwlWizard wizard : templates) {
			wizard.process(eObject, getContext());
		}

		return getContext();
	}

	protected void prepareContext(IEolContext context, Map<String, Object> variables) {
		super.prepareContext(context);
		if (variables != null) {
			for (String variableName : variables.keySet()) {
				context.getFrameStack().putGlobal(Variable.createReadOnlyVariable(variableName, variables.get(variableName)));
			}
		}
	}

}
