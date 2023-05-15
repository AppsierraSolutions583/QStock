package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.QStockShippingPage;

public class QStockShippingPageTest extends TestBase
{
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void qStockShippping()
	{
		QStockShippingPage qsp = new QStockShippingPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);
		
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(qsp.qStockShippingConfirm(),"1");
	    sa.assertTrue(qsp.dateFilter(),"2"); 
	    sa.assertTrue(qsp.userFilter(),"3");
	    sa.assertTrue(qsp.activityFilter(),"4");
	    sa.assertTrue(qsp.docFilter(),"5");
	    sa.assertTrue(qsp.messageFilter(),"6");
	    
	    sa.assertAll();
	}
	
}
