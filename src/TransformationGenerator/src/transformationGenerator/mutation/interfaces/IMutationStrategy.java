package transformationGenerator.mutation.interfaces;

import java.util.Set;

import transformationGenerator.population.interfaces.IIndividual;
import common.util.interfaces.IRandomizer;

public interface IMutationStrategy {
	IMutationOption getMutationOption(IIndividual individual, Set<IMutationOperator> mutationOperators, IRandomizer randomizer);
}
