package keywordTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
 @Test
 public void session1() {
	 System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.google.co.in/");
 }
 @Test
 public void session2() {
	 System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.google.co.in/"); }
}
