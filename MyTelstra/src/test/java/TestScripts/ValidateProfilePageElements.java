package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import General.BasePage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.ProfilePage;
import PageObjects.ServicesPage;
import io.appium.java_client.AppiumDriver;

public class ValidateProfilePageElements extends BasePage {

	@Test(priority = 0)
	public void ValidateProfilePageElementsTC() throws InterruptedException, IOException {
		startReporting(new Object() {
		}.getClass().getEnclosingMethod().getName());
		LoginPage loginPage = new LoginPage((AppiumDriver) driver);
		HomePage homePage = new HomePage((AppiumDriver) driver);
		ProfilePage profilePage = new ProfilePage((AppiumDriver) driver);
		loginPage.changeEnvironment("PVT");
		loginPage.loginMyTelstra();
		homePage.clickProfileTab();
		profilePage.validateUserEmail();
		profilePage.validatetProfilePanels();
		
	}
}
