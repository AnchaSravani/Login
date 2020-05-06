package Scenarios;

import org.testng.annotations.Test;

import BaseTest.WebBase;
import Pages.LoginPage;

public class VerifyErrorMessages extends WebBase {
	@Test(priority=1, description="Verify Error Messages for Mandatory Fields")
	public void VerifyErrorMessagesForMandatoryFields() throws Exception
	{
		
		LoginPage login = new LoginPage();
		login.NavigateToURL();
	    login.VerifyElementsInPage();
		login.VerifyErrorMessages();
	}

}
