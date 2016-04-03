package transformationGenerator.mutation.operators;

import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.JavaMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;

import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;

import epsilonExecuter.executers.ewl.interfaces.IEwlExecuterFactory;
import etlMetaModel.EtlModule;

public class RemoveRule extends JavaMutationOperator<EtlModule, RemoveRuleMutationOption> {

	@Inject
	public RemoveRule(ILogger logger, IPrettyPrinter prettyPrinter, IResourceReader resourceReader, IEwlExecuterFactory ewlExecuterFactory, IModelFactory modelFactory, IRandomizer randomizer)
			throws URISyntaxException, Exception {
		super(logger, prettyPrinter, modelFactory, randomizer, EtlModule.class, RemoveRuleMutationOption.class);
	}

	@Override
	protected List<IMutationOption> getMutationOptionsInternal(IModel model, EtlModule etlModule) throws Exception {
		return etlModule.getTransformationRules().stream().map(transformationRule -> new RemoveRuleMutationOption(this, model, etlModule, transformationRule)).collect(Collectors.toList());
	}

	@Override
	protected void mutate(EtlModule etlModule, transformationGenerator.mutation.operators.RemoveRuleMutationOption mutationOption) {
		etlModule.getTransformationRules().stream().collect(Collectors.toList()).stream()
				.filter(tr -> tr.getSourceParameter().getReferenced() == mutationOption.getTransformationRule().getSourceParameter().getReferenced())
				.forEach(tr -> etlModule.getTransformationRules().remove(tr));
	}
}
