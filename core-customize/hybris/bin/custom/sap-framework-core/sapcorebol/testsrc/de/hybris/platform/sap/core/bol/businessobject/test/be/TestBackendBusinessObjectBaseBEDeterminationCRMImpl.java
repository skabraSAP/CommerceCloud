/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.bol.businessobject.test.be;

import de.hybris.platform.sap.core.bol.backend.BackendBusinessObjectBase;
import de.hybris.platform.sap.core.bol.backend.BackendType;


/**
 * Test BackendBusinedssObjectBase implementation - for backend type determination where the determination is not
 * unique.
 */
@BackendType("CRM")
public class TestBackendBusinessObjectBaseBEDeterminationCRMImpl extends BackendBusinessObjectBase implements
		TestBackendInterfaceBEDetermination
{
	// only for testing
}
