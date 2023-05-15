package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class WarehouseLocationsPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath = "(//a[text()='Warehouse / Locations'])[1]")
	private WebElement warehouseLocations;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	@FindBy(xpath = "(//input[@type='search'])[1]")
	private WebElement search1;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	private WebElement search2;
	
	@FindBy(xpath = "(//div[@class='dataTables_info'])[1]")
	private WebElement entriesInfo1;
	
	@FindBy(xpath = "(//div[@class='dataTables_info'])[2]")
	private WebElement entriesInfo2;
	
	@FindBy(xpath = "//a[text()='Add New Location']")
	private WebElement addNewLocation;
	
	@FindBy(xpath = "//a[text()='Add New Zone Template']")
	private WebElement addNewZoneTemplate;
	
	@FindBy(xpath = "//span/a[text()='Inventory']")
	private List<WebElement> inventoryLinks;
	
	@FindBy(xpath = "//a[text()='Configure']")
	private List<WebElement> configureLinks;
	
	@FindBy(xpath = "//a[text()='Zones']")
	private List<WebElement> zonesLinks;
	
	@FindBy(xpath = "//a[text()='Clone']")
	private List<WebElement> cloneLinks;
	
	@FindBy(xpath = "//a[text()='Delete']")
	private List<WebElement> deleteLinks;
	
	@FindBy(xpath = "//a[contains(text(),'Bins')]")
	private List<WebElement> binsLinks;
	
	public  WarehouseLocationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean warehouseLocationsConfirm() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Locations / Warehouses");
		return check;
	}
	
	public boolean search1() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    sendKeys(search1, "Austin - Texas");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check = collectFieldsText("3", 0).contains("Austin - Texas");
	    return check;
	}
	
	public boolean search2() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    sendKeys(search2, "302");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check = collectFieldsText("1", 10).contains("302");
	    return check;
	}
	
	public boolean entriesDrp1() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    selectDrp("1", "10");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check = collectText(entriesInfo1).contains("Showing 1 to 10 of");
	    return check;
	}
	
	public boolean entriesDrp2() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    selectDrp("2", "10");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check = collectText(entriesInfo2).contains("Showing 1 to 10 of");
	    return check;
	}
	
	public boolean addNewLocation() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addNewLocation);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Add New Location");
		return check;
	}
	
	public boolean addNewZoneTemplate() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addNewZoneTemplate);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Add New Zone Template");
		return check;
	}
	
	public boolean warehouseLink() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String warehouse = collectFieldsText("2", 0);
	    clickLink("2", 0);	
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    By wh = By.xpath("//strong");
	    boolean check = collectText(driver.findElement(wh)).contains(warehouse);
	    return check;
	}
	
	public boolean zonesLink() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String zone = collectFieldsText("6", 0);
	    clickLink("6", 0);	
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check = collectText(entriesInfo1).contains("Showing 1 to " +zone+" of");
	    return check;
	}
	
	public boolean binsLink() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    clickLink("7", 0);	
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check = collectText(panelHeading).contains("Bin Locations");
	    return check;
	}
	
	public boolean templateNameLink() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String temp = collectFieldsText("1", 0);
	    clickLink("1", 0);	
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    By template = By.xpath("//strong");
	    boolean check = collectText(driver.findElement(template)).contains(temp);
	    return check;
	}
	
	public boolean inventoryLink() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(inventoryLinks.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Inventory");
		return check;
	}
	
	public boolean configureLink() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(configureLinks.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Configure Location");
		return check;
	}
	
	public boolean binsLink2() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(binsLinks.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Bin Locations");
		return check;
	}
	
	public boolean zonesLink2() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(zonesLinks.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Zones");
		return check;
	}
	
	public boolean cloneLink() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(cloneLinks.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Clone Location");
		return check;
	}
	
	public boolean deleteLink() {
		click(manage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(warehouseLocations);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(deleteLinks.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = driver.switchTo().alert().getText().contains("Delete this location? "
				+ "WARNING: This is a potentially volatile operation. "
				+ "Instead of deleting this record, setting the status to Inactive is recommended.");
		driver.switchTo().alert().dismiss();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	

	public String collectFieldsText(String fieldNo, int index) {
		By fields = By.xpath("//td["+fieldNo+"]");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(fields));
		return  collectText(driver.findElements(fields).get(index));	
	}
	
	public void clickLink(String fieldNo ,int index) {
		By links = By.xpath("//td["+fieldNo+"]/a");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(links));
		click(driver.findElements(links).get(index)); 
	}
	
	public void selectDrp(String drpNo, String option) {
		By drp = By.xpath("(//select)["+drpNo+"]");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(drp));
		Select sc = new Select(driver.findElement(drp));
		sc.selectByVisibleText(option);
	}
}
