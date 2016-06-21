// Copyright (c) 2006 - 2008, Clark & Parsia, LLC. <http://www.clarkparsia.com>
// This source code is available under the terms of the Affero General Public License v3.
//
// Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
// Questions, comments, or requests for clarification: licensing@clarkparsia.com

package com.clarkparsia.pellet.rules.builtins;

import com.clarkparsia.pellet.rules.BindingHelper;
import com.clarkparsia.pellet.rules.model.BuiltInAtom;
import org.mindswap.pellet.ABox;
import org.mindswap.pellet.Literal;

/**
 * <p>
 * Title: Built-In
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2007
 * </p>
 * <p>
 * Company: Clark & Parsia, LLC. <http://www.clarkparsia.com>
 * </p>
 *
 * @author Ron Alford
 */

public interface BuiltIn
{

	public BindingHelper createHelper(BuiltInAtom atom);

	public boolean apply(ABox abox, Literal[] args);

}