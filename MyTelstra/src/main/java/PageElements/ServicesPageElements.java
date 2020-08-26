package PageElements;

import java.time.temporal.ChronoUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

public class ServicesPageElements {
	@CacheLookup
	@AndroidFindBy(xpath = "((//android.widget.LinearLayout[@resource-id='com.telstra.mobile.android.mytelstra.dev.debug:id/cardSectionLayout'])[last()]/android.widget.Button/android.widget.TextView)[1]")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement lastCardNameInServices;
}
