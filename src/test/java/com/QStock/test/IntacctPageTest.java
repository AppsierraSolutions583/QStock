package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.IntacctPage;
import com.QStock.pageObjects.LoginPage;

public class IntacctPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test
	public void Intacct() throws InterruptedException {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		IntacctPage ip = new IntacctPage(TestBase.driver);
		ip.IntacctInterfaceRefresh();
		ip.ActivitySearchAndDetailsErrorTab();
		ip.ActivityPages();
//		ip.BatchedTransationRefresh();
		ip.BatchedTransactionSearchFilter();
		ip.BatchedtransactionPage();
	}

}
