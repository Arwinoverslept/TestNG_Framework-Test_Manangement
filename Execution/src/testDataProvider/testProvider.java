package testDataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testProvider {

	
	@Test(dataProvider = "getData")
	public void testAdd(int actual, int expected) {
		int actualValue = actual + 20;
		Assert.assertEquals(actualValue, expected);
	}
	
	@Test(dataProvider = "DoubleSet")
	public void testAdd2(int actual2, int expected2) {
		int actualValue = actual2 + 20;
		Assert.assertEquals(actualValue, expected2);
	}
	
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{100, 120},
			{200, 220},
			{300, 320},
			{250, 50},
			{400, 420}
		};
	}
	
	@DataProvider (name = "DoubleSet")
	public Object[][] getDataSet(){
		return new Object[][] {
			{10,30},
			{20,40}
		};
	}
	
	
	
}
