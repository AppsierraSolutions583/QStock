package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ShippingMethodPage;

public class ShippingMethodPageTest extends TestBase
{
	SoftAssert sa=new SoftAssert();
	
	
	@Test
	public void shippingMethod()
	{
		ShippingMethodPage smp = new ShippingMethodPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest(),"1");
		sa.assertTrue(smp.shippingMethodConfirm(),"2");
		sa.assertTrue(smp.verifyShippingButtons(),"3");
		sa.assertTrue(smp.cartonTypeConfirm(),"4");
		sa.assertTrue(smp.verifyCartoonButtons(),"5");
		
		sa.assertAll();
	}
	
	
	
	
	
}
