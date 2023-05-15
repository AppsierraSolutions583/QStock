package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class ManageReportsPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//span[text()='Tools']")
	private WebElement tools;
	
	@FindBy(xpath = "(//a[text()='Manage Reports'])[1]")
	private WebElement manageReports;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//input[@value='Add New Report']")
	private WebElement addNewReport;
	
	@FindBy(xpath = "//input[@ng-reflect-name='reportName']")
	private WebElement reportNameInput;
	
	@FindBy(xpath = "//input[@ng-reflect-name='reportGroup']")
	private WebElement reportGroupInput;
	
	@FindBy(xpath = "//input[@ng-reflect-name='reportFile']")
	private WebElement reportReportInput;
	
	@FindBy(xpath = "//input[@ng-reflect-name='active']")
	private WebElement active;
	
	@FindBy(xpath = "//button[text()='Add Report Parameter']")
	private WebElement addReportParameterBtn;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancelBtn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;
	
	@FindBy(xpath = "//button[text()='No']")
	private WebElement noBtn;
	
	@FindBy(xpath = "//div[@class='modal-header report-modal-header']")
	private WebElement reportHeader;
	
	@FindBy(xpath = "//span[@class='text-danger']")
	private WebElement errorMsg;
	
	@FindBy(xpath = "//select[@class='paramNumber']")
	private List<WebElement> parameterNumberDrp;
	
	@FindBy(xpath = "//select[@class='paramType']")
	private List<WebElement> parameterTypeDrp;
	
	@FindBy(xpath = "//input[@class='paramName']")
	private List<WebElement> parameterName;
	
	@FindBy(xpath = "//input[@class='paramPrompt']")
	private List<WebElement> parameterPrompt;
	
	@FindBy(xpath = "//a[@class='deleteReportParameter']")
	private List<WebElement> parameterDelete;
	
	public ManageReportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean manageReportsConfirm() {
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(manageReports);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Manage Reports");
		return check;
	}
	
	public boolean editViewLinkCheck() {
		boolean flag = false;
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(manageReports);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		editViewClick("testReport");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f1 = collectText(reportHeader).contains("Edit Report");
		boolean f2 = reportNameInput.getAttribute("ng-reflect-model").contains("testReport");
		sendKeys(reportNameInput, "reportTestEdit");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(saveBtn);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(saveBtn);
		click(noBtn);
		click(saveBtn);
		click(yesBtn);
	//	click(cancelBtn);
		editViewClick("reportTestEdit");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f3 =  reportNameInput.getAttribute("ng-reflect-model").contains("reportTestEdit");
		if(f1==true && f2==true && f3==true)
			flag = true;
		sendKeys(reportNameInput, "testReport");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(saveBtn);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(saveBtn);
		click(noBtn);
		click(saveBtn);
		click(yesBtn);
		click(cancelBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean addNewReport() {
		boolean flag = false;
		click(tools);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(manageReports);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addNewReport);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f1 = collectText(reportHeader).contains("Add Report");
		sendKeys(reportNameInput, "name");
		sendKeys(reportGroupInput, "group");
		sendKeys(reportReportInput, "report"); //passing input witout .rpt extension
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean f2 = collectText(errorMsg).contains("Report File should have .rpt extension");
		sendKeys(reportReportInput, "report.rpt");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addReportParameterBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select sc = new Select(parameterNumberDrp.get(0));
		sc.selectByVisibleText("9");
		sendKeys(parameterName.get(0), "name");
		sendKeys(parameterPrompt.get(0), "prompt");
		Select sc1 = new Select(parameterTypeDrp.get(0));
		sc1.selectByVisibleText("DATE");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(saveBtn);
		click(noBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(parameterDelete.get(0));
		click(yesBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f1==true && f2==true)
			flag = true;
		return flag;
	}
	
	public void editViewClick(String reportName) {
		By edit = By.xpath("//div[@tabulator-field='ReportName' and text()='"+reportName+"']"
				+ "/following-sibling::div[2]/a");
		click(driver.findElement(edit));
		
	}

}
