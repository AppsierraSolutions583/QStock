package com.QStock.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class VendorsPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath = "(//a[text()='Vendors'])[1]")
	private WebElement vendors;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//a[@id='PriceListItemHref']")
	private WebElement priceLists;
	
	@FindBy(xpath = "//a[@id='VendorManagerHref']")
	private WebElement vendorManager;
	
	@FindBy(xpath = "//a[@id='WarehouseItemVendorsHref']")
	private WebElement warehouseItemVendors;
	
	@FindBy(xpath = "//a[@id='VendorReturnsHref']")
	private WebElement vendorReturns;
	
	@FindBy(xpath = "//input[@id='vendorManagerSearch']")
	private WebElement vendorSearch;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-play']")
	private WebElement vendorSearchBtn;
	
	@FindBy(xpath = "(//input)[10]")
	private WebElement priceListSearch;
	
	@FindBy(xpath = "(//button)[10]")
	private WebElement priceListSearchBtn;
	
	@FindBy(xpath = "//input[@value='Add New Price List']")
	private WebElement addNewPriceList;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancel;
	
	@FindBy(xpath = "(//strong)[4]")
	private WebElement orderConfirm;
	
	@FindBy(xpath = "(//a[text()='Items'])[2]")
	private WebElement items;
	
	@FindBy(xpath = "//a[text()='Add New Vendor']")
	private WebElement addNewVendor;
	
	@FindBy(xpath = "//input[@id='AddVendorButton']")
	private WebElement addNewVendorBtn;
	
	public VendorsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean IdFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("ID", "V48");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("VendorID", 1);
		boolean check = value.contains("V48");
		clearFilter("ID");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean vendorFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Vendor", "IBM");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("VendorName", 1);
		boolean check = value.contains("IBM");
		clearFilter("Vendor");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean contactFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Contact", "FedEx");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Contact", 1);
		boolean check = value.contains("FedEx");
		clearFilter("Contact");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean cityFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("City", "Sedona");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("City", 1);
		boolean check = value.contains("Sedona");
		clearFilter("City");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean stateFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("State", "CA");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("State", 1);
		boolean check = value.contains("CA");
		clearFilter("State");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean countryFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Country", "USA");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Country", 1);
		boolean check = value.contains("USA");
		clearFilter("Country");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean vendorSearch() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(vendorSearch, "VEN-000013");
		click(vendorSearchBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectFieldsText("VendorID", 1).contains("VEN-000013");
		return check;
	}
	
	public boolean priceListSearch() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
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
		sendKeys(priceListSearch,"Drop Ship CW");
		click(priceListSearchBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectFieldsText("PriceListID", 1).contains("Drop Ship CW");
		return check;
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
		click(vendors);
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
	
	public boolean stockCodeFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseItemVendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Stock Code", "00259K");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("StockCode", 1);
		boolean check = value.contains("00259K");
		clearFilter("Stock Code");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean itemDescFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseItemVendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Item Description", "Widget");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("ItemDescription", 1);
		boolean check = value.contains("Widget");
		clearFilter("Item Description");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean warehouseFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseItemVendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Warehouse", "150");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Warehouse", 1);
		boolean check = value.contains("150");
		clearFilter("Warehouse");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean preferredVendorFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseItemVendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Preferred Vendor", "Sysco Foods");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PreferredVendor", 1);
		boolean check = value.contains("Sysco Foods");
		clearFilter("Preferred Vendor");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean preferredVendorMatching() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseItemVendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String stockCode = collectFieldsText("StockCode", 1);
		clickLink("PreferredVendor", 0);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By stockCodeOnPopup = By.xpath("//input[@name='stockCode']");
		boolean check = driver.findElement(stockCodeOnPopup).getAttribute("ng-reflect-model").contains(stockCode);
		click(cancel);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean orderFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorReturns);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Order", "VR-0006");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("OrderNumber", 1);
		boolean check = value.contains("VR-0006");
		clearFilter("Order");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean typeFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorReturns);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Type", "VR");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Type", 1);
		boolean check = value.contains("VR");
		clearFilter("Type");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean vendorFilter2() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorReturns);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By filter = By.xpath("(//div[text()='Vendor']"
				+ "/following-sibling::div[2]/input)[2]");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(filter)).perform();
		sendKeys(driver.findElement(filter), "VEN-000036");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("VendorID", 2);
		log.info(value);
		boolean check = value.contains("VEN-000036 (CostCo - Dallas)");
	//	clearFilter("Vendor");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean dateFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorReturns);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Date", "02/23/2021");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("OrderDateString", 1);
		boolean check = value.contains("02/23/2021");
		clearFilter("Date");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean statusFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorReturns);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Status", "SHIPPED");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Status", 4);
		log.info(value);
		boolean check = value.contains("SHIPPED");
		clearFilter("Status");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean whFilter() {
		click(manage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendors);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorReturns);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("WH", "100");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Warehouse", 1);
		boolean check = value.contains("100");
		clearFilter("WH");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean orderMatching() {
		click(manage);
		click(vendors);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorReturns);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s1  = collectFieldsText("OrderNumber", 1);
		log.info(s1);
		By link = By.xpath("//div[@tabulator-field='OrderNumber']/strong");
		click(driver.findElements(link).get(0)); 
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(collectText(orderConfirm));
		boolean check = collectText(orderConfirm).contains(s1);
		return check;
	}
	
	public boolean vendorIDMatching() {
		click(manage);
		click(vendors);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorManager);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String id = collectFieldsText("VendorID", 2);
		clickLink("VendorID", 1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = getVendorDetails("VendorID").contains(id);
		return check;
	}
	
	public boolean stockCodeFilter2() {
		click(manage);
		click(vendors);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorManager);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clickLink("VendorID", 1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    click(items);
	    inputFilter("Stock Code", "C6");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("StockCode", 1);
		boolean check = value.contains("C6");
		clearFilter("Stock Code");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean descriptionFilter() {
		click(manage);
		click(vendors);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorManager);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clickLink("VendorID", 1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    click(items);
	    inputFilter("Description", "Gift Card");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("ItemDescription", 1);
		boolean check = value.contains("Gift Card");
		clearFilter("Description");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean warehouseDrp() {
		click(manage);
		click(vendors);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorManager);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickLink("VendorID", 1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    click(items);
	    selectDrp("Warehouse", "700");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Warehouse", 1);
		boolean check = value.contains("700");
	//	clearFilter("Description");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean addNewVendor() {
		boolean flag = false;
		click(manage);
		click(vendors);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(vendorManager);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addNewVendor);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputVendorDetails("VendorName", "testName");
		inputVendorDetails("City", "New York");
		inputVendorDetails("Country", "USA");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addNewVendorBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
	    inputFilter("Vendor", "testName");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean f1 = collectFieldsText("VendorName", 1).contains("testName");
	    boolean f2 = collectFieldsText("City", 1).contains("New York");
	    boolean f3 = collectFieldsText("Country", 1).contains("USA");
		if(f1==true && f2==true && f3==true)
			flag = true;
		clickLink("CanBeModified", 0);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public void inputFilter(String name, String value) {
		By filter = By.xpath("//div[text()='"+name+"']"
				+ "/following-sibling::div[2]/input");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(filter)).perform();
		sendKeys(driver.findElement(filter), value);
	}
	
	public void clearFilter(String name) {
		By filter = By.xpath("//div[text()='"+name+"']"
				+ "/following-sibling::div[2]/input");
		driver.findElement(filter).clear();
		sendKeys(driver.findElement(filter), Keys.ENTER);
	}
	
	public String collectFieldsText(String field, int index) {
		By fields = By.xpath("//div[@tabulator-field='"+field+"']");
		return  collectText(driver.findElements(fields).get(index));	
	}
	
	public void clickLink(String name ,int index) {
		By links = By.xpath("//div[@tabulator-field='"+name+"']/a");
		click(driver.findElements(links).get(index)); 
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
	
	public void inputVendorDetails(String name,  String value) {
		By input = By.xpath("//input[@name='"+name+"']");
		sendKeys(driver.findElement(input), value);
	}
	
	public String getVendorDetails(String name) {
		By input = By.xpath("//input[@name='"+name+"']");
		return driver.findElement(input).getAttribute("value");
	}
	
	public void selectDrp(String drpName, String option) {
		By drp = By.xpath("//div[contains(text(),'"+drpName+"')]/following-sibling::div/select");
		Select sc = new Select(driver.findElement(drp));
		sc.selectByVisibleText(option);
	}
}
