/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.orderexchange.outbound;

import de.hybris.platform.servicelayer.model.AbstractItemModel;

import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Contributor to the creation a Data Hub Raw item using {@link RawItemBuilder}. The raw item is modeled as a list of
 * maps, each list entry representin one entry of the raw item and each map entry representing a name / value pair of
 * the raw item. Each contributor may work independently on the item model. Duplicate columns are handled by the
 * {@link RawItemBuilder}
 * 
 * @param <T>
 */
public interface RawItemContributor<T extends AbstractItemModel>
{
	/**
	 * 
	 * @return Columns to be included in the CSV string
	 */
	Set<String> getColumns();

	/**
	 * 
	 * @param model
	 *           The item model from which parts of the CSV string shall be created
	 * @return Name / value pairs. The names must correspond to the column names as returned in {@link #getColumns()}.
	 *         Each list entry corresponds to one line of the CSV string
	 */
	List<Map<String, Object>> createRows(final T model);

}
