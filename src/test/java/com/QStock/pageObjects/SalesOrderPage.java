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

public class SalesOrderPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(SalesOrderPage.class);

	@FindBy(xpath = "//a[text()='Order Management ']")
	private WebElement orderManagement;

	@FindBy(xpath = "//a[contains(text(),'Sales Orders')]")
	private WebElement salesOrders;

	@FindBy(xpath = "//*[contains(text(),'Loading')]")
	private WebElement loading;

	@FindBy(xpath = "//select[@id='warehouse']")
	private WebElement warehouse;

	@FindBy(xpath = "//select[@id='zone']")
	private WebElement zoneFilter;

	@FindBy(xpath = "//select[@id='sourceFilter']")
	private WebElement sourceFilter;

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

	@FindBy(xpath = "(//div[@tabulator-field='OrderNumber'])[1]/div/div[3]/input")
	private WebElement orderSearch;

	@FindBy(xpath = "(//div[@tabulator-field='Type'])[1]/div/div[3]/input")
	private WebElement typeSearch;

	@FindBy(xpath = "(//div[@tabulator-field='CustomerName'])[1]/div/div[3]/input")
	private WebElement customerSearch;

	@FindBy(xpath = "(//div[@tabulator-field='OrderDateString'])[1]/div/div[3]/input")
	private WebElement dateSearch;

	@FindBy(xpath = "(//div[@tabulator-field='ShipVia'])[1]/div/div[3]/input")
	private WebElement shipViaSearch;

	@FindBy(xpath = "//div[@class=\"tabulator-col-title\"][text()='Status']/parent::div/div[3]/input")
	private WebElement statusSearch;

	@FindBy(xpath = "(//div[@tabulator-field='PaymentStatus'])[1]/div/div[3]/input")
	private WebElement paymentSearch;

	@FindBy(xpath = "(//div[@tabulator-field='Warehouse'])[1]/div/div[3]/input")
	private WebElement whSearch;

	@FindBy(xpath = "(//div[@tabulator-field='SourceAbbrev'])[1]/div/div[3]/input")
	private WebElement sourceSearch;

	@FindBy(xpath = "(//div[@tabulator-field='Tags'])[1]/div/div[3]/input")
	private WebElement tagsSearch;

	@FindBy(xpath = "//div[@class='col-md-5'][contains(text(),'Group results')]/a")
	private List<WebElement> groupingList;
	
	@FindBy(xpath = "//input[@id='soNumber']")
	private WebElement orderSearchBox;
	
	@FindBy(xpath = "//button[@id='performOrderSearch']")
	private WebElement orderSearchBtn;
	
	
	
	

	public SalesOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean goToSalesOrders() {
		boolean flag = false;
		click(orderManagement);
		click(salesOrders);

		flag = driver.getCurrentUrl().contains("OrderManager");
		log.info("landed on Sales Orders Page.");
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

	public void useZoandropdown() {
		useDropdown(zoneFilter);
	}

	public void useSourcedropdown() {
		useDropdown(sourceFilter);
	}

	public void useStatusdropdown() {
		useDropdown(sourceFilter);
	}

	public void useSearch() {
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(orderSearch, "7915");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(orderSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(typeSearch, "pos");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(typeSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(customerSearch, "sea bass");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(customerSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(dateSearch, "05/03/2021");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(dateSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(shipViaSearch, "ups");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(shipViaSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(statusSearch, "PENDING");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(statusSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(whSearch, "100");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(whSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(sourceSearch, "QStock");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(sourceSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void useGrouping() {

		for (int i = 1; i < groupingList.size(); i++) {
			click(groupingList.get(i));
			try {
				Thread.sleep(7000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		click(groupingList.get(0));
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void orderSearchBox() {
		
		sendKeys(orderSearchBox,"so-1198");
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
