package Scenarios;

import org.testng.annotations.Test;


import BaseTest.WebBase;
import Pages.LoginPage;


public class CreateAnAccount extends WebBase{
	
	@Test(priority=1, description="Create an account")
	public void CreateAnAccount() throws InterruptedException
	{
		
		LoginPage login = new LoginPage();
		login.NavigateToURL();
	    login.VerifyElementsInPage();
		login.FillTheDetials();
	}
}
