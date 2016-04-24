package transformationGenerator.mutation.interfaces;

import transformationGenerator.mutation.strategies.SelectOperatorFirstAndThenAnOption;
import transformationGenerator.mutation.strategies.SelectOptionFromAllPossibleDirectly;

public interface IMutationStrategyFactory {
	SelectOperatorFirstAndThenAnOption createSelectOperatorFirstAndThenAnOption();
	SelectOptionFromAllPossibleDirectly createSelectOptionFromAllPossibleDirectly();
}
