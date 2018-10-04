package com.crm.qa.practice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.crm.qa.generics.ExcelUtil;


public class DataProvider
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.in/reg/PartialReg");
	}
	
	
	@org.testng.annotations.DataProvider
	public Iterator<Object[]> getData()
	{		
	ArrayList<Object[]> testData = ExcelUtil.getDataFromExcel();
	return	testData.iterator();
	
	}
	
	
	
	
	@Test(dataProvider="getData")
	public void halfEbayRegistration(String firstName,String lastName,String EmailAddress,String Password)
	{
		
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		
		driver.findElement(By.name("lastname")).clear();		
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(EmailAddress);
		
		driver.findElement(By.name("PASSWORD")).clear();
		driver.findElement(By.name("PASSWORD")).sendKeys(Password);
				
	}	
	
	
	@AfterMethod
	public void PostCondition()
	{			
		driver.quit();
	}
	

}
