package Order;

import java.util.concurrent.ForkJoinPool;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

public class SkippingTest {
	
	int totalTests = 4;  // Total test count
    int passedCount = 0;
    int failedCount = 0;
    int skippedCount = 0;
	
	
	 @BeforeTest
	    public void PreTest() {
	        System.out.println("Before Test");
	        
	        // Global Loop (Can be used for tracking)
	        for(int b = 1; b <= totalTests; b++) {  
	            System.out.println("Test Count: " + b);
	        }
	        System.out.println("");
	    }
	
	
	@Test (priority = 1)
	public void first() {
		System.out.println("From SkippingTest Class : first is Running");
	}
	
	
	@Test (priority = 2, enabled=false) //used when you want to skip
	public void second() {
		System.out.println("From SkippingTest Class : second is Running");
	}
	
	@Test (priority = 3)
	public void third() {
		System.out.println("From SkippingTest Class: third is Running");
		throw new SkipException("Skipping Deliberately, Test is Incomplete"); //used when you want to skip
	}
	
	@Test (priority = 4)
	public void fourth() {
		System.out.println("From SkippingTest Class : fourth is Running");
	}
	
	@AfterMethod
    public void trackResults(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            passedCount++;
        } else if (result.getStatus() == ITestResult.FAILURE) {
            failedCount++;
        } else {
        	skippedCount++;
        }
    }
	
	@AfterTest
	  public void PostTest() {
		System.out.println("");
        System.out.println("After Test");
        System.out.println("Total Passed: " + passedCount);
        System.out.println("Total Failed: " + failedCount);
        System.out.println("Total Skipped: " +skippedCount );
        System.out.println("");
        System.out.println("Test Status:");
    }
	
}
