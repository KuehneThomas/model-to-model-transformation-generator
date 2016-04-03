package transformationGenerator.fitness.functions.interfaces;

import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;

public interface IFitnessFunction {
	IEObjectMatcher createObjectMatcher();
	
	double calculateFitness(double maximumFitness,
			double numberOfMofClassInstancesInManuallyCreatedModel,
			double numberOfMofClassInstancesInOutputModelOfIndividual,
			int numberOfMofPropertiesInManuallyCreatedModel,
			int numberOfMofAssociationPropertiesInManuallyCreatedModel,
			int numberOfNotMappedMofPropertiesInNotMappedClasses,
			int numberOfNotMappedMofAssociationPropertiesInNotMappedClasses,
			int numberOfnotMappedMofClassInstances,
			int numberOfunexpectedMappedMofClassInstances,
			int numberOfnotMappedMofPropertiesInMappedMofClassesWithAssociations,
			int numberOfnotMappedMofAssociationPropertiesInMappedMofClasses);
}
