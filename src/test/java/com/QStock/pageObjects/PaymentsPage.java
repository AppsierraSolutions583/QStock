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

public class PaymentsPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	@FindBy(xpath = "//a[text()='Order Management ']")
	private WebElement orderManagement;
	
	@FindBy(xpath = "//a[text()='Payments / Charges']")
	private WebElement payments;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[1]")
	private WebElement orderFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[2]")
	private WebElement fromFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[3]")
	private WebElement typeFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[4]")
	private WebElement gatewayFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[5]")
	private WebElement dateFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[6]")
	private WebElement amountFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[7]")
	private WebElement methodFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[8]")
	private WebElement sourceFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[9]")
	private WebElement idFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[10]")
	private WebElement subFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='Order']")
	private List<WebElement> orderField;
	
	@FindBy(xpath = "//div[@tabulator-field='Order']//a")
	private List<WebElement> orderFieldLinks;
	
	@FindBy(xpath = "(//div[@id='details']//strong)[2]")
	private WebElement orderOnDeatilsPage;
	
	@FindBy(xpath = "//span[@class='ui-button-icon ui-icon ui-icon-closethick']")
	private WebElement cross;
	
	@FindBy(xpath = "//div[@tabulator-field='Type']")
	private List<WebElement> typeField;
	
	@FindBy(xpath = "//div[@tabulator-field='From']")
	private List<WebElement> fromField;
	
	@FindBy(xpath = "//div[@tabulator-field='Gateway']")
	private List<WebElement> gatewayField;
	
	@FindBy(xpath = "//div[@tabulator-field='Date']")
	private List<WebElement> dateField;
	
	@FindBy(xpath = "//div[@tabulator-field='Amount']")
	private List<WebElement> amountField;
	
	@FindBy(xpath = "//div[@tabulator-field='Method']")
	private List<WebElement> methodField;
	
	@FindBy(xpath = "//div[@tabulator-field='Status']")
	private List<WebElement> statusField;
	
	@FindBy(xpath = "//div[@tabulator-field='Source']")
	private List<WebElement> sourceField;
	
	@FindBy(xpath = "//div[@tabulator-field='ID']")
	private List<WebElement> idField;
	
	@FindBy(xpath = "//div[@tabulator-field='Subscription']")
	private List<WebElement> subField;
	
	@FindBy(xpath = "//div[@tabulator-field=' ']")
	private List<WebElement> blankField;
	
	@FindBy(xpath = "//div[@tabulator-field=' ']/a")
	private List<WebElement> blankFieldLinks;
	
	@FindBy(xpath = "//select[@id='maxPayments']")
	private WebElement maxPaymentsDrp;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	
	public PaymentsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean paymentsConfirm() {
		click(orderManagement);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(payments);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Payments");
		return check;
	}
	
	public boolean orderFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(orderFilter, "SHOP2-1062");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(orderField.get(1)).contains("SHOP2-1062");
		orderFilter.clear();
		sendKeys(orderFilter, Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean fromFilter() {
	/*	click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		sendKeys(fromFilter, "iphone");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(fromField.get(1)).contains("iphone");
		fromFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	
	
	public boolean typeFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(typeFilter, "refund");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(typeField.get(1)).contains("refund");
		typeFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean gatewayFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(gatewayFilter, "QStock API");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(gatewayField.get(1)).contains("QStock API");
		gatewayFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean dateFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(dateFilter, "7/24/2019");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(dateField.get(1)).contains("7/24/2019");
		dateFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean amountFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(amountFilter, "75.00");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(amountField.get(1)).contains("75.00");
		amountFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean methodFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(methodFilter, "EFT");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(methodField.get(1)).contains("EFT");
		methodFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean sourceFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(sourceFilter, "Shopify");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(sourceField.get(1)).contains("Shopify");
		sourceFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean idFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(idFilter, "7386");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(idField.get(1)).contains("7386");
		idFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean subscriptionFilter() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(subFilter, "yes");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(subField.get(1)).contains("yes");
		subFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean orderMatching() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String order = collectText(orderField.get(3)).toString(); 
		click(orderFieldLinks.get(2));
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(orderOnDeatilsPage).contains(order);
		click(cross);
		return check;
	}
	
	public boolean limit() {
		driver.navigate().refresh();
		boolean flag = false;
		Select sc = new Select(maxPaymentsDrp);
		sc.selectByVisibleText("250");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(orderFieldLinks.size()<=250) {
			flag=true;
		}
		log.info(orderFieldLinks.size());
		Select sc1 = new Select(maxPaymentsDrp);
		sc1.selectByVisibleText("1000");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean checkbox() {
		click(orderManagement);
		click(payments);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   click(checkbox);
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   log.info(collectText(orderField.get(1)));
	   boolean check = collectText(orderField.get(1)).isBlank();
	   return check;
	}
	
}
