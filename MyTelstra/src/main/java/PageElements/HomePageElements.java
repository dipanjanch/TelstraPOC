package PageElements;

import java.time.temporal.ChronoUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

public class HomePageElements {
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/largeLabel")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement home_button;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Services tab 2 of 5']/android.view.ViewGroup/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement services_button;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Payments tab 3 of 5']/android.widget.ImageView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement payments_button;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Get help tab 4 of 5']/android.widget.ImageView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement gethelp_button;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Shop tab 5 of 5']/android.widget.ImageView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement shop_button;

	@CacheLookup
	@AndroidFindBy(xpath = "((//android.widget.LinearLayout[@resource-id='com.telstra.mobile.android.mytelstra.dev.debug:id/cardSectionLayout'])[last()]/android.widget.Button/android.widget.TextView)[1]")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement lastCardNameInServices;

}
