package transformationGenerator.selectionAndReproduction;

import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.inject.Inject;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

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

public class RouletteWheelBasedAlgorithm implements ISelectionAndReplicationAlgorithm {

	private ILogger logger;
	private IModelFactory modelFactory;
	private IRandomizer randomizer;
	private IFitnessEvaluator fitnessEvaluator;
	private IMutationExecuter mutationExecuter;

	@Inject
	public RouletteWheelBasedAlgorithm(ILogger logger, IModelFactory modelFactory, IRandomizer randomizer, IFitnessEvaluator fitnessEvaluator, IMutationExecuter mutationExecuter) {
		this.logger = logger;
		this.logger.initialize(RouletteWheelBasedAlgorithm.class);
		this.modelFactory = modelFactory;
		this.randomizer = randomizer;
		this.fitnessEvaluator = fitnessEvaluator;
		this.mutationExecuter = mutationExecuter;
	}

	public void execute(final List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, final IModel emptyOutputModelBlueprint, IPopulation population, IFitnessFunction fitnessFunction, IMutationStrategy mutationStrategy) throws EolModelLoadingException, Exception, ParseException {

		HashSet<IIndividual> bestIndividualsToBeKept = new HashSet<IIndividual>(population.getIndividuals().stream()
				.sorted((IIndividual i1, IIndividual i2) -> Double.compare(i2.getFitness(), i1.getFitness()))
				.limit((100 / population.getIndividuals().size()) * 10)
				.collect(Collectors.toList()));
		int numberOfPicks = population.getMaximumSize() - bestIndividualsToBeKept.size();

		logger.LogInfo("execute", "executing selection based on a fitness proportional list ...", population.getGeneration());
		List<IIndividual> individualFitnessProportionalList = population.getIndividuals().stream()
				.flatMap(individual -> IntStream.range(0, (int) individual.getFitness()).boxed().map(fitnessIndex -> individual).collect(Collectors.toList()).stream())
				.collect(Collectors.toList());

		List<IIndividual> nextGenerationPicks = IntStream.range(0, numberOfPicks)
				.mapToObj(pick -> randomizer.getRandomElementFrom(individualFitnessProportionalList))
				.collect(Collectors.toList());

		logger.LogInfo("execute", "executing reproduction ...", population.getGeneration());
		population.getIndividuals().parallelStream().collect(Collectors.toList()).stream()
				.filter(individual -> !nextGenerationPicks.contains(individual) && !bestIndividualsToBeKept.contains(individual))
				.forEach(individual -> individual.killIndividual(modelFactory));

		HashSet<IIndividual> clonesCreated = new HashSet<IIndividual>();
		nextGenerationPicks.parallelStream().forEach(individual -> {
			try {
				IIndividual individualCloned = individual.cloneIndividual(modelFactory);
				clonesCreated.add(individualCloned);
				individual = individualCloned;
			} catch (Exception ex) {
				logger.LogWarning("Error during clone", "Error: {}, Individual: {}", ex, individual != null && individual.getPhenotpye() != null ? individual.getPhenotpye().getSourceCode() : null);
				population.getIndividuals().remove(individual);
			}

			mutationExecuter.applyMutationAndEvaluateFitness(individual, fitnessEvaluator, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction, mutationStrategy);
		});

		population.getIndividuals().parallelStream().collect(Collectors.toList()).stream()
				.filter(individual -> !clonesCreated.contains(individual) && !bestIndividualsToBeKept.contains(individual))
				.forEach(individual -> individual.killIndividual(modelFactory));

		// elitism!
		// P = C (generational replacement
		// N of the 2N total (truncation replacement)
	}

	@Override
	public String toString() {
		return String.format("RouletteWheelBasedAlgorithm");
	}
}
