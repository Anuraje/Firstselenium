package testingGroups;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassA {
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class");
		
	}
	
	
	@Test(groups= {"Regression"},priority=2)
public void regressionClassA() {
		System.out.println("Regression Class A");
		
	}
	@Test(groups= {"BVT"})
public void buildValidationClassA() {
		System.out.println("BVT Class A");
		
	}
	@Test(groups= {"Priority"})
public void priorityClassA() {
		System.out.println("Priority Class A");
	
}

}
