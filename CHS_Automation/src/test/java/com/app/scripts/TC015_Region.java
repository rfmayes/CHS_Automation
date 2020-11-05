package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC015_Region   extends DriverTestCase {

	
	
	
	String RegionExpectedText= "Brave Hearts";
	

	@Test
	public void region() throws InterruptedException {

	
		  String emailAddress = propertyReader.readApplicationFile("loginEmail");
		  String loginPassword = propertyReader.readApplicationFile("loginPassword");
		  
		  //Enter the login credential 
		  loginPage.enterEmailAddress(emailAddress);
		  loginPage.enterPassword(loginPassword);
		  
		  //click on login button and enter into application
		  loginPage.clickOnLoginButton();
		  
		//Navigate-Austintown
		  String facilityName= "Austintown";
		  dashboardPage.clickOnfacilityLinkAtDashBoard();
		  dashboardPage.selectFacilityName(facilityName);

			
			//verify-division-text
		  String RegionText= facilityProfilePage.getRegionText();
			System.out.println("Region: "+RegionText);
			Assert.assertEquals(RegionText, RegionExpectedText);
			

			
		  //logout form the application
	   	   loginPage.clickOnLogoutLink();
		
		
			 
	}



}
