package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.IntegrationsShopifyNewPage;
import com.QStock.pageObjects.LoginPage;

public class IntegrationsShopifyNewPageTest extends TestBase
{
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void IntegrationsShopifyNew()
	{	
		IntegrationsShopifyNewPage isn = new IntegrationsShopifyNewPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);	
		sa.assertTrue(lp.positiveLoginTest());
		
		sa.assertTrue(isn.IntegrationsShopifyNewConfirm(),"1");
		sa.assertTrue(isn.basicSetting(),"2");
		sa.assertTrue(isn.advancedSetting(),"3");
		sa.assertTrue(isn.itemMapping(),"4");
		sa.assertTrue(isn.newItemMapping(),"5");
	
		sa.assertAll();
	}

	
	
}
