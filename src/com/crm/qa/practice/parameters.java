package com.crm.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters 
{

	WebDriver driver;
	
	
	@Test
	@Parameters({"url","emailID","browser"})
	public void yahooLoginTest(String url,String emailID,String browser)
	{
	
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equals("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailID); 
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
		
		driver.close();
		
	}
	
	
	
	
}
