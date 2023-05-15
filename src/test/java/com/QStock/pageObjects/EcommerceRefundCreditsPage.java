package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class EcommerceRefundCreditsPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	@FindBy(xpath = "//a[text()='Order Management ']")
	private WebElement orderManagement;
	
	@FindBy(xpath = "//a[text()='E-Commerce Refund Credits']")
	private WebElement ecomRefundCredits;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//select[@id='dateFilter']")
	private WebElement lastDrp;
	
	@FindBy(xpath = "//select[@id='dateFilter']/option")
	private List<WebElement> lastDrpOpts;
	
	@FindBy(xpath = "//select[@id='warehouse']")
	private WebElement warehouseDrp;
	
	@FindBy(xpath = "//select[@id='warehouse']/option")
	private List<WebElement> warehouseDrpOpts;
	
	@FindBy(xpath = "//select[@id='typeFilter']")
	private WebElement typeDrp;
	
	@FindBy(xpath = "//select[@id='typeFilter']/option")
	private List<WebElement> typeDrpOpts;
	
	@FindBy(xpath = "//select[@id='statusFilter']")
	private WebElement statusDrp;
	
	@FindBy(xpath = "//select[@id='statusFilter']/option")
	private List<WebElement> statusDrpOpts;
	
	@FindBy(xpath = "//select[@id='maxOrders']")
	private WebElement maxOrdersDrp;
	
	@FindBy(xpath = "//select[@id='maxOrders']/option")
	private List<WebElement> maxOrdersDrpOpts;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> checkboxes;
	
	@FindBy(xpath = "//div[@class='tabulator-arrow']")
	private List<WebElement> arrow;
	
	@FindBy(xpath = "//div[@role='rowgroup']")
	private List<WebElement> rows;
	
	@FindBy(xpath = "//a[text()='None']")
	private WebElement none;
	
	@FindBy(xpath = "//a[text()='WH']")
	private WebElement wh;
	
	@FindBy(xpath = "//a[text()='Status']")
	private WebElement status;
	
	@FindBy(xpath = "//a[text()='Type']")
	private WebElement type;
	
	@FindBy(xpath = "//a[text()='From']")
	private WebElement from;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[1]")
	private WebElement orderFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[2]")
	private WebElement typeFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[3]")
	private WebElement fromFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[4]")
	private WebElement dateFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[5]")
	private WebElement statusFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[6]")
	private WebElement whFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='Order']")
	private List<WebElement> orderField;
	
	@FindBy(xpath = "//div[@tabulator-field='Order']//a")
	private List<WebElement> orderFieldLinks;
	
	@FindBy(xpath = "(//div[@id='details']//strong)[1]")
	private WebElement orderOnDeatilsPage;
	
	@FindBy(xpath = "//span[@class='ui-button-icon ui-icon ui-icon-closethick']")
	private WebElement cross;
	
	@FindBy(xpath = "//div[@tabulator-field='Type']")
	private List<WebElement> typeField;
	
	@FindBy(xpath = "//div[@tabulator-field='From']")
	private List<WebElement> fromField;
	
	@FindBy(xpath = "//div[@tabulator-field='OrderDateString']")
	private List<WebElement> dateField;
	
	@FindBy(xpath = "//div[@tabulator-field='Status']")
	private List<WebElement> statusField;
	
	@FindBy(xpath = "//div[@tabulator-field='WH']")
	private List<WebElement> whField;
	
	@FindBy(xpath = "//button[@id='btnPurchaseOrder']")
	private WebElement createNew;
	
	@FindBy(xpath = "//a[contains(text(),'Req')]")
	private WebElement requisition;
	
	@FindBy(xpath = "//input[@id='btnClose']")
	private WebElement close;
	
	@FindBy(xpath = "//input[@id='btnPrintReport']")
	private WebElement printReport;
	
	public EcommerceRefundCreditsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean ecommerceRefundCreditsConfirm() {
		click(orderManagement);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(ecomRefundCredits);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Purchase Orders");
		return check;
	}
	
	public boolean lastDrp() {
	//	boolean flag = false;
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc2 = new Select(typeDrp);
		sc2.selectByVisibleText("All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(lastDrp);
		sc.selectByVisibleText("14 Days");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	boolean check = collectText(dateField.get(1)).contains("10/25/2022");
		boolean check = visibilityCheck(dateField.get(1));
	/*	for(WebElement e:dateField) {
		if(collectText(e).contains("10/12/2022")) {
			flag = true;
			break;
		}
		}*/
		Select sc1 = new Select(lastDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return check;
		//return flag;
	}
	
	public boolean warehouseDrp() {
		click(orderManagement);
		click(ecomRefundCredits);
		driver.navigate().refresh();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(warehouseDrp);
		sc.selectByVisibleText("200");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(whField.get(1)).contains("200");
		Select sc1 = new Select(warehouseDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean typeDrp() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(typeDrp);
		sc.selectByVisibleText("Transfer PO");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(typeField.get(1)).contains("Transfer PO");
		Select sc1 = new Select(typeDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean statusDrp() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(statusDrp);
		sc.selectByVisibleText("Received");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(statusField.get(1)).contains("Received");
		Select sc1 = new Select(statusDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean orderFilter() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(orderFilter, "ECR-8524");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(orderField.get(1)).contains("ECR-8524");
		orderFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean typeFilter() {
	//	click(orderManagement);
	//	click(ecomRefundCredits);
		Select sc1 = new Select(typeDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(typeFilter, "Purchase Order");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(typeField.get(1)).contains("Purchase Order");
		typeFilter.clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean fromFilter() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sendKeys(fromFilter, "ACME");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean check = collectText(fromField.get(1)).contains("ACME");
			fromFilter.clear();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return check;
		}
	
	public boolean dateFilter() {
		driver.navigate().refresh();
		sendKeys(dateFilter, "10/6/2022");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(dateField.get(1)).contains("10/6/2022");
		dateFilter.clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean statusFilter() {
		driver.navigate().refresh();
		sendKeys(statusFilter, "Batched");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(statusField.get(1)).contains("Batched");
		statusFilter.clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean whFilter() {
		driver.navigate().refresh();
		sendKeys(whFilter, "300");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(whField.get(1)).contains("300");
		whFilter.clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean limit() {
		driver.navigate().refresh();
		boolean flag = false;
		Select sc = new Select(maxOrdersDrp);
		sc.selectByVisibleText("250");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(checkboxes.size()<=250) {
			flag=true;
		}
		log.info(checkboxes.size());
		Select sc1 = new Select(maxOrdersDrp);
		sc1.selectByVisibleText("1000");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean actionsEnabled() {
		driver.navigate().refresh();
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = false;
		click(close);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String f3 = close.getAttribute("disabled");
		String f4 = printReport.getAttribute("disabled");
		click(checkboxes.get(1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(close);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().dismiss();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String f7 = close.getAttribute("disabled");
		String f8 = printReport.getAttribute("disabled");
		if(f3.contains("true") && f4.contains("true") &&
				 f7==null && f8==null)
			flag = true;
		return flag;
	}
	
	public boolean verifyCreateNewButton() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(createNew);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = visibilityCheck(requisition);
		return check;
	}
	
	public boolean orderMatching() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String order = collectText(orderField.get(3)).toString(); 
		click(orderFieldLinks.get(2));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(orderOnDeatilsPage).contains(order);
		return check;
	}

	public boolean grpByWh() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc1 = new Select(typeDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(wh);
		click(arrow.get(15));
		click(arrow.get(16));
		click(arrow.get(17));
		click(arrow.get(18));
		click(arrow.get(19));
		click(arrow.get(20));
		click(arrow.get(21));
		click(arrow.get(22));
		click(arrow.get(23));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(rows.get(0)).contains("100");
		click(none);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean grpByType() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc1 = new Select(typeDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(type);
		click(arrow.get(15));
		click(arrow.get(16));
		click(arrow.get(17));
		click(arrow.get(18));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(rows.get(0)).contains("Sales Order Return");
		click(none);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean grpByStatus() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc1 = new Select(typeDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(status);
		click(arrow.get(15));
		click(arrow.get(16));
		click(arrow.get(17));
		click(arrow.get(18));
		click(arrow.get(19));
		click(arrow.get(20));
		click(arrow.get(21));
		click(arrow.get(22));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(rows.get(0)).contains("Received");
		click(none);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean grpByFrom() {
		click(orderManagement);
		click(ecomRefundCredits);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc1 = new Select(typeDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(from);
		click(arrow.get(15));
		click(arrow.get(16));
		click(arrow.get(17));
		click(arrow.get(18));
		click(arrow.get(19));
		click(arrow.get(20));
		click(arrow.get(21));
		click(arrow.get(22));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(rows.get(0)).contains("Kelly Slater");
		click(none);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
}
