/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapsalesordersimulation.service;

import de.hybris.platform.sapsalesordersimulation.dto.SalesOrderSimulationData;
import de.hybris.platform.sapsalesordersimulation.dto.SalesOrderSimulationRequestData;

public interface SalesOrderSimulationOutboundRequest {
	/**
	 * Get the response from the API passing the requestData.
	 *
	 * @param requestData
	 * @return salesOrderSimulationData.
	 */
	 public SalesOrderSimulationData getResponseFromSalesOrderSimulation(SalesOrderSimulationRequestData requestData);
}
