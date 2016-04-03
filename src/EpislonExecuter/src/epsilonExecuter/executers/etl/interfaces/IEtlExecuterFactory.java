package epsilonExecuter.executers.etl.interfaces;

import org.eclipse.epsilon.eol.models.IModel;

import com.google.inject.assistedinject.Assisted;
import common.util.interfaces.IStringResource;

public interface IEtlExecuterFactory {
	IEtlExecuter create(IStringResource transformationSource, @Assisted("sourceModel") final IModel sourceModel, @Assisted("targetModel") final IModel targetModel) throws Exception;
}
