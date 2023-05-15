package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.EcommerceRefundCreditsPage;
import com.QStock.pageObjects.LoginPage;


public class EcommerceRefundCreditsPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void EcommerceRefundCredits() {
		EcommerceRefundCreditsPage ercp = new EcommerceRefundCreditsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(ercp.ecommerceRefundCreditsConfirm(), "1");
	    sa.assertTrue(ercp.warehouseDrp(), "2");
	    sa.assertTrue(ercp.typeDrp(), "3");
	    sa.assertTrue(ercp.statusDrp(), "4");
	    sa.assertTrue(ercp.orderFilter(), "5");
	    sa.assertTrue(ercp.typeFilter(), "6");
	    sa.assertTrue(ercp.fromFilter(), "7");
	    sa.assertTrue(ercp.dateFilter(), "8");
	    sa.assertTrue(ercp.statusFilter(), "9");
	    sa.assertTrue(ercp.whFilter(), "10");
	    sa.assertTrue(ercp.limit(), "11");
	    sa.assertTrue(ercp.actionsEnabled(), "12");
	    sa.assertTrue(ercp.verifyCreateNewButton(), "13");
	    sa.assertTrue(ercp.orderMatching(), "14");
	    sa.assertTrue(ercp.grpByWh(), "15");
	    sa.assertTrue(ercp.grpByType(), "16");
	    sa.assertTrue(ercp.grpByStatus(), "17");
	    sa.assertTrue(ercp.grpByFrom(), "18");
	    sa.assertTrue(ercp.lastDrp(), "19");
	    sa.assertAll();
	}
}
