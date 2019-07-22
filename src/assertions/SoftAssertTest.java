package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	@Test
	public void login() {
		System.out.println("starting");
		int expected = 2;
		int actual = 3;
		
		SoftAssert s=new SoftAssert();
				s.assertAll();  // Mandatory to give this assertall for soft assertion condition
		System.out.println("completed");
	}

}
