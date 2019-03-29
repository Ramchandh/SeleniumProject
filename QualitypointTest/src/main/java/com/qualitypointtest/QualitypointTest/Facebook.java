package com.qualitypointtest.QualitypointTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Facebook {

	
	@Test
	public void FB()
	{
		System.setProperty("webdriver.edge.driver", "D:/JAVA Projects/QualitypointTest/driver/MicrosoftWebDriver.exe");
		
		WebDriver driver  = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Email = driver.findElement(By.id("email"));
		
		Email.sendKeys("Sample@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("qwertty");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		
		loginButton.click();
		
		
		
	}
	
}
