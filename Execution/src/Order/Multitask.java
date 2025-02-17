package Order;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multitask {
	
	@Test 
	public void start() {
		System.out.println("Starting server...");
	}
	
	@Test (dependsOnMethods = "start")
	public void initial() {
		System.out.println("Initializing the data for processing...");
	}
	
	@Test (dependsOnMethods = "initial")
	public void process() {
		Assert.assertTrue(false);
		System.out.println("Processing the Data...");
	}
	
	@Test (dependsOnMethods = {"initial","process"})
	public void end() {
		System.out.println("Stopping the server...");
	}
	
}
