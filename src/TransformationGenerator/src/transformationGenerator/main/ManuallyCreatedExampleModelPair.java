package transformationGenerator.main;

import java.net.URI;

import org.eclipse.epsilon.eol.models.IModel;

public class ManuallyCreatedExampleModelPair {
	private URI inputModelFile;
	private URI outputModelFile;
	
	private IModel inputModel;
	private IModel outputModel;

	public ManuallyCreatedExampleModelPair(URI inputModelFile, URI outputModelFile) {
		this.inputModelFile = inputModelFile;
		this.outputModelFile = outputModelFile;
	}

	public URI getInputModelFile() {
		return inputModelFile;
	}

	public URI getOutputModelFile() {
		return outputModelFile;
	}

	public IModel getInputModel() {
		return inputModel;
	}

	public void setInputModel(IModel inputModel) {
		this.inputModel = inputModel;
	}

	public IModel getOutputModel() {
		return outputModel;
	}

	public void setOutputModel(IModel outputModel) {
		this.outputModel = outputModel;
	}

}
