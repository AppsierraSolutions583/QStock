package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.QstockNewPage;

public class QstockNewPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();
	@Test
	public void QstockNew() {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		QstockNewPage qsp = new QstockNewPage(TestBase.driver);
		qsp.InterfaceControlRefresh();
		qsp.ActitvitySerachAndDetailsErrorLog();
		qsp.ActivityPages();
		
	}
}
