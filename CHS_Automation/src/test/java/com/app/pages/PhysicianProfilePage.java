package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.utils.DriverHelper;

public class PhysicianProfilePage  extends DriverHelper {

	

	@FindBy(xpath = "//h4[contains(text(),'Buccino')]")
	private WebElement phys;
	
	
	

	public PhysicianProfilePage(WebDriver webdriver) {
		super(webdriver);
		
	}
	

	public String  getPhysText() {
		String result= phys.getText();
		return result;
	}
		
		
}
	
