package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.SalesOrderReturnsPage;


public class SalesOrderReturnsPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void SalesOrderReturns() {
		SalesOrderReturnsPage sorp = new SalesOrderReturnsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(sorp.salesOrderReturnsConfirm(), "1");
	    sa.assertTrue(sorp.warehouseDrp(), "2");
	    sa.assertTrue(sorp.typeDrp(), "3");
	    sa.assertTrue(sorp.statusDrp(), "4");
	    sa.assertTrue(sorp.orderFilter(), "5");
	    sa.assertTrue(sorp.typeFilter(), "6");
	    sa.assertTrue(sorp.fromFilter(), "7");
	    sa.assertTrue(sorp.dateFilter(), "8");
	    sa.assertTrue(sorp.statusFilter(), "9");
	    sa.assertTrue(sorp.whFilter(), "10");
	    sa.assertTrue(sorp.limit(), "11");
	    sa.assertTrue(sorp.actionsEnabled(), "12");
	    sa.assertTrue(sorp.verifyCreateNewButton(), "13");
	    sa.assertTrue(sorp.orderMatching(), "14");
	    sa.assertTrue(sorp.grpByWh(), "15");
	    sa.assertTrue(sorp.grpByType(), "16");
	    sa.assertTrue(sorp.grpByStatus(), "17");
	    sa.assertTrue(sorp.grpByFrom(), "18");
	    sa.assertTrue(sorp.lastDrp(), "19");
	    sa.assertAll();
	}
}
