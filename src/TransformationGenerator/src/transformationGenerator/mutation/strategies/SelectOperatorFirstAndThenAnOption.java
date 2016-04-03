package transformationGenerator.mutation.strategies;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import common.util.interfaces.IRandomizer;
import common.util.Throwables;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.population.interfaces.IIndividual;

public class SelectOperatorFirstAndThenAnOption implements IMutationStrategy {

	@Override
	public IMutationOption getMutationOption(IIndividual individual, Set<IMutationOperator> mutationOperators, IRandomizer randomizer) {
		Map<Object, List<IMutationOption>> mutationOptionsByOperator = mutationOperators.stream()
				.flatMap(mutationOperator -> Throwables.propagate(() -> mutationOperator.getMutationOptions(individual.getGenotype()).stream()))
				.collect(Collectors.toList()).stream()
				.collect(Collectors.groupingBy(IMutationOption::getMutationOperator));

		// randomly select an operator
		List<IMutationOption> mutationOptions = mutationOptionsByOperator.get(randomizer.getRandomElementFrom(mutationOptionsByOperator.keySet()));

		// randomly select one
		IMutationOption mutationOption = randomizer.getRandomElementFrom(mutationOptions);

		return mutationOption;
	}
	
	@Override
	public String toString() {
		return "Option -> Option";
	}

}
