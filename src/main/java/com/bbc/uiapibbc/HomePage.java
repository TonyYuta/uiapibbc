/**
 *   File Name: HomePage.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 30, 2017
 *   
 */
package com.bbc.uiapibbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * HomePage //ADDD (description of class)
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
public class HomePage extends BasePage {
	
	/**
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}
		
	public static String homePageUrl = "http://www.bbc.com/";

	//cssSelector
	private String homePageTab = "#orb-nav-links > ul > li.orb-nav-homedotcom.orb-w > a";
	private String welcomeToBbComLabel = "#page > section.module.module--date.module--highlight > h2 > span";
	private By newsHeaderTab = By.cssSelector("#orb-nav-links > ul > li.orb-nav-newsdotcom.orb-w > a");		
	private String dateLabel = "#page > section > h2";
	private By sportHeaderTab = By.cssSelector("#orb-nav-links > ul > li:nth-child(3) > a");
	private By homeHeaderTabSelected = By.cssSelector("div>div>nav>ul:nth-child(1)>li>a>span:nth-child(2)"); //needs getText()
	private By weatherHeaderTab = By.cssSelector("nav>div>ul>li:nth-child(4)>a");
	
	//xpath
	
	public HomePage navigateToHomePage() {
		driver.navigate().to(homePageUrl);	
		return new HomePage(driver);
	}	
	
	String currentDate() {
		String removeLeadingText = "Welcome to BBC.com\n";
		return driver.findElement(By.cssSelector(dateLabel)).getText().replaceAll(removeLeadingText, "");
	}	
	
	public NewsPage navigateToNewsPage() {
	//	Helper.waiting2000();
		WebElement newsHeaderTabElement = driver.findElement(newsHeaderTab);
		newsHeaderTabElement.click();
	//	Helper.waiting2000();
		return new NewsPage(driver);
	}
	
	public SportPage navigateToSportPage() {
	//	Helper.waiting2000();
		we = driver.findElement(sportHeaderTab);
		we.click();
	//	Helper.waiting2000();
		return new SportPage(driver);
	}
	
	public WeatherPage navigateToWeatherPage() {
	//	Helper.waiting2000();
		we = driver.findElement(weatherHeaderTab);
		we.click();
	//	Helper.waiting2000();
		return new WeatherPage(driver);
	}

	
	

}
