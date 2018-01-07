/**
 *   File Name: SportPage.java<br>
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
 * SportPage //ADDD (description of class)
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
public class SportPage extends BasePage {
	
	WebElement we;
	
	// id
	private By moreFromBbcSportLabel = By.id("more-from-title");
	
	// cssSelector
	String moreFromBbcSportSectionNPart1 = "#more-from > div > div > div:nth-child(";
	String moreFromBbcSportSectionNPart2 = ") > article > div.aintree_article-body > a";
//	private By moreFromBbcSportSectionN;
	
	public SportPage(WebDriver driver) {
		super(driver);
	}
	
	String moreFromBbcSportLabel() {
		we = driver.findElement(moreFromBbcSportLabel);
		return we.getText();
	}

	String sportSectionName(int slot) {
		//we = (WebElement) By.cssSelector(moreFromBbcSportSectionNPart1 + slot + moreFromBbcSportSectionNPart2);
		we = driver.findElement(By.cssSelector(moreFromBbcSportSectionNPart1 + slot + moreFromBbcSportSectionNPart2));
		return we.getText();
	}
	
}
