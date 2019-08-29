package keywordTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	WebDriver driver;
	@BeforeClass
	public void browser() {
	System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 driver.manage().window().maximize();
	}
	@BeforeMethod
	 public void url() {
	 driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
	 }
	@Parameters({"USERNAME","PASSWORD"})
	 @Test
	public void login(String USERNAME, String PASSWORD) { 
	 driver.findElement(By.xpath("//*[@id='login']")).sendKeys(USERNAME);
	 driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys(PASSWORD);
	 driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
	
	 }
}
