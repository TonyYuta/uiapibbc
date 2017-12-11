/**
 *   File Name: BaseTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 8, 2017
 *   
 */

package com.bbc.uiapibbc;

import org.openqa.selenium.WebDriver;

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
	
	static WebDriver driver;
	
	BasePage basePage = new BasePage();
	HomePage homePage = new HomePage();
	NewsPage newsPage = new NewsPage();
	SignInPage signInPage = new SignInPage();
	SportPage sportPage = new SportPage();
	WeatherPage weatherPage = new WeatherPage();
	

}
