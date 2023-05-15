package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class InventoryItemsPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	public InventoryItemsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Settings']")
	private WebElement settings;
	
	@FindBy(xpath="//a[text()='Inventory Items']")
	private WebElement inventoryItems;

	@FindBy(xpath="(//div[@class='panel-heading'])[1]")
	private WebElement panelHeading;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement SearchFilter;
	
	@FindBy(xpath="//tbody/tr/td[3]")
	private List <WebElement> desField;
	
	public boolean inventoryItemsConfirm()  {
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(settings);
		click(inventoryItems);
		boolean check = collectText(panelHeading).contains("Settings - Inventory Items");
		return check;
	}

	public boolean SearchFilter()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(settings);
		click(inventoryItems);
		String searchVal = (desField.get(1)).getText();
		sendKeys( SearchFilter, searchVal);
		
		boolean check = collectText(desField.get(0)).contains(searchVal);
		return check;
		
	}
	
}
