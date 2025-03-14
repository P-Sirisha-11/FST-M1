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

public class Activity3 {

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
    public void additionTest() {
      
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.id("digit_9")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
 
       
        String result = driver.findElement(AppiumBy.id("result")).getText();
        assertEquals(result, "14");
    }
 
    
    @Test
    public void subtractTest() {
        
        driver.findElement(AppiumBy.id("digit_1")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("minus")).click();
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        String result = driver.findElement(AppiumBy.id("result")).getText();
        assertEquals(result, "5");
    }
 
    
    @Test
    public void multiplyTest() {
        
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("digit_1")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
 
        
        String result = driver.findElement(AppiumBy.id("result")).getText();
        assertEquals(result, "500");
    }
 
    
    @Test
    public void divideTest() {
      
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("divide")).click();
        driver.findElement(AppiumBy.id("digit_2")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
 
       
        String result = driver.findElement(AppiumBy.id("result")).getText();
        assertEquals(result, "25");
    }
 
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}