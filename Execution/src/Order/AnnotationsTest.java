package Order;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
	@Test
	public void first() {
		System.out.println("From Annotations Test Class : @Test is Running");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("From Annotation Class: @beforeMethod is Runninng!");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("From Annotation Class: @afterMethod is Runninng!");		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("From Annotation Class: @beforeClass is Runninng!");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("From Annotation Class: @afterClass is Runninng!");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("From Annotation Class: @afterTest is Runninng!");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("From Annotation Class: @afterSuite is Runninng!");
	}
	
	
	
}
