package transformationGenerator.population;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import transformationGenerator.population.interfaces.IConfiguration;

@Entity
@Table(name = "Configuration")
public class Configuration implements IConfiguration {
	private int id;
	private String inputMetaModel;
	private String outputMetaModel;
	private int populationSize;
	private int maximumNumberOfGenerations;
	private String selectionAndReplicationAlgorithm;
	private String fitnessFunction;
	private String mutationOperatorSelection;

	@Inject
	public Configuration() {
	}

	@Id
	@GeneratedValue
	// @GeneratedValue(generator="increment")
	// @GenericGenerator(name="increment", strategy = "increment")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getInputMetaModel() {
		return inputMetaModel;
	}

	@Override
	public void setInputMetaModel(String inputMetaModel) {
		this.inputMetaModel = inputMetaModel;
	}

	@Override
	public String getOutputMetaModel() {
		return outputMetaModel;
	}

	@Override
	public void setOutputMetaModel(String outputMetaModel) {
		this.outputMetaModel = outputMetaModel;
	}

	@Override
	public int getPopulationSize() {
		return populationSize;
	}

	@Override
	public void setPopulationSize(int populationSize) {
		this.populationSize = populationSize;
	}

	@Override
	public int getMaximumNumberOfGenerations() {
		return maximumNumberOfGenerations;
	}

	@Override
	public void setMaximumNumberOfGenerations(int maximumNumberOfGenerations) {
		this.maximumNumberOfGenerations = maximumNumberOfGenerations;
	}

	@Override
	public String getSelectionAndReplicationAlgorithm() {
		return selectionAndReplicationAlgorithm;
	}

	@Override
	public void setSelectionAndReplicationAlgorithm(String selectionAndReplicationAlgorithm) {
		this.selectionAndReplicationAlgorithm = selectionAndReplicationAlgorithm;
	}

	@Override
	public String getFitnessFunction() {
		return fitnessFunction;
	}

	@Override
	public void setFitnessFunction(String fitnessFunction) {
		this.fitnessFunction = fitnessFunction;
	}

	@Override
	public String getMutationOperatorSelection() {
		return mutationOperatorSelection;
	}

	@Override
	public void setMutationOperatorSelection(String mutationOperatorSelection) {
		this.mutationOperatorSelection = mutationOperatorSelection;
	}

	@Override
	public String toString() {
		return String.format("Configuration:\n- inputMetaModel:			%s\n- outputMetaModel:			%s\n- maximumPopulationSize			%s\n- maximumNumberOfGenerations:		%s\n- selectionAndReplicationAlgorithm:	%s\n- fitnessFunction:			%s\n- mutationOperatorSelection:		%s\n",
				getInputMetaModel(), getOutputMetaModel(), getPopulationSize(), getMaximumNumberOfGenerations(), getSelectionAndReplicationAlgorithm(), getFitnessFunction(), getMutationOperatorSelection());
	}

}
