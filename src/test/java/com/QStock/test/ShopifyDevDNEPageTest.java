package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ShopifyDevDNEPage;

public class ShopifyDevDNEPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();
	@Test
	public void QstockNew() throws InterruptedException {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		ShopifyDevDNEPage sdnep = new ShopifyDevDNEPage(TestBase.driver);
		sdnep.InterfaceRefresh();
		sdnep.ActivitySearchAndDetailErrorTab();
		sdnep.ActivityPages();
		
	}
}
