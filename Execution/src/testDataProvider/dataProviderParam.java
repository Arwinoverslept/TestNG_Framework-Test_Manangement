package testDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderParam {
	
	
	@Test(dataProvider = "scenarioData", dataProviderClass = dataSourceProvider.class)
	public void scenario1(String scenarioData) {
		System.out.println("Data for testing is: Data (" +scenarioData+ ")");
	}

	@Test(dataProvider = "scenarioData", dataProviderClass = dataSourceProvider.class)
	public void scenario2(String scenarioData) {
	System.out.println("Data2 for testing is: Data2 (" +scenarioData+ ")");
	}
	
	@Test(dataProvider = "scenarioData", dataProviderClass = dataSourceProvider.class)
	public void commonScenarios(String scenarioData) {
	System.out.println("Common Scenario for testing is: Data(" +scenarioData+ ")");
	}
	
}
