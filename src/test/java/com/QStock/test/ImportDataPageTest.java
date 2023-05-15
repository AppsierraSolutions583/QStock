package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.ImportDataPage;
import com.QStock.pageObjects.LoginPage;

public class ImportDataPageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void ImportData() {
		ImportDataPage idp = new ImportDataPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(idp.importDataConfirm(), "1");
		sa.assertTrue(idp.search(), "2");
		sa.assertTrue(idp.importDataBtn(), "3");
		sa.assertTrue(idp.configureBtn(), "4");
		sa.assertTrue(idp.cloneBtn(), "5");
		sa.assertTrue(idp.deleteBtn(), "6");
		sa.assertTrue(idp.entriesDrp(), "7");
		sa.assertTrue(idp.createNewImportDefBtn(), "8");
		sa.assertAll();
	}

}
