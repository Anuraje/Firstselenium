package com.TestNG.RemainingPortions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CopyOfTestNG {
	
	//before test
	//after test
	//dependsOn
	//alwaysRun
	//before method
	//after method
	//isenabled
	//timeout
	//dataprovider
	//groups
	

/*	@BeforeMethod
	public void testngTestBeforeMethod() {
		System.out.println("I am running Before Method");
		
	}
	@BeforeTest
	public void testngTest() {
		System.out.println("Test 1");
		
	}
	@AfterTest
	public void testngTest2() {
		System.out.println("Test 2");
		
	}
	@Test(dependsOnMethods= "testngTestMiddle2")
	public void testngTestMiddle() {
		System.out.println("Test 3");
		
	}
	@Test
	public void testngTestMiddle2() {
		System.out.println("Test 4");
	}
	@Test(enabled=false)
	public void dependsOnMethodExample() {
		System.out.println("false enabled");
	}
	
	@Test(alwaysRun=true)
	public void alwaysEnabledExample() {
		System.out.println("ALways Enabled");
	}
	@Test(timeOut=-1)
	public void timeOutExample() {
		System.out.println("Time Out in Secs");
	}*/

	@Test(dataProvider = "giveData")
	public void getDataFromDataProvider(Object t,Object x) {
		System.out.println(t+" "+x);
	}
	
	@DataProvider
	public Object[][] giveData() {
		
									//row  //columns
		Object[][] someData= new Object[4][2];
		someData[0][0]="apple";
		someData[0][1]="apple second";
		someData[1][0]="mango";
		someData[1][1]="mango second";	
		someData[2][0]="cherry";
		someData[2][1]="cherry second";
		someData[3][0]="banana";
		someData[3][1]="banana second";	
		return someData;
		
	}
}
