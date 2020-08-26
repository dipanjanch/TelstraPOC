package General;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import Utility.LogClass;

public class BasePage {
	protected Logger log = Logger.getLogger(General.BasePage.class.getName());
	DesiredCapabilities cap;
	public static AndroidDriver driver;
	AppiumDriverLocalService appiumService;
	public static ExtentReports report;
	public static ExtentTest reporter;
	public static Properties property;
	public static String screenshot;

	/**
	 * This method launches the server and initializes the driver.
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@BeforeSuite
	public void initialization() throws IOException, InterruptedException {
		initializeReporter();
		LogClass.info("Starting server");
		LogClass.startTestCase(this.getClass().getSimpleName());
	}

	@BeforeMethod
	@Parameters({ "deviceName_", "UDID", "platformName_", "appPackage_", "appActivity_" })
	public void driversetUp(String deviceName_, String udid, String platformName_, String appPackage_,
			String appActivity_) throws MalformedURLException {
		System.out.println("Loading configuration of Android driver and Desired capabilities...!");
		cap = new DesiredCapabilities();
		cap.setCapability("deviceName", deviceName_);
		cap.setCapability("udid", udid);
		cap.setCapability("platformName", platformName_);
		cap.setCapability("appPackage", appPackage_);
		cap.setCapability("appActivity", appActivity_);
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void driverTearDown() {
		driver.quit();
		log.info("Quitting the driver");
		
	}

	/**
	 * This method sets ups the logger and the extent reporter
	 * 
	 * @throws IOException
	 */
	public void initializeReporter() throws IOException {
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")
				+ "/Reports/ExtentReport" + KeyFunctions.getCurrentDateAndTime() + ".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		LogClass.info("Extent Report initialized");
	}

	/**
	 * This method is used to start reporting in the extent report
	 * 
	 * @param testName : The name of the test method
	 */
	public void startReporting(String testName) {
		reporter = report.createTest(testName);
		reporter.info("Strat Testcase " + testName);
	}

	/**
	 * 
	 */
	public void stopReporting() {
		report.flush();
	}

}
