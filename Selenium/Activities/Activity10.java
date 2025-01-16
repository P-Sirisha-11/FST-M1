import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("The title of the page:" +driver.getTitle());
		
		WebElement ball = driver.findElement(By.id("ball"));
		WebElement dropzone1  = driver.findElement(By.id("dropzone1"));
		WebElement dropzone2  = driver.findElement(By.id("dropzone2"));
		
		action.click(ball).clickAndHold().moveToElement(dropzone1).pause(1000).release().build().perform();
		if (dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("The the ball has entered Dropzone 1");
		}
		
		action.click(ball).clickAndHold().moveToElement(dropzone2).pause(1000).release().build().perform();
		if (dropzone2 .findElement(By.className("dropzone-text")).getText().equals("dropzone2")){
			System.out.println("The the ball has entered Dropzone 2");
		}
		
		
		driver.quit();
		

	}

}
