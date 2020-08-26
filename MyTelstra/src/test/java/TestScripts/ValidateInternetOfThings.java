package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import General.BasePage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.ServicesPage;
import io.appium.java_client.AppiumDriver;

public class ValidateInternetOfThings extends BasePage {

	@Test(priority = 0)
	public void ValidateInternetOfThingsTC() throws InterruptedException, IOException {
		startReporting(new Object() {
		}.getClass().getEnclosingMethod().getName());
		LoginPage loginPage = new LoginPage((AppiumDriver) driver);
		HomePage homePage = new HomePage((AppiumDriver) driver);
		ServicesPage servicesPage = new ServicesPage((AppiumDriver) driver);
		loginPage.changeEnvironment("PVT");
		loginPage.loginMyTelstra();
		homePage.clickServicesTab();
		servicesPage.scrolltoInternetofThings();
		servicesPage.validateInternetofThingsAsLastCard();
	}

}
