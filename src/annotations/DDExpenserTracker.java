package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DDExpenserTracker {

	public static WebDriver driver;

	@Test(dataProvider="dataset1")
	public static void login(String data) {

        System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is launched");

		driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
		System.out.println("URL is launched");

		driver.findElement(By.xpath("//*[@id='login']")).sendKeys("besant");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("airtel");

		driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
		driver.findElement(By.xpath("//*[@id=\"go_list_categories\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"go_add_category\"]")).click();
		driver.findElement(By.id("name")).sendKeys(data);
		driver.findElement(By.id("submit")).click();
	}

	@DataProvider (name="dataset1")
	public static Object[]getdata()
	{
		//two dimensional array - predefined
		//data set
		Object [] data = new Object[3];
		//3-iteration 2-data, username and password
		// first dataset
		data[0]="valid username";

		// second dataset 
		data[1] ="Invalid username";

		// third dataset
		data[2] ="Empty";

		return data;
	}
}