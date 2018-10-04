package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.generics.BasePage;

public class LoginPage extends BasePage
{

//Decleration

 @FindBy(name="username")
 private WebElement unTB;
 
 @FindBy(name="password")
 private WebElement pwdTB;
 
 @FindBy(xpath="//input[@class='btn btn-small']")
 private WebElement loginBTN;
 
 
 //initialization
 
 public LoginPage(WebDriver driver)
 {
	 super(driver);
	 PageFactory.initElements(driver, this);	 
 }
 
 //utilization
 
 
public void enterUserName(String un)
{
	unTB.sendKeys(un);
}

public void enterPassword(String pw)
{
	pwdTB.sendKeys(pw);
}

public void clickOnLoginButton() 
{	
loginBTN.click();	
}
 
 
}
