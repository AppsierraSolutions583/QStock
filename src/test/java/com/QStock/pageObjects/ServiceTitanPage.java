package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class ServiceTitanPage extends GeneralFunctions {
	public WebDriver driver;
	public static Logger log = Logger.getLogger(ServiceTitanPage.class);
	
	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashboardMenu;
	
	@FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[contains(text(),'ServiceTitan')]")
	private WebElement serviceTitanMenu;
	
	@FindBy(xpath = "//button[@id='interface-refresh']")
	private WebElement intefaceControlRefreshBtn;
	
	
	@FindBy(xpath = "//div[@tabulator-field='LogDateStr']//input[@type='search']")
	private WebElement date;
	
	@FindBy(xpath = "//div[@tabulator-field='UserID']//input[@type='search']")
	private WebElement user;
	
	@FindBy(xpath = "//div[@tabulator-field='ActionStr']//input[@type='search']")
	private WebElement activity;
	
	@FindBy(xpath = "//div[@tabulator-field='Link']//input[@type='search']")
	private WebElement docitem;
	
	@FindBy(xpath = "//div[@tabulator-field='Message']//input[@type='search']")
	private WebElement message;
	
	@FindBy(xpath = "//h5[normalize-space()='Detailed Logs']")
	private WebElement detailsLog;
	
	@FindBy(xpath = "//h5[normalize-space()='Error Logs']")
	private WebElement errorLog;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Show Page')]")
	private List<WebElement> listofPages;

	@FindBy(xpath = "//div[@id='logtable1']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst;


	@FindBy(xpath = "//div[@id='logtable1']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev;

	@FindBy(xpath = "//div[@id='logtable1']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext;

	@FindBy(xpath = "//div[@id='logtable1']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast;
	

	public ServiceTitanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void InterfaceRefresh() throws InterruptedException {
		click(dashboardMenu);
		click(serviceTitanMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(intefaceControlRefreshBtn);
		log.info("Landed on Qstock for Test Page");
	}
	
	public void ActivitySearchAndDetailErrorTab() {
		click(dashboardMenu);
		click(serviceTitanMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(date,"11/14/2022 10:08:55 AM PST");		
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		dateSearch.clear();
		sendKeys(user,"Shopify");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		userSearch.clear();
		sendKeys(activity,"Item - Update Qty");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		activitySearch.clear();
		sendKeys(docitem,"B500");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		docSearch.clear();
		sendKeys(message,"Posted item qty update for: B500 (15389979902015)  WH: 100  Zn: A  Qty: 1942.0");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		messageSearch.clear();
		click(detailsLog);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(errorLog);
		log.info("Search and Log Tab Working");
	}
	public void ActivityPages() {
		click(dashboardMenu);
		click(serviceTitanMenu);
		for (int i = 0; i < listofPages.size(); i++) {
			listofPages.get(i).click();
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
		log.info("Activity Pages Work Successfully");
	}
}
