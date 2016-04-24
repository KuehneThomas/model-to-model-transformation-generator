package epsilonExecuter.executers.ewl.interfaces;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.models.IModel;

import epsilonExecuter.executers.base.interfaces.IEpsilonExecuter;

public interface IEwlExecuter extends IEpsilonExecuter {
	IModel getModel();

	Boolean applicableTo(EObject element) throws EolRuntimeException;

	Object execute(EObject element, Map<String, Object> variables) throws EolRuntimeException;
}
