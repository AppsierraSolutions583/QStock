package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LanguagePage;
import com.QStock.pageObjects.LoginPage;

public class LanguagePageTest extends TestBase
{
SoftAssert sa=new SoftAssert();
	
	@Test
	public void  Language() 
	{
		LanguagePage lap = new LanguagePage(TestBase.driver); 
		LoginPage lp = new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());    
	    sa.assertTrue(lap.SearchFilter(),"1");
	
	    sa.assertAll();
	    
	}
	
	
	
	
	
}
