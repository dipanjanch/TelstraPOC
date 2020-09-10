package PageObjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import General.BasePage;
import General.KeyFunctions;
import PageElements.ProfilePageElements;
import Utility.LogClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePage extends BasePage{
	public ProfilePageElements profilepage = new ProfilePageElements();
	protected KeyFunctions keys = new KeyFunctions(driver);

	public ProfilePage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), profilepage);
	}

	/**
	 * Click in Services Tab
	 */
	public void validateUserEmail() {
		LogClass.info("Validate user email");
		Assert.assertTrue(keys.isElementDisplayed(profilepage.user_email));
	}

	/**
	 * Click in Shop Tab
	 */
	public void validatetProfilePanels() {
		String account_settingsText = "Update your profile information and manage your account settings.";
		String security_settingsText = "Update your security settings and control access to your services.";
		String about_mytelstraText ="Learn more about this app and the third party libraries we use.";
		LogClass.info("Validate Profile pannels");
		Assert.assertTrue(keys.isElementDisplayed(profilepage.username));
		Assert.assertTrue(keys.isElementDisplayed(profilepage.manageProfile));
		
		Assert.assertTrue(keys.isElementDisplayed(profilepage.account_settings));
		Assert.assertTrue(keys.isElementDisplayed(profilepage.account_settingsImage));
		Assert.assertEquals(keys.getElementText(profilepage.account_settingsText).equalsIgnoreCase(account_settingsText), true);
		
		Assert.assertTrue(keys.isElementDisplayed(profilepage.security_settings));
		Assert.assertTrue(keys.isElementDisplayed(profilepage.security_settingsImage));
		Assert.assertEquals(keys.getElementText(profilepage.security_settingsText).equalsIgnoreCase(security_settingsText), true);
		
		keys.tryVscrolltoElement(profilepage.about_mytelstra);
		Assert.assertTrue(keys.isElementDisplayed(profilepage.about_mytelstra));
		Assert.assertTrue(keys.isElementDisplayed(profilepage.about_mytelstraImage));
		Assert.assertEquals(keys.getElementText(profilepage.about_mytelstraText).equalsIgnoreCase(about_mytelstraText), true);
		
		
		
	}

}
