/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.orderexchange;

import org.apache.log4j.Logger;


/**
 * Simple test class to demonstrate how to include utility classes to your webmodule.
 */
@SuppressWarnings("javadoc")
public class SaporderexchangeHybrisWebHelper
{

	private SaporderexchangeHybrisWebHelper() {
		throw new IllegalStateException("Utility class");
	}

	/** Edit the local|project.properties to change logging behavior (properties log4j.*). */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(SaporderexchangeHybrisWebHelper.class.getName());

	public static final String getTestOutput()
	{
		return "testoutput";
	}
}
