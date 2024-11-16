import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstPrg {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in");
	//driver.close();
//	driver.navigate().refresh(); 
//	driver.navigate().to("https://www.facebook.com/");
//	driver.navigate().forward();
//	driver.navigate().back();
	
//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
//	driver.findElement(By.id("nav-search-submit-button")).click();
	
	//driver.findElement(By.linkText("Today's Deals")).click();
	//driver.findElement(By.partialLinkText("Today's")).click();
	
	String title=driver.getTitle();
	System.out.println(title);
	String currenturl=driver.getCurrentUrl();
	System.out.println( currenturl);

	
	
	}

}
