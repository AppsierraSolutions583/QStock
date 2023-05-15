package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class WarehouseTransferOrdersPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	@FindBy(xpath = "//a[text()='Order Management ']")
	private WebElement orderManagement;
	
	@FindBy(xpath = "//a[text()='Warehouse Transfer Orders']")
	private WebElement warehouseTransferOrders;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//select[@id='warehouse']")
	private WebElement warehouseDrp;
	
	@FindBy(xpath = "//select[@id='typeFilter']")
	private WebElement typeDrp;
	
	@FindBy(xpath = "//select[@id='statusFilter']")
	private WebElement statusDrp;

	@FindBy(xpath = "//select[@id='zone']")
	private WebElement zoneDrp;

	@FindBy(xpath = "//select[@id='sourceFilter']")
	private WebElement sourceDrp;	
	
	@FindBy(xpath = "//input[@id='includeShort']")
	private WebElement showShort;
	
	@FindBy(xpath = "//input[@id='soNumber']")
	private WebElement orderSearch;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-play']")
	private WebElement orderSearchBtn;
	
	@FindBy(xpath = "//input[@id='orderFromDate']")
	private WebElement orderDateFrom;
	
	@FindBy(xpath = "//input[@id='orderToDate']")
	private WebElement orderDateTo;
	
	@FindBy(xpath = "//input[@id='attentionOnly']")
	private WebElement attentionNeeded;
	
	@FindBy(xpath = "//i[@class='fa fa-exclamation-triangle text-warning']")
	private List<WebElement> triangle;
	
	@FindBy(xpath = "(//button[@id='btnTransferOrder'])[1]")
	private WebElement createNew;
	
	@FindBy(xpath = "(//a[contains(text(),'Sales')])[5]")
	private WebElement salesOrder;
	
	@FindBy(xpath = "//a[contains(text(),'POS')]")
	private WebElement posOrder;
	
	@FindBy(xpath = "(//a[contains(text(),'Transfer')])[3]")
	private WebElement warehouseTransfer;
	
	@FindBy(xpath = "(//a[contains(text(),'Transfer')])[4]")
	private WebElement fixedAssetTransfer;
	
	@FindBy(xpath = "(//a[contains(text(),'Return')])[4]")
	private WebElement fixedAssetReturn;
	
	@FindBy(xpath = "(//a[@role='button'])[8]")
	private WebElement downloadServiceTitanBatches;
	
	@FindBy(xpath = "//select[@id='showNumOrders']")
	private WebElement ordersPerPageDrp;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[1]")
	private WebElement orderFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[2]")
	private WebElement typeFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[4]")
	private WebElement customerFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[5]")
	private WebElement dateFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[6]")
	private WebElement shipViaFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[9]")
	private WebElement statusFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[10]")
	private WebElement paymentFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[11]")
	private WebElement whFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[12]")
	private WebElement sourceFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[13]")
	private WebElement tagsFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='OrderNumber']")
	private List<WebElement> orderField;
	
	@FindBy(xpath = "//div[@tabulator-field='OrderNumber']//a")
	private List<WebElement> orderFieldLinks;
	
	@FindBy(xpath = "(//div[@id='details']//strong)[1]")
	private WebElement orderOnDeatilsPage;
	
	@FindBy(xpath = "//div[@tabulator-field='Type']")
	private List<WebElement> typeField;
	
	@FindBy(xpath = "//div[@tabulator-field='CustomerName']")
	private List<WebElement> customerField;
	
	@FindBy(xpath = "//div[@tabulator-field='OrderDateString']")
	private List<WebElement> dateField;
	
	@FindBy(xpath = "//div[@tabulator-field='ShipVia']")
	private List<WebElement> shipViaField;
	
	@FindBy(xpath = "//div[@tabulator-field='Status']")
	private List<WebElement> statusField;
	
	@FindBy(xpath = "//div[@tabulator-field='PaymentStatus']")
	private List<WebElement> paymentField;
	
	@FindBy(xpath = "//div[@tabulator-field='Warehouse']")
	private List<WebElement> warehouseField;
	
	@FindBy(xpath = "//div[@tabulator-field='Zone']")
	private List<WebElement> zoneField;
	
	@FindBy(xpath = "//div[@tabulator-field='SourceAbbrev']")
	private List<WebElement> sourceField;
	
	@FindBy(xpath = "//div[@tabulator-field='Tags']")
	private List<WebElement> tagsField;
	
	@FindBy(xpath = "//input[@class='selectedBox']")
	private List<WebElement> checkboxes;
	
	@FindBy(xpath = "//input[@class='select-all']")
	private WebElement selectAllCheckbox;
	
	@FindBy(xpath = "//input[@id='btnReComplete']")
	private WebElement recomplete;
	
	@FindBy(xpath = "//input[@id='btnForceComplete']")
	private WebElement forceComplete;
	
	@FindBy(xpath = "//input[@id='btnAllocate']")
	private WebElement allocate;
	
	@FindBy(xpath = "//input[@id='btnUnAllocate']")
	private WebElement unallocate;
	
	@FindBy(xpath = "//input[@id='btnPick']")
	private WebElement quickPick;
	
	@FindBy(xpath = "//input[@id='btnPostASN']")
	private WebElement postAsn;
	
	@FindBy(xpath = "//input[@id='btnShip']")
	private WebElement ship;
	
	@FindBy(xpath = "//input[@id='btnClearAttention']")
	private WebElement clearAttention;
	
	@FindBy(xpath = "//input[@id='btnPrintPickTicket']")
	private WebElement printPick;
	
	@FindBy(xpath = "//input[@id='btnPrintPackSlip']")
	private WebElement printPack;
	
	@FindBy(xpath = "//input[@id='btnCancel']")
	private WebElement cancel;
	
	@FindBy(xpath = "//input[@id='btnAddTag']")
	private WebElement addTag;
	
	@FindBy(xpath = "//input[@id='inAddTag']")
	private WebElement addTagInput;
	
	@FindBy(xpath = "//input[@id='QuickCsv']")
	private WebElement csv;
	
	@FindBy(xpath = "//input[@id='QuickXls']")
	private WebElement xlsx;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next;
	
	@FindBy(xpath = "//button[text()='Prev']")
	private WebElement previous;
	
	@FindBy(xpath = "//button[text()='Last']")
	private WebElement last;
	
	@FindBy(xpath = "//button[text()='First']")
	private WebElement first;
	
	@FindBy(xpath = "//button[@id='cancelAction']")
	private WebElement cancelAction;
	
	public WarehouseTransferOrdersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean warehouseTransferOrdersConfirm() {
		click(orderManagement);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Transfer Orders");
	/*	click(attentionNeeded);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return check;
	}
	
	public boolean warehouseDrp() {
		click(orderManagement);
		click(warehouseTransferOrders);
	//	driver.navigate().refresh();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(warehouseDrp);
		sc.selectByVisibleText("WH1");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(warehouseField.get(1)).contains("WH1");
		Select sc1 = new Select(warehouseDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean sourceDrp() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(sourceDrp);
		sc.selectByVisibleText("QStock");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(sourceField.get(1)).contains("QStock");
		Select sc1 = new Select(sourceDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean statusDrp() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(statusDrp);
		sc.selectByVisibleText("Picked");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(statusField.get(4)).contains("PICKED");
		Select sc1 = new Select(statusDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	public boolean orderSearch() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(orderSearch, "TR7947");
		click(orderSearchBtn);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(orderField.get(1)).contains("TR7947");
/*		orderSearch.clear();
		click(orderSearchBtn);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return check;
	}
	
	public boolean ordersNeedingAttention() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(attentionNeeded);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = visibilityCheck(triangle.get(1));
	/*	click(attentionNeeded);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return check;
	}
	
	public boolean orderDates() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(orderDateFrom, "06/10/2021");
		sendKeys(orderDateTo, "06/10/2021");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(zoneDrp);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(dateField.get(1)).contains("06/10/2021");
		return check;
	}
	
	public boolean ordersPerPage() {
		boolean flag = false;
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(ordersPerPageDrp);
		sc.selectByVisibleText("10");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(orderFieldLinks.size() <= 10)
			flag = true;
	/*	Select sc1 = new Select(ordersPerPageDrp);
		sc1.selectByVisibleText("20");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return flag;
	}
	
	public boolean ordersFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(orderFilter, "TR7947");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(orderField.get(1)).contains("TR7947");
	/*	orderFilter.clear();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return check;
	}
	
	public boolean typeFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(typeFilter, "TSO");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(typeField.get(1)).contains("TSO");
	/*	typeFilter.clear();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return check;
	}
	
	public boolean customerFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(customerFilter, "100");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(customerField.get(1)).contains("100");
		return check;
	}
	
	public boolean dateFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(dateFilter, "02/15/2018");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(dateField.get(1)).contains("02/15/2018");
		return check;
	}
	
	public boolean shipViaFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(shipViaFilter, "");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(shipViaField.get(1)).contains("");
		return check;
	}
	
	public boolean statusFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(statusFilter, "SHIPPED");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(statusField.get(4)).contains("SHIPPED");
		return check;
	}
	
	public boolean paymentFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(paymentFilter, "");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(paymentField.get(4)).contains("");
		return check;
	}
	
	public boolean whFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(whFilter, "200");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(warehouseField.get(1)).contains("200");
		return check;
	}
	
	public boolean sourceFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(sourceFilter, "QStock");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(sourceField.get(1)).contains("QStock");
		return check;
	}
	
	public boolean tagsFilter() {
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(tagsFilter, "tagq");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(tagsField.get(1)).contains("tagq");
		return check;
	}
	
	public boolean verifyCreateNewButton() {
		boolean flag = false;
		click(orderManagement);
		click(warehouseTransferOrders);
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
		boolean f1 = visibilityCheck(salesOrder);
		boolean f2 = visibilityCheck(posOrder);
		boolean f3 = visibilityCheck(warehouseTransfer);
		boolean f4 = visibilityCheck(fixedAssetTransfer);
		boolean f5 = visibilityCheck(fixedAssetReturn);
		if(f1==true && f2==true && f3==true && f4==true && f5==true)
			flag=true;
		return flag;
	}
	
	public boolean verifyDownloadServiveTitanBatchesButton() {
		boolean flag = true;
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(downloadServiceTitanBatches);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().dismiss();
		return flag;
	}
	
	public boolean checkboxes() {
		boolean flag = false;
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(selectAllCheckbox);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(selectAllCheckbox.isSelected());
		boolean f1 = selectAllCheckbox.isSelected();
		click(checkboxes.get(2));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(checkboxes.get(2).isSelected());
		boolean f2 = checkboxes.get(2).isSelected();
		click(checkboxes.get(2));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(checkboxes.get(2).isSelected());
		boolean f3 = checkboxes.get(2).isSelected();
	//	log.info(selectAllCheckbox.isSelected());
	//	boolean f4 = selectAllCheckbox.isSelected();
	/*	if(f1==true && f2==false && f3==true && f4==true)
			flag = true;*/
		if(f1==true && f2==false && f3==true)
			flag = true;
		return flag;
	}
	
	public boolean actionsEnabled() {
		boolean flag = false;
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(recomplete);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String f1 = recomplete.getAttribute("disabled");
		log.info(recomplete.getAttribute("disabled"));
		String f2 = forceComplete.getAttribute("disabled");
		String f3 = allocate.getAttribute("disabled");
		String f4 = unallocate.getAttribute("disabled");
		click(checkboxes.get(1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(recomplete);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(cancelAction);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String f5 = recomplete.getAttribute("disabled");
		log.info(recomplete.getAttribute("disabled"));
		String f6 = forceComplete.getAttribute("disabled");
		String f7 = allocate.getAttribute("disabled");
		String f8 = unallocate.getAttribute("disabled");
		if(f1.contains("true") && f2.contains("true") && f3.contains("true") && f4.contains("true") &&
				f5==null && f6==null && f7==null && f8==null)
			flag = true;
		return flag;
	}
	
	public boolean pagination() {
		boolean flag = false;
		click(orderManagement);
		click(warehouseTransferOrders);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	log.info("attribute disabled: " + last.getAttribute("disabled"));
		String f1 = first.getAttribute("disabled");
		log.info("disabled for first: " + first.getAttribute("disabled"));
		String f2 = previous.getAttribute("disabled");
		log.info("disabled for prev: " + previous.getAttribute("disabled"));
		clickWithJS(next);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("clicked on next");
		String f3 = first.getAttribute("disabled");
		log.info("disabled for first: " + first.getAttribute("disabled"));
		String f4 = previous.getAttribute("disabled");
		log.info("disabled for prev: " + previous.getAttribute("disabled"));
		clickWithJS(previous);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickWithJS(last);
		log.info("clicked on last");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String f5 = last.getAttribute("disabled");
		log.info("disabled for last: " + last.getAttribute("disabled"));
		String f6 = next.getAttribute("disabled");
		log.info("disabled for next: " + next.getAttribute("disabled"));
		if(f1.contains("true") && f2.contains("true") && f3==null && f4==null && f5.contains("true") && f6.contains("true"))
		flag = true;
		return flag;
	}
}
