package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class SettingWorkOrdersPage extends GeneralFunctions
{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	public SettingWorkOrdersPage (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
			@FindBy(xpath = "//span[text()='Settings']")
			private WebElement settings;
			
			@FindBy(xpath="(//li/a[text()='Work Orders'])[3]")
			private WebElement workOrders;

			@FindBy(xpath="(//div[@class='panel-heading'])[1]")
			private WebElement panelHeading;
				
			@FindBy(xpath="//input[@type='search']")
			private WebElement SearchFilter;
			
			@FindBy(xpath="//tbody/tr/td[1]")
			private List <WebElement> settingField;
			
			public boolean workOrdersConfirm() {
				click(settings);
				click(workOrders);
				boolean check = collectText(panelHeading).contains("Settings - Work Orders");
				return check;
			}
							
			public boolean SearchFilter()
			{
				click(settings);
				click(workOrders);
		
				String searchVal = (settingField.get(1)).getText();
				sendKeys( SearchFilter, searchVal);
				
				boolean check = collectText(settingField.get(0)).contains(searchVal);
				return check;
			}
	
}
