import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		Actions action =new Actions(driver);
		
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("The title of the page:" +driver.getTitle());
		
		
		WebElement lock=driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement toml=driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement src=driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement target=driver.findElement(By.xpath("//h1[text()='target']"));
		
		action.click(lock).pause(1000).moveToElement(toml).pause(5000).click(toml).build().perform();
		String confirmation_textresult =driver.findElement(By.id("result")).getText();
		System.out.println(confirmation_textresult);
		
		action.doubleClick(src).pause(5000).moveToElement(target).contextClick(target).pause(5000).build().perform();
		action.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(5000).build().perform();
		confirmation_textresult=driver.findElement(By.id("result")).getText();
		System.out.println(confirmation_textresult);
		
		driver.quit();


	}

}
