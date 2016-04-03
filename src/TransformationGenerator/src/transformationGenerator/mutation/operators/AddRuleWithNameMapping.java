package transformationGenerator.mutation.operators;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.JavaMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;
import epsilonExecuter.executers.ewl.interfaces.IEwlExecuterFactory;
import etlMetaModel.EolFor;
import etlMetaModel.EtlModule;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import etlMetaModel.impl.EolAssignmentStatementImpl;
import etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl;
import etlMetaModel.impl.EolMofClassFormalParameterImpl;
import etlMetaModel.impl.EolMofPropertyFeatureCallImpl;
import etlMetaModel.impl.EolStatementBlockImpl;
import etlMetaModel.impl.EtlTransformationRuleImpl;

public class AddRuleWithNameMapping extends JavaMutationOperator<EtlModule, AddRuleWithNameMappingMutationOption> {

	@Inject
	public AddRuleWithNameMapping(ILogger logger, IPrettyPrinter prettyPrinter, IResourceReader resourceReader, IEwlExecuterFactory ewlExecuterFactory, IModelFactory modelFactory, IRandomizer randomizer) throws URISyntaxException, Exception {
		super(logger, prettyPrinter, modelFactory, randomizer, EtlModule.class, AddRuleWithNameMappingMutationOption.class);
	}

	@Override
	protected List<IMutationOption> getMutationOptionsInternal(IModel model, EtlModule etlModule) throws Exception {
		List<etlMetaModel.MofClass> mofClassesSourceNotYetMapped = etlModule.getMofClassesSource().stream()
				.filter(mofClassSource -> etlModule.getTransformationRules().stream().noneMatch(transformationRule -> transformationRule.getSourceParameter().getReferenced() == mofClassSource))
				.collect(Collectors.toList());

		List<etlMetaModel.MofClass> mofClassesTargetNotYetMapped = etlModule.getMofClassesTarget().stream()
				.filter(mofClassTarget -> etlModule.getTransformationRules().stream().allMatch(transformationRule -> transformationRule.getTargetParameters().stream().noneMatch(targetParameter -> targetParameter.getReferenced() == mofClassTarget)))
				.collect(Collectors.toList());

		List<IMutationOption> variableOptions = new ArrayList<IMutationOption>();
		for (MofClass mofClassSource : mofClassesSourceNotYetMapped) {
			for (MofClass mofClassTarget : mofClassesTargetNotYetMapped) {
				variableOptions.add(new AddRuleWithNameMappingMutationOption(this, model, etlModule, mofClassSource, mofClassTarget, /* existingTransformationRule*: */null));
			}
		}

		// create replacement options for 1:N transformation rules (keep the guards!):
		for (EtlTransformationRule existingTransformationRule : etlModule.getTransformationRules()) {
			Optional<EolFor> eolFor = existingTransformationRule.getBody().getStatements().stream()
					.filter(s -> s instanceof EolFor)
					.map(s -> (EolFor) s)
					.findFirst();

			if (eolFor.isPresent()) {
				MofClass mofClassSource = existingTransformationRule.getSourceParameter().getReferenced();
				MofClass mofClassTarget = existingTransformationRule.getTargetParameters().get(0).getReferenced();

				variableOptions.add(new AddRuleWithNameMappingMutationOption(this, model, etlModule, mofClassSource, mofClassTarget, existingTransformationRule));
			}
		}

		return variableOptions;
	}

	@Override
	protected void mutate(EtlModule etlModule, AddRuleWithNameMappingMutationOption option) {

		if (option.getExistingTransformationRule() != null) {
			etlModule.getTransformationRules().remove(option.getExistingTransformationRule());
		}

		etlModule.getTransformationRules().add(new EtlTransformationRuleImpl() {
			{
				setName(option.getSelectedMofClassSource().getName() + "2" + option.getSelectedMofClassTarget().getName());
				EolMofClassFormalParameterImpl sourceParameter;
				setSourceParameter(sourceParameter = new EolMofClassFormalParameterImpl() {
					{
						setName("source" + option.getSelectedMofClassSource().getName());
						setReferenced(option.getSelectedMofClassSource());
					}
				});
				EolMofClassFormalParameterImpl targetParameter;
				getTargetParameters().add(targetParameter = new EolMofClassFormalParameterImpl() {
					{
						setName("target" + option.getSelectedMofClassTarget().getName());
						setReferenced(option.getSelectedMofClassTarget());
					}
				});
				if (option.getExistingTransformationRule() != null && option.getExistingTransformationRule().getGuard() != null) {
					setGuardName(option.getExistingTransformationRule().getGuardName());
					setGuard(EcoreUtil.copy(option.getExistingTransformationRule().getGuard()));
				}
				setBody(new EolStatementBlockImpl() {
					{
						getStatements().add(new EolAssignmentStatementImpl() {
							{
								// target.Name =
								setLogicalExpressionLeft(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
										new EolFormalParameterReferenceExpressionImpl() {
											{
												setReferencedFormalParameter(targetParameter);
											}
										},
										new EolMofPropertyFeatureCallImpl() {
											{
												setReferencedMofProperty(mutation.getNameProperty(targetParameter.getReferenced()));
											}
										}
										))
								);
								// source.Name;
								setLogicalExpressionRight(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
										new EolFormalParameterReferenceExpressionImpl() {
											{
												setReferencedFormalParameter(sourceParameter);
											}
										},
										new EolMofPropertyFeatureCallImpl() {
											{
												setReferencedMofProperty(mutation.getNameProperty(sourceParameter.getReferenced()));
											}
										}))
								);

							}
						});
					}
				});
			}
		});

	}
}
