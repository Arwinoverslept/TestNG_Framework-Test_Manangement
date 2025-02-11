package Order;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions {
	
	
	@Test (priority=1)
	public void testOne() {
		System.out.println("This is test one");
		Assert.assertEquals("FaceBook", "FaceBook");
	}
	
	@Test (priority=2)
	public void testTwo() {
		Assert.assertEquals(404, 200);
		System.out.println("This is test two");
	}
	
	@Test (priority=3)
	public void testThree() {
		System.out.println("This is test three");
		Assert.assertTrue(true);
	}
	
	@Test (priority=4)
	public void testFour() {
		System.out.println("This is test four");
		Assert.assertTrue(false, "Making Test Failure");
		
	}
	
	@Test (priority=5)
	public void testFive() {
		System.out.println("This is test five");
	}
	
	@Test (priority=6)
	public void testSix() {
		System.out.println("This is test six");
	}
	
}
