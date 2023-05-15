package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class LabelsPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	public LabelsPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath="//a[text()='Labels']")
	private WebElement labels;
	
	@FindBy(xpath="//div[@class='panel-heading']")
	private WebElement panelHeading;

	@FindBy(xpath="(//input[@placeholder='filter column...'])[1]")
	private WebElement labelFilter;

	@FindBy(xpath="//div[@class='tabulator-table']/div/div[1]")
	private List <WebElement> labelField; 
	
	@FindBy(xpath="(//input[@placeholder='filter column...'])[2]")
	private WebElement xRefDesFilter;
	
	@FindBy(xpath="//div[@class='tabulator-table']/div/div[5]")
	private List <WebElement> XrefDesField;

	@FindBy(xpath="(//select[@placeholder='filter column...'])[1]")
	private WebElement labelTypeDrp ;
	
	@FindBy(xpath="(//select[@placeholder='filter column...'])[1]/option")
	private List<WebElement> labelTypeDrpOpts;
	
	@FindBy(xpath="//div[@tabulator-field='LabelType' and @role='gridcell']")
	private List<WebElement> labelTypeField;
	
	@FindBy(xpath="(//select[@placeholder='filter column...'])[2]")
	private WebElement trackingRuleDrp;
	
	@FindBy(xpath="(//select[@placeholder='filter column...'])[2]/option")
	private List<WebElement> trackingRuleDrpOpts;
	
	@FindBy(xpath="//div[@tabulator-field='Rule' and @role='gridcell']") 
	private List<WebElement> trackingRuleField;

	@FindBy(xpath="//a[text()='Add New Label']")
	private WebElement addLabel;
	
	@FindBy(xpath="//div[text()='New Label']")
	private WebElement newlabel;
	
	@FindBy(xpath="//input[@value='Save New Label']")
	private WebElement saveLabel;
	
	public boolean labelsConfirm() 
	{
		click(manage);
		click(labels);
		boolean check = collectText(panelHeading).contains("Labels");
		return check;
	}
	
	public boolean labelNameFilter()
	{
		click(manage);
		click(labels);

		String searchVal = (labelField.get(1)).getText();
		sendKeys(labelFilter,searchVal);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean check = collectText(labelField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean xrefDescFilter()
	{
		click(manage);
		click(labels);

		String searchVal = (XrefDesField.get(1)).getText();
		sendKeys(xRefDesFilter,searchVal);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(XrefDesField.get(0)).contains(searchVal);
		return check;
	}
	
	public boolean labelType()
	{
		click(manage);
		click(labels);
		
		Select sc= new Select(labelTypeDrp);
		sc.selectByVisibleText("Bin");

		boolean check =	collectText(labelTypeField.get(0)).contains("Bin");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
		
	public boolean trackingRule()
	{
		click(manage);
		click(labels);
		
		Select sc= new Select(trackingRuleDrp);
		sc.selectByVisibleText("NoTracking");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean check =	collectText(trackingRuleField.get(0)).contains("NoTracking");
		return check;
	}	
	
	
	public boolean addLabel()
	{
		boolean flag =false,f1= false,f2=false;
		
		click(manage);
		click(labels);
		click(addLabel);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		f1 = collectText(newlabel).contains("New Label");	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		f2 = saveLabel.isDisplayed();
		if(f1 && f2 == true)
		{
			flag = true;
		}
		
		return flag;
	}
		
	
}
