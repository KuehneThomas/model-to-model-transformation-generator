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
package org.eclipse.epsilon.erl.rules;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.EolLabeledBlock;


public class LabeledNamedRule extends EolLabeledBlock implements INamedRule {

	public LabeledNamedRule(AST ast, String label) {
		super(ast, label);
	}
	
}
