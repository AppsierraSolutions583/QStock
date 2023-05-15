package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ServiceTitanPage;

public class ServiceTitanPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();
	@Test
	public void QstockNew() throws InterruptedException {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		ServiceTitanPage stp = new ServiceTitanPage(TestBase.driver);
		stp.InterfaceRefresh();
		stp.ActivitySearchAndDetailErrorTab();
		stp.ActivityPages();
		
	}
}
