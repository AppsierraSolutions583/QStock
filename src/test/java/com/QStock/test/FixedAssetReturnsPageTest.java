package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.FixedAssetReturnsPage;
import com.QStock.pageObjects.LoginPage;

public class FixedAssetReturnsPageTest extends TestBase
{

	SoftAssert sa = new SoftAssert();
	
	@Test
	public void fixedAssetReturns()
	{
		FixedAssetReturnsPage farp = new FixedAssetReturnsPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);
		
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(farp.fixedOrderReturnConfirm(),"1");
		sa.assertTrue(farp.warehouseDrp(),"2");
		sa.assertTrue(farp.sourceDrp(),"3");
		sa.assertTrue(farp.statusDrp(),"4");
		sa.assertTrue(farp.dates(),"5");	
		sa.assertTrue(farp.orderSearch(),"6");
		sa.assertTrue(farp.orderSearchFilter(),"7");
		sa.assertTrue(farp.typeFilter(),"8");
		sa.assertTrue(farp.customerFilter(),"9");
		sa.assertTrue(farp.dateFilter(),"10");
		sa.assertTrue(farp.statusFilter(),"10");
		sa.assertTrue(farp.warehouseFilter(),"11");
		sa.assertTrue(farp.sourceFilter(),"12");
		
		sa.assertAll();
	}
	
	
	
}
