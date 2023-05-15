package com.QStock.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class CompanyInfoPage extends GeneralFunctions 
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	public CompanyInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Settings']")
	private WebElement settings;

	@FindBy(xpath="//a[text()='Company Info']")
	private WebElement companyInfo;

	@FindBy(xpath="//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	public boolean companyInfoConfirm() {
		click(settings);
		click(companyInfo);
		boolean check = collectText(panelHeading).contains("Company Info");
		return check;
	}
}
