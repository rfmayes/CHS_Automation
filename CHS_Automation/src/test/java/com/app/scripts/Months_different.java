package com.app.scripts;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class Months_different extends DriverTestCase {



@Test
public void monthsdifferent() throws InterruptedException {
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
String DateNumber= "18";
facilityProfilePage.selectDate(DateNumber);

//Change-Current-Date
String EndDateNumber= "18";
facilityProfilePage.selectendDateAndendMonth(EndDateNumber);

//Submit-Date-Change
facilityProfilePage.clickSubmit();

//Check-Data
String PatientCount= facilityProfilePage.getPatientCountText();
String PatientCount2= PatientCount.replaceAll("[\r\n]+", " ");
System.out.println(PatientCount2);

String DaysofCare= facilityProfilePage.getDaysofCareText();
String DaysofCare2= DaysofCare.replaceAll("[\r\n]+", " ");
System.out.println(DaysofCare2);

String SNFADM= facilityProfilePage.getSNFADMText();
String SNFADM2= SNFADM.replaceAll("[\r\n]+", " ");
System.out.println(SNFADM2);

String RTH1= facilityProfilePage.getRTHText();
String RTH2= RTH1.replaceAll("[\r\n]+", " ");
System.out.println(RTH2);

String EDslashED1= facilityProfilePage.getEDslashEDText();
String EDslashED2= EDslashED1.replaceAll("[\r\n]+", " ");
System.out.println(EDslashED2);

String ACHslashADM1= facilityProfilePage.getACHslashADM();
String ACHslashADM2= ACHslashADM1.replaceAll("[\r\n]+", " ");
System.out.println(ACHslashADM2);

String Hslash10001= facilityProfilePage.getHslash1000();
String Hslash10002= Hslash10001.replaceAll("[\r\n]+", " ");
System.out.println(Hslash10002);

String edslash10001= facilityProfilePage.getEDslash1000();
String edslash10002= edslash10001.replaceAll("[\r\n]+", " ");
System.out.println(edslash10002);

String ADMslash10001= facilityProfilePage.getADMslash1000();
String ADMslash10002= ADMslash10001.replaceAll("[\r\n]+", " ");
System.out.println(ADMslash10002);

String PDLTDOC1= facilityProfilePage.getPDLTDOC();
String PDLTDOC2= PDLTDOC1.replaceAll("[\r\n]+", " ");
System.out.println(PDLTDOC2);
}



}

