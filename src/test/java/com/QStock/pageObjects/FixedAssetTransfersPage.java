package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class FixedAssetTransfersPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public FixedAssetTransfersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Order Management ']")
	private WebElement  orderManagement;

	@FindBy(xpath = "//a[text()='Fixed Asset Transfers']")
	private WebElement fixedAssetTransfer ;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//select[@id='warehouse']")
	private WebElement warehouseDrp;
	
	@FindBy(xpath = "//select[@id='warehouse']/option")
	private List <WebElement> warehouseDrpOpts;
	
	@FindBy(xpath = "//select[@id='zone']")
	private WebElement zoneDrp ;
	
	@FindBy(xpath = "//div[@tabulator-field='Zone' and @role='gridcell']")
	private List <WebElement> zoneField;
			
	@FindBy(xpath = "//select[@id='zone']/option")
	private List <WebElement> zoneDrpOpts ;
	
	@FindBy(xpath = "//input[@id='soNumber']")
	private WebElement  orderSearch;
	
	@FindBy(xpath = "//input[@id='attentionOnly']")
	private WebElement orderAttentionCheckbox ;
	
	@FindBy(xpath = "//select[@id='sourceFilter']")
	private WebElement  sourceDrp;
	
	@FindBy(xpath = "//select[@id='sourceFilter']/option")
	private List <WebElement> sourceDrpOpts ;
	
	@FindBy(xpath = "//div[@tabulator-field='SourceAbbrev']//input[@placeholder='filter...']")
	private WebElement  sourceFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='SourceAbbrev' and @role='gridcell']")
	private List <WebElement>  sourceField;
	
	@FindBy(xpath = "//select[@id='typeFilter']")
	private WebElement typesDrp ;
	
	@FindBy(xpath = "//select[@id='typeFilter']/option")
	private List <WebElement>  typesDrpOpts;

	@FindBy(xpath = "//select[@id='statusFilter']")
	private WebElement statusDrp ;
	
	@FindBy(xpath = "//select[@id='statusFilter']/option")
	private List <WebElement>  statusDrpOpts;
	
	@FindBy(xpath = "//input[@id='includeShort']")
	private WebElement showShortChekbox ;
	
	@FindBy(xpath = "//input[@id='orderFromDate']")
	private WebElement dateFromInput ;
	
	@FindBy(xpath = "//input[@id='orderToDate']")
	private WebElement dateToInput  ;

	@FindBy(xpath = "//div[@tabulator-field='OrderDateString']//input[@placeholder='filter...']")
	private WebElement  dateFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='OrderDateString' and @role='gridcell']")
	private List <WebElement>  dateField;
	
	@FindBy(xpath = "//div[@class='row']//button[@id='btnTransferOrder']")
	private WebElement createNewTop  ;
	
	@FindBy(xpath = "//div[@class='box-body']//button[@id='btnTransferOrder']")
	private WebElement createNewBottom  ;
	
	@FindBy(xpath = "//a[@class='btn btn-xs btn-default']")
	private WebElement downloadServiceTitanBatchesTop ;
	
	@FindBy(xpath = "//a[@class='btn btn-sm btn-default']")
	private WebElement downloadServiceTitanBatchesBottom ;
				
	@FindBy(xpath = "(//input[@placeholder='filter...'])[1]")
	private WebElement  orderFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='OrderNumber' and @role='gridcell']")
	private List <WebElement> orderField  ;
	
	@FindBy(xpath = "//div[@tabulator-field='Type']//input[@placeholder='filter...']")
	private WebElement typeFilter ;
	
	@FindBy(xpath = "//div[@tabulator-field='Type' and @role='gridcell']")
	private List <WebElement> typeField ;
	
	@FindBy(xpath = "//div[@tabulator-field='CustomerName']//input[@placeholder='filter...']")
	private WebElement  customerFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='CustomerName' and @role='gridcell']")
	private List <WebElement>  customerField;	
	
	@FindBy(xpath = "//div[@tabulator-field='ShipVia']//input[@placeholder='filter...']")
	private WebElement  shipViaFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='ShipVia']")
	private List <WebElement> shipViaField ;
	
	@FindBy(xpath = "//div[@tabulator-field='Status']//input[@placeholder='filter...']")
	private WebElement  statusFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='Status']/span")
	private List <WebElement> statusField ;	
	
	@FindBy(xpath = "//div[@tabulator-field='PaymentStatus']//input[@placeholder='filter...']")
	private WebElement  paymentFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='PaymentStatus']")
	private List <WebElement> paymentField ;
	
	@FindBy(xpath = "//div[@tabulator-field='Warehouse']//input[@placeholder='filter...']")
	private WebElement  whFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='Warehouse' and @role='gridcell']")
	private List <WebElement> whField ;
	
	@FindBy(xpath = "//div[@tabulator-field='Tags']//input[@placeholder='filter...']")
	private WebElement  tagsFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='Tags' and @role='gridcell']")
	private List <WebElement> tagsField ;
	
	@FindBy(xpath = "//button[text()='First']")
	private WebElement first ;
	
	@FindBy(xpath = "//button[text()='Prev']")
	private WebElement  previous;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement  next;
	
	@FindBy(xpath = "//button[text()='Last']")
	private WebElement  last;
		
	
	
	public boolean fixedAssetTransfersConfirm() {
		click(orderManagement);
		click(fixedAssetTransfer);
		boolean check = collectText(panelHeading).contains("Fixed Asset Transfers");
		return check;
	}
	
	public boolean warehouseDrp() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select sc = new Select(warehouseDrp);
		sc.selectByVisibleText("100");
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		boolean check = collectText(whField.get(1)).contains("100");
		Select sc1 = new Select(warehouseDrp);
		sc1.selectByVisibleText("All");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		return check;
	}
	
	public boolean zoneDrp() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		
		Select sc = new Select(warehouseDrp);
		sc.selectByVisibleText("100");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Select sc1= new Select(zoneDrp);
		sc1.selectByVisibleText("A");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(zoneField.get(0)).contains("A");
		Select sc2 = new Select(zoneDrp);
		sc2.selectByVisibleText("All");
		
		Select sc3 = new Select(warehouseDrp);
		sc3.selectByVisibleText("All");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		return check;
	}

	
	
	public boolean orderFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String searchVal =(orderField.get(1)).getText().replace(" ","");
		sendKeys(orderFilter, searchVal);
	
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(orderField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean typeFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		String searchVal =(typeField.get(1)).getText();
		sendKeys(typeFilter,searchVal);
	
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(typeField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean customerFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		String searchVal =(customerField.get(1)).getText();
		sendKeys(customerFilter, searchVal);
	
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(customerField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean dateFilter() {

		click(orderManagement);
		click(fixedAssetTransfer);

		String searchVal =(dateField.get(1)).getText();
		sendKeys(dateFilter, searchVal);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(dateField.get(0)).contains(searchVal);
		return check;
	}
	
	//empty filter	
	public boolean shipViaFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		String searchVal = (shipViaField.get(1)).getText();
		sendKeys(shipViaFilter, searchVal);
	
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		boolean check = collectText(shipViaField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean statusFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		String searchVal =(statusField.get(1)).getText();
		sendKeys(statusFilter,searchVal);
	
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(statusField.get(0)).contains(searchVal);
		return check;
	}
	//empty filter	
	public boolean paymentFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		String searchVal = (paymentField.get(1)).getText();
		sendKeys(paymentFilter, searchVal);
	
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		boolean check = collectText(paymentField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean whFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		String searchVal = (whField.get(1)).getText();
		sendKeys(whFilter, searchVal);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(whField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean sourceFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		String searchVal = (sourceField.get(1)).getText();
		sendKeys(sourceFilter,searchVal);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(sourceField.get(0)).contains(searchVal);
		return check;
	}
	
	//empty filter
	public boolean tagFilter() {
		click(orderManagement);
		click(fixedAssetTransfer);
		
		String searchVal = (tagsField.get(1)).getText();
		sendKeys(tagsFilter, searchVal);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(tagsField.get(0)).contains(searchVal);
		return check;
	}
	
	
	
}
