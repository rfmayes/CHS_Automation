package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC009_VerifyHslash1000   extends DriverTestCase {
String hslash1000ExpectedText="27|1.6"; 
		
@Test
public void verifyhslash1000() throws InterruptedException {

		  
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
String Hslash10001= facilityProfilePage.getHslash1000();
String Hslash10002= Hslash10001.replaceAll("[\r\n]+", " ");
System.out.println(Hslash10002);
//Assert.assertTrue(Hslash10002.equals(hslash1000ExpectedText));
	}



}
