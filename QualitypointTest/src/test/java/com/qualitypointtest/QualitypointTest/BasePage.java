package com.qualitypointtest.QualitypointTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {

	static	WebDriver driver ;
	
	public static WebDriver LaunchBrowser(String browsername, String url)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:/JAVA Projects/QualitypointTest/driver/chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:/JAVA Projects/QualitypointTest/driver/geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:/JAVA Projects/QualitypointTest/driver/IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		return driver;
		
	}
	
}
