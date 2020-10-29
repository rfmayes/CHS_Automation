package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC012_VerifyPDLTDOC   extends DriverTestCase {
String pdltdocExpectedText="16890";
@Test
public void verifsnfadm() throws InterruptedException {

		  
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
System.out.println(DateNumber);


//Change-Current-Date
String EndDateNumber= "19";
facilityProfilePage.selectendDate(EndDateNumber);

//Submit-Date-Change
facilityProfilePage.clickSubmit();

//Verify-Count
String PDLTDOC1= facilityProfilePage.getPDLTDOC();
String PDLTDOC2= PDLTDOC1.replaceAll("[\r\n]+", " ");
System.out.println(PDLTDOC2);
//Assert.assertTrue(PDLTDOC2.equals(pdltdocExpectedText));
	}



}



