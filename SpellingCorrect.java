import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpellingCorrect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement a1=driver.findElement(By.id("email"));
		a1.sendKeys("pragatii");
		Thread.sleep(2000);
		a1.sendKeys(Keys.BACK_SPACE);
		
		a1.sendKeys(Keys.CONTROL+"a");
		a1.sendKeys(Keys.CONTROL+"c");
		WebElement a2=driver.findElement(By.id("pass"));
		a2.sendKeys(Keys.CONTROL+"v");
		

	}

}
