/**
 *   File Name: BasePageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 8, 2017
 *   
 */

package com.bbc.uiapibbc;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * BasePageTest //ADDD (description of class)
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
public class BasePageTest extends TestBaseSetup{
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void verifyHomePage() {
		System.out.println("Home page test...");
		BasePage basePage = new BasePage(driver);
		Assert.assertEquals(basePage.navigateToHomePage() , "Home page title doesn't match");
	}

}