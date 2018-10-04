package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.generics.BasePage;

public class CRMPROPage extends BasePage
{

	//Decleration
	
	@FindBy(xpath="//a[contains(.,'Logout')]")
	private WebElement logoutBTN;
	
	
	//initialization
	
	public CRMPROPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void clickOnLogout()
	{
		logoutBTN.click();
	}
	
	
}
