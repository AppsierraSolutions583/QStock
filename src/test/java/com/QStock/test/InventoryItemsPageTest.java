package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.InventoryItemsPage;
import com.QStock.pageObjects.LoginPage;

public class InventoryItemsPageTest extends TestBase
{
	SoftAssert sa=new SoftAssert();
	
	@Test
	public void InventoryItems() 
	{
		InventoryItemsPage iip = new InventoryItemsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());    
	    sa.assertTrue(iip.inventoryItemsConfirm(),"1");
	    sa.assertTrue(iip.SearchFilter(),"2");
	
	    sa.assertAll();
	    
	}
	
	
	
	
}
