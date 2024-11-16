import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCick {
	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		
		WebElement rightcl=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		act.contextClick(rightcl).perform();
		

		
	}

}
