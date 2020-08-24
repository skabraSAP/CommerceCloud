/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.bol.businessobject.test;

import de.hybris.platform.sap.core.bol.businessobject.BackendInterface;
import de.hybris.platform.sap.core.bol.businessobject.BusinessObjectBase;
import de.hybris.platform.sap.core.bol.businessobject.test.be.TestBackendInterfaceBEDeterminationNotFound;


/**
 * Test BusinessObjectBase implementation - for backend type determination test where no implementation is found.
 */
@BackendInterface(TestBackendInterfaceBEDeterminationNotFound.class)
public class TestBusinessObjectBaseBEDeterminationNotFoundImpl extends BusinessObjectBase
{
	// only for testing
}
