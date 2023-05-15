package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.VendorsPage;

public class VendorsPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void vendors() {
		VendorsPage vp = new  VendorsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(vp.IdFilter(), "1");
	    sa.assertTrue(vp.vendorFilter(), "2");
	    sa.assertTrue(vp.contactFilter(), "3");
	    sa.assertTrue(vp.cityFilter(), "4");
	    sa.assertTrue(vp.stateFilter(), "5");
	    sa.assertTrue(vp.countryFilter(), "6");
	    sa.assertTrue(vp.vendorSearch(), "7");
	    sa.assertTrue(vp.priceListSearch(), "8");
	    sa.assertTrue(vp.addNewPriceList(), "9");
	    sa.assertTrue(vp.stockCodeFilter(), "10");
	    sa.assertTrue(vp.itemDescFilter(), "11");
	    sa.assertTrue(vp.warehouseFilter(), "12");
	    sa.assertTrue(vp.preferredVendorFilter(), "13");
	    sa.assertTrue(vp.preferredVendorMatching(), "14");
	    sa.assertTrue(vp.orderFilter(), "15");
	    sa.assertTrue(vp.typeFilter(), "16");
	    sa.assertTrue(vp.vendorFilter2(), "17");
	    sa.assertTrue(vp.dateFilter(), "18");
	    sa.assertTrue(vp.statusFilter(), "19");
	    sa.assertTrue(vp.whFilter(), "20");
//	    sa.assertTrue(vp.orderMatching(), "21");
	    sa.assertTrue(vp.vendorIDMatching(), "22");
	    sa.assertTrue(vp.stockCodeFilter2(), "23");
	    sa.assertTrue(vp.descriptionFilter(), "24");
	    sa.assertTrue(vp.warehouseDrp(), "25");
	    sa.assertTrue(vp.addNewVendor(), "26");
		sa.assertAll();
	}

}
