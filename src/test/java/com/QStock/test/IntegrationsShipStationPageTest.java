package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.IntegrationsShipStationPage;
import com.QStock.pageObjects.LoginPage;

public class IntegrationsShipStationPageTest extends TestBase
{

SoftAssert sa = new SoftAssert();
	
	@Test
	public void IntegrationsshipStation()
	{
		
		IntegrationsShipStationPage iss = new IntegrationsShipStationPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);	
		sa.assertTrue(lp.positiveLoginTest());
		
		sa.assertTrue(iss.IntegrationsShipStationConfirm(),"1");
		sa.assertTrue(iss.basicSetting(),"2");
		sa.assertTrue(iss.shipSationSearchFilter(),"3");
		sa.assertTrue(iss.advancedSetting(),"4");
		sa.assertTrue(iss.itemMapping(),"5");
		sa.assertTrue(iss.newItemMapping(),"6");
	
		sa.assertAll();
	}
	
	
}
