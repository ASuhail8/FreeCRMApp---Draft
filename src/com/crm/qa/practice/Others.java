package com.crm.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.qa.generics.BaseTest;

public class Others extends BaseTest {
	
	@Test
	public void Demo1()
	{
		String aTitle = driver.getTitle();
		System.out.println(aTitle);
		
		
	}

}
