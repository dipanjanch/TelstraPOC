package PageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import General.BasePage;
import General.KeyFunctions;
import PageElements.ServicesPageElements;
import PageElements.ShopPageElements;
import Utility.LogClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopPage extends BasePage {
	protected KeyFunctions keys = new KeyFunctions(driver);
	ShopPageElements shopPage = new ShopPageElements();

	public ShopPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), shopPage);
	}
	
	public void vaidateWelcomeToShop()
	{
		Assert.assertTrue(keys.isElementDisplayed(shopPage.WelcomeToShopHeading));
		Assert.assertTrue(keys.isElementDisplayed(shopPage.PromotionsHeading));
	}
	
	
	public void scrolltoGetMoreFromTelstra()
	{
		LogClass.info("Scroll to Internet of Things ");
		keys.scrollToText("Get more from Telstra");
	}
	
	public void validateGetMoreFromTelstra()
	{
		Assert.assertTrue(keys.isElementDisplayed(shopPage.MobileAndTablet));
		Assert.assertTrue(keys.isElementDisplayed(shopPage.HomeAndInternet));
		Assert.assertTrue(keys.isElementDisplayed(shopPage.Entertainment));
		Assert.assertTrue(keys.isElementDisplayed(shopPage.MovingHome));
		Assert.assertTrue(keys.isElementDisplayed(shopPage.DealsAndGifts));
		Assert.assertTrue(keys.isElementDisplayed(shopPage.Accessories));
		
	}
	public void validateShopByBrandsTile()
	{
		keys.scrollToText("Shop by brands");
		Assert.assertTrue(keys.isElementDisplayed(shopPage.ShopByBrands));
	}
	
	
}
