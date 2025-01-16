import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();

        
        driver.get("https://training-support.net/webelements/alerts");
        
        System.out.println("The Page title: " + driver.getTitle());
        
        driver.findElement(By.id("simple")).click();
        
        Alert alert = driver.switchTo().alert();
        String allerttext=alert.getText();
        System.out.println(allerttext);
        
        alert.accept();
        
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();
    }
}