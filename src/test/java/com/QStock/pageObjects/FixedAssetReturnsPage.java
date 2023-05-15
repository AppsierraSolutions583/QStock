package com.QStock.pageObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class FixedAssetReturnsPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public FixedAssetReturnsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Order Management ']")
	private WebElement orderManagement;
	
	@FindBy(xpath = "//a[text()='Fixed Asset Returns']")
	private WebElement fixedAssetReturns;

	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading; 

	@FindBy(xpath = "//select[@id='warehouse']")
	private WebElement warehouseDrp;
	
	@FindBy(xpath = "//select[@id='warehouse']/option")
	private List <WebElement> warehouseDrpOpts;
	
	@FindBy(xpath = "//select[@id='zone']")
	private WebElement zoneDrp;
	
	@FindBy(xpath = "//select[@id='zone']/option")
	private List <WebElement> zoneDrpOpts;

	@FindBy(xpath = "//select[@id='sourceFilter']")
	private WebElement sourceDrp;
	
	@FindBy(xpath = "//select[@id='sourceFilter']/option")
	private List <WebElement> sourceDrpOpts;
	
	@FindBy(xpath = "//div[@tabulator-field='SourceAbbrev' and @role='gridcell']")
	private List <WebElement> sourceField;
	
	@FindBy(xpath = "//select[@id = 'typeFilter']")
	private WebElement typeDrp;

	@FindBy(xpath = "//select[@id = 'typeFilter']/option")
	private List <WebElement> typeDrpOpts;
	
	@FindBy(xpath = "//select[@id='statusFilter']")
	private WebElement statusDrp;

	@FindBy(xpath = "//select[@id='statusFilter']/option")
	private List <WebElement> statusDrpOpts;

	@FindBy(xpath = "//input[@id='soNumber']")
	private WebElement orderSearch;
	
	@FindBy(xpath = "//input[@id='orderFromDate']")
	private WebElement dateFromInput;
	
	@FindBy(xpath = "//input[@id='orderToDate']")
	private WebElement dateToInput;

	@FindBy(xpath = "//input[@id='attentionOnly']")
	private WebElement ordersAttentioncheck;

	@FindBy(xpath = "(//button[@id='btnTransferOrder'])[1]")
	private WebElement createNew;
	
	@FindBy(xpath = "//a[@class='btn btn-xs btn-default']")
	private WebElement downloadServiceTitan;
	
	@FindBy(xpath ="(//input[@placeholder='filter...'])[1]")
	private WebElement orderFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[2]")
	private WebElement typeFilter;
	
	@FindBy(xpath ="(//input[@placeholder='filter...'])[4]")
	private WebElement customerFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[5]")
	private WebElement dateFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[9]")
	private WebElement statusFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='Status']//span")
	private List <WebElement> statusField;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[11]")
	private WebElement warehouseFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='Warehouse' and @role='gridcell']")
	private List <WebElement> whField;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[12]")
	private WebElement sourceFilter;
	
	@FindBy(xpath = "(//input[@placeholder='filter...'])[13]")
	private WebElement tagsFilter;
	
	@FindBy(xpath = "//div[@tabulator-field='OrderDateString' and @role='gridcell']")
	private List <WebElement> dateField;
	
	@FindBy(xpath = "//div[@tabulator-field='OrderNumber']//a")
	private List<WebElement> orderField;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-play']")
	private WebElement arrow;
	
	@FindBy(xpath = "//div[@tabulator-field='Type' and @role='gridcell']")
	private List<WebElement> typeField;
	
	@FindBy(xpath = "//div[@tabulator-field='CustomerName']//a")
	private List<WebElement> customerField;
	
	
	public boolean fixedOrderReturnConfirm()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		boolean check = collectText(panelHeading).contains("Fixed Asset Returns");
		return check;	
	}
	
	public boolean warehouseDrp() 
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select sc = new Select(warehouseDrp);
		sc.selectByVisibleText("200");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(whField.get(0)).contains("200");
		Select sc1 = new Select(warehouseDrp);
		sc1.selectByVisibleText("All");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		return check;	
	}
	
	public boolean sourceDrp() 
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select sc = new Select(sourceDrp);
		sc.selectByVisibleText("QStock");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(sourceField.get(0)).contains("QStock");
		Select sc1 = new Select(sourceDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		return check;
	}
	
	
	public boolean statusDrp()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select sc = new Select(statusDrp);
		sc.selectByVisibleText("Shipped");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(statusField.get(1)).contains("SHIPPED");
		Select sc1 = new Select(statusDrp);
		sc1.selectByVisibleText("All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}	
		return check;
	}
	
	
	public boolean dates() 
	{
		boolean flag = false;
		
		click(orderManagement);
		click(fixedAssetReturns);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String dt = (dateField.get(1)).getText(); //input from date
		System.out.println(dt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(dt));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		c.add(Calendar.DATE, 1);  				// number of days to add
		String	dt2 = sdf.format(c.getTime());  // input to date

		
		sendKeys(dateFromInput, dt);
		sendKeys(dateToInput, dt2);
		dateToInput.sendKeys(Keys.ESCAPE);
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	if(collectText(dateField.get(0)).contains(dt) == true)
		flag = true;
	log.info(collectText(dateField.get(0)));
	return flag;
	}

	public boolean orderSearch()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchVal =(orderField.get(1)).getText();
		sendKeys(orderSearch,searchVal);
		click(arrow);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(orderField.get(0)).contains(searchVal);
		return check;
		
	}
	
	public boolean orderSearchFilter()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchVal =(orderField.get(1)).getText();
		sendKeys(orderFilter,searchVal);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(orderField.get(0)).contains(searchVal);
		orderFilter.clear();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
		
	}
	
	
	public boolean typeFilter()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchVal =(typeField.get(1)).getText();
		sendKeys(typeFilter,searchVal);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(typeField.get(0)).contains(searchVal);
		typeFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
	
	
	public boolean customerFilter()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchVal =(customerField.get(1)).getText();
		sendKeys(customerFilter,searchVal);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(customerField.get(0)).contains(searchVal);
		customerFilter.clear();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
	
	public boolean dateFilter()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchVal =(dateField.get(1)).getText();
		sendKeys(dateFilter,searchVal);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(dateField.get(0)).contains(searchVal);
		dateFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
	
	public boolean statusFilter()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchVal =(statusField.get(1)).getText();
		sendKeys(statusFilter,searchVal);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(statusField.get(0)).contains(searchVal);
		statusFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
	
	public boolean warehouseFilter()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchVal =(whField.get(1)).getText();
		sendKeys(warehouseFilter,searchVal);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(whField.get(0)).contains(searchVal);
		warehouseFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean sourceFilter()
	{
		click(orderManagement);
		click(fixedAssetReturns);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchVal =(sourceField.get(1)).getText();
		sendKeys(sourceFilter,searchVal);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(sourceField.get(0)).contains(searchVal);
		sourceFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	

}
