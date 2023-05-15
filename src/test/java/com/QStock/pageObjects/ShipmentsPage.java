package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class ShipmentsPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//a[@role='button'][text()='Shipments']")
	private WebElement shipmentsDrp;
	
	@FindBy(xpath = "//a[@href='/Shipment/Shipments']")
	private WebElement shipments;
	
//	@FindBy(xpath = "//div[@tabulator-field='SONumber']//input[@placeholder='filter...']")
//	private WebElement orderFilter;

	@FindBy(xpath = "(//input[@placeholder='filter...'])[1]")
	private WebElement orderFilter;
	
	
	@FindBy(xpath = "//div[@tabulator-field='ShipmentID']//input[@placeholder='filter...']")
	private WebElement qsShipmentFilter ;
	
	@FindBy(xpath = "//div[@tabulator-field='MasterTrackingNumber']//input[@placeholder='filter...']")
	private WebElement trackingFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='ShipTo']//input[@placeholder='filter...']")
	private WebElement shippedToFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='warehouse']//input[@placeholder='filter...']")
	private WebElement fromWarehouseFilter ;
	
	@FindBy(xpath = "//div[@tabulator-field='UserID']//input[@placeholder='filter...']")
	private WebElement byUserFilter ;

	@FindBy(xpath = "//div[@tabulator-field='Carrier']//input[@placeholder='filter...']")
	private WebElement carrierFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='Service']//input[@placeholder='filter...']")
	private WebElement serviceFilter ;
	
	@FindBy(xpath = "//div[@tabulator-field='SONumber' and @role='gridcell']")
	private List<WebElement> orderField  ;
	
	@FindBy(xpath = "//div[@tabulator-field='ShipmentID' and @role='gridcell']")
	private List<WebElement> qsShipmentField  ;
	
	@FindBy(xpath = "//div[@tabulator-field='MasterTrackingNumber' and @role='gridcell']")
	private List<WebElement> trackingField;
	
	@FindBy(xpath = "//div[@tabulator-field='ShipTo' and @role='gridcell']")
	private List<WebElement>  shippedToField;
	
	@FindBy(xpath = "//div[@tabulator-field='warehouse' and @role='gridcell']")
	private List<WebElement>  fromWareHouseField;
	
	@FindBy(xpath = "//div[@tabulator-field='UserID' and @role='gridcell']")
	private List<WebElement> byUserField ;
	
	@FindBy(xpath = "//div[@tabulator-field='Carrier' and @role='gridcell']")
	private List<WebElement>  carrierField;
	
	@FindBy(xpath = "//div[@tabulator-field='Service' and @role='gridcell']")
	private List<WebElement>  serviceField;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next ;

	@FindBy(xpath = "//button[text()='Last']")
	private WebElement last ;

	@FindBy(xpath = "//button[text()='First']")
	private WebElement first;
	
	@FindBy(xpath = "//button[text()='Prev']")
	private WebElement previous ;
	
	public ShipmentsPage(WebDriver driver) 
	{	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean shipmentsConfirm() {
		click(shipmentsDrp);
		click(shipments);
		boolean check = collectText(panelHeading).contains("Shipments");
		return check;
	}
	
	public boolean orderFilter() {
		click(shipmentsDrp);
		click(shipments);
		
		String searchVal = (orderField.get(1)).getText();
		sendKeys(orderFilter,searchVal);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(orderField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean qsShipmentFilter() {
		click(shipmentsDrp);
		click(shipments);
		
		String searchVal = (qsShipmentField.get(1)).getText();
		sendKeys(qsShipmentFilter,searchVal);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(qsShipmentField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean trackingFilter() {
		click(shipmentsDrp);
		click(shipments);
		
		String searchVal = (trackingField.get(1)).getText();
		sendKeys(trackingFilter,searchVal);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(trackingField.get(0)).contains(searchVal);
		return check;
	}

	//ShippedToFilter Not Working
	public boolean shippedToFilter() {
		click(shipmentsDrp);
		click(shipments);
		
		String searchVal = (shippedToField.get(1)).getText();
		sendKeys(shippedToFilter,searchVal);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(shippedToField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean fromWareHouse() {
		click(shipmentsDrp);
		click(shipments);
		
		String searchVal = (fromWareHouseField.get(1)).getText();
		sendKeys(fromWarehouseFilter,searchVal);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		boolean check = collectText(fromWareHouseField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean byUserFilter() {
		click(shipmentsDrp);
		click(shipments);
		
		String searchVal = (byUserField.get(1)).getText();
		sendKeys(byUserFilter,searchVal);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(byUserField.get(0)).contains(searchVal);
		return check;
	}
	
	
	public boolean carrierFilter() {
		click(shipmentsDrp);
		click(shipments);
		
		String searchVal = (carrierField.get(1)).getText();
		sendKeys(carrierFilter,searchVal);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(carrierField.get(0)).contains(searchVal);
		return check;
	}	
	
	public boolean serviceFilter() {
		click(shipmentsDrp);
		click(shipments);
		
		String searchVal = (serviceField.get(1)).getText();
		sendKeys(serviceFilter,searchVal);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		boolean check = collectText(serviceField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean pagination() {
		boolean flag = false;
		click(shipmentsDrp);
		click(shipments);
			
	//	log.info("attribute disabled: " + last.getAttribute("disabled"));
		String f1 = first.getAttribute("disabled");
		log.info("disabled for first: " + first.getAttribute("disabled"));
		String f2 = previous.getAttribute("disabled");
		log.info("disabled for prev: " + previous.getAttribute("disabled"));
		clickWithJS(next);
		
		log.info("clicked on next");
		String f3 = first.getAttribute("disabled");
		log.info("disabled for first: " + first.getAttribute("disabled"));
		String f4 = previous.getAttribute("disabled");
		log.info("disabled for prev: " + previous.getAttribute("disabled"));
		clickWithJS(previous);
		
		clickWithJS(last);
		
		String f5 = last.getAttribute("disabled");
		log.info("disabled for last: " + last.getAttribute("disabled"));
		String f6 = last.getAttribute("disabled");
		log.info("disabled for last: " + last.getAttribute("disabled"));
		if(f1.contains("true") && f2.contains("true") && f3==null && f4==null && f5.contains("true") && f6.contains("true"))
		flag = true;
		return flag;
	}

	
}
