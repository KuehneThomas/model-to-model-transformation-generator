/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package epsilonExecuter.executers.base;

import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.models.IModel;

import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IStringResource;

import epsilonExecuter.executers.base.interfaces.IEpsilonExecuter;

public abstract class EpsilonExecuter implements IEpsilonExecuter {

	protected final ILogger logger;
	protected IPrettyPrinter prettyPrinter;
	protected IEolExecutableModule module;

	public EpsilonExecuter(ILogger logger, IPrettyPrinter prettyPrinter, IEolExecutableModule module, IStringResource source, List<IModel> models) throws Exception {
		this.logger = logger.initialize(this.getClass());
		this.prettyPrinter = prettyPrinter;
		this.module = module;

		String emfModelNames = "";
		for (IModel model : models) {
			emfModelNames += model.getName() + "; ";
		}
		this.logger.LogTrace("Constructor", "Using {}", emfModelNames);

		module.parse(source.getContent());

		if (module.getParseProblems().size() > 0) {
			String problems = "Parse errors occured:";
			for (ParseProblem problem : module.getParseProblems()) {
				problems += "\\n" + problem.toString();
			}
			throw new Exception(problems);
		}

		for (IModel model : models) {
			module.getContext().getModelRepository().addModel(model);
		}
	}

	public Object execute() throws Exception {
		logger.LogTrace("execute", "...");
		Object result = execute(module);
		return result;
	}

	public void dispose() {
		logger.LogTrace("dispose", "...");
		module.getContext().getModelRepository().dispose();
		module = null;
	}

	protected Object execute(IEolExecutableModule module) throws EolRuntimeException {
		return module.execute();
	}

}
