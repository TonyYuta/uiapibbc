/**
 *   File Name: BaseTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 8, 2017
 *   
 */

package com.bbc.uiapibbc;

import java.util.ArrayList;
import java.util.HashSet;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * BaseTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class BaseTest {
	
	public WebDriver driver;
	
	HomePage homePage;
	NewsPage newsPage;
	NewsVideoPage newsVideoPage;
	SportPage sportPage;
	SportFootballPage sportFootballPage;
	WeatherPage weatherPage;
	
	ArrayList<String> al;
	HashSet<String> hs;
	
	/**
	 * @param browser
	 * @param appURL
	 */
	@Parameters({ "browser", "appURL", "groups" })
	@BeforeClass(alwaysRun = true)				
	public void initializeTestBaseSetup(String browser, String appURL, String groups) {
		try {
			DriverFactory.setDriver(browser, appURL, groups);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
		driver = DriverFactory.getDriver();
		
		homePage = new HomePage(driver);
		newsPage = new NewsPage(driver);	
		newsVideoPage = new NewsVideoPage(driver);
		sportPage = new SportPage(driver);
		sportFootballPage = new SportFootballPage(driver);
		weatherPage = new WeatherPage(driver);

	}
	
	@AfterClass(enabled = true, alwaysRun = true)
	public void afterClassTearDown() {
		//driver.close();
		driver.quit();
		}	
	

	
	

}