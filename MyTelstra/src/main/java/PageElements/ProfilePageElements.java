package PageElements;

import java.time.temporal.ChronoUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

public class ProfilePageElements {
	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/emailIdTextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement user_email;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/userNameTextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement username;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/manageProfileTitle")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement manageProfile;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/accountPreferencesPanel")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement account_settings;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @resource-id='com.telstra.mobile.android.mytelstra.dev.debug:id/accountPreferencesPanel']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement account_settingsText;

	@CacheLookup
	@AndroidFindBy(xpath = "(//*[@class='android.widget.Button' and @resource-id='com.telstra.mobile.android.mytelstra.dev.debug:id/accountPreferencesPanel']/android.widget.ImageView)[1]")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement account_settingsImage;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/securityAccessPanel")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement security_settings;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @resource-id='com.telstra.mobile.android.mytelstra.dev.debug:id/securityAccessPanel']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement security_settingsText;

	@CacheLookup
	@AndroidFindBy(xpath = "(//*[@class='android.widget.Button' and @resource-id='com.telstra.mobile.android.mytelstra.dev.debug:id/securityAccessPanel']/android.widget.ImageView)[1]")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement security_settingsImage;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/appSettingsPanel")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement app_settings;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/notificationCenterPanel")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement notification_settings;

	@CacheLookup
	@AndroidFindBy(id = "com.telstra.mobile.android.mytelstra.dev.debug:id/aboutMyTelstraPanel")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement about_mytelstra;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @resource-id='com.telstra.mobile.android.mytelstra.dev.debug:id/aboutMyTelstraPanel']/android.widget.TextView")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement about_mytelstraText;

	@CacheLookup
	@AndroidFindBy(xpath = "(//*[@class='android.widget.Button' and @resource-id='com.telstra.mobile.android.mytelstra.dev.debug:id/aboutMyTelstraPanel']/android.widget.ImageView)[1]")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement about_mytelstraImage;

}
