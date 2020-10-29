package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC002_VerifyLabelAnd_Breadcrumb extends DriverTestCase {

	
	
	String breadCrumbExpectedText= "Division: Heartland Region: Brave Hearts Facility: Austintown";
	String divionExpectedText= "Heartland";
	String RegionExpectedText= "Brave Hearts";

	@Test
	public void verifyLabelAndBreadcrumbTest() throws InterruptedException {

	
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
		  
		  String breadcrumb= facilityProfilePage.getBreadCrumb();
		  System.out.println("Bread:" + breadcrumb);
		  
		  String breadcrumbInOneLIne= breadcrumb.replaceAll("[\r\n]+", " ");
		  System.out.println("String is: "+ breadcrumbInOneLIne);

		  //verify that bread crumb is showing as expected
		  Assert.assertTrue(breadcrumbInOneLIne.contains(breadCrumbExpectedText), "Breadcrumb should be display as expected");
		
			String divisionText= facilityProfilePage.getDivisionText();
			String RegionText= facilityProfilePage.getRegionText();
			
			//verify that division and region text
			Assert.assertEquals(divisionText, divionExpectedText);
			Assert.assertEquals(RegionText, RegionExpectedText);

			
		  //logout form the application
	   	   loginPage.clickOnLogoutLink();
		
		
			 
	}

}
