package com.crm.qa.practice;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGConcept 
{

	WebDriver driver;
	
	
	@BeforeSuite
	public void BeforeSuite()
	{
		
	System.out.println("Before Suite");
						
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test(groups="test1",invocationCount=10)
	public void testMethod1()
	{
		
		System.out.println("Test Method 1");
		

	}
	
	@Test(groups="test2")
	public void testMethod2()
	{
		System.out.println("Test Method 2");
		
	}
	
	
	@Test(groups="test3")
	public void testMethod3()
	{
		System.out.println("Test method 3");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method ");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
		
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	
	
	
}
