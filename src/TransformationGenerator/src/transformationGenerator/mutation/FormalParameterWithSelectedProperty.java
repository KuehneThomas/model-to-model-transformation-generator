package transformationGenerator.mutation;

import java.util.List;

import transformationGenerator.mutation.Mutation.ChainedMofProperty;
import etlMetaModel.EolMofClassFormalParameter;

public class FormalParameterWithSelectedProperty {

	private EolMofClassFormalParameter formalParameter;

	private ChainedMofProperty formalParameterChainedMofProperty;
	private List<ChainedMofProperty> formalParameterAssociationPropertyChains;

	public FormalParameterWithSelectedProperty(EolMofClassFormalParameter formalParameter, ChainedMofProperty formalParameterChainedMofProperty, List<ChainedMofProperty> formalParameterAssociationPropertyChains) {
		this.formalParameter = formalParameter;
		this.formalParameterChainedMofProperty = formalParameterChainedMofProperty;
		this.formalParameterAssociationPropertyChains = formalParameterAssociationPropertyChains;
	}

	public EolMofClassFormalParameter getFormalParameter() {
		return formalParameter;
	}

	public ChainedMofProperty getFormalParameterChainedMofProperty() {
		return formalParameterChainedMofProperty;
	}

	public List<ChainedMofProperty> getFormalParameterAssociationPropertyChains() {
		return formalParameterAssociationPropertyChains;
	}

	@Override
	public String toString() {
		return String.format("CollectionProperty=%s,CollectionPropertyChain=%s",
				this.getFormalParameterChainedMofProperty().toSelfString(),
				this.getFormalParameterAssociationPropertyChains().stream().map(c -> c.getMofProperty() != null ? c.getMofProperty().getName() : "root").reduce("", (c1, c2) -> c1 + "." + c2));
	}

}