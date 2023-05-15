package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.CompanyInfoPage;
import com.QStock.pageObjects.LoginPage;


public class CompanyInfoPageTest extends TestBase
{

	SoftAssert sa=new SoftAssert();
	
	@Test
	public void companyInfo() 
	{
		CompanyInfoPage cip = new CompanyInfoPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());    
	    sa.assertTrue(cip.companyInfoConfirm(), "1");
	    
	    sa.assertAll();
	}
}