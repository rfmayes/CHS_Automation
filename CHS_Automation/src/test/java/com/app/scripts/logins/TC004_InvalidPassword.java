package com.app.scripts.logins;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC004_InvalidPassword       extends DriverTestCase {


@Test
public void invalidpassword() throws InterruptedException {

		  
//Enter the login credential
String emailAddress = propertyReader.readApplicationFile("loginEmail");
String loginPassword = "fgtre";
loginPage.enterEmailAddress(emailAddress);
loginPage.enterPassword(loginPassword);


//Login-error-message
loginPage.findtheError();
}
}




