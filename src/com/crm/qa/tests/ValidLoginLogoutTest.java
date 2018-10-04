package com.crm.qa.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.qa.generics.BasePage;
import com.crm.qa.generics.BaseTest;
import com.crm.qa.generics.ExcelData;
import com.crm.qa.pages.CRMPROPage;
import com.crm.qa.pages.LoginPage;

@Listeners(com.crm.qa.generics.ListenersTest.class)
public class ValidLoginLogoutTest extends BaseTest
{
	
	@Test()
	public void TestValidLoginLogout() throws Exception
	{
		
	LoginPage lp = new LoginPage(driver);
	String lpTitle = ExcelData.getData(path, "LoginPage", 1, 0);	
	
	//verify Title
	lp.verifyTitle(lpTitle);
	
	//Enter User Name
	
	String un = ExcelData.getData(path, "LoginPage", 1, 1);
	lp.enterUserName(un);
		
	// Enter Password 
	
	String pw = ExcelData.getData(path, "LoginPage", 1, 2);
	lp.enterPassword(pw);
	
	//Click on login Button
	
	lp.clickOnLoginButton();
	
	CRMPROPage hp = new CRMPROPage(driver);
	
	
	//Verify Home Page title
	String CRMPROPageTitle = ExcelData.getData(path, "CRMPROPage", 1, 0);
	hp.verifyTitle(CRMPROPageTitle);
	
	
	//click on Logout
	hp.clickOnLogout();
	
	//verify login Page Title
	lp.verifyTitle(lpTitle);
	
	}
	
	

}
