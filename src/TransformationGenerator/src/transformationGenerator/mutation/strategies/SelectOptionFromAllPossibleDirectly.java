package transformationGenerator.mutation.strategies;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import common.util.interfaces.IRandomizer;
import common.util.Throwables;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.population.interfaces.IIndividual;

public class SelectOptionFromAllPossibleDirectly implements IMutationStrategy {

	@Override
	public IMutationOption getMutationOption(IIndividual individual, Set<IMutationOperator> mutationOperators, IRandomizer randomizer) {
		List<IMutationOption> mutationOptions = mutationOperators.stream()
				.flatMap(mutationOperator -> Throwables.propagate(() -> mutationOperator.getMutationOptions(individual.getGenotype()).stream()))
				.collect(Collectors.toList());

		// randomly select one
		IMutationOption mutationOption = randomizer.getRandomElementFrom(mutationOptions);
		return mutationOption;
	}
	
	@Override
	public String toString() {
		return "Option";
	}

}
