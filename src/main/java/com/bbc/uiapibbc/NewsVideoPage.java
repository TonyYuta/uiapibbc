/**
 *   File Name: NewsVideoPage.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 16, 2017
 *   
 */

package com.bbc.uiapibbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * NewsVideoPage //ADDD (description of class)
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
public class NewsVideoPage extends BasePage {
	
	WebDriver driver;
	private By newsVideoLabel = By.cssSelector("#page>div:nth-child(1)>div:nth-child(1)>div>nav>a>span");
	
	public NewsVideoPage(WebDriver driver) {
		super(driver);
	}
	
	public String getNewsVideoPageLabel(WebDriver driver) {
		return driver.findElement(newsVideoLabel).getText();
	}


	
}
