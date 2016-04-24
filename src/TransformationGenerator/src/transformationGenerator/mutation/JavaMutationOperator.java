package transformationGenerator.mutation;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.population.interfaces.IChangeLogEntry;
import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;

public abstract class JavaMutationOperator<T extends EObject, O extends IMutationOption> extends MutationOperator {

	private Class<T> clazzT;
	private Class<O> clazzO;
	protected JavaMutation javaMutation;

	protected JavaMutationOperator(ILogger logger, IPrettyPrinter prettyPrinter, IModelFactory modelFactory, IRandomizer randomizer, Class<T> clazzT, Class<O> clazzO) throws URISyntaxException, Exception {
		super(logger, prettyPrinter, modelFactory, randomizer);
		this.clazzT = clazzT;
		this.clazzO = clazzO;
		this.javaMutation = new JavaMutation();
	}

	@Override
	public List<IMutationOption> getMutationOptions(IModel model, EObject element) throws Exception {
		if (!clazzT.isAssignableFrom(element.getClass())) {
			return new ArrayList<IMutationOption>();
		}

		@SuppressWarnings("unchecked")
		T t = (T) element;

		return getMutationOptionsInternal(model, t);
	}

	protected abstract List<IMutationOption> getMutationOptionsInternal(IModel model, T element) throws Exception;

	@SuppressWarnings("unchecked")
	@Override
	public IChangeLogEntry mutate(IMutationOption mutationOption) throws Exception {

		if (!clazzO.isAssignableFrom(mutationOption.getClass())) {
			throw new Exception("mutationOption was not of the expected type or null");
		}

		if (mutationOption.getMutationOperator() != this) {
			throw new Exception("mutationOption was created by another mutation operator!");
		}

		O oMutationOption = (O) mutationOption;

		String variablesLogEntry = mutationOption.toString();
		logMutation(mutationOption.getElement(), variablesLogEntry);

		T element = (T) mutationOption.getElement();
		mutate(element, oMutationOption);
		
		cleanupModelAfterMutation(mutationOption.getModel());

		return createChangeLogEntry(variablesLogEntry);
	}

	protected abstract void mutate(T element, O mutationOption);

}
