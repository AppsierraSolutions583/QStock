package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.ExternalShipmentNotificationsPage;
import com.QStock.pageObjects.LoginPage;

public class ExternalShipmentNotificationsPageTest extends TestBase
{

	SoftAssert sa = new SoftAssert();
	
	@Test
	public void ExternalShipmentNotifications()
	{
		ExternalShipmentNotificationsPage esn = new ExternalShipmentNotificationsPage(TestBase.driver); 
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		
		sa.assertTrue(esn.externalShipmentNotificationsConfirm(),"1");
		sa.assertTrue(esn.orderFilter(),"2");
		sa.assertTrue(esn.carrierShipFilter(),"3");
		sa.assertTrue(esn.providerFilter(),"4");
		sa.assertTrue(esn.carrierFilter(),"5");
		sa.assertTrue(esn.serviceFilter(),"6");
	//	sa.assertTrue(esn.cartonFilter(),"7");  NW
	//	sa.assertTrue(esn.countFilter(),"8");   NW
		sa.assertTrue(esn.scacFilter(),"9");
	//	sa.assertTrue(esn.pagination(),"10");  
	
		sa.assertAll();
	}
	
	
}
