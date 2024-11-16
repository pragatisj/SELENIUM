import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("1212");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert=driver.switchTo().alert();
		
		String alertt=driver.switchTo().alert().getText();
		      Thread.sleep(3000);
		alert.accept();		
		

	}

}
