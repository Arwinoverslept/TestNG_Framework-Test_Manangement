package testDataProvider;

import org.testng.annotations.Test;

public class testDataType {
	
	@Test(dataProvider = "TestType", dataProviderClass = dataSourceProvider.class)
	public void IntegrationTest(String testType) {
		System.out.println("This is for Integration Testing:  (" +testType+ ")");
	}

	@Test(dataProvider = "TestType", dataProviderClass = dataSourceProvider.class)
	public void AcceptanceTest(String testType) {
		System.out.println("This is for Acceptance Testing:  (" +testType+ ")");
	}
		
	@Test(dataProvider = "TestType", dataProviderClass = dataSourceProvider.class)
	public void commonScenarios(String testType) {
		System.out.println("Common Scenario for testing is: (" +testType+ ")");
	}
		

	
}
