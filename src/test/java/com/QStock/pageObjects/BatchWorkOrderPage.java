package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class BatchWorkOrderPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(BatchWorkOrderPage.class);

	@FindBy(xpath = "//a[text()='Work Orders']")
	private WebElement workOrders;

	@FindBy(xpath = "//a[@href=\"/WorkOrderManager\"]")
	private WebElement workOrders1;

	@FindBy(xpath = "//*[contains(text(),'Loading')]")
	private WebElement loading;

	@FindBy(xpath = "//select[@id='warehouse']")
	private WebElement warehouse;

	@FindBy(xpath = "//select[@id='dateFilter']")
	private WebElement lastFilter;
	
	@FindBy(xpath = "//select[@id='typeFilter']")
	private WebElement typeFilter;
	
	@FindBy(xpath = "//select[@id='statusFilter']")
	private WebElement statusFilter;

	@FindBy(xpath = "//input[@id='showActiveColumn']")
	private WebElement checkboxShowInactive;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement btnNext;

	@FindBy(xpath = "//button[contains(text(),'Last')]")
	private WebElement btnlast;

	@FindBy(xpath = "//button[contains(@aria-label,'Show Page')]")
	private List<WebElement> listOfPages;

	@FindBy(xpath = "//input[@id='QuickCsv']")
	private WebElement btnDownloadCs;

	@FindBy(xpath = "//input[@id='QuickXls']")
	private WebElement btnDownloadXlsx;

	@FindBy(xpath = "//a[contains(text(),'Export all data to .csv')]")
	private WebElement btnExportAll;

	@FindBy(xpath = "//button[contains(text(),'Prev')]")
	private WebElement btnPrev;

	@FindBy(xpath = "//button[contains(text(),'First')]")
	private WebElement btnFirst;

	@FindBy(xpath = "//button[contains(text(),'Last')]")
	private WebElement btnLast;

	@FindBy(xpath = "//div[@class='tabulator-col']/div/div[2]/span/input")
	private WebElement selectAllCheckbox;

	@FindBy(xpath = "(//div[@tabulator-field='PT_Number'])[1]/div/div[3]/input")
	private WebElement workOrderSearch;

	@FindBy(xpath = "(//div[@tabulator-field='WO_BuildDate'])[1]/div/div[3]/input")
	private WebElement scheduled;

	@FindBy(xpath = "(//div[@tabulator-field='WO_StockCode'])[1]/div/div[3]/input")
	private WebElement assembly;

	@FindBy(xpath = "(//div[@tabulator-field='WO_ItemDesc'])[1]/div/div[3]/input")
	private WebElement woItemDesc;
	
	@FindBy(xpath = "(//div[@tabulator-field='PT_Status'])[1]/div/div[3]/input")
	private WebElement allocatedStatus;

	@FindBy(xpath = "(//div[@tabulator-field='PT_SubStatus'])[1]/div/div[3]/input")
	private WebElement buildStatus;
	
	
	@FindBy(xpath = "(//div[@tabulator-field='WO_Qty'])[1]/div/div[3]/input")
	private WebElement buildQty;
	
	@FindBy(xpath = "(//div[@tabulator-field='WO_QtyToDate'])[1]/div/div[3]/input")
	private WebElement mfgDate;
	
	@FindBy(xpath = "(//div[@tabulator-field='Warehouse'])[1]/div/div[3]/input")
	private WebElement warehousesearch;
	
	@FindBy(xpath = "(//div[@tabulator-field='Zone'])[1]/div/div[3]/input")
	private WebElement zone;
	
	

	@FindBy(xpath = "//div[contains(text(),'Group results by:')]/a")
	private List<WebElement> groupingList;
	
	@FindBy(xpath = "//input[@id='txtWOOrderSearch']")
	private WebElement orderSearchBox;
	
	@FindBy(xpath = "//button[@id='performOrderSearch']")
	private WebElement orderSearchBtn;
	
	
	
	

	public BatchWorkOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean goToBatchWorkOrders() {
		boolean flag = false;
		click(workOrders);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(workOrders1);

		flag = driver.getCurrentUrl().contains("WorkOrderManager");
		log.info("landed on Work Orders Page.");
		return flag;
	}

	public void useDropdown(WebElement element) {
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		explicitWait(element, 10);
		Select dropdown = new Select(element);
		List<WebElement> list = dropdown.getOptions();
		int sizeOfList = list.size();

		for (int i = 1; i < +sizeOfList; i++) {
			dropdown.selectByIndex(i);
			try {
				Thread.sleep(7000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dropdown.selectByIndex(0);
	}

	public void goThroughAllAvailablePages() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(selectAllCheckbox);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listOfPages.size(); i++) {
			listOfPages.get(i).click();
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		click(btnFirst);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnFirst);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void useWarehousedropdown() {
		useDropdown(warehouse);
	}

	public void useStatusdropdown() {
		useDropdown(statusFilter);
	}

	public void useSearch() {
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(workOrderSearch, "11402");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(workOrderSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(scheduled, "5/5/2022");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(scheduled, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(assembly, "B300FG");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(assembly, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(woItemDesc, "B300FG");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(woItemDesc, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(allocatedStatus, "UNALLOCATED");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(allocatedStatus, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(buildStatus, "IN-PRODUCTION");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(buildStatus, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sendKeys(buildQty, "20");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(buildQty, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sendKeys(mfgDate, "20");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(mfgDate, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		sendKeys(warehousesearch, "100");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(warehousesearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sendKeys(zone, "101");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(zone, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	

	}

	

	public void orderSearchBox() {
		
		sendKeys(orderSearchBox,"WO-11404");
		click(orderSearchBtn);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sendKeys(orderSearchBox,Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
