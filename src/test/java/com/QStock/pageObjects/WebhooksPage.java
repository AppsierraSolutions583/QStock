package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class WebhooksPage extends GeneralFunctions
{

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	public WebhooksPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashBoard;
	
	@FindBy(xpath = "(//a[text()='Webhooks'])[1]")
	private WebElement webhooks;
	
	@FindBy(xpath = "//div[3]//div[1]//p[1]")
	private WebElement panelHeading;
	
	@FindBy(xpath = "//input[@placeholder='filter column...']")
	private WebElement lastAttemptFilter;

	@FindBy(xpath = "//div[@tabulator-field='AttemptedDate' and @role='gridcell']")
	private List <WebElement> lastAttemptField ; 
		
	public boolean webhooksConfirm()
	{
		click(dashBoard);
		click(webhooks);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(panelHeading).contains("Webhooks integration:");
		return check;	
	}
	
	public boolean lastAttemptFilter()
	{
		click(dashBoard);
		click(webhooks);
		
		String searchVal = ((lastAttemptField.get(1)).getText()).substring(0, 10);
		
		sendKeys(lastAttemptFilter,searchVal);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean check = collectText(lastAttemptField.get(0)).contains(searchVal);
		lastAttemptFilter.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return check;
	}
}
