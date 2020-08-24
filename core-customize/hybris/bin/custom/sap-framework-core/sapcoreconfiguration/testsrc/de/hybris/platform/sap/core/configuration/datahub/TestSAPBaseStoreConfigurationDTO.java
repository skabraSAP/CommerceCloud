/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.configuration.datahub;

import de.hybris.platform.core.PK;


/**
 * Test DTO bean.
 */
@SuppressWarnings("javadoc")
public class TestSAPBaseStoreConfigurationDTO
{

	private PK pk;
	private String core_name;
	private PK SAPRFCDestinationPK;

	public void setPk(final PK pk)
	{
		this.pk = pk;
	}

	public PK getPk()
	{
		return pk;
	}

	public void setCore_name(final String core_name) // NOPMD
	{
		this.core_name = core_name;
	}

	public String getCore_name() // NOPMD
	{
		return core_name;
	}

	public PK getSAPRFCDestinationPK()
	{
		return SAPRFCDestinationPK;
	}

	public void setSAPRFCDestinationPK(final PK sAPRFCDestinationPK)
	{
		SAPRFCDestinationPK = sAPRFCDestinationPK;
	}

}
