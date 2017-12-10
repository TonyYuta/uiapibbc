/**
 *   File Name: BasePage.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 30, 2017
 *   
 */

package com.bbc.uiapibbc;

//import com.bbc.uiapibbc.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




/**
 * BasePage //ADDD (description of class)
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
public class BasePage {

	
	WebDriver driver;
	WebElement we;
	
	//cssSelector
	public String homePageTab = "#orb-nav-links > ul > li.orb-nav-homedotcom.orb-w > a";
	public String welcomeToBbComLabel = ".module.module--date.module--highlight > .module__title";
	
	
	// id

	
	// className
	
	BasePage() {
		driver = DriverFactory.getDriver(TestData.BROWSER);	
	}
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String navigateToHomePage() {
System.out.println("-----debug1-------------");
		String result = "Welcome to BBC.com";	
System.out.println("-----debug2-------------");
		we = driver.findElement(By.cssSelector(homePageTab));
System.out.println("-----debug3-------------");
		we.click();
System.out.println("-----debug4-------------");
		we = driver.findElement(By.cssSelector(welcomeToBbComLabel));
System.out.println("-----debug5-------------");
		return result = we.getText();
	}
//	
//	public String logOut() {
//		String result = "Log Out";
//		action = new Actions(driver);		
//		we = driver.findElement(By.cssSelector(labelMyAccount));
//		action.moveToElement(we).build().perform();
//		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
//		driver.findElement(By.cssSelector(logOutBtn)).click();
//		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
//		return result;
//	}
//		
//	public String navigateToAllProductsPage() {
//		action = new Actions(driver);
//		we = driver.findElement(By.cssSelector(productsTab));
//		action.moveToElement(we).build().perform();
//		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
//		driver.findElement(By.cssSelector(allProductsTab)).click();
//		return driver.getCurrentUrl();
//	}
//	

	

	
}
