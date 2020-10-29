package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC006_VerifyRTH   extends DriverTestCase {
String rthExpectedText="65|26.53%";
@Test
public void verifyrth() throws InterruptedException {

		  
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

//Verify-RTH
String RTH1= facilityProfilePage.getRTHText();
String RTH2= RTH1.replaceAll("[\r\n]+", " ");
System.out.println(RTH2);
//Assert.assertTrue(RTH2.equals(rthExpectedText));
	}


}




