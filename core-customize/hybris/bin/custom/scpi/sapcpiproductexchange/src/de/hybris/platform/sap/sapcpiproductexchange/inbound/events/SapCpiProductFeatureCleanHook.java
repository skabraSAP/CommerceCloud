/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiproductexchange.inbound.events;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.classification.ClassificationService;
import de.hybris.platform.classification.features.FeatureList;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.odata2services.odata.persistence.hook.PrePersistHook;
import de.hybris.platform.sap.sapmodel.model.ERPVariantProductModel;

public class SapCpiProductFeatureCleanHook implements PrePersistHook
{
	private static final Logger LOG = LoggerFactory.getLogger(SapCpiProductFeatureCleanHook.class);
	private ClassificationService classificationService;

	@Override
	public Optional<ItemModel> execute(ItemModel item)
	{

		if (item instanceof ERPVariantProductModel || item instanceof ProductModel)
		{
			LOG.info("The cleaning hook sapCpiProductFeatureCleanHook is called!");
			final ProductModel productModel = (ProductModel) item;
			try
			{
				final FeatureList featureList = classificationService.getFeatures(productModel);
				featureList.getFeatures().forEach(entry -> entry.removeAllValues());
				classificationService.replaceFeatures(productModel, featureList);
			}
			catch (Exception ex)
			{
				LOG.error(String.format(
						"Something went wrong while removing classification system attribute values for the product [%s]! %s",
						productModel.getCode(), ex.getMessage()),ex);
			}

			return Optional.of(item);
		}

		return Optional.of(item);
	}

	protected ClassificationService getClassificationService()
	{
		return classificationService;
	}

	@Required
	public void setClassificationService(ClassificationService classificationService)
	{
		this.classificationService = classificationService;
	}
}
