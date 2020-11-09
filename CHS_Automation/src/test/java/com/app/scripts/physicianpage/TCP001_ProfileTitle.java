package com.app.scripts.physicianpage;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;




public class TCP001_ProfileTitle   extends DriverTestCase {


@Test
public void profiletitle() throws InterruptedException {

		  
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
dashboardPage.selectPhysician();

//Verify-Profile-Title
String PhysicianTitle= physicianProfilePage.getPhysText();
System.out.println(PhysicianTitle);



}



}
