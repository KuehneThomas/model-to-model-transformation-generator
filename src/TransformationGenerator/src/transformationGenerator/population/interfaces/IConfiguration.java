package transformationGenerator.population.interfaces;


public interface IConfiguration {
	int getId();

	String getInputMetaModel();

	void setInputMetaModel(String inputMetaModel);

	String getOutputMetaModel();

	void setOutputMetaModel(String ouputMetaModel);

	int getPopulationSize();

	void setPopulationSize(int populationSize);

	int getMaximumNumberOfGenerations();

	void setMaximumNumberOfGenerations(int maximumNumberOfGenerations);

	String getSelectionAndReplicationAlgorithm();

	void setSelectionAndReplicationAlgorithm(String selectionAndReplicationAlgorithm);

	void setFitnessFunction(String fitnessFunction);

	String getFitnessFunction();

	String getMutationOperatorSelection();

	void setMutationOperatorSelection(String mutationOperatorSelection);
}
