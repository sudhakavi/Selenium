package parameterizationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParameterTest {
	WebDriver driver;
@Test
@Parameters("browser")

public void BrowserParameter(String browser) throws InterruptedException {
	
  if(browser.equals("Firefox")) {
	  System.out.println("Test case started");
	  System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.get("https://www.google.co.in/");
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	}
	else if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		}
	}
}

