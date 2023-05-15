package com.QStock.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.QStock.generics.GeneralFunctions;

public class IntegrationsServiceTitanPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public IntegrationsServiceTitanPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath="//a[normalize-space()='Integrations']")
	private WebElement integrations;
	
	@FindBy(xpath="(//a[text()='ServiceTitan'])[2]")
	private WebElement serviceTitan;

	@FindBy(xpath="//div[@class='panel-heading']")
	private WebElement serviceTitanPanelHeading;
	
	@FindBy(xpath="//a[text()='Settings']")
	private WebElement setting;
	
	@FindBy(xpath="//h5[text()='ServiceTitan API Settings']")
	private WebElement settingPanelHeading;
	
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
	
	
	public boolean IntegrationsServiceTitanConfirm()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(manage);
		click(integrations);
		click(serviceTitan);
			
		boolean check = collectText(serviceTitanPanelHeading).contains("ServiceTitan Interface Configuration");	
		return check;
	}

	public boolean setting()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(manage);
		click(integrations);
		click(serviceTitan);
		click(setting);	
		boolean check = collectText(settingPanelHeading).contains("ServiceTitan API Settings");	
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
		click(serviceTitan);	
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
		click(serviceTitan);	
		click(itemMapping);
		
		click(newItemMapping);
		boolean check = collectText(addItemMapPanelHeading).contains("Add Item Mapping");
	
		Assert.assertTrue(addItemMapButton.isDisplayed());	
	
		return check;
	}

}
