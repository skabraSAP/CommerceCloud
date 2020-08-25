package de.hybris.platform.sap.sapsalesordersimulation.service.impl;

import javax.annotation.Resource;

import org.junit.Test;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.warehousing.sourcing.bin.BinStockLevelIntegrationTest;

@IntegrationTest(replaces = BinStockLevelIntegrationTest.class)
public class SimulationBinStockLevelIntegrationTest {
	@Resource 
	private DefaultSapProductAvailabilityService commerceStockService;

	@Test
	public void shouldFindStockLevelHavingBins()
	{
		// empty implementation
	}

	@Test
	public void shouldFindStockLevelNotHavingBins()
	{
		// empty implementation
		
	}
}
