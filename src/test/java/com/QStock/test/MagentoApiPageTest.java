package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.MagentoApiPage;

public class MagentoApiPageTest extends TestBase
{
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void fixedAssetReturns()
	{
		MagentoApiPage map = new MagentoApiPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);
		
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(map.magentoApiConfirm(),"1");
	    sa.assertTrue(map.dateFilter(),"2");
	    sa.assertTrue(map.userFilter(),"3");
	    sa.assertTrue(map.activityFilter(),"4");
	    sa.assertTrue(map.docFilter(),"5");
	    sa.assertTrue(map.messageFilter(),"6");
	
		sa.assertAll();
	}
	
}
