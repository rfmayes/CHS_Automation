package com.app.scripts.logins;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC002_InvalidLogin      extends DriverTestCase {


@Test
public void invalidlogin() throws InterruptedException {

		  
//Enter the login credential
String emailAddress = "blevy@datalign.com";
String loginPassword = "fgtre";
loginPage.enterEmailAddress(emailAddress);
loginPage.enterPassword(loginPassword);


//Login-error-message
loginPage.findtheError();
}
}




