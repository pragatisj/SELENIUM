import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Actions act=new Actions(driver);

//		WebElement e1=driver.findElement(By.className("Automation"));
//		e1.click();
//		System.out.println(e1.isSelected());
//		WebElement e2=driver.findElement(By.className("Performance"));
//		e2.click();
//		System.out.println(e2.isSelected());
//		
		WebElement gender=driver.findElement(By.id("female"));
		gender.click();
//		System.out.println(gender.isSelected());
//		WebElement gender1=driver.findElement(By.id("male"));
//		gender1.click();
//		System.out.println(gender1.isSelected());
		
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"dblClkBtn\"]"));
		act.doubleClick(wb).perform();
	}

}
