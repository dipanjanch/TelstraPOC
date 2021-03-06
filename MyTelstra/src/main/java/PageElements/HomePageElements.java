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
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Services']")
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
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement shop_button;
	
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/profile")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement profileIcon;

	/**
	 * Elements to test the calculator application
	 */
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='8']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement digit1;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='2']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement digit2;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='÷']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement operator;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='=']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement equals;

	@CacheLookup
	@AndroidFindBy(id = "com.android.calculator2:id/result")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement result;

}
