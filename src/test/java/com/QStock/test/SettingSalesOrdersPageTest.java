package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.SettingSalesOrdersPage;

public class SettingSalesOrdersPageTest extends TestBase
{
	SoftAssert sa=new SoftAssert();
	
	@Test
	public void salesOrders() 
	{
		SettingSalesOrdersPage sop = new SettingSalesOrdersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());    
	    sa.assertTrue(sop.salesOrdersConfirm(), "1");
	    sa.assertTrue(sop.SearchFilter(),"2");
	
	    sa.assertAll();
	    
	}
	
	
	
	
}
