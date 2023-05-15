package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.SettingWorkOrdersPage;

public class SettingWorkOrdersPageTest extends TestBase
{
	SoftAssert sa=new SoftAssert();
	
	@Test
	public void workOrders() 
	{
		SettingWorkOrdersPage wop = new SettingWorkOrdersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());    
	    sa.assertTrue(wop.workOrdersConfirm(), "1");
	    sa.assertTrue(wop.SearchFilter(),"2");
	
	    sa.assertAll();
	    
	}
	
}
