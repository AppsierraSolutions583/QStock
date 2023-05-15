package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class MagentoApiPage extends GeneralFunctions
{

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	
	public MagentoApiPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashBoard;
	
	@FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[text()='Magento-API']")
	private WebElement magentoApi;
	
	@FindBy(xpath = "//p[@class='lead']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "(//input[@type='search'])[1]")
	private WebElement dateFilter;

	@FindBy(xpath = "//div[@tabulator-field='LogDateStr' and @role='gridcell']")
	private List <WebElement> dateField ;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	private WebElement userFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='UserID' and @role='gridcell']")
	private List <WebElement> userField;
	
	@FindBy(xpath = "(//input[@type='search'])[3]")
	private WebElement activityFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='ActionStr' and @role='gridcell']")
	private List <WebElement> activityField;
	
	@FindBy(xpath = "(//input[@type='search'])[4]")
	private WebElement docFilter;

	@FindBy(xpath = "//div[@tabulator-field='Link' and @role='gridcell']")
	private List <WebElement> docField;
	
	@FindBy(xpath = "(//input[@type='search'])[5]")
	private WebElement messageFilter;

	@FindBy(xpath = "//div[@tabulator-field='Message' and @role='gridcell']")
	private List <WebElement> messageField;

	
	
	public boolean magentoApiConfirm()
	{
		click(dashBoard);
		click(magentoApi);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(panelHeading).contains("Magento-API store");
		return check;
		
	}
	
	public boolean dateFilter()
	{
		click(dashBoard);
		click(magentoApi);
		
		String searchVal = (dateField.get(1)).getText();
		sendKeys(dateFilter,searchVal);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(dateField.get(0)).contains(searchVal);
		dateFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	public boolean userFilter()
	{
		click(dashBoard);
		click(magentoApi);
		
		String searchVal = (userField.get(1)).getText();
		sendKeys(userFilter,searchVal);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(userField.get(0)).contains(searchVal);
		userFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean activityFilter()
	{
		click(dashBoard);
		click(magentoApi);
		
		String searchVal = (activityField.get(1)).getText();
		sendKeys(activityFilter,searchVal);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(activityField.get(0)).contains(searchVal);
		activityFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return check;
	}	
	
	public boolean docFilter()
	{
		click(dashBoard);
		click(magentoApi);
		
		String searchVal = (docField.get(1)).getText();
		sendKeys(docFilter,searchVal);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(docField.get(0)).contains(searchVal);
		docFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	
	public boolean messageFilter()
	{
		click(dashBoard);
		click(magentoApi);
		
		String searchVal = (messageField.get(1)).getText();
		sendKeys(messageFilter,searchVal);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(messageField.get(0)).contains(searchVal);
		messageFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return check;
	}	
	
}
