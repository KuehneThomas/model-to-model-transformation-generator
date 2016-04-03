package transformationGenerator.fitness.functions;

import java.util.Optional;

import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.internal.CachingDistance;
import org.eclipse.emf.ecore.EAttribute;

import common.emf.EmfIdentifierEObjectMatcher;

public class BalancedFitnessFunctionBasedOnStructureAsFallback extends BalancedFitnessFunction {
	@Override
	public IEObjectMatcher createObjectMatcher() {
		// extend content matcher to treat the "Name" attribute as the identity of an object
		final EditionDistance editionDistance = new EditionDistance();
		final CachingDistance cachedDistance = new CachingDistance(editionDistance);
		final IEObjectMatcher contentMatcher = new ProximityEObjectMatcher(cachedDistance);
		IEObjectMatcher matcher = new EmfIdentifierEObjectMatcher(contentMatcher, eObject -> {
			Optional<EAttribute> nameDefinition = eObject.eClass().getEAllAttributes().stream().filter(a -> a.getName().equals("Name")).findFirst();
			if (nameDefinition.isPresent()) {
				Object nameValue = eObject.eGet(nameDefinition.get());
				return nameValue != null ? eObject.eClass().getName() + nameValue.toString() : null;
			} else {
				return null;
			}
		});
		return matcher;
	}

	@Override
	public String toString() {
		return String.format("BalancedFitnessFunctionBasedOnStructureAsFallback[(mofClassFitness * 3 - mofClassError + mofPropertyFitness) / 4.]");
	}

}