package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import General.BasePage;
import General.KeyFunctions;
import PageElements.HomePageElements;
import Utility.LogClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;

public class HomePage extends BasePage {
	protected Logger log = Logger.getLogger(HomePage.class.getName());// + ":" + nameofCurrMethod);
	public HomePageElements homepage = new HomePageElements();
	protected KeyFunctions keys = new KeyFunctions(driver);

	public Properties obj;
	public FileInputStream objfile;
	public String search_content, product_name;
	WebDriverWait wait;

	public HomePage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), homepage);
	}

	/**
	 * Click in Services Tab
	 */
	public void clickServicesTab() {
		LogClass.info("Click on services_button ");
		keys.waitForElementPresent(homepage.shop_button);
		keys.clickElement(homepage.services_button);
	}

	/**
	 * Click in Shop Tab
	 */
	public void clickShopTab() {
		LogClass.info("Click on shop_button ");
		keys.waitForElementPresent(homepage.shop_button);
		keys.clickElement(homepage.shop_button);
	}

}
