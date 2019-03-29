package com.qualitypointtest.QualitypointTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

	
	
	public LoginPage(WebDriver driver) {
			
		this.driver = driver;
	}
	
	
	@FindBy(id = "username")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(className = "butclas")
	public WebElement loginButton;

	public void Login(String loginID, String pwd) {

		username.sendKeys(loginID);

		password.sendKeys(pwd);
	
		loginButton.click();
	}
	
	public void VerifyTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Online Timesheet • Qualitypointtech.com");
		
		System.out.println(this.getClass().getSimpleName() +"Verified the title of the page");
	}
	

}
