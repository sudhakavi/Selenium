package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeSuite
	public void browser() {
		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is launched");
	}
	@BeforeClass
	public void url() {
		driver.get("https://www.guru99.com/all-about-testng-and-selenium.html");
		System.out.println("URL is launched");
	}
	@BeforeMethod
	public void link() {
		 WebElement link=driver.findElement(By.xpath("//*[@id=\'g-mainbar\']/div[1]/div/div/div/div/div/div[2]/h2[5]"));
		 JavascriptExecutor Js= (JavascriptExecutor)driver;
	     Js.executeScript("window.scrollBy(0,1000)");
	     Js.executeScript("arguments[0].scrollIntoView();",link);
		System.out.println("Click the link");
	}
	@org.testng.annotations.Test
	public void Test1() {
		System.out.println("Test is executed");
	}
	@org.testng.annotations.Test
	public void Test2() {
		System.out.println("Test2 is executed");
	}
	@AfterClass
	public void url1() {
		driver.get("https://www.toolsqa.com/testng/what-is-testng/");
		System.out.println("URL1 is launched");
	}
	@AfterMethod
	public void link1() {
		 WebElement link1 = driver.findElement(By.xpath("//*[@id=\"post-33850\"]/div[1]/div/div[2]/div/div/div[1]/div/h3[3]/em"));
		 JavascriptExecutor Js= (JavascriptExecutor)driver;
	     Js.executeScript("window.scrollBy(0,500)");
	     Js.executeScript("arguments[0].scrollIntoView();",link1);
		System.out.println("Click the link1");

	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		System.out.println("Browser is closed");
	}
	
	
	
}









