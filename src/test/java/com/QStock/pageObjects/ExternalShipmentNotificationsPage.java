package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class ExternalShipmentNotificationsPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public ExternalShipmentNotificationsPage(WebDriver driver) 
	{	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@tabulator-field='OrderNumber']//input[@placeholder='filter...']")
	private WebElement orderFilter;
	
	@FindBy(xpath="//div[@tabulator-field='ShipmentID']//input[@placeholder='filter...']")
	private WebElement carrierShipFilter;
	
	@FindBy(xpath="//div[@tabulator-field='Provider']//input[@placeholder='filter...']")
	private WebElement providerFilter;

	@FindBy(xpath="//div[@tabulator-field='Carrier']//input[@placeholder='filter...']")
	private WebElement carrierFilter;
	
	@FindBy(xpath="//div[@tabulator-field='Service']//input[@placeholder='filter...']")
	private WebElement serviceFilter;
	
	@FindBy(xpath="//div[@tabulator-field='CartonNumber']//input[@placeholder='filter...']")
	private WebElement cartonFilter;
	
	@FindBy(xpath="//div[@aria-sort='asc']//input[@placeholder='filter...']")
	private WebElement countFilter; 
	
	@FindBy(xpath="//div[@tabulator-field='SCAC']//input[@placeholder='filter...']")
	private WebElement scacFilter;
	
	@FindBy(xpath="//div[@tabulator-field='OrderNumber' and @role='gridcell']")
	private List <WebElement> orderField;
	
	@FindBy(xpath="//div[@tabulator-field='ShipmentID' and @role='gridcell']")
	private List <WebElement> carrierShipField;
	
	@FindBy(xpath="//div[@tabulator-field='Provider' and @role='gridcell']")
	private List <WebElement> providerField;
	
	@FindBy(xpath="//div[@tabulator-field='Carrier' and @role='gridcell']")
	private List <WebElement> carrierField;
	
	@FindBy(xpath="//div[@tabulator-field='Service' and @role='gridcell']")
	private List <WebElement> serviceField;
	
	@FindBy(xpath="//div[@tabulator-field='CartonNumber' and @role='gridcell']")
	private List <WebElement> cartonField;
	
	@FindBy(xpath="//div[@tabulator-field='CartonCount' and @role='gridcell']")
	private List <WebElement> countField;
	
	@FindBy(xpath="//div[@tabulator-field='SCAC' and @role='gridcell']")
	private List <WebElement> scacField;
	
	@FindBy(xpath = "//a[@role='button'][text()='Shipments']")
	private WebElement shipmentsDrp;
	
	@FindBy(xpath="//a[text()='External Shipment Notifications']")
	private WebElement externalShipNot;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//button[text()='First']")
	private WebElement first; 
	
	@FindBy(xpath = "//button[text()='Prev']")
	private WebElement previous;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next;
	
	@FindBy(xpath = "//button[text()='Last']")
	private WebElement last;
	
	public boolean externalShipmentNotificationsConfirm() {
		click(shipmentsDrp);
		click(externalShipNot);
		boolean check = collectText(panelHeading).contains("External Shipment Notifications");
		return check;
	}
	
	public boolean orderFilter() {
		click(shipmentsDrp);
		click(externalShipNot);
		String searchVal =(orderField.get(1)).getText();
		sendKeys(orderFilter,searchVal);
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean check = collectText(orderField.get(0)).contains(searchVal);
		return check;
	}
	
	
	public boolean carrierShipFilter() {
		click(shipmentsDrp);
		click(externalShipNot);
		String searchVal =(carrierShipField.get(1)).getText();
		sendKeys(carrierShipFilter,searchVal );
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(carrierShipField.get(0)).contains(searchVal);
		return check;
	}	
	
	
	public boolean providerFilter() {
		click(shipmentsDrp);
		click(externalShipNot);
		String searchVal =(providerField.get(1)).getText();
		sendKeys(providerFilter,searchVal);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean check = collectText(providerField.get(0)).contains(searchVal);
		return check;
	}	
	
	public boolean carrierFilter() {
		click(shipmentsDrp);
		click(externalShipNot);
		String searchVal =(carrierField.get(1)).getText();
		sendKeys(carrierFilter,searchVal);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean check = collectText(carrierField.get(0)).contains(searchVal);
		return check;
	}
	

	public boolean serviceFilter() {
		click(shipmentsDrp);
		click(externalShipNot);
		String searchVal =(serviceField.get(1)).getText();
		sendKeys(serviceFilter,searchVal);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean check = collectText(serviceField.get(0)).contains(searchVal);
		return check;
	}
	
	// Filter not working
	public boolean cartonFilter() {
		click(shipmentsDrp);
		click(externalShipNot);
		String searchVal =(cartonField.get(1)).getText();
		sendKeys(cartonFilter,searchVal);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean check = collectText(cartonField.get(0)).contains(searchVal);
		return check;
	}
	
	// Filter not working
	public boolean countFilter() {
		click(shipmentsDrp);
		click(externalShipNot);
		String searchVal =(countField.get(1)).getText();
		sendKeys(countFilter,searchVal);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(countField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean scacFilter() {
		click(shipmentsDrp);
		click(externalShipNot);
		String searchVal =(scacField.get(1)).getText();
		sendKeys(scacFilter,searchVal);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean check = collectText(scacField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean pagination() {
		boolean flag = false;
		click(shipmentsDrp);
		click(externalShipNot);
		
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
