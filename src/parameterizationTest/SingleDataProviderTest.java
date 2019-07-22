package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDataProviderTest {
	
  @Test (dataProvider="dataset1")   ////data provider will act as annoation and keyword

public void loginTest(String username, String password) {
	System.out.println(username);
	System.out.println(password);
	System.out.println("Click");
} 
  @DataProvider (name="dataset1")
  public static Object[][]getdata()
{
	//two dimensional array - predefined
			//data set
	Object [][] data =new Object[3][2];
	//3-iteration 2-data, username and password
	     // first dataset
			data[0][0] ="valid username";
	        data[0][1] ="valid password";
	       // second dataset 
	        data[1][0] ="Invalid username";
	        data[1][1] ="Invalid password";
	        // third dataset
	        data[2][0] ="Empty";
	        data[2][1] ="Empty";
	        return data;
}
}
