package transformationGenerator.mutation;

import java.net.URISyntaxException;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.population.ChangeLogEntry;
import transformationGenerator.population.interfaces.IChangeLogEntry;

import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;
import common.util.interfaces.IStringResource;

import epsilonExecuter.executers.ewl.interfaces.IEwlExecuter;
import epsilonExecuter.executers.ewl.interfaces.IEwlExecuterFactory;

public abstract class EglMutationOperator extends MutationOperator {

	private IResourceReader resourceReader;
	private IEwlExecuterFactory ewlExecuterFactory;
	private String sourceFileName;
	protected IEwlExecuter ewlExecuter;

	protected EglMutationOperator(ILogger logger, IPrettyPrinter prettyPrinter, IResourceReader resourceReader, IEwlExecuterFactory ewlExecuterFactory, IModelFactory modelFactory, IRandomizer randomizer, String sourceFileName) throws URISyntaxException, Exception {
		super(logger, prettyPrinter, modelFactory, randomizer);
		this.resourceReader = resourceReader;
		this.ewlExecuterFactory = ewlExecuterFactory;
		this.sourceFileName = sourceFileName;
	}

	private IStringResource GetSourceFile(String sourceFileName) throws URISyntaxException {
		IStringResource sourceTextFile = resourceReader.getJarResourceAsStringResource(String.format("resources/mutationOperators/%s.ewl", sourceFileName));
		return sourceTextFile;
	}

	protected Boolean applicableTo(IModel model, EObject element) throws Exception {
		if (ewlExecuter == null) {
			ewlExecuter = ewlExecuterFactory.create(GetSourceFile(sourceFileName), model);
		}
		Boolean applicableTo = ewlExecuter.applicableTo(element);
		if (applicableTo) {
			logger.LogTrace("applicableTo", "{}", element.eClass().getName());
		}
		return applicableTo;
	}

	protected IChangeLogEntry mutateElement(IModel model, EObject element, Map<String, Object> variables) throws Exception {
		String variablesLogEntry = "";
		for (String variableName : variables.keySet()) {
			Object value = variables.get(variableName);
			variablesLogEntry += String.format("%s=%s; ", variableName, value instanceof EObject ? prettyPrinter.ToString((EObject) value) : value.toString());
		}
		logger.LogTrace("execute", "on {} with {}", element.eClass().getName(), variablesLogEntry);

		if (ewlExecuter == null) {
			ewlExecuter = ewlExecuterFactory.create(GetSourceFile(sourceFileName), model);
		}
		ewlExecuter.execute(element, variables);

		cleanupModelAfterMutation(model);

		return new ChangeLogEntry(String.format("Mutation %s applied with parameters: %s", this.getClass().getName(), variablesLogEntry));
	}

	@SuppressWarnings("unchecked")
	protected <T> T getProperty(EObject element, String propertyName) {
		EStructuralFeature propertyDefinition = element.eClass().getEStructuralFeature(propertyName);
		T propertyValue = (T) element.eGet(propertyDefinition);
		return propertyValue;
	}

	@Override
	public void dispose() {
		logger.LogTrace("dispose", "...");
		if (ewlExecuter != null) {
			ewlExecuter.dispose();
		}
	}
}
