package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampleTestClass {

	@Test //Passed
	public void testOne() {
		System.out.println("Test one");
		System.out.println("");
	}
	
	@DataProvider //run two times to print object
	public Object[] dataProvider() {
		return new Object[] {"A","B"};
	}
	
	@Test(dataProvider = "dataProvider") //Get DataProvider
	public void testGetData(String s) {
		System.out.println("Test GetData Method: input = "+s);
		System.out.println("");
	}
	
	@Test //Fail since not equal
	public void testThree() {
		Assert.assertEquals(5, 7);
		System.out.println("");
	}
	
	@Test //skip
	public void testFour() {
		System.out.println("This is test four");
		System.out.println("");
		throw new SkipException(null);
	}
	

}
