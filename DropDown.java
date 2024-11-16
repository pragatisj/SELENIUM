import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		
		//Select drpcount=new Select(driver.findElement(By.name("passCount")));
		//drpcount.selectByIndex(1);
		//drpcount.selectByValue("");
		
		Select drpcount1=new Select(driver.findElement(By.name("fromPort")));
		drpcount1.selectByVisibleText("New York");
		
		Select drpcount2=new Select(driver.findElement(By.name("fromMonth")));
		drpcount2.selectByVisibleText("September");

		Select drpcount3=new Select(driver.findElement(By.name("fromDay")));
		drpcount3.selectByVisibleText("21");
		
		Select drpcount4=new Select(driver.findElement(By.name("toPort")));
		drpcount4.selectByVisibleText("London");
		
		Select drpcount5=new Select(driver.findElement(By.name("toMonth")));
		drpcount5.selectByVisibleText("August");

		Select drpcount6=new Select(driver.findElement(By.name("toDay")));
		drpcount6.selectByVisibleText("22");
		
		Select drpcount7=new Select(driver.findElement(By.name("airline")));
		drpcount7.selectByVisibleText("Blue Skies Airlines");
		
		
		
	}

}
