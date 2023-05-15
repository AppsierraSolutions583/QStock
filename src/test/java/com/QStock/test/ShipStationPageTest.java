package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.ShipStationPage;

public class ShipStationPageTest extends TestBase
{

SoftAssert sa=new SoftAssert();
	
	@Test
	public void ShipStation() {
		ShipStationPage ss = new ShipStationPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(ss.shipStationConfirm(),"1");
	    sa.assertTrue(ss.dateFilter(),"2");
	    sa.assertTrue(ss.userFilter(),"3");
	    sa.assertTrue(ss.activityFilter(),"4");
	    sa.assertTrue(ss.docFilter(),"5");
	    sa.assertTrue(ss.messageFilter(),"6");
	    
	    sa.assertAll();
	}
	 
	
	
	
	
	
	
	
}
