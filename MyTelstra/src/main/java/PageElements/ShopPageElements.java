package PageElements;

import java.time.temporal.ChronoUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

public class ShopPageElements {
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/welcome_title")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement WelcomeToShopHeading;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/shopTitle")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement PromotionsHeading;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Mobile & Tablets']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement MobileAndTablet;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Home Internet & Phone']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement HomeAndInternet;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Entertainment']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement Entertainment;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Moving Home']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement MovingHome;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Deals & Gifts']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement DealsAndGifts;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Accessories']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement Accessories;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/shopByBrandsTitle")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement ShopByBrands;

}
