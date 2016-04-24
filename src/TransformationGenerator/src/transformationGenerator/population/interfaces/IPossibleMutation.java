package transformationGenerator.population.interfaces;

public interface IPossibleMutation {
	int getId();

	IIndividual getIndividual();

	void setIndividual(IIndividual individual);

	String getMutationOperator();

	void setMutationOperator(String mutationOperator);

	String getMutationOption();

	void setMutationOption(String mutationOption);

	double getFitnessBefore();

	void setFitnessBefore(double fitnessBefore);

	double getFitnessAfter();

	void setFitnessAfter(double fitnessAfter);
}
