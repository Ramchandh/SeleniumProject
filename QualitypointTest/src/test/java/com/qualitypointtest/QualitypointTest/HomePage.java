package com.qualitypointtest.QualitypointTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
	
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[contains(text(),'Employee Details')]")
	public WebElement empDetails;
	
	@FindBy(xpath="//*[contains(text(),'Project Details')]")
	public WebElement prjktDetails;
	
	@FindBy(xpath="//*[contains(text(),'Weekly Status')]")
	public WebElement wklyStatus;
	
	
	public void VerifyPageTitle()
	{
		
		Assert.assertEquals(driver.getTitle(), "Report - Online Timesheet • Qualitypointtech.com");

		System.out.println("Assertion successful");
	}
	
	
	

}
