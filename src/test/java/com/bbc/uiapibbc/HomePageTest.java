package com.bbc.uiapibbc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	//private WebDriver driver;
	//private BasePage basePage;
	//private HomePage homePage;
	//private NewsPage newsPage;
	
	/*
	 *  TODO:
	 *  1. Stop using BasePage - it is only for inheritance. Initial page for you 
	 *  	is probably HomePage. When you go to the url in the beginning of the test, 
	 *  	you don't even need to use the method "navigateToHomePage" because it is 
	 *  	the initial page anyway.
	 *  2. navigateToHomePage method should not be called from HomePage class. 
	 *  	It should be called from the class of the page that actually has the 
	 *  	ability to navigate to the HomePage (for example, NewsPage, etc.).
	 *  3. I commented out all objects in the beginning of this class (all pages) 
	 *  	because you do not initialize them there. To avoid errors, for now, 
	 *  	create them when you actually use them.
	 *  4. No need to create driver here because it is created in the BaseTest, 
	 *  	and you inherit it from there.
	 *  5. Every test class that you will use, you need to inherit the BaseTest just like here
	 */
	
	
	@Test(enabled = true, groups = {"HomePageTestClass", "home", "regression", "all"}, priority = 0)
	public void testCurrentDate() {
		Assert.assertEquals(homePage.currentDate(), Helper.currentWeekdayDayOfMonthMonth(), "current date doesn't match to date on Home page");
	}
	
	@Test(enabled = true, groups = {"HomePageTestClass",  "bat", "regression", "all"}, priority = 0)
	public void testNavigateHomePage() {
		String expected = "BBC - Homepage";
		homePage.navigateToHomePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"HomePageTestClass", "home", "news", "bat", "regression", "all"}, priority = 0)
	public void testNavigateToNewsPage() {
		String expected = "BBC - Homepage";
		Assert.assertEquals(homePage.currentPageTitle(), expected, "current Page Title doesn't match to News page");
	}
	
	@Test(enabled = true, groups = {"sport", "bat", "HomePageTestClass", "regression", "all"}, priority = 0)
	public void testNavigateToSportPage() {
		String expected = "Home - BBC Sport";
		homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.currentPageTitle(), expected, "current Page Title doesn't match to Sport page");
	}
	
	@Test(enabled = true, groups = {"weather", "bat", "HomePageTestClass", "regression", "all"}, priority = 0)
	public void testNavigateToWeatherPage() {
		String expected = "BBC Weather";
		homePage.navigateToWeatherPage();
		Assert.assertEquals(weatherPage.currentPageTitle(), expected, "current Page Title doesn't match to Weather page");
	}
	
	// copy -- temporary
	@Test(enabled = true, groups = {"weather", "bat", "HomePageTestClass", "regression", "all"}, priority = 0)
	public void testNavigateToWeatherPageCopy1() {
		String expected = "BBC Weather";
		homePage.navigateToWeatherPage();
		Assert.assertEquals(weatherPage.currentPageTitle(), expected, "current Page Title doesn't match to Weather page");
	}
	
	// copy -- temporary
	@Test(enabled = true, groups = {"weather", "bat", "HomePageTestClass", "regression", "all"}, priority = 0)
	public void testNavigateToWeatherPageCopy2() {
		String expected = "BBC Weather";
		homePage.navigateToWeatherPage();
		Assert.assertEquals(weatherPage.currentPageTitle(), expected, "current Page Title doesn't match to Weather page");
	}
	
	

	
		
	
}
