package transformationGenerator.population;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.population.interfaces.IPossibleMutation;

@Entity
@Table(name = "PossibleMutation")
public class PossibleMutation implements IPossibleMutation {
	private int id;
	private IIndividual individual;
	private String mutationOperator;
	private String mutationOption;
	private double fitnessBefore;
	private double fitnessAfter;

	public PossibleMutation() {

	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(targetEntity = Individual.class)
	@JoinColumn(name = "IndividualId")
	// @Column(name = "PopulationId")
	public IIndividual getIndividual() {
		return individual;
	}

	public void setIndividual(IIndividual individual) {
		this.individual = individual;
	}

	public String getMutationOperator() {
		return mutationOperator;
	}

	public void setMutationOperator(String mutationOperator) {
		this.mutationOperator = mutationOperator;
	}

	public String getMutationOption() {
		return mutationOption;
	}

	public void setMutationOption(String mutationOption) {
		this.mutationOption = mutationOption;
	}

	public double getFitnessBefore() {
		return fitnessBefore;
	}

	public void setFitnessBefore(double fitnessBefore) {
		this.fitnessBefore = fitnessBefore;
	}

	public double getFitnessAfter() {
		return fitnessAfter;
	}

	public void setFitnessAfter(double fitnessAfter) {
		this.fitnessAfter = fitnessAfter;
	}
}
