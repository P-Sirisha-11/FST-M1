import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println(" The Page title: " + driver.getTitle());

     
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        checkbox.click();
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        System.out.println("Checkbox is selected : " + checkbox.isSelected());
        checkbox.click();
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        checkbox.click();
        System.out.println("Checkbox is  selected : " + checkbox.isSelected());

        driver.quit();
    }
}