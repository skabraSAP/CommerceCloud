/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.orderexchange.cancellation;

/**
 * Runtime exception which signals an error in the cancel processing
 */
public class SapOrderCancelException extends RuntimeException
{

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("javadoc")
	public SapOrderCancelException(final String msg, final Throwable throwable)
	{
		super(msg, throwable);
	}

	@SuppressWarnings("javadoc")
	public SapOrderCancelException(final String msg)
	{
		super(msg);
	}

}
