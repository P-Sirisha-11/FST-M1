package activities;

import static org.testng.Assert.assertEquals;

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

public class Activity1 {
	AppiumDriver driver;
	
	@BeforeClass
		public void setUp() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options ui= new UiAutomator2Options();
		ui.setPlatformName("android");
		ui.setAutomationName("UiAutomator2");
		ui.setAppPackage("com.android.calculator2");
		ui.setAppActivity(".Calculator");
		ui.noReset();
		
		URL url = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(url, ui);
	}
	@Test
	public void multiplication() {
		driver.findElement(AppiumBy.id("digit_8")).click();
		//driver.findElement(AppiumBy.accessibilityId("×")).click();
		driver.findElement(AppiumBy.id("op_mul")).click();
		driver.findElement(AppiumBy.id("digit_8")).click();
		//driver.findElement(AppiumBy.accessibilityId("equals")).click();
		driver.findElement(AppiumBy.id("eq")).click();
		
		String result = driver.findElement(AppiumBy.id("result")).getText();

		assertEquals(result, "40");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}


