package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class LanguagePage extends GeneralFunctions 
{

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	public LanguagePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Settings']")
	private WebElement settings;
	
	@FindBy(xpath="//a[text()='Language']")
	private WebElement language;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement SearchFilter;
	
	@FindBy(xpath="//tbody/tr/td[2]")
	private List <WebElement> desField;
			
	public boolean SearchFilter()
	{
		click(settings);
		click(language);
		String searchVal = (desField.get(1)).getText();
		sendKeys(SearchFilter, searchVal);
		
		boolean check = collectText(desField.get(0)).contains(searchVal);
		return check;
		
	}
	
	
}
