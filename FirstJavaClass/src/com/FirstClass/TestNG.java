package com.FirstClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	//before test
	//after test
	//dependsOn
	//before method
	//after method
	//isenabled
	//timeout
	//dataprovider
	//groups
	

	@BeforeMethod
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

}
