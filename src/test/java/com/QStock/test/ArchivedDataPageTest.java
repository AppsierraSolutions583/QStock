package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.ArchivedDataPage;
import com.QStock.pageObjects.LoginPage;

public class ArchivedDataPageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void archivedData() {
		ArchivedDataPage adp = new ArchivedDataPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(adp.archivedDataConfirm(), "1");
		sa.assertTrue(adp.numberFilter(), "2");
		sa.assertTrue(adp.typeFilter(), "3");
		sa.assertTrue(adp.sourceFilter(), "4");
		sa.assertTrue(adp.customerFilter(), "5");
		sa.assertTrue(adp.bulkReactivation(), "6");
		sa.assertTrue(adp.actionsLink(), "7");
		sa.assertAll();
	}
}
