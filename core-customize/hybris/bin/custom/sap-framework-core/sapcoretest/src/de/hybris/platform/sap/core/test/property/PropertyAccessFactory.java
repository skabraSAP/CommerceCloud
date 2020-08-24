/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.test.property;

/**
 * Creates class for extended property handling for tests.
 */
public class PropertyAccessFactory
{

	/**
	 * Create instance or {@link PropertyAccess}.
	 * 
	 * @return instance
	 */
	public PropertyAccess createPropertyAccess()
	{
		return new PropertyAccessImpl();
	}

}
