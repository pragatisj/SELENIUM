import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {

	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
    	driver.findElement(By.name("firstName")).sendKeys("Pragati");
//		WebElement we=driver.findElement(By.name("firstName"));
//		we.sendKeys("Pragati");
    	driver.findElement(By.name("lastName")).sendKeys("Jadhav");
    	driver.findElement(By.name("phone")).sendKeys("121212");
    	driver.findElement(By.name("userName")).sendKeys("pj@gmail.com");
    	
    	driver.findElement(By.name("address1")).sendKeys("Nanded,Maharashtra");
    	driver.findElement(By.name("city")).sendKeys("Nanded");
    	driver.findElement(By.name("state")).sendKeys("Maharashtra");
    	driver.findElement(By.name("postalCode")).sendKeys("431605");
    	
    	Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("pj@gmail.com");
		driver.findElement(By.name("password")).sendKeys("111");
		driver.findElement(By.name("confirmPassword")).sendKeys("111");
		
		driver.findElement(By.name("submit")).click();
	}

}
