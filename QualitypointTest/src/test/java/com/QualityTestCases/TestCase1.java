package com.QualityTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qualitypointtest.QualitypointTest.BasePage;
import com.qualitypointtest.QualitypointTest.LoginPage;

public class TestCase1 {
	
	
	
	
	@Test
	public void PositiveFlow()
	{
		
		WebDriver driver = BasePage.LaunchBrowser("chrome", "http://qualitypointtech.net/timesheetdemo/index.php?logout=true#logoutstatus");
		
		LoginPage loginPageobject = PageFactory.initElements(driver, LoginPage.class);
		
		loginPageobject.Login("admin", "admmin");
		
		loginPageobject.VerifyTitle();
		
	}
	

}
