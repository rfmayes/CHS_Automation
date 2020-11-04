package com.app.scripts.logins;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.utils.DriverTestCase;

public class TC003_InvalidEmail      extends DriverTestCase {


@Test
public void invalidemail() throws InterruptedException {

		  
	//Enter the login credential
	String emailAddress = "blevy@datalign.com";
	String loginPassword = propertyReader.readApplicationFile("loginPassword");
	loginPage.enterEmailAddress(emailAddress);
	loginPage.enterPassword(loginPassword);
	


	//Login-error-message
	loginPage.findtheError();
	
}
}



