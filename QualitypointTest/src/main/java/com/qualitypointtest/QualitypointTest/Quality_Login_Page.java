package com.qualitypointtest.QualitypointTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Quality_Login_Page {
	
	WebDriver driver = null;
	
	
	
	
	
	@Test(priority=2)
	public void Login()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:/JAVA Projects/QualitypointTest/driver/chromedriver.exe");		
		driver = new ChromeDriver();
		
		driver.get("http://qualitypointtech.net/timesheetdemo/index.php");
		
		driver.manage().window().maximize();
		
		WebElement loginUsername = driver.findElement(By.id("username"));
		
		loginUsername.sendKeys("admin");
		
		WebElement loginPassword = driver.findElement(By.name("password"));
		
		loginPassword.sendKeys("admin");
		
		WebElement clickLogin = driver.findElement(By.className("butclas"));
		
		clickLogin.click();
		
		System.out.println(driver.getTitle());
	}
	

	

}
