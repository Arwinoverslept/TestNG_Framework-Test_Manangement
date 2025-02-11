package Order;

import org.testng.annotations.*;

public class SampleTestNGUsage {
	@BeforeTest
	public void beforeTest() {
		System.out.println("From UseTestNG Class: @Before Test is Running");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("From UseTestNG Class: @Before Suite is Running");
	}
	
}
