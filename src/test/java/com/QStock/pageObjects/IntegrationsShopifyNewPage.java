package com.QStock.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.QStock.generics.GeneralFunctions;

public class IntegrationsShopifyNewPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public IntegrationsShopifyNewPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//a[@href='#'][normalize-space()='Shopify'])[2]")
	private WebElement shopify;
	
	@FindBy(xpath="(//a[text()='QStock-New'])[2]")
	private WebElement shopifyNew;
	
	@FindBy(xpath="//h3[text()='Basic Settings']")
	private WebElement basicPanelHeading;
		
	@FindBy(xpath="//div[text()='Shopify Interface Configuration']")
	private WebElement shopifyNewPanelHeading;
	
	@FindBy(xpath="//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath="//a[normalize-space()='Integrations']")
	private WebElement integrations;
	
	@FindBy(xpath="//a[text()='Advanced Settings']")
	private WebElement advancedSetting;

	@FindBy(xpath="//h3[text()='Advanced Shopify Settings']")
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

	
	public boolean IntegrationsShopifyNewConfirm()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(shopify);
		click(shopifyNew);	
		boolean check = collectText(shopifyNewPanelHeading).contains("Shopify Interface Configuration");	
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
		click(shopify);
		click(shopifyNew);	
		boolean check = collectText(basicPanelHeading).contains("Basic Settings");	
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
		click(shopify);
		click(shopifyNew);	
		click(advancedSetting);
		
		boolean check = collectText(advancedPanelHeading).contains("Advanced Shopify Settings");
		
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
		click(shopify);
		click(shopifyNew);	
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
		click(shopify);
		click(shopifyNew);	
		click(itemMapping);
		
		click(newItemMapping);
		boolean check = collectText(addItemMapPanelHeading).contains("Add Item Mapping");
	
		Assert.assertTrue(addItemMapButton.isDisplayed());	
	
		return check;
	
	}

}
