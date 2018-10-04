package com.crm.qa.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadPropertiesFile 
{
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		
	//Read the property file
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\ProjectAutomationWorkSpace\\FreeCRM\\src\\com\\crm\\qa\\practice\\config.properties");
	prop.load(fis);
		
	//System.out.println(prop.getProperty("loginBTN_xpath"));
	
	
	//System.out.println(prop.getProperty("browser"));
	
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
	driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
	Thread.sleep(1000);
	driver.findElement(By.xpath(prop.getProperty("loginBTN_xpath"))).click();
	
	
	
	//driver.close();
	
	}	
		
	}
		
	}
	
	
	
	
