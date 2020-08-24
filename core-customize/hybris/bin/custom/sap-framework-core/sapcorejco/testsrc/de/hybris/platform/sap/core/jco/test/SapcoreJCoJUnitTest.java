/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.jco.test;

import de.hybris.platform.sap.core.test.SapcoreSpringJUnitTest;

import org.springframework.test.context.ContextConfiguration;


/**
 * Base test class for JCO unit tests.
 */
@ContextConfiguration(locations =
{ "classpath:sapcorejco-spring.xml", "classpath:sapcorejco-monitor-spring.xml", "classpath:sapcorejco-test-spring.xml",
		"classpath:global-sapcorejco-spring.xml" })
public class SapcoreJCoJUnitTest extends SapcoreSpringJUnitTest
{

}
