package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC014_Division  extends DriverTestCase {

	
	
	
	String divisionExpectedText= "Heartland";
	

	@Test
	public void division() throws InterruptedException {

	
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
			String divisionText= facilityProfilePage.getDivisionText();
			System.out.println("Division: "+divisionText);
			Assert.assertEquals(divisionText, divisionExpectedText);
			

			
		  //logout form the application
	   	   loginPage.clickOnLogoutLink();
		
		
			 
	}




}
