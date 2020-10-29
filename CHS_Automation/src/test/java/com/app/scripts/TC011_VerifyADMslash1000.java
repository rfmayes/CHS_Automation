package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC011_VerifyADMslash1000    extends DriverTestCase {
String admslash1000ExpectedText="27|583.48"; 
		
@Test
public void verifyadmslash1000() throws InterruptedException {

		  
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
String ADMslash10001= facilityProfilePage.getADMslash1000();
String ADMslash10002= ADMslash10001.replaceAll("[\r\n]+", " ");
System.out.println(ADMslash10002);
//Assert.assertTrue(ADMslash10002.equals(admslash1000ExpectedText));
	}



}



