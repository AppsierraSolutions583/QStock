package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.InventoryPage;
import com.QStock.pageObjects.LoginPage;

public class InventoryPageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void InventoryModule() {
		
		
		
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		
		InventoryPage ip=new InventoryPage(TestBase.driver);
		sa.assertTrue(ip.goToInventoryManagement());
	//	ip.useWarehouseFilter();
	//	ip.useAllCheckbox();
		ip.goThroughAllAvailablePages();
		
		
		
		
		
		
		sa.assertAll();
		lp.signOut();
		
	}
	
	

}
