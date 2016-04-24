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
package org.eclipse.epsilon.erl.exceptions;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.erl.rules.ExtensibleNamedRule;


public class ErlCircularRuleInheritanceException extends EolRuntimeException{
	
	protected ExtensibleNamedRule rule;
	
	public ErlCircularRuleInheritanceException(ExtensibleNamedRule rule){
		this.rule = rule;
	}
	
	@Override
	public String getReason(){
		return "Circular extension detected in rule '" + rule.getName() + "'"; 
	}
	
	@Override
	public AST getAst(){
		return rule.getAst();
	}
	
}
