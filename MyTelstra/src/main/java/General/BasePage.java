package General;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BasePage {
	protected Logger log = Logger.getLogger(General.BasePage.class.getName());
	DesiredCapabilities cap;
	public static AndroidDriver driver;
	AppiumDriverLocalService appiumService;

	@BeforeMethod
	@Parameters({ "deviceName_", "UDID", "platformName_", "appPackage_", "appActivity_" })
	public void driversetUp(String deviceName_, String udid, String platformName_, String appPackage_,
			String appActivity_) throws MalformedURLException {
		System.out.println("Loading configuration of Android driver and Desired capabilities...!");
		cap = new DesiredCapabilities();
		// Dom configuration for Log messages
		DOMConfigurator.configure("util/log4j.xml");
		log.info(getClass());
		cap.setCapability("deviceName", deviceName_);
		// cap.setCapability("platformVersion", platformVersion_);
		cap.setCapability("udid", udid);
		cap.setCapability("platformName", platformName_);
		cap.setCapability("appPackage", appPackage_);
		cap.setCapability("appActivity", appActivity_);
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Androiddriver created successfully");
		log.info("Application launched successfully");

	}
	
	@AfterMethod
	public void driverTearDown()
	{
		driver.quit();
		log.info("Quitting the driver");
	}

}
