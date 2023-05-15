package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class ShippingMethodPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	public ShippingMethodPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath="//a[@href='/ShippingManager/Index/']")
	private WebElement shippingMethods;
	
	@FindBy(xpath="//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath="//input[@id='btnSaveShippingMethod']")
	private WebElement saveshippingMethodBtn;
	
	@FindBy(xpath="//input[@id='btnAddShippingMethod']")
	private WebElement addNewShippingMethod;

	@FindBy(xpath="//a[text()='Carton Types']")
	private WebElement cartonType;
	
	@FindBy(xpath="//input[@aria-controls='shippingcartontypelisttable']")
	private WebElement searchFilter;
	
	@FindBy(xpath="//table[@id='shippingcartontypelisttable']/tbody/tr/td[1]")
	private List <WebElement> carrierField;
	
	@FindBy(xpath="//input[@id='btnSaveShippingCartonType']")
	private WebElement saveCartonTypes;
	
	@FindBy(xpath="//input[@id='btnAddShippingCartonType']")
	private WebElement addCartonTypes;
	
	
	public boolean shippingMethodConfirm()
	{
		click(manage);
		click(shippingMethods);
		boolean check = collectText(panelHeading).contains("Shipping Methods");
		return check;
	}
	
	public boolean verifyShippingButtons()
	{
		boolean f1 = false,f2=false, flag=false;
		
		click(manage);
		click(shippingMethods);
		f1 = saveshippingMethodBtn.isDisplayed();
		f2 = addNewShippingMethod.isDisplayed();
		
		if(f1 && f2 == true)
		{
			flag= true;
		}
		return flag;
	}
	
	public boolean cartonTypeConfirm()
	{
		click(manage);
		click(shippingMethods);
		click(cartonType);
		
		String searchVal = (carrierField.get(2)).getText();
		sendKeys(searchFilter,searchVal);
		
		boolean check = collectText(carrierField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean verifyCartoonButtons()
	{
		boolean f1 = false,f2=false, flag=false;
		
		click(manage);
		click(shippingMethods);
		click(cartonType);
		
		f1 = saveCartonTypes.isDisplayed();
		f2 = addCartonTypes.isDisplayed();
		
		if(f1 && f2 == true)
		{
			flag= true;
		}
		return flag;
	}
	
}
