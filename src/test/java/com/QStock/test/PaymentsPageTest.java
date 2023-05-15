package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.PaymentsPage;

public class PaymentsPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void Payments() {
		PaymentsPage pp = new PaymentsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(pp.paymentsConfirm(), "1");
	    sa.assertTrue(pp.orderFilter(), "2");
	    sa.assertTrue(pp.fromFilter(), "3");
	    sa.assertTrue(pp.typeFilter(), "4");
	    sa.assertTrue(pp.gatewayFilter(), "5");
	    sa.assertTrue(pp.dateFilter(), "6");
	    sa.assertTrue(pp.amountFilter(), "7");
	    sa.assertTrue(pp.methodFilter(), "8");
	    sa.assertTrue(pp.sourceFilter(), "9");
	    sa.assertTrue(pp.idFilter(), "10");
	    sa.assertTrue(pp.subscriptionFilter(), "11");
	    sa.assertTrue(pp.orderMatching(), "12");
	    sa.assertTrue(pp.limit(), "13");
	    sa.assertTrue(pp.checkbox(), "14");
	    sa.assertAll();
	}
}
