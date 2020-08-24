/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.common.util.conv;

import org.junit.Assert;
import org.junit.Test;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.sap.core.common.TechKey;


/**
 * Test for the conversion utility.
 */
@UnitTest
public class GuidConversionUtilTest
{
	private final static String fifteen = "0000000000000000000000000000000F";

	/**
	 * Calls conversion methods with empty input.
	 */
	@Test
	public void testEmptyInput()
	{
		try
		{
			GuidConversionUtil.convertToByteArray("");
			Assert.fail("Empty string should raise a NumberFormatException");
		}
		catch (final NumberFormatException e)
		{
			// ok
		}

		try
		{
			final TechKey tk = new TechKey("");
			GuidConversionUtil.convertToByteArray(tk);
			Assert.fail("Empty string should raise a NumberFormatException");
		}
		catch (final NumberFormatException e)
		{
			// ok
		}

		try
		{
			GuidConversionUtil.convertToString(new byte[] {});
			Assert.fail("Empty byte array should raise a NumberFormatException");
		}
		catch (final NumberFormatException e)
		{
			// ok
		}

		try
		{
			GuidConversionUtil.convertToTechKey(new byte[] {});
			Assert.fail("Empty byte array should raise a NumberFormatException");
		}
		catch (final NumberFormatException e)
		{
			// ok
		}
	}

	/**
	 * Calls conversion methods with correct input.
	 */
	@Test
	public void testCorrectInput()
	{
		final byte[] b = GuidConversionUtil.convertToByteArray(fifteen);
		Assert.assertEquals(fifteen, GuidConversionUtil.convertToString(b));

		final byte[] b2 = GuidConversionUtil.convertToByteArray(new TechKey(fifteen));
		Assert.assertEquals(fifteen, GuidConversionUtil.convertToString(b2));

		final TechKey tk = GuidConversionUtil.convertToTechKey(b);
		Assert.assertEquals(new TechKey(fifteen), tk);
	}
}
