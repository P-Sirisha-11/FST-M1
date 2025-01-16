//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new FirefoxDriver();
     driver.get("https://training-support.net/webelements/target-practice");
     System.out.println("The title of the page:"+driver.getTitle());
     driver.quit();
	}

}
