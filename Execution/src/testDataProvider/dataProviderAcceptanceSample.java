package testDataProvider;

import org.testng.annotations.Test;

public class dataProviderAcceptanceSample {
	
	@Test(dataProvider = "scenarioData", dataProviderClass = dataSourceProvider.class)
	public void printData(String data1) {
		System.out.println("Printing data1 value: "+data1);
	}
}
