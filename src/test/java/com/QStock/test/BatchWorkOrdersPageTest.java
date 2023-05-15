package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.BatchWorkOrdersPage;
import com.QStock.pageObjects.LoginPage;

public class BatchWorkOrdersPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void batchWorkOrders() {
		BatchWorkOrdersPage bwop = new BatchWorkOrdersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(bwop.batchWorkOrdersConfirm(), "1");
		sa.assertTrue(bwop.warehouseDrp(),"2");
	//	sa.assertTrue(bwop.zoneDrp(),"3"); buggy
		sa.assertTrue(bwop.statusDrp(),"4");
		sa.assertTrue(bwop.orderSearch(),"5");
		sa.assertTrue(bwop.woFilter(),"5");
		sa.assertTrue(bwop.scheduledFilter(),"6");
		sa.assertTrue(bwop.assemblyFilter(),"7");
		sa.assertTrue(bwop.woItemDescFilter(),"8");
		sa.assertTrue(bwop.assignedToFilter(),"9");
		sa.assertTrue(bwop.allocationStatusFilter(),"10");
		sa.assertTrue(bwop.buildStatusFilter(),"11");
		sa.assertTrue(bwop.buildQtyFilter(),"12");
		sa.assertTrue(bwop.mfgToDateFilter(),"13");
		sa.assertTrue(bwop.whFilter(),"14");
		sa.assertTrue(bwop.zoneFilter(),"15");
	//	sa.assertTrue(bwop.batchesFilter(),"16"); buggy
		sa.assertTrue(bwop.newWorkOrder(),"17");
		sa.assertTrue(bwop.orderMatching(),"18");
		sa.assertAll();
	}
}
