package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ShortOrderReAllocationPage;

public class ShortOrderReAllocationPageTest extends TestBase
{

	SoftAssert sa	= new SoftAssert();
	
	@Test
	public void ShortOrderReAllocation()
	{
		ShortOrderReAllocationPage sora	= new ShortOrderReAllocationPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);	
		sa.assertTrue(lp.positiveLoginTest());
		
		sa.assertTrue(sora.orderFilter(),"1");
		sa.assertTrue(sora.customerFilter(),"2");
		sa.assertTrue(sora.zoneDrp(),"3");
		sa.assertTrue(sora.dates(),"4");
		
		sa.assertAll();
		
	}
	
	
	
	
	
	
	
}
