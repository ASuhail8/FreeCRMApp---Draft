package com.crm.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.qa.generics.BaseTest;
import com.crm.qa.generics.ListenersTest;

@Listeners(com.crm.qa.generics.ListenersTest.class)
public class screenshotEx extends BaseTest
{
	
	@Test()
	public void Demo()
	{

		Assert.fail();	
		
	}

}
