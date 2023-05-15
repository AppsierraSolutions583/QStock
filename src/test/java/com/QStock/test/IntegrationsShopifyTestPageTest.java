package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.QStock.generics.TestBase;
import com.QStock.pageObjects.IntegrationsShopifyTestPage;
import com.QStock.pageObjects.LoginPage;

public class IntegrationsShopifyTestPageTest extends TestBase
{
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void IntegrationsShopifyTest()
	{
		
		IntegrationsShopifyTestPage ist = new IntegrationsShopifyTestPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);	
		sa.assertTrue(lp.positiveLoginTest());
		
		sa.assertTrue(ist.IntegrationsShopifyTestConfirm(),"1");
		sa.assertTrue(ist.basicSetting(),"2");
		sa.assertTrue(ist.advancedSetting(),"3");
		sa.assertTrue(ist.itemMapping(),"4");
		sa.assertTrue(ist.newItemMapping(),"5");
	
		sa.assertAll();
	}
	
}
