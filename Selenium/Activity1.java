import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net");
		System.out.println("page titale:"+driver.getTitle());
		driver.findElement(By.linkText("About Us"));
		System.out.println("new pae title:" +driver.getTitle());
		driver.quit();

	}

}
