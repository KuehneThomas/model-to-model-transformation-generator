package epsilonExecuter.executers.eol;

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

import javax.inject.Inject;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.models.IModel;

import com.google.inject.assistedinject.Assisted;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IStringResource;

import epsilonExecuter.executers.base.EpsilonExecuter;
import epsilonExecuter.executers.eol.interfaces.IEolExecuter;

public class EolExecuter extends EpsilonExecuter implements IEolExecuter {

	@SuppressWarnings("serial")
	@Inject
	public EolExecuter(ILogger logger, IPrettyPrinter prettyPrinter, @Assisted IStringResource source, @Assisted final IModel model) throws Exception {
		super(logger, prettyPrinter, new EolModule(), source, new ArrayList<IModel>() {
			{
				add(model);
			}
		});

	}

}