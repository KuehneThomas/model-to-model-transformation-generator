package transformationGenerator.main.interfaces;

import com.google.inject.assistedinject.Assisted;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.main.TransformationGenerationOrchestrator;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.selectionAndReproduction.interfaces.ISelectionAndReplicationAlgorithm;

public interface ITransformationGenerationOrchestratorFactory {
	TransformationGenerationOrchestrator create(ISelectionAndReplicationAlgorithm selectionAndReplicationAlgorithm,
			@Assisted IFitnessFunction fitnessFunction,
			@Assisted IMutationStrategy mutationStrategy,
			@Assisted("maximumPopulationSize") int maximumPopulationSize,
			@Assisted("maximumNumberOfGenerations") int maximumNumberOfGenerations);
}
