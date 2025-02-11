package Order;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
		
		@Test (priority = 1)
		public void testCaseOne() {
			System.out.println("");			
			SoftAssert softAssert = new SoftAssert();
			System.out.println("Test Case One");
			softAssert.assertEquals(5,  5, "First Assert Fialed");
			System.out.println("Hard Assert success");
			softAssert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
			System.out.println("test case one executed successfully");
		}
		
		@Test (priority = 2)
		public void testCasetwo() {
			System.out.println("");
			SoftAssert softAssert = new SoftAssert();
			System.out.println("Test Case Two");
			softAssert.assertEquals("Hello","hello", "First soft assert failed");
			System.out.println("Hard Assert success");
			softAssert.assertTrue(false, "Second assert failed");
			softAssert.assertTrue(false, "Third assert failed");
			System.out.println("test case two executed successfully");
			softAssert.assertAll();
			System.out.println("");
		}
		 
		@Test (priority = 3)
		public void testCasethree() {
			System.out.println("");
			SoftAssert softAssert = new SoftAssert();
			System.out.println("Test Case Three");
			softAssert.assertEquals(5,  5, "First Assert Fialed");
			System.out.println("Hard Assert success");
			softAssert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
			System.out.println("Test case three executed successfully");
			System.out.println("");
		}
}
