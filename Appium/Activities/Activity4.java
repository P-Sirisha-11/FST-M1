package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {
	AppiumDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options ui = new UiAutomator2Options();
		ui.setPlatformName("android");
		ui.setAutomationName("UiAutomator2");
		ui.setAppPackage("com.android.contacts");
		ui.setAppActivity(".activities.PeopleActivity");
		ui.noReset();

		URL url = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(url, ui);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Test
	public void contactTest() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@text='First name']")));
		driver.findElement(AppiumBy.id("com.android.contacts:id/floating_action_button"));
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\'First name\']")).sendKeys("Aaditya");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\'Last name\']")).sendKeys("Aaditya");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Phone\"]")).sendKeys("999148292");
		driver.findElement(AppiumBy.id("com.android.contacts:id/editor_menu_save_button"));

		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.contacts:id/large_title")));

		String test = driver.findElement(AppiumBy.id("com.android.contacts:id/large_title")).getText();
		assertEquals(test, "Aaditya Varma");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
