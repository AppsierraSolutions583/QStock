package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.importOrderPage;

public class importOrderPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test
	public void InventoryModule() {

		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		importOrderPage ip = new importOrderPage(TestBase.driver);
		ip.goToImportOrder();
		ip.doSearch();
		ip.importOption();
		ip.cloneOption();
		ip.deleteOption();

		sa.assertAll();
		lp.signOut();

	}

}
