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

public class PurchaseOrderPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(PurchaseOrderPage.class);

	@FindBy(xpath = "//a[text()='Purchasing']")
	private WebElement purchasing;

	@FindBy(xpath = "//a[contains(text(),'Purchase Orders')]")
	private WebElement purchaseOrder;

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

	@FindBy(xpath = "(//div[@tabulator-field='Order'])[1]/div/div[3]/input")
	private WebElement orderSearch;

	@FindBy(xpath = "(//div[@tabulator-field='Type'])[1]/div/div[3]/input")
	private WebElement typeSearch;

	@FindBy(xpath = "(//div[@tabulator-field='From'])[1]/div/div[3]/input")
	private WebElement fromSearch;

	@FindBy(xpath = "(//div[@tabulator-field='OrderDateString'])[1]/div/div[3]/input")
	private WebElement dateSearch;
	
	@FindBy(xpath = "(//div[@tabulator-field='Status'])[1]/div/div[3]/input")
	private WebElement statusSearch;

	@FindBy(xpath = "(//div[@tabulator-field='WH'])[1]/div/div[3]/input")
	private WebElement whSearch;

	@FindBy(xpath = "//div[contains(text(),'Group results by:')]/a")
	private List<WebElement> groupingList;
	
	@FindBy(xpath = "//input[@id='soNumber']")
	private WebElement orderSearchBox;
	
	@FindBy(xpath = "//button[@id='performOrderSearch']")
	private WebElement orderSearchBtn;
	
	
	
	

	public PurchaseOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean goToSPurchaseOrders() {
		boolean flag = false;
		click(purchasing);
		click(purchaseOrder);

		flag = driver.getCurrentUrl().contains("PurchaseManager");
		log.info("landed on Purchase Orders Page.");
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

	public void useLastdropdown() {
		useDropdown(lastFilter);
	}

	public void useTypedropdown() {
		useDropdown(typeFilter);
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

		sendKeys(orderSearch, "1143");
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

		sendKeys(typeSearch, "purchase order");
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

		sendKeys(fromSearch, "Sandcastles, Inc");
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(fromSearch, Keys.ENTER);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(dateSearch, "10/20/2022*");
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

		sendKeys(statusSearch, "InProcess");
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
