package keywordTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;


public class GroupTest {
	WebDriver driver;
	@Test(groups = "A")
	public void browser() {
		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is launched");
	}
	
	public void url() {
		driver.get("https://www.guru99.com/all-about-testng-and-selenium.html");
		System.out.println("URL is launched");
	}
	
	public void link() {
		 WebElement link=driver.findElement(By.xpath("//*[@id=\'g-mainbar\']/div[1]/div/div/div/div/div/div[2]/h2[5]"));
		 JavascriptExecutor Js= (JavascriptExecutor)driver;
	     Js.executeScript("window.scrollBy(0,1000)");
	     Js.executeScript("arguments[0].scrollIntoView();",link);
		System.out.println("Click the link");
	}
	@Test(groups="B")
	public void Test1() {
		System.out.println("Test is executed");
	}
	
	public void Test2() {
		System.out.println("Test2 is executed");
	}

}
