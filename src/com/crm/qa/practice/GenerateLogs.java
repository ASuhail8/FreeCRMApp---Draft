package com.crm.qa.practice;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs 
{

	
	public static void main(String[] args)
	{
		
	Logger log=Logger.getLogger(GenerateLogs.class);
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	log.info("Browser Launched");
	
	driver.get("https://www.google.com");

	log.info("Google URL Entered");
	
	String title = driver.getTitle();
	System.out.println(title);
	log.info("Google title is "+title);
	
	if(title.equals("Google"))
	{
		System.out.println("Title Matching");
		log.info("Title matching and test case is passed");
	}
	
	else
	{
		System.out.println("Title not Matching");
		log.info("Title matching and test case is failed");
	}
	
	driver.close();
	
	log.info("Browser closed");
		
		
	}
}
