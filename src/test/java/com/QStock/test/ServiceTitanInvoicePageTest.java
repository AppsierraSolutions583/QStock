package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ServiceTitanInvoicePage;

public class ServiceTitanInvoicePageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test
	public void OrdermanagementServiceTitan() {

		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		ServiceTitanInvoicePage st = new ServiceTitanInvoicePage(TestBase.driver);
		sa.assertTrue(st.goToServiceTitan());
		st.useSearch();
		st.goThroughAllAvailablePages();
		st.useWarehousedropdown();
		st.useZoandropdown();
		st.useStatusdropdown();
		sa.assertAll();
		lp.signOut();

	}

}
