package com.crm.qa.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.qa.generics.BaseTest;
import com.crm.qa.generics.ExcelData;
import com.crm.qa.pages.CRMPROPage;
import com.crm.qa.pages.LoginPage;

@Listeners(com.crm.qa.generics.ListenersTest.class)
public class InvalidLoginTest extends BaseTest 
{
	
	@Test
	public void TestInvalidLogin() throws Exception
	{
		
	LoginPage lp = new LoginPage(driver);
	
	//verify login page Title
	String lpTitle = ExcelData.getData(path, "LoginPage", 1, 0);	
	lp.verifyTitle(lpTitle);
	
	//enter invalid Username or password
	String un = ExcelData.getData(path, "LoginPage", 1, 1);
	lp.enterUserName(un);
	
	String pw = ExcelData.getData(path, "LoginPage", 1, 2);
	lp.enterPassword(pw);
		
	//click on login Button
	
	lp.clickOnLoginButton();
	
	
	CRMPROPage hp =new CRMPROPage(driver);
	
	
	 //Verify Home Page title
	String CRMPROPageTitle = ExcelData.getData(path, "CRMPROPage", 1	, 0);
	hp.verifyTitle(CRMPROPageTitle);
	
	
	
	
	}

}
