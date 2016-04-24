package transformationGenerator.fitness.interfaces;

import java.util.List;

import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.main.ManuallyCreatedExampleModelPair;
import transformationGenerator.population.interfaces.IIndividual;

public interface IFitnessEvaluator {
	
	double getMaximumFitness();

	void evaluateFitness(IIndividual individual, List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, IModel emptyOutputModelBlueprint, IFitnessFunction fitnessFunction) throws Exception;

	double evaluateFitness(IModel manuallyCreatedOutputModel, IModel outputModelOfIndividual, IFitnessFunction fitnessFunction);

}
