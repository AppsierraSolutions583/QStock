package com.QStock.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class ExportDataPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//span[text()='Tools']")
	private WebElement tools;
	
	@FindBy(xpath = "(//a[text()='Export Data'])[1]")
	private WebElement exportData;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//a[text()='Select inventory for export...']")
	private WebElement selectInvForExp;
	
	public ExportDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public boolean exportDataConfirm() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(exportData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Export Data");
		return check;
	}
	
	public boolean selectInventoryForExport() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(exportData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(selectInvForExp);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Inventory");
		return check;
	}

}
