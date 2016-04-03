package transformationGenerator.selectionAndReproduction;

import java.text.ParseException;
import java.util.Comparator;
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

import com.google.inject.assistedinject.Assisted;

import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IRandomizer;

public class TournamentBasedAlgorithm implements ISelectionAndReplicationAlgorithm {

	private final int tournamentSize;

	private ILogger logger;
	private IModelFactory modelFactory;
	private IRandomizer randomizer;
	private IFitnessEvaluator fitnessEvaluator;
	private IMutationExecuter mutationExecuter;

	@Inject
	public TournamentBasedAlgorithm(ILogger logger, IModelFactory modelFactory, IRandomizer randomizer, IFitnessEvaluator fitnessEvaluator, IMutationExecuter mutationExecuter, @Assisted int tournamentSize) {
		this.logger = logger;
		this.logger.initialize(TournamentBasedAlgorithm.class);
		this.modelFactory = modelFactory;
		this.randomizer = randomizer;
		this.fitnessEvaluator = fitnessEvaluator;
		this.mutationExecuter = mutationExecuter;
		this.tournamentSize = tournamentSize;
	}

	public void execute(final List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, final IModel emptyOutputModelBlueprint, IPopulation population, IFitnessFunction fitnessFunction, IMutationStrategy mutationStrategy) throws EolModelLoadingException, Exception, ParseException {
		int tournamentNumber = population.getIndividuals().size() / tournamentSize;
		List<IIndividual> outsideTournament = population.getIndividuals().stream().collect(Collectors.toList());

		logger.LogInfo("execute", "creating tournaments ...", population.getGeneration());
		List<List<IIndividual>> tournaments = IntStream.range(0, tournamentNumber).boxed().map(tn ->
				IntStream.range(0, tournamentSize).boxed().map(tournamentSelection -> {
					IIndividual selectedIndividual = randomizer.getRandomElementFrom(outsideTournament);
					outsideTournament.remove(selectedIndividual);
					return selectedIndividual;
				}).filter(i -> i != null).collect(Collectors.toList())
				).filter(t -> t.size() > 0).collect(Collectors.toList());

		logger.LogInfo("execute", "executing tournaments ...", population.getGeneration());
		tournaments.parallelStream().forEach(tournament -> {

			IIndividual bestInidivdualInTournament = tournament.stream().max(Comparator.comparing(IIndividual::getFitness)).get();
			IIndividual worstInidivdualInTournament = tournament.stream().min(Comparator.comparing(IIndividual::getFitness)).get();

			if (bestInidivdualInTournament != worstInidivdualInTournament) {
				worstInidivdualInTournament.killIndividual(modelFactory);

				try {
					bestInidivdualInTournament.cloneIndividual(modelFactory);
				} catch (Exception ex) {
					logger.LogWarning("Error during clone", "Error: {}, Individual: {}", ex, bestInidivdualInTournament.getPhenotpye().getSourceCode());
				}
			}

			mutationExecuter.applyMutationAndEvaluateFitness(bestInidivdualInTournament, fitnessEvaluator, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction, mutationStrategy);
		});

		// elitism?
		// P = C (generational replacement
		// N of the 2N total (truncation replacement)
	}

	@Override
	public String toString() {
		return String.format("TournamentBasedAlgorithm [tournamentSize=%s]", tournamentSize);
	}
}
