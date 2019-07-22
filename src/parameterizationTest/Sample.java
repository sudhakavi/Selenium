package parameterizationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {
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
		driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
		System.out.println("URL is launched");
		driver.findElement(By.xpath("/html/body/div/div/a")).click();
	}
	@Test(dataProvider="dataset",priority=0)
	
	public void Register(String Uname,String Pswd,String CPswd) {
		
		WebElement username=driver.findElement(By.name("login"));
		username.sendKeys(Uname);
		System.out.println("username is: " +Uname);
				
		WebElement password=driver.findElement(By.name("password1"));
		password.sendKeys(Pswd);
		System.out.println("password is: " +Pswd);
		
		WebElement password1=driver.findElement(By.name("password2"));
		password1.sendKeys(CPswd);
		System.out.println("password is: " +CPswd);
	}
	 @DataProvider(name="dataset")
	  public static Object[][]getdataRegister()
	  {
		  return new Object[][]
		      {
			  {"sudha5695","sudhakck","sudhakck"}
		      };
	  }
	 @Test(priority=1)
	 public void Register() {
		 driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
		 System.out.println("Click the register");
	 }


}
