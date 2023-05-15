package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LoginPage;
import com.QStock.pageObjects.WarehouseTransferOrdersPage;

public class WarehouseTransferOrdersPageTest  extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void WarehouseTransferOrders() {
		WarehouseTransferOrdersPage wtop = new WarehouseTransferOrdersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(wtop.warehouseTransferOrdersConfirm(), "1");
	    sa.assertTrue(wtop.warehouseDrp(), "2");
	    sa.assertTrue(wtop.sourceDrp(), "3");
	    sa.assertTrue(wtop.statusDrp(), "4");
	    sa.assertTrue(wtop.orderSearch(), "5");
	    sa.assertTrue(wtop.orderDates(), "6");
	    sa.assertTrue(wtop.ordersPerPage(), "7");
	    sa.assertTrue(wtop.ordersFilter(), "8");
	    sa.assertTrue(wtop.typeFilter(), "9");
	    sa.assertTrue(wtop.customerFilter(), "10");
	    sa.assertTrue(wtop.dateFilter(), "11");
	 // sa.assertTrue(wtop.shipViaFilter(), "12");
	    sa.assertTrue(wtop.statusFilter(), "13");
	 // sa.assertTrue(wtop.paymentFilter(), "14");
	    sa.assertTrue(wtop.whFilter(), "15");
	    sa.assertTrue(wtop.sourceFilter(), "16");
	    sa.assertTrue(wtop.tagsFilter(), "17");
	    sa.assertTrue(wtop.verifyCreateNewButton(), "18");
	    sa.assertTrue(wtop.verifyDownloadServiveTitanBatchesButton(), "19");
	    sa.assertTrue(wtop.checkboxes(), "20");
	    sa.assertTrue(wtop.actionsEnabled(), "21");
	//    sa.assertTrue(wtop.pagination(), "22");
	//  sa.assertTrue(wtop.ordersNeedingAttention(), "random");
	    sa.assertAll();
	}

	
	@Test
	public void rough() {
		WarehouseTransferOrdersPage wtop = new WarehouseTransferOrdersPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());
	    sa.assertTrue(wtop.ordersPerPage(), "7");
	    sa.assertTrue(wtop.ordersFilter(), "8");
	    sa.assertAll();   
	}
}
