package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class IntacctPage extends GeneralFunctions{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(IntacctPage.class);


	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashboardMenu;

	@FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[contains(text(),'Intacct')]")
	private WebElement intacctMenu;

	@FindBy(xpath = "//button[@id='panel-refresh']//span[@class='glyphicon glyphicon-refresh']")
	private WebElement intacctInterfaceControlRefreshBtn;

	@FindBy(xpath = "//div[@tabulator-field='LogDateStr']//input[@type='search']")
	private WebElement dateSearch;

	@FindBy(xpath = "//div[@tabulator-field='UserID']//input[@type='search']")
	private WebElement userSearch;

	@FindBy(xpath = "//div[@tabulator-field='ActionStr']//input[@type='search']")
	private WebElement activitySearch;

	@FindBy(xpath = "//div[@tabulator-field='Link']//input[@type='search']")
	private WebElement docSearch;

	@FindBy(xpath = "//div[@tabulator-field='Message']//input[@type='search']")
	private WebElement messageSearch;

	@FindBy(xpath = "//h5[contains(text(),'Detailed Logs')]")
	private WebElement detailsLog;

	@FindBy(xpath = "//h5[contains(text(),'Error Logs')]")
	private WebElement errorsLog;

	@FindBy(xpath = "(//span[@class='tabulator-pages'])[1]/button[contains(@aria-label,'Show Page')]")
	private List<WebElement> listofPages;

	@FindBy(xpath = "//div[@id='logtable1']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst;

	@FindBy(xpath = "//div[@id='logtable1']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev;

	@FindBy(xpath = "//div[@id='logtable1']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext;

	@FindBy(xpath = "//div[@id='logtable1']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast;

	@FindBy(xpath = "//button[@id='tob-refresh']//span[@class='glyphicon glyphicon-refresh']")
	private WebElement batchedtransRefresh;


	@FindBy(xpath = "(//span[@class='tabulator-pages'])[2]/button[contains(@aria-label,'Show Page')]")
	private List<WebElement> listofPages2;

	@FindBy(xpath = "//div[@id='transouttable']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst2;


	@FindBy(xpath = "//div[@id='transouttable']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev2;

	@FindBy(xpath = "//div[@id='transouttable']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext2;

	@FindBy(xpath = "//div[@id='transouttable']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast2;

	@FindBy(xpath = "//div[@tabulator-field='TransID']//input[@placeholder='filter...']")
	private WebElement transId;

	@FindBy(xpath = "//div[@tabulator-field='TransDesc']//input[@placeholder='filter...']")
	private WebElement transDesc;

	@FindBy(xpath = "//div[@tabulator-field='ReasonDesc']//input[@placeholder='filter...']")
	private WebElement reasonDesc;

	@FindBy(xpath = "//div[@tabulator-field='AdjReasonCode']//input[@placeholder='filter...']")
	private WebElement code;

	@FindBy(xpath = "//div[@tabulator-field='PTNumber']//input[@placeholder='filter...']")
	private WebElement poso;

	@FindBy(xpath = "//div[@tabulator-field='StockCode']//input[@placeholder='filter...']")
	private WebElement stock;

	@FindBy(xpath = "//div[@tabulator-field='Qty']//input[@placeholder='filter...']")
	private WebElement qty;

	@FindBy(xpath = "//div[@tabulator-field='RtnMsg']//input[@placeholder='filter...']")
	private WebElement message;



	public IntacctPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void IntacctInterfaceRefresh() throws InterruptedException {
		click(dashboardMenu);
		click(intacctMenu);
		click(intacctInterfaceControlRefreshBtn);
		log.info("Landed on Intact Page");
	}

	public void ActivitySearchAndDetailsErrorTab() throws InterruptedException {
		click(dashboardMenu);
		click(intacctMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(dateSearch,"11/30/2022 10:32:51 AM PST");		
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		dateSearch.clear();
		sendKeys(userSearch,"Shopify");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		userSearch.clear();
		sendKeys(activitySearch,"Item - Update Qty");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		activitySearch.clear();
		sendKeys(docSearch,"B500");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		docSearch.clear();
		sendKeys(messageSearch,"Posted item qty update for: B500 (15389979902015)  WH: 100  Zn: A  Qty: 1926.0");
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
		click(errorsLog);
		log.info("Search and Log Tab Working");
	}

	public void ActivityPages() {
		click(dashboardMenu);
		click(intacctMenu);
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

	public void BatchedTransationRefresh() throws InterruptedException {
		click(dashboardMenu);
		click(intacctMenu);
		click(batchedtransRefresh);
		log.info("Refresh BUtton work successfully");
	}
	public void BatchedTransactionSearchFilter() {
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(transId,"8805");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(transDesc,"Inventory Adjustment");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(reasonDesc,"CORRECTION");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(code,"CO");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(stock,"B500");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(qty,"1");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(message,"iPostInventoryAdjustment exception: Could not retrieve Intacct project ID (p2021): success");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Batched Transaction Work Successfully");
	}

	public void BatchedtransactionPage() {
		click(dashboardMenu);
		click(intacctMenu);
		for (int i = 0; i < listofPages2.size(); i++) {
			listofPages2.get(i).click();
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		click(btnFirst2);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext2);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast2);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev2);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnFirst2);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Batched transaction page working Successfully");
	}
}


