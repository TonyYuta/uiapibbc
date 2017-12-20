/**
 *   File Name: NewsPage.java<br>
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
 * NewsPage //ADDD (description of class)
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
public class NewsPage extends BasePage {
		
	private By videoRedTab = By.cssSelector("div:nth-child(2) > div > div:nth-child(1) > nav > ul > li:nth-child(2)> a > span:nth-child(1)");
	
	public NewsPage(WebDriver driver) {
		super(driver);
	}

	public NewsVideoPage navigateToNewsVideoPage() {
		Helper.waiting2000();
		WebElement videoRedTabElement = driver.findElement(videoRedTab);
		videoRedTabElement.click();
		Helper.waiting2000();
		return new NewsVideoPage(driver);
	}
	



}
