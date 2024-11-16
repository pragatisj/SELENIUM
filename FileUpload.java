import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement uploadelem=driver.findElement(By.name("uploadfile_0"));
		//uploadelem.sendKeys("C:\\Users\\Lenovo\\Desktop\\applicant.pdf");
		uploadelem.sendKeys("C:\\Users\\Lenovo\\Desktop\\STOCKS.xlsx");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
	}
	
}
