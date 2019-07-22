	package annotations;
	
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	
	public class Testing {
		@BeforeSuite
		public void beforesuite() {
			System.out.println("BeforeSuite---1");
		}
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest---1");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass---1");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BeforeMethod---1");
	}
	@org.testng.annotations.Test(priority=2,groups= "A")
	public void Test() {
		System.out.println("Test is executed");
	}
	@org.testng.annotations.Test(priority=0,groups= "A")
	public void Test1() {
		System.out.println("Test 1 is executed");
	}
	@org.testng.annotations.Test(priority=1,groups= "A")
	public void Test2() {
		System.out.println("Test 2 is executed");
	}
	@org.testng.annotations.Test(dependsOnMethods="Test1")
	public void Test3() {
		System.out.println("Test 3 is executed");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("AfterMethod---1");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("AfterClass---1");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("AfterTest---1");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("AfterSuite---1");
	}
	}
	
	
		
		
		
		
		
		
		
		