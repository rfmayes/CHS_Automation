package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.utils.DriverHelper;

public class DashboardPage  extends DriverHelper {

	@FindBy(xpath = "//p[contains(text(),'Facility')]")
	private WebElement facilityLinkAtDashBoard;
	
	@FindBy(xpath = "//input[contains(@class,'MuiInputBase-input') and contains(@placeholder,'Type Facility Name')]")
	private WebElement facilityNameDropdown;
	
	@FindBy(xpath = "//input[@title='email']")
	private WebElement emailConfirmationAtReviewFrom;
	
	@FindBy(xpath = "//h6[contains(text(),'Facility Profile')]")
	private WebElement facilityProfileLabel;
	
	@FindBy(xpath = "//table")
	private WebElement PhysicianTable;
	
	

	public DashboardPage(WebDriver webdriver) {
		super(webdriver);

	}
	

		public DashboardPage clickOnfacilityLinkAtDashBoard() {
			facilityLinkAtDashBoard.click();
			WaitUntilWebElementIsVisible(facilityNameDropdown);
			return PageFactory.initElements(getWebDriver(), DashboardPage.class);
		}	
		
		public DashboardPage selectFacilityName(String facilityName) throws InterruptedException {
			facilityNameDropdown.sendKeys(facilityName);
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//span[contains(.,\'"+facilityName+"\')]")).click();
		    WaitUntilWebElementIsVisible(facilityProfileLabel);
		    return PageFactory.initElements(getWebDriver(), DashboardPage.class);
		}	
		
		public DashboardPage selectPhysician() throws InterruptedException {
		    driver.findElement(By.xpath("(//table[contains(@class,'MuiTable-root')]/tbody/tr/td/p/a)[1]")).click();
		    WaitUntilWebElementIsVisible(PhysicianTable);
		    return PageFactory.initElements(getWebDriver(), DashboardPage.class);
		}	
		
		
}
