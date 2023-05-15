package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.QStock.generics.GeneralFunctions;

public class IntegrationsShipStationPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public IntegrationsShipStationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath="//a[normalize-space()='Integrations']")
	private WebElement integrations;
	
	@FindBy(xpath="(//a[text()='ShipStation'])[2]")
	private WebElement shipStation;
	
	@FindBy(xpath="//div[text()='ShipStation Interface Configuration']")
	private WebElement shipStationPanelHeading;
	
	@FindBy(xpath="//h3[text()='Basic Settings']")
	private WebElement basicPanelHeading;
	
	@FindBy(xpath="//input[@aria-controls='carrierservicetable']")
	private WebElement shipStationSearchFilter;
	
	@FindBy(xpath="//tbody/tr/td[3]")
	private List <WebElement> serviceField;
	
	@FindBy(xpath="//a[text()='Advanced Settings']")
	private WebElement advancedSetting;

	@FindBy(xpath="//h3[text()='Advanced ShipStation Settings']")
	private WebElement advancedPanelHeading;

	@FindBy(xpath="//a[text()='Item Mapping']")
	private WebElement itemMapping;

	@FindBy(xpath="//h4[text()='Item mappings']")
	private WebElement itemMapPanelHeading;

	@FindBy(xpath="//a[text()='New item mapping']")
	private WebElement newItemMapping;

	@FindBy(xpath="//div[@class='panel-heading']")
	private WebElement addItemMapPanelHeading;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement addItemMapButton;

	public boolean IntegrationsShipStationConfirm()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(manage);
		click(integrations);
		click(shipStation);	
		boolean check = collectText(shipStationPanelHeading).contains("ShipStation Interface Configuration");	
		return check;
	}
		
	public boolean basicSetting()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(manage);
		click(integrations);
		click(shipStation);	
		boolean check = collectText(basicPanelHeading).contains("Basic Settings");	
		return check;
	}
	
	public boolean shipSationSearchFilter()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(manage);
		click(integrations);
		click(shipStation);
		String searchVal = (serviceField.get(1)).getText();
		sendKeys( shipStationSearchFilter, searchVal);
		
		boolean check = collectText(serviceField.get(0)).contains(searchVal);
		return check;
		
	}
	
	public boolean advancedSetting()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(shipStation);
		click(advancedSetting);
		
		boolean check = collectText(advancedPanelHeading).contains("Advanced ShipStation Settings");
		
		return check;	
	}

	public boolean itemMapping()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(shipStation);	
		click(itemMapping);
		
		boolean check = collectText(itemMapPanelHeading).contains("Item mappings");
		
		return check;
	}
	
	public boolean newItemMapping()
	{	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(shipStation);
		click(itemMapping);
		
		click(newItemMapping);
		boolean check = collectText(addItemMapPanelHeading).contains("Add Item Mapping");
	
		Assert.assertTrue(addItemMapButton.isDisplayed());	
	
		return check;
	
	}
}
