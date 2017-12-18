/**
 *   File Name: BaseTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 8, 2017
 *   
 */

package com.bbc.uiapibbc;

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
	
	/**
	 * @param browserType
	 * @param appURL
	 */
	@Parameters({ "browserType", "appURL" })
	@BeforeClass(enabled = true, alwaysRun = true)				
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			DriverFactory.setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
		driver = DriverFactory.getDriver();
		
		homePage = new HomePage(driver);
		newsPage = new NewsPage(driver);	
		newsVideoPage = new NewsVideoPage(driver);


	}
	
	@AfterClass(enabled = true, alwaysRun = true)
	public void afterClassTearDown() {
		//driver.close();
		driver.quit();
		}	
	


}