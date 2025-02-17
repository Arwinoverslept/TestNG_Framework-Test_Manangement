package Order;

import org.testng.annotations.Test;

public class testGrouping {

	@Test(groups = "Regression")
	public void testOne() {
		System.out.println("This is Test One - Group Regression");
	}
	
	@Test(groups = "Regression")
	public void testTwo() {
		System.out.println("This is Test Two- Group Regression");
	}	
	
	
	@Test(groups = "Smoke")
	public void testThree() {
		System.out.println("This is Test Three - Group Smoke");
	}
	
	@Test(groups = {"Smoke","Sanity"})
	public void testFour() {
		System.out.println("This is Test Four - Group Smoke");
	}
	
}
