/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.test;

import de.hybris.platform.sap.core.test.beans.ApplicationContextProvider;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Base test class for junit test in the hybris environment without starting the server.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext
@ContextConfiguration(locations =
{ "classpath:sapcoretest-test-spring.xml", "classpath:converters-spring.xml" })
public abstract class SapcoretestSpringJUnitTest
{

	@Resource(name = "sapCoreApplicationContextProvider")
	private ApplicationContextProvider applicationContextProvider;

	/**
	 * Standard test setUp method.
	 */
	@Before
	public void setUp()
	{
	}

	/**
	 * Standard test tearDown method.
	 */
	@After
	public void tearDown()
	{
	}

	/**
	 * Returns the Spring ApplicationContext e.g. for getting beans
	 * 
	 * @return ApplicationContext
	 */
	protected ApplicationContext getApplicationContext()
	{
		return applicationContextProvider.getApplicationContext();
	}

}
