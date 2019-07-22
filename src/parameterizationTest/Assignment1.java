package parameterizationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment1 {
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
		}
	
    @Test(dataProvider="dataset",priority=0)
	
	public void Register(String Uname,String Pswd,String CPswd) {
    	driver.findElement(By.xpath("/html/body/div/div/a")).click();
		WebElement username=driver.findElement(By.name("login"));
		username.sendKeys(Uname);
		System.out.println("username is: " +Uname);
				
		WebElement password=driver.findElement(By.name("password1"));
		password.sendKeys(Pswd);
		System.out.println("password is: " +Pswd);
		
		WebElement password1=driver.findElement(By.name("password2"));
		password1.sendKeys(CPswd);
		System.out.println("Confirmation password is: " +CPswd);
	}
	 @DataProvider(name="dataset")
	  public static Object[][]getdata()
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

    @Test (dataProvider = "dataset1",priority=2)
	public void loginTest(String Uname1,String Pswd) {
		WebElement username=driver.findElement(By.xpath("//*[@id='login']"));
		username.sendKeys(Uname1);
		System.out.println("username is: " +Uname1);
				
		WebElement password=driver.findElement(By.xpath("//*[@id=\'password\']"));
		password.sendKeys(Pswd);
		System.out.println("password is: " +Pswd);
				}
	  @DataProvider(name="dataset1")
	  public static Object[][]getdatalogin()
	 {
		  return new Object[][]
		      {
		  {"sudha5695","sudhakck"}
		     };
	  }
	
	 @Test(priority=3)
	  public void login() {
		  driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
			System.out.println("Click");
	  }
	 @Test(priority=4)
	 public void listcategory() {
		 driver.findElement(By.xpath("//*[@id=\"go_list_categories\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"go_add_category\"]")).click();
		 driver.findElement(By.id("name")).sendKeys("pencil");
		 driver.findElement(By.id("submit")).click();
		 driver.findElement(By.xpath("//*[@id=\"go_add_category\"]")).click();
		 driver.findElement(By.id("name")).sendKeys("Pen");
		 driver.findElement(By.id("submit")).click();
		 driver.findElement(By.xpath("//*[@id=\"go_add_category\"]")).click();
	     driver.findElement(By.id("name")).sendKeys("fruits");
		 driver.findElement(By.id("submit")).click();
			System.out.println("List category is added");
	 }
	 @Test(priority=5)
	 public void AddExpenses() {
		 driver.findElement(By.xpath("//*[@id=\"go_add_expense\"]")).click();
		 driver.findElement(By.id("day")).sendKeys("12");
		 driver.findElement(By.name("month")).sendKeys("1");
		 driver.findElement(By.id("year")).sendKeys("2019");
		// driver.findElement(By.name("//*[@id=\\'category\\']")).sendKeys("fruits");
		 WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'category\']"));
		 Select s = new Select(dropdown);
		// s.selectByIndex(2);
		  //s.selectByValue("Test");
		  s.selectByVisibleText("fruits");
		  driver.findElement(By.name("amount")).sendKeys("500");
		  driver.findElement(By.name("reason")).sendKeys("checking");
		  driver.findElement(By.id("submit")).click();
		 System.out.println("Add expenses is added");
	 }
}


















