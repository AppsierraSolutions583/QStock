package com.QStock.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class LoginPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	private String comp = "qstockintaccttest";
	private String username = "Guarav";
	private String pass = "welcome!";

	@FindBy(xpath = "//input[@id='Company']")
	private WebElement company;
	
	@FindBy(xpath = "//input[@id='Username']")
	private WebElement id;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement signIn;

	@FindBy(xpath = "//span[@class='field-validation-error text-danger']")
	private WebElement errorMsg;

	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	private WebElement newVersionMsgDismiss;

	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logout;

	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement logoutVerify;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean positiveLoginTest() {
		sendKeys(company, comp);
		sendKeys(id, username);
		sendKeys(password, pass);
		click(signIn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().equals("https://test.qstockweb.com/");
		log.info("Sign-In is Done.");
	
		return plTest;
	}

	public boolean negativeLoginTest() {
		sendKeys(id, "Testing");
		sendKeys(password, "Testing");
		click(signIn);
		boolean nlTest = visibilityCheck(errorMsg);
		log.info("Negative SignIn is Verified.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return nlTest;
	}

	public boolean signOut() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(logout);
		boolean logoutVfy = visibilityCheck(logoutVerify);
		log.info("LogOut is Done.");
		return logoutVfy;

	}

}
