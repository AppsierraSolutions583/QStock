package com.QStock.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QStock.generics.GeneralFunctions;

public class ItemPage extends GeneralFunctions{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(ItemPage.class);

	@FindBy(xpath = "//span[normalize-space()='Manage']")
	private WebElement managedMenu;

	@FindBy(xpath = "//a[@href='/ItemManager/Index/']")
	private WebElement itemMenu;

	@FindBy(xpath = "//div[@tabulator-field='StockCode']//input[@placeholder='filter column...']")
	private WebElement item;

	@FindBy(xpath = "//*[@id=\"itemindextable1\"]/div[1]/div[1]/div[3]/div[1]/div[3]/input")
	private WebElement description;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/input[1]")
	private WebElement productBrand;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/input[1]")
	private WebElement productCategory;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[6]/div[1]/div[3]/input[1]")
	private WebElement productGroup;
	
	@FindBy(xpath = "//*[@id=\"itemindextable1\"]/div[3]/span/span/button")
	private List<WebElement> listofPages;
	
	@FindBy(xpath = "//div[@id='itemindextable1']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst;


	@FindBy(xpath = "//div[@id='itemindextable1']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev;

	@FindBy(xpath = "//div[@id='itemindextable1']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext;

	@FindBy(xpath = "//div[@id='itemindextable1']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast;
	
	
	@FindBy(xpath = "//a[contains(text(),'Export to .csv')]")
	private WebElement exportBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/div[1]/div[3]/input[1]")
	private WebElement style;

	@FindBy(xpath = "//div[@tabulator-field='Color']//input[@placeholder='filter column...']")
	private WebElement color;

	@FindBy(xpath = "//div[@tabulator-field='Size']//input[@placeholder='filter column...']")
	private WebElement size;

	@FindBy(xpath = "//div[@tabulator-field='UOMSetName']//input[@placeholder='filter column...']")
	private WebElement uom;

	@FindBy(xpath = "//div[@tabulator-field='defaultUnit']//input[@placeholder='filter column...']")
	private WebElement defaultUnit;

	@FindBy(xpath = "//div[@tabulator-field='sourceName']//input[@placeholder='filter column...']")
	private WebElement source;

	@FindBy(xpath = "//a[normalize-space()='Style']")
	private WebElement styleTab;

	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[1]/div[1]/div[3]/input")
	private WebElement styleDesc;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[2]/div[1]/div[3]/input")
	private WebElement styleId;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[3]/div[1]/div[3]/input")
	private WebElement style2;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[4]/div[1]/div[3]/input")
	private WebElement color2;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[5]/div[1]/div[3]/input")
	private WebElement size2;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[6]/div[1]/div[3]/input")
	private WebElement productBrand2;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[7]/div[1]/div[3]/input")
	private WebElement productCategory2;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[8]/div[1]/div[3]/input")
	private WebElement productGroup2;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[1]/div[1]/div[9]/div[1]/div[3]/input")
	private WebElement stockCodes;
	
	@FindBy(xpath = "//*[@id=\"itemstylestable1\"]/div[3]/span/span/button")
	private List<WebElement> listofPages2;
	
	@FindBy(xpath = "//div[@id='itemstylestable1']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst2;
	
	@FindBy(xpath = "//div[@id='itemstylestable1']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev2;

	@FindBy(xpath = "//div[@id='itemstylestable1']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext2;

	@FindBy(xpath = "//div[@id='itemstylestable1']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast2;
	
	@FindBy(xpath = "//a[contains(text(),'UOM Sets')]")
	private WebElement uomSetTab;
	
	@FindBy(xpath = "//input[@aria-controls='table_uomsetList']")
	private WebElement uomSearch;
	
	@FindBy(xpath = "//a[contains(text(),'Tracking Rules')]")
	private WebElement trackingRuleTab;
	
	
	@FindBy(xpath = "//*[@id=\"TrackingRulesTable\"]/div[3]/span/span/button")
	private List<WebElement> listofPages3;
	
	@FindBy(xpath = "//div[@id='TrackingRulesTable']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst3;
	
	@FindBy(xpath = "//div[@id='TrackingRulesTable']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev3;

	@FindBy(xpath = "//div[@id='TrackingRulesTable']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext3;

	@FindBy(xpath = "//div[@id='TrackingRulesTable']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast3;
	
	@FindBy(xpath = "//a[@id='AIMapsHref']")
	private WebElement aiMapTab;
	
	@FindBy(xpath = "//*[@id=\"qstock-table\"]/div/div[3]/span/span/button")
	private List<WebElement> listofPages4;
	
	@FindBy(xpath = "//div[@id='qstock-table']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst4;
	
	@FindBy(xpath = "//div[@id='qstock-table']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev4;

	@FindBy(xpath = "//div[@id='qstock-table']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext4;

	@FindBy(xpath = "//div[@id='qstock-table']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast4;
	
	
	@FindBy(xpath = "//a[@id='WarehouseItemVendorsHref']")
	private WebElement warehousevendorItemTab;
	
	
	@FindBy(xpath = "//*[@id=\"warehouse-item-table\"]/div/div[1]/div[1]/div[1]/div[1]/div[3]/input")
	private WebElement wvStockCodes;
	
	@FindBy(xpath = "//*[@id=\"warehouse-item-table\"]/div/div[1]/div[1]/div[2]/div[1]/div[3]/input")
	private WebElement wvItemDesc;
		
	@FindBy(xpath = "//*[@id=\"warehouse-item-table\"]/div/div[1]/div[1]/div[3]/div[1]/div[3]/input")
	private WebElement wvWarehouse;
	
	@FindBy(xpath = "//*[@id=\"warehouse-item-table\"]/div/div[1]/div[1]/div[5]/div[1]/div[3]/input")
	private WebElement wvPrferredVendor;
	
	@FindBy(xpath = "//*[@id=\"warehouse-item-table\"]/div/div[3]/span/span/button")
	private List<WebElement> listofPages5;
	
	@FindBy(xpath = "//div[@id='warehouse-item-table']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst5;
	
	@FindBy(xpath = "//div[@id='warehouse-item-table']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev5;

	@FindBy(xpath = "//div[@id='warehouse-item-table']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext5;

	@FindBy(xpath = "//div[@id='warehouse-item-table']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast5;
	
	
	@FindBy(xpath = "//a[@id='ItemCrossReferenceHref']")
	private WebElement crossReferenceTab;
	
	@FindBy(xpath = "//div[@id='warehouseItemVendors']//div[2]//div[1]//div[3]//input[1]")
	private WebElement crItem;
	
	@FindBy(xpath = "//*[@id=\"qstock-table\"]/div/div[1]/div[1]/div[3]/div[1]/div[3]/input")
	private WebElement crItemDesc;
	
	@FindBy(xpath = "//div[@tabulator-field='Unit']//input[@placeholder='filter column...']")
	private WebElement crUnit;
	
	
	@FindBy(xpath = "//div[@tabulator-field='XRef']//input[@placeholder='filter column...']")
	private WebElement crCrossreference;
	
	
	@FindBy(xpath = "//div[@tabulator-field='XrefDesc']//input[@placeholder='filter column...']")
	private WebElement crdescription;
	
	
	@FindBy(xpath = "//*[@id=\"qstock-table\"]/div/div[3]/span/span/button")
	private List<WebElement> listofPages6;
	
	@FindBy(xpath = "//div[@id='qstock-table']//button[@title='First Page'][normalize-space()='First']")
	private WebElement btnFirst6;
	
	@FindBy(xpath = "//div[@id='qstock-table']//button[@title='Prev Page'][normalize-space()='Prev']")
	private WebElement btnPrev6;

	@FindBy(xpath = "//div[@id='qstock-table']//button[@title='Next Page'][normalize-space()='Next']")
	private WebElement btnNext6;

	@FindBy(xpath = "//div[@id='qstock-table']//button[@title='Last Page'][normalize-space()='Last']")
	private WebElement btnLast6;
	
	
	

	public ItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public void ItemTab() {
		click(managedMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(item);
		sendKeys(item,"00259");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(description);
		sendKeys(description,"Mr. T Smoked Sausage - Garlic 7/3#");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(productGroup);
		sendKeys(productGroup,"Food");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(uom);
		sendKeys(uom,"7/3 lb Case");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(defaultUnit);
		sendKeys(defaultUnit,"Pounds");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(source);
		sendKeys(source,"Intacct");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		sendKeys(message,"iPostInventoryAdjustment exception: Could not retrieve Intacct project ID (p2021): success");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		log.info("Item Filter Work Successfully");
	}
	public void ItemPages() {
		click(managedMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listofPages.size(); i++) {
			listofPages.get(i).click();
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		click(btnFirst);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnFirst);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Item Pages Work Successfully");
	}
	
	public void ExportItem() {
		click(managedMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(exportBtn);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Item Exported");
	}
	public void StyleTab() {
		click(managedMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(styleTab);
		click(styleDesc);
		sendKeys(styleDesc,"2 Serial Finished Good");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(styleId);
		sendKeys(styleId,"Style");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(style2);
		sendKeys(style2,"Style");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(color2);
		sendKeys(color2,"Red");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(size2);
		sendKeys(size2,"1");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(productBrand2);
		sendKeys(productBrand2,"Brand");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(productCategory2);
		sendKeys(productCategory2,"MOTOR");
		//		sendKeys(message,"iPostInventoryAdjustment exception: Could not retrieve Intacct project ID (p2021): success");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(productGroup2);
		sendKeys(productGroup2,"Electronics");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		click(stockCodes);
		sendKeys(stockCodes,"2SFinishedGood");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		log.info("Style Tab Filter Work Successfully");
	}
	public void StylePages() {
		click(managedMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(styleTab);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listofPages2.size(); i++) {
			listofPages2.get(i).click();
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		click(btnFirst2);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext2);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast2);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev2);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnFirst2);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Style Pages Work Successfully");
	}
	
	public void UomSearchFiletr() {
		click(managedMenu);
		click(itemMenu);
		click(uomSetTab);
		sendKeys(uomSearch, "10PK");
	}
	
	public void TrackingRulePages() {
		click(managedMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(trackingRuleTab);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listofPages3.size(); i++) {
			listofPages3.get(i).click();
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		click(btnFirst3);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext3);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast3);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev3);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnFirst3);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Tracking Rule Pages Work Successfully");
	}
	
	public void AIMapPages() {
		click(managedMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(aiMapTab);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listofPages4.size(); i++) {
			listofPages4.get(i).click();
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		click(btnFirst4);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext4);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast4);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev4);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnFirst4);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		log.info("AI Map Pages Work Successfully");
	}
	
	public void WarehouseItemVendorTab() {
		click(managedMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(warehousevendorItemTab);
		click(wvStockCodes);
		sendKeys(wvStockCodes,"00259");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(wvItemDesc);
		sendKeys(wvItemDesc,"Mr. T Smoked Sausage - Garlic 7/3#");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(wvWarehouse);
		sendKeys(wvWarehouse,"100");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(wvPrferredVendor);
		sendKeys(wvPrferredVendor,"Select");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		log.info("Warehouse Item Vendor  Filter Work Successfully");
	}
	public void WarehouseItemPages() {
		click(managedMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(warehousevendorItemTab);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listofPages5.size(); i++) {
			listofPages5.get(i).click();
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		click(btnFirst5);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext5);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast5);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev5);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnFirst5);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("WarehouseItem Pages Work Successfully");
	}
	
	public void CrossReferenceTab() {
		click(managedMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(crossReferenceTab);
		click(crItem);
		sendKeys(crItem,"AL-COST");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(crItemDesc);
		sendKeys(crItemDesc,"Amory Cost Testing");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(crUnit);
		sendKeys(crUnit,"Each");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(crCrossreference);
		sendKeys(crCrossreference,"20000000000677");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(crdescription);
		sendKeys(crdescription,"GTIN");
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		log.info("CrossReference Tab Vendor  Filter Work Successfully");
	}
	public void CrossreferencePages() {
		click(managedMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(itemMenu);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(crossReferenceTab);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listofPages6.size(); i++) {
			listofPages6.get(i).click();
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		click(btnFirst6);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnNext6);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(btnLast6);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnPrev6);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(btnFirst6);
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Cross reference Pages Work Successfully");
	}

}
