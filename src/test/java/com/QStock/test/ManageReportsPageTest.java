package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ManageReportsPage;

public class ManageReportsPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void manageReports() {
		ManageReportsPage mrp = new ManageReportsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(mrp.manageReportsConfirm(), "1");
	    sa.assertTrue(mrp.editViewLinkCheck(), "2");
	    sa.assertTrue(mrp.addNewReport(), "3");
		sa.assertAll();
	}

}
