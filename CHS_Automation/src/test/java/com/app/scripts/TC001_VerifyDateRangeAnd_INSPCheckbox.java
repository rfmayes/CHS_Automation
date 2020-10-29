package com.app.scripts;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC001_VerifyDateRangeAnd_INSPCheckbox extends DriverTestCase {

	
	@Test
	public void verifyCurrentDateAndISNPCheckBox() throws InterruptedException {
		
		
		  String emailAddress = propertyReader.readApplicationFile("loginEmail");
		  String loginPassword = propertyReader.readApplicationFile("loginPassword");
		  
		  //Enter the login credential 
		  loginPage.enterEmailAddress(emailAddress);
		  loginPage.enterPassword(loginPassword);
		  
		  //click on login button and enter into application
		  loginPage.clickOnLoginButton();
		  
		  String facilityName= "Austintown";
		  dashboardPage.clickOnfacilityLinkAtDashBoard();
		  dashboardPage.selectFacilityName(facilityName);
		  
		  //Get the system local current date
		  String getSystemLocalCurrentDate= getCurrentLocalDate();
		  
		  //get the application start & current data in facility profile page
		  String startDate= facilityProfilePage.getStartDate();
		  String currentDateFromWebApplication= facilityProfilePage.getCurrentDate();
		  
		  //verify that both the system local current date and application current date should be same
	   	  Assert.assertEquals(currentDateFromWebApplication, getSystemLocalCurrentDate, "System local current data and application current date should be same");;
		 	
	   	  //verify that ISNP checkbox should not be checked at default
	   	  boolean ISNPCheckBoxChecked = facilityProfilePage.isISNPCheckChecked();
	   	  System.out.println("checked? " + ISNPCheckBoxChecked);
	   	  Assert.assertFalse(ISNPCheckBoxChecked, "ISNP checkbox should not be checked at default");
		
	   	  //logout form the application
	   	   loginPage.clickOnLogoutLink();
		
		

	}

}
