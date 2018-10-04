package com.crm.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.generics.BaseTest;
import com.crm.qa.util.Xls_Reader;

public class ExcelDataTest extends BaseTest 
{
	
	
	public static void main(String[] args) throws Exception 
	{
	
	
		Xls_Reader reader = new Xls_Reader(path);
	
		int rowCount=reader.getRowCount("EbayReg");
		//System.out.println(rowCount);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.in/reg/PartialReg");
		
		
		reader.addColumn("EbayReg", "status");
		
		for(int rowNum=2;rowNum<=rowCount;rowNum++)
		{
			
			System.out.println("****");
		String firstName=reader.getCellData("EbayReg", "firstName", rowNum);
			System.out.println(firstName);
			
			String lastName=reader.getCellData("EbayReg", "LastName", rowNum);
			System.out.println(lastName);
			
			String emailAddress=reader.getCellData("EbayReg","EmailAddress", rowNum);
			System.out.println(emailAddress);
			
			String password =reader.getCellData("EbayReg", "Password", rowNum);
			System.out.println(password);
			
			driver.findElement(By.name("firstname")).clear();
			driver.findElement(By.name("firstname")).sendKeys(firstName);
			
			driver.findElement(By.name("lastname")).clear();		
			driver.findElement(By.name("lastname")).sendKeys(lastName);
			
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(emailAddress);
			
			driver.findElement(By.name("PASSWORD")).clear();
			driver.findElement(By.name("PASSWORD")).sendKeys(password);
			
			
			reader.setCellData("EbayReg", "status", rowNum, "pass");
			
			//Thread.sleep(1000);
			
			//driver.findElement(By.id("ppaFormSbtBtn")).click();
			//Thread.sleep(2000);
			
			
			
		}
		driver.close();
			
	}
	
}
