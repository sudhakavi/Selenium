 package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	  // Hard Assert = Static
	  // Soft Assert = Non Static
		@Test
		public void login() {
			System.out.println("starting");
			int expected =5;
			int actual =5;
			Assert.assertEquals(expected,actual);
			System.out.println("completed");
			}
		}
