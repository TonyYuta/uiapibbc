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
	
	private By newsVideoLabel = By.cssSelector("#page>div:nth-child(1)>div:nth-child(1)>div>nav>a>span");
		
	String mostWatchetBigNumberLocatorPart1 = "#page>div.vxp-mostpopular-component.vxp-component--post-loaded>div>div>div>div>div>ul>li:nth-child(";
	String mostWatchetBigNumberLocatorPart2 = ")>a>span.vxp-mostpop__list-item-rank";
	
	private By mostWatchetBigNumber;

	public NewsVideoPage(WebDriver driver) {
		super(driver);
	}
	
	public String getNewsVideoPageLabel() {
		return driver.findElement(newsVideoLabel).getText();
	}
		
	public int mostWatchedVideo(byte slot) {
		byte bigNumber = 0;
		mostWatchetBigNumber = By.cssSelector(mostWatchetBigNumberLocatorPart1 + slot + mostWatchetBigNumberLocatorPart2);
		bigNumber = (byte) Integer.parseInt(driver.findElement(mostWatchetBigNumber).getText());
		return bigNumber;
	}

	
}
