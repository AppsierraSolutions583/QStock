package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.PurchaseOrderPage;

public class PurchaseOrderPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test
	public void OrdermanagementServiceTitan() {

		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		PurchaseOrderPage so = new PurchaseOrderPage(TestBase.driver);
		sa.assertTrue(so.goToSPurchaseOrders());
		so.useSearch();
		so.useGrouping();
		so.useWarehousedropdown();
		so.useLastdropdown();
		so.useTypedropdown();
		so.useStatusdropdown();
		sa.assertAll();
		lp.signOut();

	}

}
