package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC007_VerifyEDslashED   extends DriverTestCase {
String edslashedExpectedText="3|1.22%";

@Test
public void verifyedslashed() throws InterruptedException {

		  
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

//Verify-Count
String EDslashED1= facilityProfilePage.getEDslashEDText();
String EDslashED2= EDslashED1.replaceAll("[\r\n]+", " ");
System.out.println(EDslashED2);
//Assert.assertTrue(EDslashED2.equals(edslashedExpectedText));
	}


}



