package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import General.BasePage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.ServicesPage;
import io.appium.java_client.AppiumDriver;

public class calculator extends BasePage {

    @Test(priority = 0)
    public void ValidateInternetOfThingsTC() throws InterruptedException, IOException {
        startReporting(new Object() {
        }.getClass().getEnclosingMethod().getName());
        HomePage homePage = new HomePage((AppiumDriver) driver);
        homePage.calcOperation();
    }

}
