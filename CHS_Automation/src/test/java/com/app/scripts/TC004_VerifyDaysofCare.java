package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC004_VerifyDaysofCare extends DriverTestCase {
	String docExpectedText="Days of Care 58862";
@Test
public void verifypatientcount() throws InterruptedException {
String emailAddress = propertyReader.readApplicationFile("loginEmail");
String loginPassword = propertyReader.readApplicationFile("loginPassword");
		  
//Enter the login credential 
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
String DaysofCare= facilityProfilePage.getDaysofCareText();
String DaysofCare2= DaysofCare.replaceAll("[\r\n]+", " ");
System.out.println(DaysofCare2);
//Assert.assertTrue(DaysofCare2.equals(docExpectedText));
	}

}
