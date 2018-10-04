package com.crm.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.generics.ExcelData;

public class DataProviderExample extends ExcelData
{
	
	@DataProvider
	public Object[] getData() 
	{
	
		Object[][] data = new Object[4][4];
		data[0][0] = "Abdulla";
		data[0][1] = "test123";
		data[1][0] = "ZOya";
		data[1][1] = "test123";
		
		return data;
	
	}
	
	@Test(dataProvider ="getData")
	public void printData(String firstName,String password)
	{
		System.out.println("Name :"+firstName+ " Password :" +password);
		
		/*
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.in/reg/PartialReg");
		
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		
		driver.findElement(By.name("lastname")).clear();		
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(EmailAddress);
		
		driver.findElement(By.name("PASSWORD")).clear();
		driver.findElement(By.name("PASSWORD")).sendKeys(Password);
		
		*/
	}
	
	
	
	
	
}
