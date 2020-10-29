package com.app.scripts;
import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC00_VerifyTableData extends DriverTestCase {



@Test
public void verifytabledata() throws InterruptedException {

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

//Number-of-rows
facilityProfilePage.getNumberofRows();

//Row-Text
facilityProfilePage.getRowInfo();

//Verify-Table-Data



	}

}

