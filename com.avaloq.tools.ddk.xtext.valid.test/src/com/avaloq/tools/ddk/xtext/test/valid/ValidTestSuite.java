/*******************************************************************************
 * Copyright (c) 2016 Avaloq Evolution AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Avaloq Evolution AG - initial API and implementation
 *******************************************************************************/
package com.avaloq.tools.ddk.xtext.test.valid;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.avaloq.tools.ddk.xtext.valid.formatting.ValidFormattingTest;
import com.avaloq.tools.ddk.xtext.valid.scoping.ValidScopingTest;
import com.avaloq.tools.ddk.xtext.valid.validation.ValidValidationOkTest;
import com.avaloq.tools.ddk.xtext.valid.validation.ValidValidationTest;


/**
 * Empty class serving only as holder for JUnit4 annotations.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ValidFormattingTest.class, ValidValidationTest.class, ValidValidationOkTest.class, ValidScopingTest.class})
public class ValidTestSuite {}

