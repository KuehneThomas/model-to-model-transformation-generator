package epsilonExecuter.executers.eol.interfaces;

import org.eclipse.epsilon.eol.models.IModel;

import common.util.interfaces.IStringResource;

public interface IEolExecuterFactory {
	IEolExecuter create(IStringResource source, final IModel model) throws Exception;
}
