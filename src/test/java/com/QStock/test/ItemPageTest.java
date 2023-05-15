package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.ItemPage;
import com.QStock.pageObjects.LoginPage;

public class ItemPageTest extends TestBase{
	
	SoftAssert sa = new SoftAssert();
	@Test
	public void Item() {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		ItemPage ip = new ItemPage(TestBase.driver);
		ip.ItemTab();
		ip.ItemPages();
		ip.ExportItem();
		ip.StyleTab();
		ip.StylePages();
		ip.UomSearchFiletr();
		ip.TrackingRulePages();
		ip.AIMapPages();
		ip.WarehouseItemVendorTab();
		ip.WarehouseItemPages();
		ip.CrossReferenceTab();
		ip.CrossreferencePages();
	}

}
