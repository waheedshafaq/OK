package com.TestNG2;

import org.testng.annotations.Test;

import com.GenericLibrary2.GenericClass2;

public class TestNG2 extends GenericClass2 {
	
	TestNG2 test;
	
	@Test
	public void runsetup() {
		test = new TestNG2();
		test.openBrowser();
		test.getURL();
		test.MaximizeBrowser();
		test.getUserName();
		test.getPassword();
		test.getLogIn();
		
				
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
