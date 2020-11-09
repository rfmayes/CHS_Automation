package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.utils.DriverHelper;

public class LoginPage extends DriverHelper {

	@FindBy(id = "username")
	private WebElement loginEmailAddress;

	@FindBy(id = "password")
	private WebElement loginPassword;
	
	@FindBy(xpath= "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath= "//p[contains(text(),'Log Out')]")
	private WebElement loginOutLink;
	
	
	public LoginPage(WebDriver webdriver) {
		super(webdriver);

	}
	
	
	public LoginPage enterEmailAddress(String emailAddress) {
		loginEmailAddress.clear();
		loginEmailAddress.sendKeys(emailAddress);
		return PageFactory.initElements(getWebDriver(), LoginPage.class);
	}

	
	public LoginPage enterPassword(String password) {
		loginPassword.clear();
		loginPassword.sendKeys(password);
		return PageFactory.initElements(getWebDriver(), LoginPage.class);
	}
	
	public LoginPage clickOnLoginButton() {
		loginButton.click();
		WaitUntilWebElementIsVisible(loginOutLink);
		return PageFactory.initElements(getWebDriver(), LoginPage.class);
	}

	public LoginPage clickOnLogoutLink() {
		loginOutLink.click();
		WaitUntilWebElementIsVisible(loginButton);
		return PageFactory.initElements(getWebDriver(), LoginPage.class);
	}
		
public LoginPage findtheError() throws InterruptedException {
	loginButton.click();
	driver.findElement(By.xpath("//div[contains(@class,\"MuiCollapse-container jss\")][1]"));
	return PageFactory.initElements(getWebDriver(), LoginPage.class);
	}
	
	
	
}
