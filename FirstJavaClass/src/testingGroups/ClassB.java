package testingGroups;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassB {
	
	@Test(groups= {"Regression"},priority=1)
	public void regressionClassB() {
		System.out.println("Regression Class B");
		
	}
	@Parameters({"firstname"})
	@Test(groups= {"Regression"})
	public void testingParameters(String name) {
		System.out.println(name);
		assert "Annika".equals(name) ;
		
		
	}
	@Test(groups= {"BVT"})
public void buildValidationClassB() {
		System.out.println("BVT Class B");
		
	}
	@Test(groups= {"Priority"})
public void priorityClassB() {
		System.out.println("Priority Class B");
	
}

}
