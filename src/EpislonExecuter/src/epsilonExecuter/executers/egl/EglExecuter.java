package epsilonExecuter.executers.egl;

import javax.inject.Inject;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.ModelRepository;

import com.google.inject.assistedinject.Assisted;
import common.util.interfaces.ILogger;
import common.util.interfaces.IStringResource;

import epsilonExecuter.executers.egl.interfaces.IEglExecuter;

public class EglExecuter implements IEglExecuter {

	private final ILogger logger;
	private EglTemplateFactory factory;
	private EglTemplate template;

	@Inject
	public EglExecuter(ILogger logger, @Assisted IStringResource source, @Assisted IModel model) throws Exception {
		this.logger = logger.initialize(EglExecuter.class);
		
		this.logger.LogTrace("Constructor", "Using {}", model.getName());
		
		factory = new EglTemplateFactory();

		template = factory.prepare(source.getContent());

		if (template.getParseProblems().size() > 0) {
			String problems = "Parse errors occured:";
			for (ParseProblem problem : template.getParseProblems()) {
				problems += "\\n" + problem.toString();
			}
			throw new Exception(problems);
		}

		ModelRepository modelRepository = factory.getContext().getModelRepository();
		modelRepository.addModel(model);
	}

	@Override
	public String execute() throws Exception {
		this.logger.LogTrace("execute", "started..");
		try {
			String result = template.process();
			
			this.logger.LogTrace("execute", "finished");
			return result;
		} catch (Exception ex) {
			Throwable exT = ex.getCause();
			while (exT.getCause() != null) {
				exT = exT.getCause();
			}
			throw new Exception(ex.getMessage() + " " + exT.getMessage());
		}
	}

	@Override
	public void dispose() {
		if (factory != null) {
			factory.getContext().dispose();
		}
	}
}
