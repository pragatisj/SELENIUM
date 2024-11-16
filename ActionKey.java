import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKey {

	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		WebElement we=driver.findElement(By.id("email"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(we).click().sendKeys(we,"pj@gmail.com").perform();
		act.moveToElement(we).click().keyDown(we,Keys.SHIFT).sendKeys(we,"pj@gmail.com").perform();
		
	}

}
