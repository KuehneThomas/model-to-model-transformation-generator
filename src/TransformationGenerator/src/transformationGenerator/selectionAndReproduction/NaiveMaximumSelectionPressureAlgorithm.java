package transformationGenerator.selectionAndReproduction;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

import com.google.inject.assistedinject.Assisted;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.fitness.interfaces.IFitnessEvaluator;
import transformationGenerator.main.ManuallyCreatedExampleModelPair;
import transformationGenerator.mutation.interfaces.IMutationExecuter;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.population.interfaces.IPopulation;
import transformationGenerator.selectionAndReproduction.interfaces.ISelectionAndReplicationAlgorithm;
import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IRandomizer;

public class NaiveMaximumSelectionPressureAlgorithm implements ISelectionAndReplicationAlgorithm {

	private int minimumPopulationSize;
	private double badFitnessIsBelow;

	private ILogger logger;
	private IModelFactory modelFactory;
	private IRandomizer randomizer;
	private IFitnessEvaluator fitnessEvaluator;
	private IMutationExecuter mutationExecuter;

	@Inject
	public NaiveMaximumSelectionPressureAlgorithm(ILogger logger, IModelFactory modelFactory, IRandomizer randomizer, IFitnessEvaluator fitnessEvaluator, IMutationExecuter mutationExecuter, @Assisted int minimumPopulationSize, @Assisted double badFitnessIsBelow) {
		this.logger = logger;
		this.logger.initialize(NaiveMaximumSelectionPressureAlgorithm.class);
		this.modelFactory = modelFactory;
		this.randomizer = randomizer;
		this.fitnessEvaluator = fitnessEvaluator;
		this.mutationExecuter = mutationExecuter;
		this.minimumPopulationSize = minimumPopulationSize;
		this.badFitnessIsBelow = badFitnessIsBelow;
	}

	public void execute(final List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, final IModel emptyOutputModelBlueprint, IPopulation population, IFitnessFunction fitnessFunction, IMutationStrategy mutationStrategy) throws EolModelLoadingException, Exception, ParseException {
		List<IIndividual> fittestIndividuals = population.getFittestIndividuals();
		if (population.getIndividuals().size() < population.getMaximumSize()) {
			logger.LogInfo("execute", "generation {}: reproducing best individuals ...", population.getGeneration());
			while (population.getIndividuals().size() < population.getMaximumSize()) {

				IIndividual randomFittestIndividual = randomizer.getRandomElementFrom(fittestIndividuals);

				IIndividual individualCloned = null;
				try {
					individualCloned = randomFittestIndividual.cloneIndividual(modelFactory);
				} catch (Exception ex) {
					logger.LogWarning("Error during clone", "Error: {}, Individual: {}", ex, randomFittestIndividual != null && randomFittestIndividual.getPhenotpye() != null ? randomFittestIndividual.getPhenotpye().getSourceCode() : null);
					population.getIndividuals().remove(individualCloned);
				}
			}
		} else {
			logger.LogInfo("execute", "generation {}: reproduction of individuals not possible since the population has its maximum size of {}", population.getGeneration(), population.getMaximumSize());
		}

		logger.LogInfo("generate", "generation {}: mutating & evaluating fitness ...", population.getGeneration());
		population.getIndividuals().stream().collect(Collectors.toList()).parallelStream().filter(individual -> individual != fittestIndividuals.get(0)).forEach(individual -> {
			mutationExecuter.applyMutationAndEvaluateFitness(individual, fitnessEvaluator, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction, mutationStrategy);
		});

		logger.LogInfo("execute", "generation {}: filtering out individuals with bad fitness (<{}), but keeping population size greater than {}...", population.getGeneration(), badFitnessIsBelow, minimumPopulationSize);
		int killedInidividuals = 0;
		for (IIndividual individual : new ArrayList<IIndividual>(population.getIndividuals())) {
			if (individual.getFitness() < badFitnessIsBelow && population.getIndividuals().size() > minimumPopulationSize) {
				individual.killIndividual(modelFactory);
				killedInidividuals++;
			}
		}
		logger.LogInfo("execute", "generation {}: killed {}.", population.getGeneration(), killedInidividuals);
	}

	@Override
	public String toString() {
		return String.format("NaiveMaximumSelectionPressureAlgorithm [minimumPopulationSize=%s,badFitnessIsBelow=%s]", minimumPopulationSize, badFitnessIsBelow);
	}
}
