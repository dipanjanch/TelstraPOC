package PageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import General.BasePage;
import General.KeyFunctions;
import PageElements.ServicesPageElements;
import Utility.LogClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ServicesPage extends BasePage{
	protected KeyFunctions keys = new KeyFunctions(driver);
	ServicesPageElements servicepage = new ServicesPageElements();
	
	public ServicesPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), servicepage);
	}
	
	/**
	 * Scroll to Internet of things
	 */
	public void scrolltoInternetofThings()
	{
		LogClass.info("Scroll to Internet of Things ");
		keys.scrollToText("Internet of Things");
	}
	
	/**
	 * Validate Internet of things as last card
	 */
	public void validateInternetofThingsAsLastCard()
	{
		String lastCardName = keys.getElementText(servicepage.lastCardNameInServices, "text");
		LogClass.info("Name dispayed in lasd card="+lastCardName);
		LogClass.info("Validating the last card name");
		Boolean isNameDisplayed = lastCardName.equalsIgnoreCase("Internet of Things");
		Assert.assertTrue(isNameDisplayed, "Validating the last card as Internet of Things");
	}

}
