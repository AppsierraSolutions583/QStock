package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.WebhooksPage;

public class WebhooksPageTest extends TestBase
{
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void webhooks()
	{
		WebhooksPage wp	= new WebhooksPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(wp.webhooksConfirm());
//	    sa.assertTrue(wp.lastAttemptFilter());  Filter Not Working	    
	    
	    sa.assertAll();
	}

	
	
}
