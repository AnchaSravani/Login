package Util;

import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class CommonFunctions {
	public static String getRootDir() {
		File path = new File("");
		String absPath = path.getAbsolutePath();
		File dir = new File(absPath);
		String rootDir = dir.getParent();
		System.out.println("Project Location is(CustomFunction)-rootDir = " + rootDir);
		System.out.println("Project Location is(CustomFunction)-absPath = " + absPath);
		return rootDir;

	}

	/*
	 * This methods is for Explicit Wait
	 */

	public void ExplictWait(WebDriver driver, By ele) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	}

	/*
	 * This method helps to click on element
	 */
	public void clickonElement(WebDriver driver, By ele) {
		CommonFunctions Funtion = new CommonFunctions();
		Funtion.ExplictWait(driver, ele);
		driver.findElement(ele).click();

	}

	/*
	 * This method helps to find the element is disabled or not
	 */
	public void VerifyElementIsDisabled(WebDriver driver, By ele) {
		CommonFunctions Funtion = new CommonFunctions();
		Funtion.ExplictWait(driver, ele);
		driver.findElement(ele).isDisplayed();

	}

	/*
	 * This method helps to compared the expected and actual text values
	 */
	public void VerifyAssertion(WebDriver driver, String Actual, String Expected) {
		CommonFunctions Funtion = new CommonFunctions();
		Assert.assertEquals(Actual, Expected);
		System.out.println("Found " + Actual + "and it is matching with Expected Value that is " + Expected);

	}

	/*
	 * This method helps to enter the text in any field
	 */
	public void enterText(WebDriver driver, By ele, String txt) {
		CommonFunctions Funtion = new CommonFunctions();
		Funtion.ExplictWait(driver, ele);
		driver.findElement(ele).isDisplayed();
		driver.findElement(ele).clear();
		driver.findElement(ele).sendKeys(txt);

	}

	/*
	 * This method helps to get the text in any field
	 */
	public String getText(WebDriver driver, By ele) {
		CommonFunctions Funtion = new CommonFunctions();
		Funtion.ExplictWait(driver, ele);
		String Value = driver.findElement(ele).getText();
		return Value;

	}

	/*
	 * This method helps to navigate Back
	 */
	public void NavigateBack(WebDriver driver) {
		driver.navigate().back();
	}

	/*
	 * This method helps to Navigate Farword
	 */
	public void NavigateFarword(WebDriver driver) {
		driver.navigate().forward();
	}



}
