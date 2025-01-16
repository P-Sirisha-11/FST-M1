import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println(" The Page title: " + driver.getTitle());
        
        WebElement textBox= driver.findElement(By.id("textInput"));
       System.out.println("The text field is enabled:" + textBox.isEnabled());
        driver.findElement(By.id("textInputButton")).click();
       System.out.println("The text field is enabled:" + textBox.isEnabled());
       
       textBox.sendKeys("Example text");
       System.out.println(textBox.getDomProperty("value"));
 
       driver.quit();
       
    }
}