package testDataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class dataSourceProvider {
		
	@DataProvider (name = "scenarioData")
	public static Object[][] getScenarioData(ITestContext context){
		String testCaseString = context.getName();
		if ("scenario1".equals(testCaseString)) {
			return new Object[][] {{"Scenario Data"}};
		} else if ("scenario2".equals(testCaseString)) {
			return new Object[][] {{"Scenario2 Data"}};
		} else {
			return new Object[][] {{"Common Scenario Data"}};
		}
	}
	
	
	@DataProvider (name = "TestType")
	public static Object[][] getTestDataType(Method method){
		String testNameString = method.getName();
		if ("IntegrationTest".equals(testNameString)) {
			return new Object[][] {{"Integration Test Data"}};
		} else if ("AcceptanceTest".equals(testNameString)) {
			return new Object[][] {{"Acceptance Test Data"}};
		} else {
			return new Object[][] {{"Common Test Data"}};
		}
	}
	
}
