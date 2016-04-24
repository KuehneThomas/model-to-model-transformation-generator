package transformationGenerator.selectionAndReproduction.interfaces;

import java.text.ParseException;
import java.util.List;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.main.ManuallyCreatedExampleModelPair;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.population.interfaces.IPopulation;

public interface ISelectionAndReplicationAlgorithm {
	void execute(final List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, final IModel emptyOutputModelBlueprint, IPopulation population, IFitnessFunction fitnessFunction, IMutationStrategy mutationStrategy) throws EolModelLoadingException, Exception, ParseException;
}
