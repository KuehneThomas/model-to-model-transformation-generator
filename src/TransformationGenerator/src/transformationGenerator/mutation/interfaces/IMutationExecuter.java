package transformationGenerator.mutation.interfaces;

import java.util.List;

import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.fitness.interfaces.IFitnessEvaluator;
import transformationGenerator.main.ManuallyCreatedExampleModelPair;
import transformationGenerator.population.interfaces.IIndividual;

public interface IMutationExecuter {
	
	void removeEverythingNotChangingTheFitness(IIndividual individual, IFitnessEvaluator fitnessEvaluator, List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, IModel emptyOutputModelBlueprint, IFitnessFunction fitnessFunction) throws Exception;

	void applyMutation(IIndividual individual, IMutationStrategy mutationStrategy) throws Exception;

	void applyMutationAndEvaluateFitness(IIndividual individual, IFitnessEvaluator fitnessEvaluator, List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, IModel emptyOutputModelBlueprint, IFitnessFunction fitnessFunction, IMutationStrategy mutationStrategy);

}
