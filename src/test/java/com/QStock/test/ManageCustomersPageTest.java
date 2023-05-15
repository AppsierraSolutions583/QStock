package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ManageCustomersPage;

public class ManageCustomersPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void  manageCustomers() {
		 ManageCustomersPage mcp = new  ManageCustomersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(mcp.manageCustomersConfirm(), "1");
		sa.assertTrue(mcp.customerSearch(), "2");
		sa.assertTrue(mcp.idMatching(), "3");
		sa.assertTrue(mcp.priceList(), "4");
		sa.assertTrue(mcp.priceListSearch(), "5");
	//	sa.assertTrue(mcp.priceListItemsMatching(), "6");
		
		sa.assertTrue(mcp.addNewPriceList(), "8");
		sa.assertAll();
	}
	
	@Test
	public void  rough() {
		 ManageCustomersPage mcp = new  ManageCustomersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(mcp.priceListItemsMatching(), "6");
		sa.assertAll();
	}
}
