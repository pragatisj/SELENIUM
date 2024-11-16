import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTab {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String>allwindow=driver.getWindowHandles();
		
		for(String a : allwindow) {
			System.out.println(a);
			driver.switchTo().window(a);
			WebDriver title=driver.switchTo().window(a);
			System.out.println(title);
			
			if(driver.getTitle().equals("selenium")) {
				driver.close();
				
				
			}
			
		}
		
		
	}

}
