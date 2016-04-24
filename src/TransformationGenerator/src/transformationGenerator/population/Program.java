package transformationGenerator.population;

import javax.inject.Inject;

import transformationGenerator.population.interfaces.IProgram;

public class Program implements IProgram {
	private String sourceCode;

	@Inject
	public Program() {
		
	}
	
	public Program(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	
	@Override
	public String toString() {
		return sourceCode;
	}
}
