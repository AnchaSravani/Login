package Pages;

import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Util.LoadPropertiesFile.objectrepo;
import static Util.LoadPropertiesFile.Datarepo;


import BaseTest.WebBase;
import Util.CommonFunctions;
import junit.framework.Assert;

public class LoginPage extends WebBase {
	
	
	
	By FirstName = By.xpath(objectrepo.getProperty("FirstName"));
	By LastName = By.xpath(objectrepo.getProperty("LastName"));
	By FirstNameError = By.xpath(objectrepo.getProperty("FirstNameError"));
	By LastNameRrror = By.xpath(objectrepo.getProperty("LastNameRrror"));
	By Email = By.xpath(objectrepo.getProperty("Email"));
	By EmailMandatoryError = By.xpath(objectrepo.getProperty("EmailMandatoryError"));
	By Password = By.xpath(objectrepo.getProperty("Password"));
	By PsswordError = By.xpath(objectrepo.getProperty("PsswordError"));
	By ConfirmPassword = By.xpath(objectrepo.getProperty("ConfirmPassword"));
	By PasswordMissMatch = By.xpath(objectrepo.getProperty("PasswordMissMatch"));
	By TermsAndConditions = By.xpath(objectrepo.getProperty("TermsAndConditions"));
	By CreateAccount = By.xpath(objectrepo.getProperty("CreateAccount"));
	
public void NavigateToURL() 
{
	
	try {
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Ancha 2//workspace//Login//Resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.get(Datarepo.getProperty("Url"));
		System.out.println(driver.getTitle());
       
	}
	catch(Exception e)
	{
		System.out.println(e);
	
	}

}
	public void VerifyElementsInPage()
	{
		try{
			System.out.println("kjdfgkdfg");
		driver.findElement(FirstName).isDisplayed();
		driver.findElement(LastName).isDisplayed();
		driver.findElement(Email).isDisplayed();
		driver.findElement(Password).isDisplayed();
		driver.findElement(ConfirmPassword).isDisplayed();
		driver.findElement(TermsAndConditions).isDisplayed();
		driver.findElement(CreateAccount).isDisplayed();
	
		
		
	}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
}

	public void FillTheDetials()
	{
		try{
			CommonFunctions Funtion = new CommonFunctions();
			Funtion.enterText(driver, FirstName, Datarepo.getProperty("FirstName"));
			Funtion.enterText(driver, LastName, Datarepo.getProperty("LastName"));
			Random randomGenerator = new Random();  
			int randomInt = randomGenerator.nextInt(1000);  
			
			Funtion.enterText(driver, Email, "username"+ randomInt +"@gmail.com");
			Funtion.enterText(driver, Password, Datarepo.getProperty("password"));
			Funtion.enterText(driver, ConfirmPassword, Datarepo.getProperty("password"));
		
		driver.findElement(TermsAndConditions).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		Funtion.clickonElement(driver, CreateAccount);
		
		
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		
		}
		
}
	
	public void VerifyErrorMessages() throws Exception
	{
		try{
			CommonFunctions Funtion = new CommonFunctions();

			Funtion.enterText(driver, FirstName, Datarepo.getProperty("FirstName"));
			driver.findElement(FirstName).clear();
			
			Funtion.enterText(driver, LastName, Datarepo.getProperty("LastName"));
			driver.findElement(LastName).clear();
			
			Funtion.enterText(driver, Email, Datarepo.getProperty("LastName"));
			driver.findElement(Email).clear();
			driver.findElement(EmailMandatoryError).isDisplayed();
			Funtion.enterText(driver, Password, Datarepo.getProperty("password"));
			Funtion.enterText(driver, ConfirmPassword, "password");
			driver.findElement(PasswordMissMatch).isDisplayed();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}

	
	
}
}
