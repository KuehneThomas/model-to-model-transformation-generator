package epsilonExecuter.executers.ewl.interfaces;

import org.eclipse.epsilon.eol.models.IModel;

import common.util.interfaces.IStringResource;

public interface IEwlExecuterFactory {
	IEwlExecuter create(IStringResource source, final IModel model) throws Exception;
}
