package com.app.scripts.allfacility;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC014_Brookside      extends DriverTestCase {
String rthExpectedText="65|26.53%";

@Test
public void anchorage() throws InterruptedException {

		  
//Enter the login credential
String emailAddress = propertyReader.readApplicationFile("loginEmail");
String loginPassword = propertyReader.readApplicationFile("loginPassword");
loginPage.enterEmailAddress(emailAddress);
loginPage.enterPassword(loginPassword);
loginPage.clickOnLoginButton();

//Navigate
String facilityName= "Brookside";
dashboardPage.clickOnfacilityLinkAtDashBoard();
dashboardPage.selectFacilityName(facilityName);

//Verify-RTH
String RTH1= facilityProfilePage.getRTHText();
String RTH2= RTH1.replaceAll("[\r\n]+", " ");
System.out.println(RTH2);
}
}




