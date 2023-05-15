package com.QStock.pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QStock.generics.GeneralFunctions;

public class KitsAssembliesComponentsPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "(//a[text()='Work Orders'])[1]")
	private WebElement workOrders;
	
	@FindBy(xpath = "//a[text()='Kits, Assemblies & Components']")
	private WebElement kitsAssembliesComponents;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement panelHeading;
	
	public KitsAssembliesComponentsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean kitsAssembliesComponentsConfirm() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(panelHeading).contains("Kits, Assemblies & Components");
		return check;
	}
	
	public boolean componentItemFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Component..." ,"Item", "33066MG");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("StockCode", 1);
		boolean check = value.contains("33066MG");
		clearFilter("Component..." ,"Item");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean componentDescriptionFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Component..." ,"Description", "FAN PROLOGIX");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("ItemDescription", 1);
		boolean check = value.contains("FAN PROLOGIX");
		clearFilter("Component..." ,"Description");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean kitItemFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Used in Kit/Assembly..." ,"Item", "007NonInv2");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("KitStockCode", 1);
		boolean check = value.contains("007NonInv2");
		clearFilter("Used in Kit/Assembly..." ,"Item");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean kitDescriptionFilter() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFilter("Used in Kit/Assembly..." ,"Description", "1 Serial Finished Good");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("KitDescription", 1);
		boolean check = value.contains("1 Serial Finished Good");
		clearFilter("Used in Kit/Assembly..." ,"Description");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public boolean warehouseDrp() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectDrp("Warehouse", "WH1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = collectFieldsText("Warehouse", 2);
		boolean check = value.contains("WH1");
		selectDrp("Warehouse", "All");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		}
	
	public boolean componentItemClickLink() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickLink("StockCode", 0);
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> windowIDs = driver.getWindowHandles();
		List<String> windowIDsList = new ArrayList(windowIDs);
		String parentWindowId = windowIDsList.get(0);
		String childWindowId = windowIDsList.get(1);
		driver.switchTo().window(parentWindowId);
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String item = collectFieldsText("StockCode", 1);
		driver.switchTo().window(childWindowId);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check =	driver.getCurrentUrl().contains(item);
	  if(driver.getTitle().contains("Item Details"))
		  driver.close();
	  driver.switchTo().window(parentWindowId);
		return check;
		}
	
	public boolean kitItemClickLink() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickLink("KitStockCode", 0);
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> windowIDs = driver.getWindowHandles();
		List<String> windowIDsList = new ArrayList(windowIDs);
		String parentWindowId = windowIDsList.get(0);
		String childWindowId = windowIDsList.get(1);
		driver.switchTo().window(parentWindowId);
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String item = collectFieldsText("KitStockCode", 1);
		driver.switchTo().window(childWindowId);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check =	driver.getCurrentUrl().contains(item);
	  if(driver.getTitle().contains("Item Details"))
		  driver.close();
	  driver.switchTo().window(parentWindowId);
		return check;
		}
	
	public boolean buildItemClickLink() {
		click(workOrders);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(kitsAssembliesComponents);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickLink("BuildItem", 1);
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> windowIDs = driver.getWindowHandles();
		List<String> windowIDsList = new ArrayList(windowIDs);
		String parentWindowId = windowIDsList.get(0);
		String childWindowId = windowIDsList.get(1);
		driver.switchTo().window(parentWindowId);
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.switchTo().window(childWindowId);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean check =	driver.getTitle().contains("New Batch Work Order");
	  if(driver.getTitle().contains("New Batch Work Order"))
		  driver.close();
	  driver.switchTo().window(parentWindowId);
		return check;
		}
	
	public void inputFilter(String component ,String name, String value) {
		By filter = By.xpath("//div[text()='"+component+"']/parent::div/following-sibling::div[1]/div/div"
				+ "/div[text()='"+name+"']"
				+ "/following-sibling::div[2]/input");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(filter)).perform();
		sendKeys(driver.findElement(filter), value);
	}
	
	public void clearFilter(String component ,String name) {
		By filter = By.xpath("//div[text()='"+component+"']/parent::div/following-sibling::div[1]/div/div"
				+ "/div[text()='"+name+"']"
				+ "/following-sibling::div[2]/input");
		driver.findElement(filter).clear();
		sendKeys(driver.findElement(filter), Keys.ENTER);
	}
	
	public String collectFieldsText(String field, int index) {
		By fields = By.xpath("//div[@tabulator-field='"+field+"']");
		return  collectText(driver.findElements(fields).get(index));	
	}
	
	public void clickLink(String name ,int index) {
		By links = By.xpath("//div[@tabulator-field='"+name+"']/a");
		click(driver.findElements(links).get(index)); 
	}
	
	public void selectDrp(String drpName, String option) {
		By drp = By.xpath("//div[contains(text(),'"+drpName+"')]/select");
		Select sc = new Select(driver.findElement(drp));
		sc.selectByVisibleText(option);
	}

}
