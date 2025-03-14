import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();

        
        driver.get("https://training-support.net/webelements/alerts");
        
        System.out.println("The Page title: " + driver.getTitle());
        
        driver.findElement(By.id("prompt")).click();
        
        Alert alret = driver.switchTo().alert();
        String alretmsg=alret.getText();
        System.out.println("test in alret:" +alretmsg);
        
        alret.sendKeys("Awesome!");
        alret.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();
    }
}