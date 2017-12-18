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
	
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testCurrentDate() {
		//BasePage basePage = new BasePage(driver); 
		//HomePage homePage = new HomePage(driver); 
		//homePage.navigateToHomePage(driver);
		//homePage.navigateToHomePage(driver);
		//Helper.waiting2000();
		System.out.println("=== debug 1 === homePage.currentDate(): " + homePage.currentDate());
		Assert.assertEquals(homePage.currentDate(), Helper.currentWeekdayDayOfMonthMonth(), "current date doesn't match to date on Home page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateHomePage() {
		String expected = "BBC - Homepage";
		homePage.navigateToHomePage(driver);
		Helper.waiting2000();
		Assert.assertEquals(homePage.currentPageTitle(driver), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"news", "regression", "all"}, priority = 0)
	public void testNavigateToNewsPage() {
		String expected = "BBC - Homepage";
		Helper.waiting2000();
		Assert.assertEquals(homePage.currentPageTitle(driver), expected, "current Page Title doesn't match to News page");
	}
	
	

	
		
	
}
