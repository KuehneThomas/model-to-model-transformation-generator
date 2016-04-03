package transformationGenerator.fitness.functions;

import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.utils.UseIdentifiers;

public class BalancedFitnessFunctionBasedOnlyOnStructure extends BalancedFitnessFunction {
	@Override
	public IEObjectMatcher createObjectMatcher() {
		// this is the default content matcher:
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
		return matcher;
	}

	@Override
	public String toString() {
		return String.format("BalancedFitnessFunctionBasedOnlyOnStructure[(mofClassFitness * 3 - mofClassError + mofPropertyFitness) / 4.]");
	}

}
