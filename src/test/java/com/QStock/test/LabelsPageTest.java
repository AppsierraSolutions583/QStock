package com.QStock.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QStock.generics.TestBase;
import com.QStock.pageObjects.LabelsPage;
import com.QStock.pageObjects.LoginPage;


public class LabelsPageTest extends TestBase
{

	SoftAssert sa=new SoftAssert();
	
	@Test
	public void labelsPage() 
	{
		LabelsPage lbp = new LabelsPage(TestBase.driver); 
		LoginPage lp=new LoginPage(TestBase.driver);
	    sa.assertTrue(lp.positiveLoginTest());  
	    sa.assertTrue(lbp.labelsConfirm(),"1");
	    sa.assertTrue(lbp.labelNameFilter(),"2");
	    sa.assertTrue(lbp.xrefDescFilter(),"3");
	   	sa.assertTrue(lbp.labelType(),"4");
	  	sa.assertTrue(lbp.trackingRule(),"5");
	    sa.assertTrue(lbp.addLabel(),"6");

	    sa.assertAll();
	}   
		
	
}
