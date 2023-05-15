package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.QstockForTestPage;

public class QstockForPageTest extends TestBase{

	SoftAssert sa = new SoftAssert();
	@Test
	public void QstockForTest() throws InterruptedException {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		QstockForTestPage qsp=new QstockForTestPage(TestBase.driver);
		qsp.InterfaceRefresh();
		qsp.ActivitySearchAndDetailErrorTab();
		qsp.ActivityPages();
		
	}
}
