package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {

	AppiumDriver driver;

	@BeforeClass
	public void main() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");

		// Server Address
		URL serverURL = new URI("http://localhost:4723").toURL();
		// Driver Initialization
		driver = new AndroidDriver(serverURL, options);
		driver.get("https://training-support.net");
	}

	@Test
	public void Test() {
		String heading = driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"WebElements\"]")).getText();
		System.out.println("heading:" + heading);
		driver.findElement(AppiumBy.accessibilityId("About Us")).click();
		String aboutPageHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']"))
				.getText();
		System.out.println(aboutPageHeading);
	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}
}
