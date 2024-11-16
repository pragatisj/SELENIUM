import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionHovering {
	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://stqatools.com/demo/MouseHover.php");
		
		WebElement a1=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/button"));
		
		Actions act=new Actions(driver);
		act.moveToElement(a1).perform();
		
		WebElement wb=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/a[1]"));
		act.moveToElement(wb);
		act.click().perform();

	}

}
