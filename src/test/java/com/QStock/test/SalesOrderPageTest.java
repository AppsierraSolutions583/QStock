package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.SalesOrderPage;

public class SalesOrderPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test
	public void OrdermanagementServiceTitan() {

		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		SalesOrderPage so = new SalesOrderPage(TestBase.driver);
		sa.assertTrue(so.goToSalesOrders());
		so.useSearch();
		so.goThroughAllAvailablePages();
		so.useGrouping();
		so.orderSearchBox();
		so.useWarehousedropdown();
		so.useZoandropdown();
		so.useSourcedropdown();
		so.useStatusdropdown();
		sa.assertAll();
		lp.signOut();

	}

}
