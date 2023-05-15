package com.QStock.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class ArchivedDataPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//span[text()='Tools']")
	private WebElement tools;
	
	@FindBy(xpath = "(//a[text()='Archived Data'])[1]")
	private WebElement archivedData;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//input[@id='fromDate']")
	private WebElement fromDate;
	
	@FindBy(xpath = "//input[@id='toDate']")
	private WebElement toDate;
	
	@FindBy(xpath = "//a[@role and contains(text(),'Reactivate')]")
	private WebElement reactivate;
	
	public ArchivedDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean archivedDataConfirm() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(archivedData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Archived Orders");
		return check;	
	}
	
	public boolean numberFilter() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(archivedData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Number", "7908");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PTNumber", 1);
		boolean check = value.contains("7908");
		clearFilter("Number");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean typeFilter() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(archivedData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Type", "SO");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("PTType", 1);
		boolean check = value.contains("SO");
		clearFilter("Type");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean sourceFilter() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(archivedData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Source", "Intacct");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("SourceAbbrev", 1);
		boolean check = value.contains("Intacct");
		clearFilter("Source");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean customerFilter() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(archivedData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Customer", "Yandu Udanta");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("CustomerName", 1);
		boolean check = value.contains("Yandu Udanta");
		clearFilter("Customer");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean bulkReactivation() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(archivedData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
		act.moveToElement(fromDate);
	    sendKeys(fromDate, "11/19/2022");
	//    sendKeys(fromDate, Keys.ENTER);
	    sendKeys(toDate, "12/19/2022");
	//    sendKeys(toDate, Keys.ENTER);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    click(reactivate);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   boolean check = driver.switchTo().alert().getText().contains("Reactivate orders from 11/19/2022 to 12/19/2022 now?");
	   driver.switchTo().alert().dismiss();
	   return check;
	}
	
	public boolean actionsLink() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(archivedData);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String linkValue = collectFieldsText("Actions", 1).replace("Reactivate ", "");
		log.info(linkValue);
		clickLink("Actions", 0);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(driver.switchTo().alert().getText());
		boolean check = driver.switchTo().alert().getText().contains("Reactivate order " +linkValue+ " now?");
		driver.switchTo().alert().dismiss();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public void inputFilter(String name, String value) {
		By filter = By.xpath("//div[@class='tabulator-col-title' and text()='"+name+"']"
				+ "/parent::div/div[@class='tabulator-header-filter']/input");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(filter)).perform();
		sendKeys(driver.findElement(filter), value);
	}

	public void clearFilter(String name) {
		By filter = By.xpath("//div[@class='tabulator-col-title' and text()='"+name+"']"
				+ "/parent::div/div[@class='tabulator-header-filter']/input");
		driver.findElement(filter).clear();
		sendKeys(driver.findElement(filter), Keys.ENTER);
	}
	
	public String collectFieldsText(String field, int index) {
		By fields = By.xpath("//div[@tabulator-field='"+field+"']");
		return  collectText(driver.findElements(fields).get(index));	
	}
	
	public void clickLink(String name ,int index) {
		By links = By.xpath("//div[@tabulator-field='"+name+"']/a");
		click(driver.findElements(links).get(index)); 
	}
	
}
