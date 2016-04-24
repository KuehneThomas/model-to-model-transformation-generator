package transformationGenerator.mutation;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.population.ChangeLogEntry;
import common.emf.interfaces.IModelFactory;
import common.util.Throwables;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;

public abstract class MutationOperator implements IMutationOperator {
	protected final ILogger logger;
	protected final IPrettyPrinter prettyPrinter;
	private IModelFactory modelFactory;
	protected IRandomizer randomizer;
	protected Mutation mutation;

	protected MutationOperator(ILogger logger, IPrettyPrinter prettyPrinter, IModelFactory modelFactory, IRandomizer randomizer) throws URISyntaxException, Exception {
		this.logger = logger.initialize(this.getClass());
		this.prettyPrinter = prettyPrinter;
		this.modelFactory = modelFactory;
		this.randomizer = randomizer;
		this.mutation = new Mutation();
	}

	@Override
	public List<IMutationOption> getMutationOptions(IModel model) throws Exception {
		@SuppressWarnings("unchecked")
		Collection<EObject> elements = new ArrayList<EObject>((Collection<? extends EObject>) model.allContents());
		return elements.stream()
				.flatMap(element -> Throwables.propagate(() -> this.getMutationOptions(model, element).stream()))
				.collect(Collectors.toList());
	}

	protected void logMutation(EObject element, String variablesLogEntry) {
		logger.LogTrace("execute", "on {} with {}", element.eClass().getName(), variablesLogEntry);
	}

	protected ChangeLogEntry createChangeLogEntry(String variablesLogEntry) {
		return new ChangeLogEntry(String.format("Mutation %s applied with parameters: %s", this.getClass().getName(), variablesLogEntry));
	}
	
	protected void cleanupModelAfterMutation(IModel model) throws Exception {
		// cleanup: remove everything but the root element to avoid memory leaks
		EmfModel emfModel = (EmfModel) model;
		for (EObject eObject : emfModel.getResource().getContents().toArray(new EObject[0])) {
			if (!eObject.eClass().getName().equals("EtlModule")) {
				emfModel.getResource().getContents().remove(eObject);
			}
		}

		modelFactory.reinitializeCache(model); // cleans up model.allContents()
	}

	@Override
	public void dispose() {
	}
}
