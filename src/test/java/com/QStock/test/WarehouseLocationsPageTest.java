package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.WarehouseLocationsPage;

public class WarehouseLocationsPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void  warehouseLocations() {
		 WarehouseLocationsPage wlp = new   WarehouseLocationsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(wlp.warehouseLocationsConfirm(), "1");
		sa.assertTrue(wlp.search1(), "2");
		sa.assertTrue(wlp.search2(), "3");
		sa.assertTrue(wlp.entriesDrp1(), "4");
		sa.assertTrue(wlp.entriesDrp2(), "5"); 
		sa.assertTrue(wlp.addNewLocation(), "6");
		sa.assertTrue(wlp.addNewZoneTemplate(), "7");
		sa.assertTrue(wlp.warehouseLink(), "8"); 
		sa.assertTrue(wlp.zonesLink(), "9");
		sa.assertTrue(wlp.binsLink(), "10");
		sa.assertTrue(wlp.templateNameLink(), "11"); 
		sa.assertTrue(wlp.inventoryLink(), "12");
		sa.assertTrue(wlp.configureLink(), "13");
		sa.assertTrue(wlp.binsLink2(), "14");
		sa.assertTrue(wlp.zonesLink2(), "15");
		sa.assertTrue(wlp.cloneLink(), "16");
		sa.assertTrue(wlp.deleteLink(), "17");
		sa.assertAll();
	}

}
