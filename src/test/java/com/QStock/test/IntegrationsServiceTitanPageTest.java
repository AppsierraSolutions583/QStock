package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.IntegrationsServiceTitanPage;
import com.QStock.pageObjects.LoginPage;

public class IntegrationsServiceTitanPageTest extends TestBase
{

SoftAssert sa = new SoftAssert();
	
	@Test
	public void IntegrationsServiceTitanTest()
	{
		
		IntegrationsServiceTitanPage ist = new IntegrationsServiceTitanPage(TestBase.driver);
		LoginPage lp = new LoginPage(TestBase.driver);	
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(ist.IntegrationsServiceTitanConfirm(),"1");
		sa.assertTrue(ist.setting(),"2");
		sa.assertTrue(ist.itemMapping(),"3");
		sa.assertTrue(ist.newItemMapping(),"4");

	
		sa.assertAll();
	}
	
}
