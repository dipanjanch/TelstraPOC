package General;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Utility.LogClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class KeyFunctions extends BasePage{
	public KeyFunctions(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver = BasePage.driver;
	}
	
	/**
	 * This method gets the current time
	 * 
	 * @return String containing the current time
	 */
	public static String getCurrentDateAndTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}
	
	/**
	 * This method is used to get a base64 screenshot and attach it to the extent
	 * report
	 * 
	 * @throws IOException
	 */
	public static void attachScreenshotToReport() throws IOException {
		String path = System.getProperty("user.dir") + "/Screenshots/" + getCurrentDateAndTime() + ".png";
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File(path));
		screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		reporter.log(Status.INFO, "Snapshot below: ",
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());

	}
	
	//clicking element
	public void clickElement(WebElement element) {

		element.click();

	}
	
	//setting value to element
	public void sendSetText(WebElement element, String str) {
		((MobileElement) element).setValue(str);
		driver.hideKeyboard();


	}
	
	//scrolling to element text
	public void scrollToText(String text) {

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
				+ ".scrollIntoView(new UiSelector().textContains(\"" + text + "\").instance(0))"));

	}
	
	//getting text property of element
	public  String getElementText(WebElement ele, String param) {
		String eletext = ele.getAttribute(param);

		return eletext;
	}
	
	
	
	public void tryVscrolltoElement(String xpath, double startwidthx, double startheighty, double endheighty) {
		TouchAction actions;
		Dimension dimensions = driver.manage().window().getSize();
		LogClass.info("s=" + dimensions);
		Double screenWidthStart = dimensions.getWidth() * startwidthx;
		int scrollStartx = screenWidthStart.intValue();
		LogClass.info("startx=" + scrollStartx);
		Double screenHeightStart = dimensions.getHeight() * startheighty;
		int scrollStarty = screenHeightStart.intValue();
		LogClass.info("starty=" + scrollStarty);
		Double screenHeightEnd = dimensions.getHeight() * endheighty;
		int scrollEndy = screenHeightEnd.intValue();
		LogClass.info("endy=" + scrollEndy);
		actions = new TouchAction(driver);
		boolean display;
		By element=By.xpath(xpath);
		display = driver.findElements(element).size()>0;
		do{
		actions.press(PointOption.point(scrollStartx, scrollStarty))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(scrollStartx, scrollEndy)).release().perform();
		display = driver.findElements(element).size()>0;
		}while(display == false); 

	}	
	
	public Point getCoordinates(WebElement element) {
		Point location = element.getLocation();
		return location;
	}
	
	
	//perform enter key operation
	public void enter_key() {

		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

	}
	
	/**
	 * Method to check element displayed
	 * 
	 * @param element : WebElement element to pass the locator
	 */
	public boolean isElementDisplayed(WebElement element) {
		waitForElementPresent(element);
		return element.isDisplayed();
	}
	/**
	 * Method to check element presence using explicit wait condition
	 * 
	 * @param element - WebElement element to pass the locator
	 */
	public void waitForElementPresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
