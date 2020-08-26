package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import General.BasePage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.ServicesPage;
import PageObjects.ShopPage;
import io.appium.java_client.AppiumDriver;

public class ValidateShopScreenElements extends BasePage {
	@Test
	public void ValidateShopScreenElementsTC() throws InterruptedException, IOException {
	startReporting(new Object() {
	}.getClass().getEnclosingMethod().getName());
	LoginPage loginPage = new LoginPage((AppiumDriver) driver);
	HomePage homePage = new HomePage((AppiumDriver) driver);
	ShopPage shopPage = new ShopPage((AppiumDriver) driver);
	
	loginPage.changeEnvironment();
	loginPage.launchMyTelstraApp();
	loginPage.loginMyTelstra();
	homePage.clickShopTab();
	shopPage.vaidateWelcomeToShop();
	shopPage.scrolltoGetMoreFromTelstra();
	shopPage.validateGetMoreFromTelstra();
	shopPage.validateShopByBrandsTile();
	
	}

}
