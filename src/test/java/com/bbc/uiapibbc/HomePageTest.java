package com.bbc.uiapibbc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BasePageTest {
	
	
	@BeforeClass(enabled = true, alwaysRun = true)
	public void beforeClassSetUp() {
	}
	
	@AfterClass(enabled = true, alwaysRun = true)
	public void afterClassTearDown() {
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeTestSetUp() {
		
	}
	
	@AfterMethod(enabled = true, alwaysRun = true)
	public void afterTest() {
		
	}

	@Test(enabled = false, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {

	}
 
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateHomePage() {
		String expected = "www.bbc.com/";
		String actual = "www.bbc.com/";
		actual = basePage.navigateToHomePage();
		AssertJUnit.assertEquals(actual, expected, "URI doesn't match to Home page");
	}
	
	

	

	
	

	
	
	
}
