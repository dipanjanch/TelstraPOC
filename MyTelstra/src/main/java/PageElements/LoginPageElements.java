package PageElements;

import java.time.temporal.ChronoUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

public class LoginPageElements {
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/next")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement splashScreenNext;
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/next")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement splashScreenFinish;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/profile")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement profileIcon;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/developerPlaygroundButton")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement developerPlayground;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/environmentButton")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement devEnvironment;
	
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/dropDownList")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement dropDownList;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='PVT']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement PVT;
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/doneButton")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement dropDownDone;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Search']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement searchLauncher;

	@CacheLookup
	@AndroidFindBy(id = "com.google.android.googlequicksearchbox:id/search_box")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement searchBox;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='Open My Telstra Dev.']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement myTelstraApp;
	
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/signInNowButton")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement signinNow;
	
	@CacheLookup
	@AndroidFindBy(id = "username")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement usernameBox;
	
	@CacheLookup
	@AndroidFindBy(id = "password")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement passwordBox;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement signInButton;
	
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/close")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement closeIcon;

}
