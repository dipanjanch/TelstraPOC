package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import General.BasePage;
import General.KeywordFunctions;
import PageElements.LoginPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BasePage{
	protected Logger log = Logger.getLogger(LoginPage.class.getName());
	protected KeywordFunctions keys = new KeywordFunctions(driver);
	public LoginPageElements loginpage = new LoginPageElements();
	public Properties obj;
	public FileInputStream objfile;
	public String username, invalid_username, password, invalid_password, search_content;
	WebDriverWait wait;
	
	//page factory initialization
	public LoginPage(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), loginpage);
		log.info(getClass());
		log.info("Loginpage elements initialized");
	}
	
	
	public void changeEnvironment() throws InterruptedException, IOException {
		keys.waitForElementPresent(loginpage.splashScreenNext);
		System.out.println("Setting up PVT environment");
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenFinish);
		System.out.println("Clicking profileIcon");
		keys.clickElement(loginpage.profileIcon);
		System.out.println("Clicking Developer Playground");
		keys.scrollToText("Developer Playground");
		keys.clickElement(loginpage.developerPlayground);
		System.out.println("Clicking devEnvironment");
		keys.clickElement(loginpage.devEnvironment);
		keys.clickElement(loginpage.dropDownList);
		System.out.println("Clicking PVT");
		keys.scrollToText("PVT");
		keys.clickElement(loginpage.PVT);
		keys.clickElement(loginpage.dropDownDone);		
	}
	
	public void launchMyTelstraApp() throws InterruptedException, IOException {
		Point point = keys.getCoordinates(loginpage.searchLauncher);
		keys.clickElement(loginpage.searchLauncher);
		keys.sendSetText(loginpage.searchBox, "My Telstra");
		keys.clickElement(loginpage.myTelstraApp);
		
	}
	public void loginMyTelstra() throws IOException {
		System.out.println("Retreiving Username and Password from property file");
		obj = new Properties();
		log.info(getClass());
		System.out.println(System.getProperty("user.dir"));
		objfile = new FileInputStream(System.getProperty("user.dir") + "/util/testdata.properties");
		obj.load(objfile);
		username = obj.getProperty("username");
		password = obj.getProperty("password");
		
		System.out.println("Clicking on next button in splash screen");
		keys.waitForElementPresent(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		keys.clickElement(loginpage.splashScreenNext);
		System.out.println("Clicking on SignInNow button");
		keys.waitForElementPresent(loginpage.signinNow);
		keys.clickElement(loginpage.signinNow);
		System.out.println("Entering username");
		keys.waitForElementPresent(loginpage.usernameBox);
		keys.clickElement(loginpage.usernameBox);
		keys.sendSetText(loginpage.usernameBox, username);
		System.out.println("Entering password");
		keys.clickElement(loginpage.passwordBox);
		keys.sendSetText(loginpage.passwordBox, password);
		System.out.println(" Cick in sign in button");
		keys.clickElement(loginpage.signInButton);
		keys.waitForElementPresent(loginpage.closeIcon);
		System.out.println(" Cick in close button");
		keys.clickElement(loginpage.closeIcon);
	}
}
