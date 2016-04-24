package epsilonExecuter.executers.ewl;

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

import java.util.ArrayList;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.models.IModel;

import com.google.inject.assistedinject.Assisted;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IStringResource;

import epsilonExecuter.executers.base.EpsilonExecuter;
import epsilonExecuter.executers.ewl.interfaces.IEwlExecuter;

public class EwlExecuter extends EpsilonExecuter implements IEwlExecuter {

	@SuppressWarnings("serial")
	@Inject
	public EwlExecuter(ILogger logger, IPrettyPrinter prettyPrinter, @Assisted IStringResource source, @Assisted final IModel model) throws Exception {
		super(logger, prettyPrinter, (IEolExecutableModule) new EwlExecuteableModule(), source, new ArrayList<IModel>() {
			{
				add(model);
			}
		});

	}

	public IModel getModel() {
		return module.getContext().getModelRepository().getModels().get(0);
	}

	public Boolean applicableTo(EObject element) throws EolRuntimeException {
		Boolean applicableTo = ((EwlExecuteableModule) module).applicableTo(element);
		return applicableTo;
	}

	public Object execute(EObject element, Map<String, Object> variables) throws EolRuntimeException {
		return ((EwlExecuteableModule) module).execute(element, variables);
	}

}