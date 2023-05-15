
package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.IntegrationsIntacctPage;
import com.QStock.pageObjects.LoginPage;

public class IntegrationsIntacctTest extends TestBase 
{
	SoftAssert sa = new SoftAssert();
		
	@Test
	public void IntegrationsIntacct()
	{
		
	IntegrationsIntacctPage iip = new IntegrationsIntacctPage(TestBase.driver);
	LoginPage lp = new LoginPage(TestBase.driver);	
	sa.assertTrue(lp.positiveLoginTest());
		
	sa.assertTrue(iip.IntegrationsIntacctConfirm(),"1");
	sa.assertTrue(iip.interfaceSettings(),"2");
	sa.assertTrue(iip.orders(),"3");
	sa.assertTrue(iip.locations(),"4");
	sa.assertTrue(iip.miscellaneous(),"5");
	sa.assertTrue(iip.transactionDefinitions(),"6");
	sa.assertTrue(iip.adjustmentDefinitions(),"7");
	sa.assertTrue(iip.mapUserDefs(),"8");
	
	sa.assertAll();
	}
	
}
