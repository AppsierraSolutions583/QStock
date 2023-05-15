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

public class WorkOrdersPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "(//a[text()='Work Orders'])[1]")
	private WebElement workOrders;
	
	@FindBy(xpath = "(//a[text()='Work Orders'])[2]")
	private WebElement workOrders2;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//input[@id='txtWOOrderSearch']")
	private WebElement orderSearchInput;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-play']")
	private WebElement orderSearchButton;
	
	@FindBy(xpath = "//button[@id='btnNewWorkOrder']")
	private WebElement newWorkOrderBtn;
	
	@FindBy(xpath = "//button[@id='btnQuickComplete']")
	private WebElement quickCompleteBtn;
	
	@FindBy(xpath = "//button[@id='cancelQC']")
	private WebElement cancelBtn;
	
	@FindBy(xpath = "//span[@class='ui-button-icon ui-icon ui-icon-closethick']")
	private WebElement crossBtn;
	
	@FindBy(xpath = "//button[@id='btnAllocateAll']")
	private WebElement allocateBtn;
	
	@FindBy(xpath = "//button[@id='btnUnAllocateAll']")
	private WebElement unAllocateBtn;
	
	@FindBy(xpath = "//button[@id='btnHoldOrders']")
	private WebElement holdOrdersBtn;
	
	public  WorkOrdersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean workOrdersConfirm() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Work Orders");
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
		click(workOrders2);
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
		click(workOrders2);
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
		click(workOrders2);
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
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(orderSearchInput, "WO-11360");
		click(orderSearchButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PT_Number", 1);
		boolean check = value.contains("WO-11360");
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
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Work Order", "WO-11371");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PT_Number", 1);
		boolean check = value.contains("WO-11371");
		clearFilter("Work Order");
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
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Scheduled", "3/16/2022");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_BuildDate", 1);
		boolean check = value.contains("3/16/2022");
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
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Assembly", "BKIT-S");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_StockCode", 1);
		boolean check = value.contains("BKIT-S");
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
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("WO Item Desc", "Stockable Kit R1-IN");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("WO_ItemDesc", 1);
		boolean check = value.contains("Stockable Kit R1-IN");
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
		click(workOrders2);
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
		click(workOrders2);
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
		click(workOrders2);
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
		click(workOrders2);
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
		click(workOrders2);
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
		click(workOrders2);
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
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Zone", "T3");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Zone", 2);
		boolean check = value.contains("T3");
		clearFilter("Zone");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean fromSalesOrderFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("From Sales Order", "");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("SONumber", 1);
		boolean check = value.contains("");
		clearFilter("From Sales Order");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean checkboxes() {
		boolean flag  = false;
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f1 = selectCheckBox(1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f2 = selectCheckBox(0);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f2==true && (f1==true || f1==false)==true) {
			flag = true;
		}
		
		return flag;
	}
	
	public boolean actionsEnabled() {
		boolean flag  = false;
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(workOrders2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectCheckBox(1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f1 = visibilityCheck(quickCompleteBtn);
		boolean f2 = visibilityCheck(allocateBtn);
		boolean f3 = visibilityCheck(unAllocateBtn);
		boolean f4 = visibilityCheck(holdOrdersBtn);
		
		if(f1==true && f2==true && f3==true && f4==true)
		   flag = true;
		click(quickCompleteBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(cancelBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean newWorkOrder() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(workOrders2);
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
	  	boolean check = collectText(panelHeading).contains("Create New Work Order");
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
		click(workOrders2);
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
		click(crossBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public void test() {
		click(workOrders);
		click(workOrders2);
		inputFilter("Work Order", "WO-11341");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clearFilter("Work Order");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		   log.info(collectFieldsText("PT_Number", 1));
		   selectDrp("Warehouse", "WH1");
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   selectDrp("Warehouse", "All");
		   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   selectCheckBox(2);
		   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		clickWoLink(3);
		   try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	
	public boolean selectCheckBox(int index) {
		By boxes = By.xpath("//input[@type='checkbox']");
		click(driver.findElements(boxes).get(index));
		boolean check = driver.findElements(boxes).get(index).isSelected();
		log.info(check);
		return check;
	}
	
	public void selectDrp(String drpName, String option) {
		By drp = By.xpath("//div[contains(text(),'"+drpName+"')]/select");
		Select sc = new Select(driver.findElement(drp));
		sc.selectByVisibleText(option);
	}

}
