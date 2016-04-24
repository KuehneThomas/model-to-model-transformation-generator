package transformationGenerator.fitness.functions;

import java.util.Optional;

import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.internal.CachingDistance;
import org.eclipse.emf.ecore.EAttribute;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import common.emf.EmfIdentifierEObjectMatcher;

public class PropertyFocusedFitnessFunctionBasedOnStructureAsFallback implements IFitnessFunction {
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
	public double calculateFitness(double maximumFitness,
			double numberOfMofClassInstancesInManuallyCreatedModel,
			double numberOfMofClassInstancesInOutputModelOfIndividual,
			int numberOfMofPropertiesInManuallyCreatedModel,
			int numberOfMofAssociationPropertiesInManuallyCreatedModel,
			int numberOfNotMappedMofPropertiesInNotMappedClasses,
			int numberOfNotMappedMofAssociationPropertiesInNotMappedClasses,
			int numberOfnotMappedMofClassInstances,
			int numberOfunexpectedMappedMofClassInstances,
			int numberOfnotMappedMofPropertiesInMappedMofClassesWithAssociations,
			int numberOfnotMappedMofAssociationPropertiesInMappedMofClasses) {

		double mofClassFitness = (maximumFitness / numberOfMofClassInstancesInManuallyCreatedModel) * (numberOfMofClassInstancesInManuallyCreatedModel - numberOfnotMappedMofClassInstances);
		double mofClassError = numberOfMofClassInstancesInOutputModelOfIndividual > 0 ? (numberOfunexpectedMappedMofClassInstances / numberOfMofClassInstancesInOutputModelOfIndividual) * maximumFitness : 0;
		double mofPropertyFitness = (maximumFitness / numberOfMofPropertiesInManuallyCreatedModel) * (numberOfMofPropertiesInManuallyCreatedModel - (numberOfNotMappedMofPropertiesInNotMappedClasses + numberOfnotMappedMofPropertiesInMappedMofClassesWithAssociations));

		double fitness = (mofClassFitness - mofClassError + mofPropertyFitness * 3) / 4.;
		return fitness < 0. ? 0. : fitness;
	}

	@Override
	public String toString() {
		return String.format("PropertyFocuesdFitnessFunctionBasedOnStructureAsFallback[(mofClassFitness - mofClassError + mofPropertyFitness * 3) / 4.]");
	}

}
