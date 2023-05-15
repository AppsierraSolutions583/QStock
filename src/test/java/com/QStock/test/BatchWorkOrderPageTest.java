package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.BatchWorkOrderPage;
import com.QStock.pageObjects.LoginPage;

public class BatchWorkOrderPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test
	public void WorkOrderPageAutomationtest() {

		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		BatchWorkOrderPage wo = new BatchWorkOrderPage(TestBase.driver);
		sa.assertTrue(wo.goToBatchWorkOrders());
		wo.useWarehousedropdown();
		wo.useStatusdropdown();
		wo.useSearch();
		wo.orderSearchBox();
		sa.assertAll();
		lp.signOut();

	}

}
