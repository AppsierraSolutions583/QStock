package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.WooCommerceApiPage;

public class WooCommerceApiPageTest extends TestBase
{
	SoftAssert sa=new SoftAssert();
	
	@Test
	public void wooCommerceApi() {
		WooCommerceApiPage wcp = new WooCommerceApiPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(wcp.wooCommerceApiConfirm(),"1");
	    sa.assertTrue(wcp.dateFilter(),"2"); 
	    sa.assertTrue(wcp.userFilter(),"3");
	    sa.assertTrue(wcp.activityFilter(),"4");
	    sa.assertTrue(wcp.docFilter(),"5");
	    sa.assertTrue(wcp.messageFilter(),"6");
	    
	    sa.assertAll();
	}
	 
	
}
