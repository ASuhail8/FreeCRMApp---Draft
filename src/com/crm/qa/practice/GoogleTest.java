package com.crm.qa.practice;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GoogleTest 
{

	WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	
	@Test(priority=2,enabled=false)
	public void printTitle()
	{
	String 	expected = "Google";
	String	actual = driver.getTitle();
	Assert.assertEquals(actual, expected);
	
	}
	
	@Test(priority=3,enabled=false)
	public void verifyGoogleImage()
	{
	boolean img = driver.findElement(By.xpath("//*[@id=\"hplogo\"]/div[2]")).isDisplayed();
	Assert.assertEquals(img, true);
	}
	
	@Test(priority=4,enabled=false)
	public void verifyGmailTab()
	{
	boolean gmail=driver.findElement(By.linkText("mail")).isDisplayed();
	Assert.assertTrue(gmail);	
	}
	
	@Test(priority=1,expectedExceptions=NumberFormatException.class)
	public void searchtab()
	{
		//boolean search = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).isEnabled();
		//Assert.assertEquals(search, true);
		//driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Alhamdullilah");
	String x = "100A";
	Integer.parseInt(x);
	
		
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}
	
	
}
