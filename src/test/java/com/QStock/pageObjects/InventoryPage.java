package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class InventoryPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(InventoryPage.class);

	@FindBy(xpath = "//a[text()='Inventory ']")
	private WebElement inventory;

	@FindBy(xpath = "//a[text()='Inventory Management']")
	private WebElement inventoryManagement;

	@FindBy(xpath = "//select[@id='warehouse']")
	private WebElement warehouse;

	@FindBy(xpath = "//input[@id='includeRef']")
	private WebElement checkboxIncRef;

	@FindBy(xpath = "//input[@id='includeSerial']")
	private WebElement checkboxShowSerial;

	@FindBy(xpath = "//input[@id='includeLP']")
	private WebElement checkboxLP;

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

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean goToInventoryManagement() {
		boolean flag = false;
		click(inventory);
		click(inventoryManagement);

		flag = driver.getCurrentUrl().contains("InventoryManager");
		log.info("landed on Inventory management.");
		return flag;
	}

	public void useWarehouseFilter() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Select dropdown = new Select(warehouse);
		dropdown.selectByVisibleText("100");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 100.");
		dropdown.selectByVisibleText("200");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 200.");
		dropdown.selectByVisibleText("300");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 300.");
		dropdown.selectByVisibleText("320");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 320.");
		dropdown.selectByVisibleText("400");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 400.");
		dropdown.selectByVisibleText("500");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 500.");
		dropdown.selectByVisibleText("600");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 500.");
		dropdown.selectByVisibleText("700");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 700.");
		dropdown.selectByVisibleText("800");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 800.");
		dropdown.selectByVisibleText("90-DS");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 90-DS.");
		dropdown.selectByVisibleText("900");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 900.");
		dropdown.selectByVisibleText("99-XF");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter 99-XF.");
		dropdown.selectByVisibleText("HUB");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter HUB.");
		dropdown.selectByVisibleText("WH1");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter WH1.");
		dropdown.selectByVisibleText("WH2");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Filter WH2.");

	}

	public void useAllCheckbox() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(checkboxIncRef);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Checkbox IncRef.");
		click(checkboxIncRef);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(checkboxShowSerial);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Checkbox Show Serial.");
		click(checkboxShowSerial);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(checkboxLP);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Checkbox LP.");
		click(checkboxLP);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(checkboxShowInactive);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Used Checkbox Show Inactive.");
		click(checkboxShowInactive);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void goThroughAllAvailablePages() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < listOfPages.size(); i++) {
			listOfPages.get(i).click();
			try {
				Thread.sleep(4000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		click(btnFirst);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext);

		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnFirst);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
