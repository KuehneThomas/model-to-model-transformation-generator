package epsilonExecuter.executers.etl;

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

//import org.eclipse.emf.compare.diff.metamodel.DiffModel;
//import org.eclipse.emf.compare.diff.service.DiffService;
//import org.eclipse.emf.compare.match.MatchOptions;
//import org.eclipse.emf.compare.match.metamodel.MatchModel;
//import org.eclipse.emf.compare.match.service.MatchService;
import java.util.ArrayList;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.trace.Transformation;
import org.eclipse.epsilon.etl.trace.TransformationTrace;

import com.google.inject.assistedinject.Assisted;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IStringResource;

import epsilonExecuter.executers.base.EpsilonExecuter;
import epsilonExecuter.executers.etl.interfaces.IEtlExecuter;

public class EtlExecuter extends EpsilonExecuter implements IEtlExecuter {

	@SuppressWarnings("serial")
	@Inject
	public EtlExecuter(ILogger logger, IPrettyPrinter prettyPrinter, @Assisted IStringResource transformationSource, @Assisted("sourceModel") final IModel sourceModel, @Assisted("targetModel") final IModel targetModel) throws Exception {
		super(logger, prettyPrinter, (IEolExecutableModule) new EtlModule(), transformationSource, new ArrayList<IModel>() {
			{
				add(sourceModel);
				add(targetModel);
			}
		});
	}

	@Override
	public Object execute() throws Exception {

		Object result = super.execute();

		TransformationTrace trace = (TransformationTrace) result;
		String summary = "Summary of used rules and created elements:";
		for (Transformation transformation : trace.getTransformations()) {
			summary += String.format("\nRule: %s - Applied to Source: %s", transformation.getRule().getName(), transformationObjectToString(transformation.getSource()));
			// TODO EolSequence is not a Object and causes an exception when present here...
			// for (Object target : transformation.getTargets()) {
			// summary += String.format("\n -> Created: %s", transformationObjectToString(target));
			// }
		}
		logger.LogDebug("execute", summary);

		return result;
	}

	private String transformationObjectToString(Object transformationObject) {
		EObject container = (EObject) transformationObject;
		String output = prettyPrinter.ToString(container);
		return output;
	}

}
