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

public class BatchWorkOrdersPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "(//a[text()='Work Orders'])[1]")
	private WebElement workOrders;
	
	@FindBy(xpath = "//a[text()='Batch Work Orders']")
	private WebElement batchWorkOrders;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//input[@id='txtWOOrderSearch']")
	private WebElement orderSearchInput;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-play']")
	private WebElement orderSearchButton;
	
	@FindBy(xpath = "//button[@id='btnNewWorkOrder']")
	private WebElement newWorkOrderBtn;
	
	public BatchWorkOrdersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean batchWorkOrdersConfirm() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Batch Work Orders");
		return check;
	}
	
	public boolean warehouseDrp() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectDrp("Warehouse", "WH1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Warehouse", 2);
		boolean check = value.contains("WH1");
		selectDrp("Warehouse", "All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		}
	
	public boolean zoneDrp() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectDrp("Zone", "All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Zone", 2);
		boolean check = value.contains("A");
		return check;
		}
	
	public boolean statusDrp() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectDrp("Status", "Closed");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PT_SubStatus", 2);
		boolean check = value.contains("CLOSED");
		selectDrp("Status", "All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		}
	
	public boolean orderSearch() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(orderSearchInput, "WO-11385");
		click(orderSearchButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PT_Number", 1);
		boolean check = value.contains("WO-11385");
		sendKeys(orderSearchInput, "");
		sendKeys(orderSearchInput, Keys.ENTER);
		click(orderSearchButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean woFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Batch Work Order", "WO-11391");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PT_Number", 1);
		boolean check = value.contains("WO-11391");
		clearFilter("Batch Work Order");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean scheduledFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Scheduled", "12/16/2021");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_BuildDate", 1);
		boolean check = value.contains("12/16/2021");
		clearFilter("Scheduled");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean assemblyFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Assembly", "COCOA5LB");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_StockCode", 1);
		boolean check = value.contains("COCOA5LB");
		clearFilter("Assembly");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean woItemDescFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("WO Item Desc", "CBD Isolate - 1g");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_ItemDesc", 1);
		boolean check = value.contains("CBD Isolate - 1g");
		clearFilter("WO Item Desc");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean assignedToFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Assigned To", "");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_Department", 1);
		boolean check = value.contains("");
		clearFilter("Assigned To");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean allocationStatusFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Allocation Status", "PICKED");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PT_Status", 1);
		boolean check = value.contains("PICKED");
		clearFilter("Allocation Status");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean buildStatusFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Build Status", "PENDING");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PT_SubStatus", 1);
		boolean check = value.contains("PENDING");
		clearFilter("Build Status");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean buildQtyFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Build Qty", "5");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_Qty", 1);
		boolean check = value.contains("5");
		clearFilter("Build Qty");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean mfgToDateFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Mfg To Date", "10");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_QtyToDate", 1);
		boolean check = value.contains("10");
		clearFilter("Mfg To Date");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean whFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Warehouse", "100");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Warehouse", 1);
		boolean check = value.contains("100");
		clearFilter("Warehouse");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean zoneFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Zone", "A");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Zone", 1);
		boolean check = value.contains("A");
		clearFilter("Zone");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean batchesFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("# Batches", "2");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_BatchQty", 1);
		boolean check = value.contains("2");
		clearFilter("# Batches");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean newWorkOrder() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	click(newWorkOrderBtn);
	  	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	boolean check = collectText(panelHeading).contains("Kits, Assemblies & Components");
	  	return check;
	}
	
	public boolean orderMatching() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(batchWorkOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String order = collectFieldsText("PT_Number", 1);
		String orderMatch = clickWoLink(0);
		log.info(orderMatch);
		log.info(order);
		boolean check = orderMatch.contains(order);
		return check;
	}

	public void inputFilter(String name, String value) {
		By filter = By.xpath("//div[@class='tabulator-col-title' and text()='"+name+"']/following-sibling::div[2]/input");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(filter)).perform();
		sendKeys(driver.findElement(filter), value);
	}
	
	public void clearFilter(String name) {
		By filter = By.xpath("//div[@class='tabulator-col-title' and text()='"+name+"']/following-sibling::div[2]/input");
		driver.findElement(filter).clear();
		sendKeys(driver.findElement(filter), Keys.ENTER);
	}
	
	public String collectFieldsText(String field, int index) {
		By fields = By.xpath("//div[@tabulator-field='"+field+"']");
		return  collectText(driver.findElements(fields).get(index));	
	}
	
	public String clickWoLink(int index) {
		By woLinks = By.xpath("//div[@tabulator-field='PT_Number']/a");
		click(driver.findElements(woLinks).get(index));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By woInPopup = By.xpath("(//strong)[2]");
		 return collectText(driver.findElement(woInPopup)).toString(); 
	}
	
	public void selectDrp(String drpName, String option) {
		By drp = By.xpath("//div[contains(text(),'"+drpName+"')]/select");
		Select sc = new Select(driver.findElement(drp));
		sc.selectByVisibleText(option);
	}
	
}
