package com.crm.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.generics.BaseTest;
import com.crm.qa.generics.ExcelData;
import com.crm.qa.util.Xls_Reader;
public class DemoExcel extends BaseTest {

	public static void main(String[] args) throws Exception 
	
	{
		
		
		int rowCount = ExcelData.getRowCount(path, "EbayReg");
//    System.out.println(rowCount);
//
		int cellCount=ExcelData.getCellCount(path, "EbayReg", rowCount);
//	System.out.println(cellCount);
//	
//	
	
	for(int rowNum=1;rowNum<=rowCount;rowNum++)
	{
		
			/*
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.in/reg/PartialReg");
		*/
		System.out.println("*******");
		
	String firstName = ExcelData.getData(path, "EbayReg", rowNum, 0);
	System.out.println(firstName);
	
	String lastName = ExcelData.getData(path, "EbayReg", rowNum, 1);
	System.out.println(lastName);
	
	String EmailAddress = ExcelData.getData(path, "EbayReg", rowNum, 2);
	System.out.println(EmailAddress);
	
	String Password = ExcelData.getData(path, "EbayReg", rowNum, 3);
	System.out.println(Password);
	
/*
	driver.findElement(By.name("firstname")).clear();
	driver.findElement(By.name("firstname")).sendKeys(firstName);
	
	driver.findElement(By.name("lastname")).clear();		
	driver.findElement(By.name("lastname")).sendKeys(lastName);
	
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys(EmailAddress);
	
	driver.findElement(By.name("PASSWORD")).clear();
	driver.findElement(By.name("PASSWORD")).sendKeys(Password);
	driver.close();
*/	
	}
	
	}
	
	}
	
