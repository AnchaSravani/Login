package BaseTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.LoginPage;
import Util.LoadPropertiesFile;



public class WebBase   {
	public static WebDriver driver;
	public static LoginPage login;
	
	@BeforeSuite
	public void initalise()
	{
		System.out.println("Loading property file");
		LoadPropertiesFile.loadProperties();
		System.out.println("Sucessfully Loaded the properties file");
		
	}
	




}
