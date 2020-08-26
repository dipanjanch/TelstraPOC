package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import General.BasePage;
import General.KeyFunctions;
import PageElements.LoginPageElements;
import Utility.LogClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BasePage {
	protected Logger log = Logger.getLogger(LoginPage.class.getName());
	protected KeyFunctions keys = new KeyFunctions(driver);
	public LoginPageElements loginpage = new LoginPageElements();
	public Properties obj;
	public FileInputStream objfile;
	public String username, invalid_username, password, invalid_password, search_content;
	WebDriverWait wait;

	// page factory initialization
	public LoginPage(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), loginpage);
		log.info(getClass());
		log.info("Loginpage elements initialized");
	}

	/**
	 * Changing the environment
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void changeEnvironment(String environment) throws InterruptedException, IOException {
		keys.waitForElementPresent(loginpage.splashScreenNext);
		LogClass.info("Setting up PVT environment");
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenFinish);
		LogClass.info("Clicking profileIcon");
		keys.clickElement(loginpage.profileIcon);
		LogClass.info("Clicking Developer Playground");
		keys.scrollToText("Developer Playground");
		keys.clickElement(loginpage.developerPlayground);
		LogClass.info("Clicking devEnvironment");
		keys.clickElement(loginpage.devEnvironment);
		keys.clickElement(loginpage.dropDownList);
		LogClass.info("Clicking "+environment);
		keys.scrollToText(environment);
		keys.clickElement(loginpage.PVT);
		keys.clickElement(loginpage.dropDownDone);
		((AndroidDriver) driver).activateApp("com.telstra.mobile.android.mytelstra.dev.debug");
	}

	/**
	 * Login to mytelstra app
	 * @throws IOException
	 */
	public void loginMyTelstra() throws IOException {
		LogClass.info("Retreiving Username and Password from property file");
		obj = new Properties();
		log.info(getClass());
		LogClass.info(System.getProperty("user.dir"));
		objfile = new FileInputStream(System.getProperty("user.dir") + "/util/testdata.properties");
		obj.load(objfile);
		username = obj.getProperty("username");
		password = obj.getProperty("password");

		LogClass.info("Clicking on next button in splash screen");
		keys.waitForElementPresent(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		LogClass.info("Clicking on SignInNow button");
		keys.waitForElementPresent(loginpage.signinNow);
		keys.clickElement(loginpage.signinNow);
		LogClass.info("Entering username");
		keys.waitForElementPresent(loginpage.usernameBox);
		keys.clickElement(loginpage.usernameBox);
		keys.sendSetText(loginpage.usernameBox, username);
		LogClass.info("Entering password");
		keys.clickElement(loginpage.passwordBox);
		keys.sendSetText(loginpage.passwordBox, password);
		LogClass.info(" Cick in sign in button");
		keys.clickElement(loginpage.signInButton);
		keys.waitForElementPresent(loginpage.closeIcon);
		LogClass.info(" Cick in close button");
		keys.clickElement(loginpage.closeIcon);
	}
}
