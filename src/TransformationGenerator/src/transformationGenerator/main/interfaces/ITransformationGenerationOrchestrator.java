package transformationGenerator.main.interfaces;

import java.net.URI;
import java.util.List;

import transformationGenerator.main.ManuallyCreatedExampleModelPair;
import transformationGenerator.population.interfaces.IIndividual;

public interface ITransformationGenerationOrchestrator {
	IIndividual generate(URI inputMetaModelFile, URI outputMetaModelFile, final List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, URI emptyOutputFile, URI sourceAndTargetMetaModelInAbstractSyntax) throws Exception;
}
