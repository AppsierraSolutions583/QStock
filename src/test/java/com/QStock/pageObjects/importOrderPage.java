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

public class importOrderPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(importOrderPage.class);

	@FindBy(xpath = "//a[text()='Order Management ']")
	private WebElement orderManagement;

	@FindBy(xpath = "//a[contains(text(),'Import Orders')]")
	private WebElement importOrders;

	@FindBy(xpath = "//div[@id='deftable_filter']/label/input")
	private WebElement searchBar;

	@FindBy(xpath = "//a[text()='Import Data'][@role='button']")
	private WebElement importBtn;

	@FindBy(xpath = "//div[contains(text(),'Run Import')]")
	private WebElement importText;
	
	@FindBy(xpath = "//a[contains(text(),'Configure')]")
	private WebElement configure;
	
	@FindBy(xpath = "//a[contains(text(),'Clone')]")
	private WebElement clone;
	
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	private WebElement delete;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement cloneConfirm;

	public importOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean goToImportOrder() {
		boolean flag = false;
		click(orderManagement);
		click(importOrders);

		flag = driver.getCurrentUrl().contains("Sales");
		log.info("landed on Import Order Page.");
		return flag;
	}

	public void doSearch() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sendKeys(searchBar,"copy of");
		
	}

	public boolean importOption() {
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(importBtn);
		boolean flag = visibilityCheck(importText);

		driver.navigate().back();
		return flag;

	}
	
	
	public boolean configureOption() {
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(configure);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean flag = driver.getCurrentUrl().contains("ConfigureImport");
		driver.navigate().back();
		return flag;
	}
	
	public boolean cloneOption() {
		click(clone);
		driver.switchTo().alert().dismiss();
		
		click(clone);
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean flag=cloneConfirm.getAttribute("value").contains("Copy of");
		driver.navigate().back();
		return flag;
		
	}
	
	public void deleteOption() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(delete);
		driver.switchTo().alert().dismiss();
		
		click(delete);
		driver.switchTo().alert().accept();
		
	}
}
