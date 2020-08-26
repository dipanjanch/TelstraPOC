package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import General.BasePage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.appium.java_client.AppiumDriver;

public class ValidateInternetOfThings extends BasePage{
	@Test(priority=0)
	public void ValidateInternetOfThingsTC() throws InterruptedException, IOException {
	LoginPage lp = new LoginPage((AppiumDriver) driver);
	HomePage hp= new HomePage((AppiumDriver) driver);
	lp.changeEnvironment();
	lp.launchMyTelstraApp();
	lp.loginMyTelstra();
	hp.clickServicesTab();
	hp.scrolltoInternetofThings();
	hp.validateInternetofThingsAsLastCard();
	}

}
