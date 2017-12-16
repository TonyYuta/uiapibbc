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
public class HomePage {
	
	//static WebElement we;
	private WebDriver driver;
		
	//cssSelector
	public String dateLabel = "#page > section > h2";
	
	//xpath
	//public String dateLabel = "//*[@id='page']/section[1]/h2";
	//public String dateLabel = "//*[@id='page']/section[1]/h2/text()";
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	String currentDate() {
		String result = "";	
		String removeLeadingText = "Welcome to BBC.com\n";
		
// System.out.println("===debug==driver.findElement(By.xpath(dateLabel)).getText(): " + driver.findElement(By.xpath(dateLabel)).getText());
 //System.out.println("===debug==driver.findElement(By.cssSelector(dateLabel)).getText(): " + driver.findElement(By.cssSelector(dateLabel)).getText());
		result = driver.findElement(By.cssSelector(dateLabel)).getText().replaceAll(removeLeadingText, "");
	//	result = driver.findElement(By.cssSelector(dateLabel)).getText().replace(removeNewLine, "");
 	//result = driver.findElement(By.xpath(dateLabel)).getText(); 
 	//result = result.replaceAll(removeNewLine, "");
 	
//	result = driver.findElement(By.xpath(dateLabel)).getText();
	return result;
	}
	
	

}
