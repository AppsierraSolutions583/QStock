package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.FixedAssetTransfersPage;
import com.QStock.pageObjects.LoginPage;

public class FixedAssetTransfersPageTest extends TestBase
{
	SoftAssert sa=new SoftAssert();	
	
	@Test
	public void FixedAssetTransfers() 
	{
		FixedAssetTransfersPage fatp = new FixedAssetTransfersPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());	
	    sa.assertTrue(fatp.fixedAssetTransfersConfirm(),"1");
		sa.assertTrue(fatp.warehouseDrp(),"2");
		sa.assertTrue(fatp.zoneDrp(),"3");
		sa.assertTrue(fatp.orderFilter(),"4");
		sa.assertTrue(fatp.typeFilter(),"5");
		sa.assertTrue(fatp.customerFilter(),"6");
		sa.assertTrue(fatp.dateFilter(),"7");
	//	sa.assertTrue(fatp.shipViaFilter(),"8"); // Null Filter    
	    sa.assertTrue(fatp.statusFilter(),"9");  	
	//	sa.assertTrue(fatp.paymentFilter(),"10"); // Null Filter
		sa.assertTrue(fatp.whFilter(),"11");
		sa.assertTrue(fatp.sourceFilter(),"12");
	//	sa.assertTrue(fatp.tagFilter(),"13");   // Null Filter
	
		sa.assertAll();
		
	}
	
	
	
	
	
	
}
