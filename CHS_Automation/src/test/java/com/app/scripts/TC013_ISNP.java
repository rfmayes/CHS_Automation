package com.app.scripts;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC013_ISNP extends DriverTestCase {

	
	@Test
	public void verifyISNPCheckBox() throws InterruptedException {
		
		
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
		  
	   	  //verify that ISNP checkbox should not be checked at default
	   	  boolean ISNPCheckBoxChecked = facilityProfilePage.isISNPCheckChecked();
	   	  System.out.println("checked? " + ISNPCheckBoxChecked);
	   	  Assert.assertFalse(ISNPCheckBoxChecked, "ISNP checkbox should not be checked at default");
		
	   	  //logout form the application
	   	   loginPage.clickOnLogoutLink();
		
		

	}

}
