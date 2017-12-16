package com.bbc.uiapibbc;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest extends TestBaseSetup {
	
	private WebDriver driver;
	private BasePage basePage;
	private HomePage homePage;

	
	@BeforeClass(enabled = true, alwaysRun = true)
	public void beforeClassSetUp() {
		driver = getDriver();
	}
	
	@AfterClass(enabled = true, alwaysRun = true)
	public void afterClassTearDown() {
		
	}
	
	
	

	@Test(enabled = false, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
	}
 
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateHomePage() {
		basePage = new BasePage(driver);
		String expected = "Welcome to BBC.com";
		String actual = "";
		actual = basePage.navigateToHomePage();
		Helper.waiting2000();
		Assert.assertEquals(actual, expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testCurrentDate() {
		String expected = Helper.currentWeekdayDayOfMonthMonth();
		String actual = "";
		String home = basePage.navigateToHomePage();
		Helper.waiting2000();
		actual = homePage.currentDate();
		Assert.assertEquals(actual, expected, "current date doesn't match to date on Home page");
	}	
	

	

	

	
	

	
	
	
}
