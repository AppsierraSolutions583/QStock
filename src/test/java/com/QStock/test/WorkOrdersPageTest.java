package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.WorkOrdersPage;

public class WorkOrdersPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void workOrders() {
		WorkOrdersPage wop = new WorkOrdersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(wop.workOrdersConfirm(),"1");
		sa.assertTrue(wop.warehouseDrp(),"2");
		sa.assertTrue(wop.zoneDrp(),"3");
		sa.assertTrue(wop.orderSearch(),"4");
		sa.assertTrue(wop.woFilter(),"5");
		sa.assertTrue(wop.scheduledFilter(),"6");
		sa.assertTrue(wop.assemblyFilter(),"7");
		sa.assertTrue(wop.woItemDescFilter(),"8");
		sa.assertTrue(wop.assignedToFilter(),"9");
		sa.assertTrue(wop.allocationStatusFilter(),"10");
		sa.assertTrue(wop.buildStatusFilter(),"11");
		sa.assertTrue(wop.buildQtyFilter(),"12");
		sa.assertTrue(wop.mfgToDateFilter(),"13");
		sa.assertTrue(wop.whFilter(),"14");
		sa.assertTrue(wop.zoneFilter(),"15");
		sa.assertTrue(wop.fromSalesOrderFilter(),"16");
		sa.assertTrue(wop.checkboxes(),"17");
		sa.assertTrue(wop.actionsEnabled(),"18");
		sa.assertTrue(wop.newWorkOrder(),"19");
		sa.assertTrue(wop.orderMatching(),"20");
		sa.assertTrue(wop.statusDrp(),"21");
		sa.assertAll();
	}
	
/*	@Test
	public void rough() {
		WorkOrdersPage wop = new WorkOrdersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(wop.actionsEnabled(),"18");
		sa.assertTrue(wop.newWorkOrder(),"19");
		sa.assertTrue(wop.orderMatching(),"20");
		sa.assertTrue(wop.statusDrp(),"21");
		sa.assertAll();
	}*/
}
