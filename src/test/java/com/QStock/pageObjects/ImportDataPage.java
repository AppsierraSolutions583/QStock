package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class ImportDataPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//span[text()='Tools']")
	private WebElement tools;
	
	@FindBy(xpath = "(//a[text()='Import Data'])[1]")
	private WebElement importData;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//select")
	private WebElement entriesDrp;
	
	@FindBy(xpath = "//div[@class='dataTables_info']")
	private WebElement entriesInfo;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement search;
	
	@FindBy(xpath = "//tr")
	private List<WebElement> rows;
	
	@FindBy(xpath = "//a[@role='button' and text()='Import Data']")
	private List<WebElement> importDataBtn;
	
	@FindBy(xpath = "//a[text()='Configure']")
	private List<WebElement> configureBtn;
	
	@FindBy(xpath = "//a[text()='Clone']")
	private List<WebElement> cloneBtn;
	
	@FindBy(xpath = "//a[text()='Delete']")
	private List<WebElement> deleteBtn;
	
	@FindBy(xpath = "//a[text()='Create New Import Definition']")
	private WebElement createNewImportDefBtn;
	
	public ImportDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean importDataConfirm() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("File Imports");
		return check;
	}
	
	public boolean search() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  sendKeys(search, "2022-01-28 09:42 PST");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  log.info(collectText(rows.get(1)));
	 boolean check = collectText(rows.get(1)).contains("2022-01-28 09:42 PST"); 
	  return check;
	}
	
	public boolean importDataBtn() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importDataBtn.get(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Run Import");
		return check;
	}
	
	public boolean configureBtn() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(configureBtn.get(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("File Import Definition");
		return check;
	}
	
	public boolean cloneBtn() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(cloneBtn.get(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = driver.switchTo().alert().getText().contains("Create a new copy of this import definition?");
		driver.switchTo().alert().dismiss();
		return check;
	}
	
	public boolean deleteBtn() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(deleteBtn.get(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = driver.switchTo().alert().getText().contains("Delete this import definition?");
		driver.switchTo().alert().dismiss();
		return check;
	}
	
	public boolean entriesDrp() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(entriesDrp);
		sc.selectByVisibleText("25");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(entriesInfo).contains("Showing 1 to 25 of 25 entries");
		return check;
	}
	
	public boolean createNewImportDefBtn() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(importData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
		act.moveToElement(createNewImportDefBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    click(createNewImportDefBtn);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check = collectText(panelHeading).contains("Run Import");
	    return check;
	}
	
}
