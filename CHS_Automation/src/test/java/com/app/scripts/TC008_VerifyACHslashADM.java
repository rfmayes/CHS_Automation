package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC008_VerifyACHslashADM   extends DriverTestCase {
String achslashadmExpectedText="245"; 
		
@Test
public void verifyachslashadm() throws InterruptedException {

		  
//Enter the login credential
String emailAddress = propertyReader.readApplicationFile("loginEmail");
String loginPassword = propertyReader.readApplicationFile("loginPassword");
loginPage.enterEmailAddress(emailAddress);
loginPage.enterPassword(loginPassword);
loginPage.clickOnLoginButton();

//Navigate-Austintown
String facilityName= "Austintown";
dashboardPage.clickOnfacilityLinkAtDashBoard();
dashboardPage.selectFacilityName(facilityName);

//Change-Start-Date
String DateNumber= "19";
facilityProfilePage.selectDate(DateNumber);

//Change-Current-Date
String EndDateNumber= "19";
facilityProfilePage.selectendDate(EndDateNumber);

//Submit-Date-Change
facilityProfilePage.clickSubmit();

//Verify-Count
String ACHslashADM1= facilityProfilePage.getACHslashADM();
String ACHslashADM2= ACHslashADM1.replaceAll("[\r\n]+", " ");
System.out.println(ACHslashADM2);
//Assert.assertTrue(ACHslashADM2.equals(achslashadmExpectedText));
	}



}



