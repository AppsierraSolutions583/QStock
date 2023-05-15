package com.QStock.pageObjects;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;



public class ShortOrderReAllocationPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public ShortOrderReAllocationPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Order Management ']")
	private WebElement orderManagement;
	
	@FindBy(xpath = "//a[text()='Short Order Re-Allocation']")
	private WebElement sortOrderReAllocation;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//select[@id='warehouse']")
	private WebElement warehouseDrp;
	
	@FindBy(xpath = "//select[@id='warehouse']/option")
	private List <WebElement> warehouseDrpOpts;
	
	@FindBy(xpath = "//select[@id='zone']")
	private WebElement zoneDrp;
	
	@FindBy(xpath = "//select[@id='zone']/option")
	private List <WebElement> zoneDrpOpts;

	@FindBy(xpath = "//div[@tabulator-field='Zone' and @role='gridcell']")
	private List <WebElement> zoneField;
	
	@FindBy(xpath = "//select[@id='sourceFilter']")
	private WebElement sourceDrp;
	
	@FindBy(xpath = "//select[@id='sourceFilter']/option")
	private List <WebElement> sourceDrpOpts;
	
	@FindBy(xpath = "//select[@id = 'typeFilter']")
	private WebElement typeDrp;

	@FindBy(xpath = "//select[@id = 'typeFilter']/option")
	private List <WebElement> typeDrpOpts;
	
	@FindBy(xpath = "//input[@id='soNumber']")
	private WebElement orderSearch;
	
	@FindBy(xpath = "//input[@id='orderFromDate']")
	private WebElement dateFromInput;
	
	@FindBy(xpath = "//input[@id='orderToDate']")
	private WebElement dateToInput;

	@FindBy(xpath = "//div[@tabulator-field='OrderDateString' and @role='gridcell']")
	private List <WebElement> dateField;
	
	
	@FindBy(xpath ="(//input[@placeholder='filter...'])[2]")
	private WebElement customerFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='CustomerName' and @role='gridcell']")
	private List <WebElement> customerField;
	
	
	public boolean sortOrderReAllocationConfirm()
	{
		click(orderManagement);
		click(sortOrderReAllocation);
		
		boolean check = collectText(panelHeading).contains("Short Orders");
		return check;	
	}
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[1]")
	private WebElement orderFilter;

	@FindBy(xpath = "//div[@tabulator-field='OrderNumber' and @role='gridcell']")
	private List <WebElement> orderField ; 
		
	
	
	
	public boolean orderFilter()
	{
		click(orderManagement);
		click(sortOrderReAllocation);
		
		String searchVal = ((orderField.get(2)).getText()).replace(" ", "");
		System.out.println(searchVal);
		
		sendKeys(orderFilter,searchVal);
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = (collectText(orderField.get(0))).contains(searchVal);
		orderFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return check;
	}

	
	
	public boolean customerFilter()
	{
		click(orderManagement);
		click(sortOrderReAllocation);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select sc = new Select(warehouseDrp);
		sc.selectByVisibleText("100");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String searchVal = (customerField.get(1)).getText();
		sendKeys(customerFilter,searchVal);
		
		System.out.println(searchVal);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(customerField.get(0)).contains(searchVal);	
		System.out.println(collectText(customerField.get(0)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		customerFilter.clear();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean zoneDrp() 
	{
		click(orderManagement);
		click(sortOrderReAllocation);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select sc = new Select(zoneDrp);
		sc.selectByVisibleText("A");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(zoneField.get(0)).contains("A");
		Select sc1 = new Select(zoneDrp);
		sc1.selectByVisibleText("All");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		return check;	
	}
	
	public boolean dates() 
	{
		click(orderManagement);
		click(sortOrderReAllocation);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String dt = (dateField.get(1)).getText(); //input from date
		System.out.println(dt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(dt));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		c.add(Calendar.DATE, 1);  // number of days to add
		String	dt2 = sdf.format(c.getTime());  // input to date
		
		
		
		sendKeys(dateFromInput, dt);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(dateToInput, dt2);
		dateToInput.sendKeys(Keys.ESCAPE);
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	boolean check = collectText(dateField.get(0)).contains(dt);
		
	log.info(collectText(dateField.get(0)));
	return check;
	}
	
}
