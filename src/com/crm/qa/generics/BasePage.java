package com.crm.qa.generics;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import junit.framework.Assert;

public class BasePage 
{

	public static WebDriver driver;
	public BasePage(WebDriver driver)
	{
		
		this.driver = driver;
		
	}
	
	
	//To Verify Title
	
	public static void verifyTitle(String etitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try {
		wait.until(ExpectedConditions.titleIs(etitle));
		Reporter.log("Title is matching : " +etitle,true);
		}
		catch(Exception e)
		{
		Reporter.log("Title is not matching",true);
		Assert.fail();
		}
	}
	
	
	
}
