package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.KitsAssembliesComponentsPage;
import com.QStock.pageObjects.LoginPage;

public class KitsAssembliesComponentsPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void kitsAssembliesComponents() {
		KitsAssembliesComponentsPage kacp = new KitsAssembliesComponentsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(kacp.kitsAssembliesComponentsConfirm(), "1");
		sa.assertTrue(kacp.componentItemFilter(), "2");
		sa.assertTrue(kacp.componentDescriptionFilter(), "3");
		sa.assertTrue(kacp.kitItemFilter(), "4");
		sa.assertTrue(kacp.kitDescriptionFilter(), "5");
	//	sa.assertTrue(kacp.warehouseDrp(), "6"); //no wh field
		sa.assertTrue(kacp.componentItemClickLink(), "7");
		sa.assertTrue(kacp.kitItemClickLink(), "8");
		sa.assertTrue(kacp.buildItemClickLink(), "9");
		sa.assertAll();
	}

}
