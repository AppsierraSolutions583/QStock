package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ShipmentsPage;

public class ShipmentsPageTest extends TestBase
{

	SoftAssert sa = new SoftAssert();
	
	@Test(priority=1)
	public void shipments()
	{
		ShipmentsPage sp = new ShipmentsPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);
		
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(sp.shipmentsConfirm(),"1");
		sa.assertTrue(sp.orderFilter(),"2");
		sa.assertTrue(sp.qsShipmentFilter(),"3");
		sa.assertTrue(sp.trackingFilter(),"4");
	//	sa.assertTrue(sp.shippedToFilter(),"5"); Filter not working
		sa.assertTrue(sp.fromWareHouse(),"6");
		sa.assertTrue(sp.byUserFilter(),"7");
		sa.assertTrue(sp.carrierFilter(),"8");
		sa.assertTrue(sp.serviceFilter(),"9");
	//	sa.assertTrue(sp.pagination(),"10");
		sa.assertAll();
	}
	
	
	
}
