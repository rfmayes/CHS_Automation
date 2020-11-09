package com.app.pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.utils.DriverHelper;

public class FacilityProfilePage extends DriverHelper {

	@FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input')])[1]")
	private WebElement startDate;
	
	@FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input')])[2]")
	private WebElement currentDate;
	
	@FindBy(xpath = "//div[@data-qa-testing='date-range-submit']") //div[@class='jss94'] //span[@data-qa-testing='date-range-submit']
	private WebElement submitDate;
	
	@FindBy(xpath = "//button[contains (@class,'MuiPickersCalendarHeader-iconButton')][1]")
	private WebElement leftDateArrow;
	
	@FindBy(xpath = "//span[contains(text(),'ISNP Only')]/preceding-sibling::span/span/input[@type='checkbox']")
	private WebElement ISNPCheckBox;
	
	@FindBy(xpath = "//h4[contains(text(),'Austintown')]")
	private WebElement AustintownLabel;
	
	
	@FindBy(xpath = "//ol[@class='MuiBreadcrumbs-ol']")
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//div/p[contains(text(),'Heartland')]")
	private WebElement divisionText;
	
	@FindBy(xpath = "//div/p[contains(text(),'Brave Hearts')]")
	private WebElement regionText;
	
	@FindBy(xpath = "//div[contains(@class,'MuiGrid-root jss') and starts-with(.,'Patient Count')]")
	private WebElement PatientCount;
	
	@FindBy(xpath = "//div[contains(@class,'MuiGrid-root jss') and starts-with(.,'Days of Care')]")
	private WebElement DaysofCare;
	
	@FindBy(xpath = "//div[contains(@class,'MuiGrid-root jss') and starts-with(.,'SNF ADM')]")
	private WebElement SNFADM;
	
	@FindBy(xpath = "//span[@data-qa-testing='rth']")
	private WebElement RTH;
	
	@FindBy(xpath = "//span[@data-qa-testing='ed']")
	private WebElement EDslashED;
	
	@FindBy(xpath = "//span[@data-qa-testing='ach_adm']")
	private WebElement ACHslashADM;
	
	@FindBy(xpath = "//span[@data-qa-testing='h_1000']")
	private WebElement Hslash1000;
	
	@FindBy(xpath = "//span[@data-qa-testing='ed_1000']")
	private WebElement EDslash1000;
	
	@FindBy(xpath = "//span[@data-qa-testing='adm_1000']")
	private WebElement ADMslash1000;
	
	@FindBy(xpath = "//span[@data-qa-testing='pd_lt_doc']")
	private WebElement PDLTDOC;
	
	@FindBy(xpath = "(//div[contains(@class,'MuiGrid-direction-xs-column')])[1]")
	private WebElement HighFrailty;
	
	@FindBy(xpath = "//h4[contains(text(),'Buccino')]")
	private WebElement phys;
	
	@FindAll({@FindBy(xpath = "//table[contains(@class,'MuiTable-root')]/tbody/tr")})
	private List<WebElement> Rows;

	
	

	public FacilityProfilePage(WebDriver webdriver) {
		super(webdriver);

	}
	

	
		public String getStartDate() {
			String sDate= startDate.getAttribute("value");
			return sDate;
		}	
		
		
		public String getCurrentDate() {
			String cDate= currentDate.getAttribute("value");
			return cDate;
		}
	
		public FacilityProfilePage clickSubmit() {
			driver.findElement(By.xpath("//div[@data-qa-testing='date-range-submit']")).click();
			return PageFactory.initElements(getWebDriver(), FacilityProfilePage.class);
		}
		
		public FacilityProfilePage selectDate(String DateNumber) throws InterruptedException {
			startDate.click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//p[contains(@class,'MuiTypography-colorInherit') and contains(text(),\'"+DateNumber+"\')]")).click();
		    WaitUntilWebElementIsVisible(startDate);
			return PageFactory.initElements(getWebDriver(), FacilityProfilePage.class);
		}
		
		public FacilityProfilePage selectendDate(String EndDateNumber) throws InterruptedException {
			currentDate.click();
			driver.findElement(By.xpath("//button[contains(@class,'MuiPickersCalendarHeader-iconButton')][1]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//p[contains(@class,'MuiTypography-colorInherit') and contains(text(),\'"+EndDateNumber+"\')]")).click();
		    WaitUntilWebElementIsVisible(currentDate);
			return PageFactory.initElements(getWebDriver(), FacilityProfilePage.class);
		}
		
		public FacilityProfilePage selectendDateAndendMonth(String EndDateNumber) throws InterruptedException {
			currentDate.click();
			driver.findElement(By.xpath("//button[contains(@class,'MuiPickersCalendarHeader-iconButton')][1]")).click();
			driver.findElement(By.xpath("//button[contains(@class,'MuiPickersCalendarHeader-iconButton')][1]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//p[contains(@class,'MuiTypography-colorInherit') and contains(text(),\'"+EndDateNumber+"\')]")).click();
		    WaitUntilWebElementIsVisible(currentDate);
			return PageFactory.initElements(getWebDriver(), FacilityProfilePage.class);
		}

		public boolean isISNPCheckChecked() {
			boolean result= ISNPCheckBox.isSelected();
			return result;
		}	
		
		public String getBreadCrumb() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("return document.readyState").toString().equals("complete");
			Thread.sleep(5000);
			String result= breadcrumb.getText();
			return result;
		}	
		
		public String  getDivisionText() {
			String result= divisionText.getText();
			return result;
		}
		
		public String  getPhysText() {
			String result= phys.getText();
			return result;
		}
		
		public String  getRegionText() {
			String result= regionText.getText();
			return result;
		}
		
		public String  getAustintownLabel() {
			String result= AustintownLabel.getText();
			return result;
		}
		
		public String getPatientCountText() {
			String result= PatientCount.getText();
			return result;
		}
			
			public String getDaysofCareText() {
				String result= DaysofCare.getText();
				return result;
		}
			public String getSNFADMText() {
				String result= SNFADM.getText();
				return result;
		}
			public String getRTHText() {
				String result= RTH.getText();
				return result;
		}
			public String getEDslashEDText() {
				String result= EDslashED.getText();
				return result;
		}
			public String getACHslashADM() {
				String result= ACHslashADM.getText();
				return result;
		}
			public String getHslash1000() {
				String result= Hslash1000.getText();
				return result;
		}
			public String getEDslash1000() {
				String result= EDslash1000.getText();
				return result;
		}
			public String getADMslash1000() {
				String result= ADMslash1000.getText();
				return result;
		}
			public String getPDLTDOC() {
				String result= PDLTDOC.getText();
				return result;
				
		}
			public String getHighFrailty() {
				String result= HighFrailty.getText();
				return result;
		
		}
			
			public FacilityProfilePage getNumberofRows() {
				System.out.println("Total rows: "+ Rows.size());
				return PageFactory.initElements(getWebDriver(), FacilityProfilePage.class);
		}
			public FacilityProfilePage getRowInfo() {
				for (WebElement webElement : Rows) {
		            String name1 = webElement.getText();
		            String name2= name1.replaceAll("[\r\n]+", " ");
		            System.out.println(name2);}
		            return PageFactory.initElements(getWebDriver(), FacilityProfilePage.class);
		}
			
			
			
}
			
			
			
			

		

