package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class ManageCustomersPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath = "(//a[text()='Customers'])[1]")
	private WebElement customers;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//a[@id='CustomerManagerHref']")
	private WebElement custManager;
	
	@FindBy(xpath = "//a[@id='PriceListItemHref']")
	private WebElement priceLists;
	
	@FindBy(xpath = "//input[@id='customerSearch']")
	private WebElement custSearch;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-play']")
	private WebElement custSearchBtn;
	
	@FindBy(xpath = "//span[text()='Customer Details']")
	private WebElement custDetails;
	
	@FindBy(xpath = "(//strong)[1]")
	private WebElement custIdOnPopup;
	
	@FindBy(xpath = "(//strong)[2]")
	private WebElement custNameOnPopup;
	
	@FindBy(xpath = "//span[@class='ui-button-icon ui-icon ui-icon-closethick']")
	private WebElement closePopup;
	
	@FindBy(xpath = "//a[@ng-reflect-router-link='/SOPriceList']")
	private WebElement returnToSoPriceList;
	
	@FindBy(xpath = "//button[@id='btnAddNewCustomer']")
	private WebElement addNewCustomer;
	
	@FindBy(xpath = "(//input)[3]")
	private WebElement priceListSearch;
	
	@FindBy(xpath = "(//button)[13]")
	private WebElement priceListSearchBtn;
	
	@FindBy(xpath = "//input[@class='priceListName']")
	private List<WebElement> priceListName;
	
	@FindBy(xpath = "//input[@value='Add New Price List']")
	private WebElement addNewPriceList;
	
	@FindBy(xpath = "//input[@id='BTsameST']")
	private WebElement billingAddSameAsShippingAdd;
	
	@FindBy(xpath = "//input[@value='Add Customer']")
	private WebElement addCustomer;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancel;
	
	public ManageCustomersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean manageCustomersConfirm() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(customers);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Customers");
		return check;	
	}
	
	public boolean customerSearch() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(customers);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(custSearch, "C12");
		click(custSearchBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectFieldsText("CustID", 1).contains("C12");
		return check;
	}
	
	public boolean idMatching() {
		boolean flag = false;
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(customers);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  String id = collectFieldsText("CustID", 1);
	  log.info(id);
	  clickLink("CustID", 0);
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  boolean f1 = visibilityCheck(custDetails);
	  boolean f2 = collectText(custIdOnPopup).contains(id);
	  if(f1==true && f2==true)
		  flag = true;
		return flag;
	}
	
	public boolean priceList() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(customers);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  String id = collectFieldsText("PriceLevel", 1);
	  log.info(id);
	  clickLink("PriceLevel", 0);
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  boolean f1 = collectText(priceLists).contains("Base Price");
	  click(returnToSoPriceList);
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return f1;
	}
	
	public boolean priceListSearch() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(customers);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(priceLists);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(priceListSearch,"CBD");
		click(priceListSearchBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectFieldsText("PriceListID", 1).contains("CBD");
		return check;
	}
	
	public boolean priceListItemsMatching() {
		boolean flag = false;
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(customers);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(priceLists);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String items = collectFieldsText("Items", 5);
	    int noOfItems = Integer.parseInt(items);
	    log.info(items);
	    log.info(noOfItems);
	   
	    clickLink("Items", 4);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    By noOfDelete = By.xpath("//a[@class='delete-price-list-item']");
	    int totalItems = driver.findElements(noOfDelete).size();
	    if(totalItems==noOfItems);
	    flag = true;
	    return flag;
	}
	
	public boolean addNewCustomer() {
		boolean flag = false;
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(customers);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addNewCustomer);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean f1 = visibilityCheck(custDetails);
	    custDetailsInput1("CustName", "Test Name");
	    custDetailsInput1("FirstName", "Test");
	    custDetailsInput1("LastName", "Name");
	    custDetailsInput1("CustID", "1234");
	    custDetailsInput1("CustName", "TestName");
		return f1;
	}
	
	public boolean addNewPriceList() {
		boolean flag = false;
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(customers);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(priceLists);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addNewPriceList);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean f1 = save.isEnabled();
		addPriceList("priceListID", "1234");
		addPriceList("priceListName", "testName");
		addPriceListType("priceListType", "PERITEM");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(save);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(priceListSearch, "1234");
		click(priceListSearchBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f2 = collectFieldsText("PriceListID", 1).contains("1234");
		clickLink("CanBeDeleted", 0);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f3 = driver.switchTo().alert().getText().contains("This Price List will be deleted permanently."
				+ " Do you want to proceed? ");
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(priceListSearch, "1234");
		click(priceListSearchBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By noDataAvailable = By.xpath("//span[text()='No Data Available']");
		boolean f4 = visibilityCheck(driver.findElement(noDataAvailable));
		if(f1==false && f2==true && f3==true && f4==true)
			flag = true;
	    return flag;	
	}
	
	public String collectFieldsText(String field, int index) {
		By fields = By.xpath("//div[@tabulator-field='"+field+"']");
		return  collectText(driver.findElements(fields).get(index));	
	}
	
	public void clickLink(String name ,int index) {
		By links = By.xpath("//div[@tabulator-field='"+name+"']/a");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElements(links).get(index)).perform();
		click(driver.findElements(links).get(index)); 
	}
	
	public void custDetailsInput1(String id, String value) {
		By input = By.xpath("//input[@class='form-control-sm text-box single-line' and @id='"+id+"']");
		sendKeys(driver.findElement(input), value);
	}
	
	public void custDetailsInput2(String id, String value) {
		By input = By.xpath("//input[@class='ShipTo form-control-sm text-box single-line' and @id='"+id+"']");
		sendKeys(driver.findElement(input), value);
	}
	
	public void selectDrp(String drpName, String option) {
		By drp = By.xpath("//p[contains(text(),'"+drpName+"')]/select");
		Select sc = new Select(driver.findElement(drp));
		sc.selectByVisibleText(option);
	}
	
	public void addPriceList(String name, String value) {
		By input = By.xpath("//input[@name='"+name+"']");
		sendKeys(driver.findElement(input),value);
	}
	
	public void addPriceListType(String name,  String option) {
	By priceListType = By.xpath("//select[@name]");
	Select sc = new Select(driver.findElement(priceListType));
	sc.selectByVisibleText(option);
	}
}
