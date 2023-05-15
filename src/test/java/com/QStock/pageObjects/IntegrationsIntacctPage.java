package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.QStock.generics.GeneralFunctions;

public class IntegrationsIntacctPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public IntegrationsIntacctPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath="//a[normalize-space()='Integrations']")
	private WebElement integrations;
	
	@FindBy(xpath="//a[@href='/Intacct/Configure/28']")
	private WebElement intacct;
	
	@FindBy(xpath="//div[text()='Intacct Interface Configuration']")
	private WebElement panelHeading;
	
	@FindBy(xpath="//div/h3[text()='Interface Settings']")
	private WebElement interfaceSettings;

	@FindBy(xpath="//a[text()='Orders / E-Commerce']")
	private WebElement orders;
	
	@FindBy(xpath="//div[text()='Download Sales Orders from Intacct']")
	private WebElement ordersPanelHeading;

	@FindBy(xpath="//a[text()='Locations / Dimensions']")
	private WebElement locations;
	
	@FindBy(xpath="//div[text()='Dimensions and Location Mapping']")
	private WebElement locationPanelHeading;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement zoneSearchFilter;
	
	@FindBy(xpath="//tbody/tr/td[2]/strong/a")
	private List <WebElement> zoneField;

	@FindBy(xpath="//a[text()='Miscellaneous']")
	private WebElement miscellaneous;

	@FindBy(xpath="//div[text()='Downloads / Sync FROM Intacct']")
	private WebElement miscellaneousPanelHeading;

	@FindBy(xpath="//a[text()='Transaction Definitions']")
	private WebElement transactionDefinitions;

	@FindBy(xpath="//h3[text()='Transaction Definitions']")
	private WebElement transactionPanelHeading;

	@FindBy(xpath="//a[text()='Map User Defs']")
	private WebElement mapUserDefs;

	@FindBy(xpath="//h3[text()='User Def Mapping']")
	private WebElement mapPanelHeading;

	@FindBy(xpath="//a[text()='Adjustment Definitions']")
	private WebElement adjustmentDef;

	@FindBy(xpath="//h3[text()='Adjustment Definitions']")
	private WebElement adjustmentPanelHeading;
	
	
	public boolean IntegrationsIntacctConfirm()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(intacct);
		boolean check = collectText(panelHeading).contains("Intacct Interface Configuration");
		return check;
	}
		
	public boolean interfaceSettings()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(intacct);
		boolean check = collectText(interfaceSettings).contains("Interface Settings");
	//	Assert.assertEquals(interfaceSettings.getText(),"Interface Settings");
	
		return check;
	}
	
	
	public boolean orders()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(intacct);
		click(orders);
		boolean check = collectText(ordersPanelHeading).contains("Download Sales Orders from Intacct");
		return check;
	}
	
	public boolean locations()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean flag = false;
		click(manage);
		click(integrations);
		click(intacct);
		click(locations);
		boolean f1 = collectText(locationPanelHeading).contains("Dimensions and Location Mapping");
	
		String searchVal = (zoneField.get(1)).getText();
		sendKeys(zoneSearchFilter,searchVal);
		boolean f2 =collectText(zoneField.get(0)).contains(searchVal);
		
		if(f1 && f2 == true){
			flag = true;
			}
		return flag;
	}
		
	public boolean miscellaneous()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(intacct);
		click(miscellaneous);
		boolean check = collectText(miscellaneousPanelHeading).contains("Downloads / Sync FROM Intacct");
		return check;
	}	
	
	public boolean transactionDefinitions()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(intacct);
		click(transactionDefinitions);
		boolean check = collectText(transactionPanelHeading).contains("Transaction Definitions");
		return check;
	}

	public boolean adjustmentDefinitions()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(intacct);
		click(adjustmentDef);
		boolean check = collectText(adjustmentPanelHeading).contains("Adjustment Definitions");
		return check;
	}

	public boolean mapUserDefs()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(intacct);
		click(mapUserDefs);
		boolean check = collectText(mapPanelHeading).contains("User Def Mapping");
		return check;
	}	
	
	
}
