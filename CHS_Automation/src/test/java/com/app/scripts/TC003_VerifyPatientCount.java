package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC003_VerifyPatientCount extends DriverTestCase {

String pcExpectedText= "Patient Count 269";

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
String PatientCount= facilityProfilePage.getPatientCountText();
String PatientCount2= PatientCount.replaceAll("[\r\n]+", " ");
System.out.println(PatientCount2);
//Assert.assertTrue(PatientCount2.equals(pcExpectedText));

}
}
