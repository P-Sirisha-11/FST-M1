import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver =new FirefoxDriver();
      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
      
      driver.get("https://training-support.net/webelements/dynamic-controls");
      System.out.println("The title of the page:" +driver.getTitle());
      
     WebElement checkbox= driver.findElement(By.id("checkbox"));
     System.out.println("Check box is diplayed?:" +checkbox.isDisplayed());
     
     WebElement toggleCheckbox= driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
     toggleCheckbox.click();
     wait.until(ExpectedConditions.invisibilityOf(checkbox));
     System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
     
     WebElement toggleCheckbox1= driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
     toggleCheckbox1.click();
     wait.until(ExpectedConditions.visibilityOf(checkbox));
     wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
     System.out.println("Check box is seleted?:" +checkbox.isSelected()); 
     
      driver.quit();
	}

}
