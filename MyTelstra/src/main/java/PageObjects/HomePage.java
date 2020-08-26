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
import General.KeywordFunctions;
import PageElements.HomePageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;

public class HomePage extends BasePage{
	protected Logger log = Logger.getLogger(HomePage.class.getName());// + ":" + nameofCurrMethod);
	public HomePageElements homepage = new HomePageElements();
	protected KeywordFunctions keys = new KeywordFunctions(driver);

	public Properties obj;
	public FileInputStream objfile;
	public String search_content, product_name;
	WebDriverWait wait;

	public HomePage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), homepage);
	}

	public void clickServicesTab() {	
		System.out.println("Click on services_button ");
		System.out.println();
		keys.clickElement(homepage.services_button);
	}
	
	public void scrolltoInternetofThings()
	{
		System.out.println("Scroll to Internet of Things ");
		keys.scrollToText("Internet of Things");
	}
	
	public void validateInternetofThingsAsLastCard()
	{
		String lastCardName = keys.getElementText(homepage.lastCardNameInServices, "text");
		System.out.println("Name dispayed in lasd card="+lastCardName);
		System.out.println("Validating the last card name");
		Boolean isNameDisplayed = lastCardName.equalsIgnoreCase("Internet of Things");
		Assert.assertTrue(isNameDisplayed, "Validating the last card as Internet of Things");
	}

}
