package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.ExportDataPage;
import com.QStock.pageObjects.LoginPage;

public class ExportDataPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void exportData() {
		ExportDataPage edp = new ExportDataPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(edp.exportDataConfirm(), "1");
	    sa.assertTrue(edp.selectInventoryForExport(), "2");
		sa.assertAll();
		
	}

}
