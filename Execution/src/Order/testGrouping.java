package Order;

import org.testng.annotations.Test;

public class testGrouping {

	@Test(groups = "Regression", priority = 0)
	public void testOne() {
		System.out.println("This is Test One - Group Regression");
	}
	
	@Test(groups = "Regression", priority = 1)
	public void testTwo() {
		System.out.println("This is Test Two- Group Regression");
	}	
	
	
	@Test(groups = "Smoke", priority = 2)
	public void testThree() {
		System.out.println("This is Test Three - Group Smoke");
	}
	
	@Test(groups = {"Regression","Sanity"}, priority = 3)
	public void testFour() {
		System.out.println("This is Test Four - Group Regression and Sanity");
	}
	
}
