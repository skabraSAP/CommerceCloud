/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saporderexchangeoms.enums;

public enum SapOmsPartnerRoles {
	

	@SuppressWarnings("javadoc")
	VENDOR("LF");

	private String code;

	private SapOmsPartnerRoles(final String code)
	{
		this.code = code;
	}

	@SuppressWarnings("javadoc")
	public String getCode()
	{
		return code;
	}

}
