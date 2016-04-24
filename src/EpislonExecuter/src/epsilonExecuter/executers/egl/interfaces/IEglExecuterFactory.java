package epsilonExecuter.executers.egl.interfaces;

import org.eclipse.epsilon.eol.models.IModel;

import common.util.interfaces.IStringResource;

public interface IEglExecuterFactory {
	IEglExecuter create(IStringResource source, final IModel mModel) throws Exception;
}
