package com.qualitypointtest.QualitypointTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Twitter {
	
	WebDriver driver = null;
	

	@Test(priority=1)
	public void TwitterLoginPage()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:/JAVA Projects/QualitypointTest/driver/geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("sample@gmail.com");
		
		WebElement passwd = driver.findElement(By.id("passwd"));
		
		passwd.sendKeys("admin");
		
		WebElement clickButton = driver.findElement(By.id("SubmitLogin"));

		clickButton.click();
	}
	
	

}
