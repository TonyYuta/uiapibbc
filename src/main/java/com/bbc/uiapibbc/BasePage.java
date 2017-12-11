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

	
	static WebDriver driver;
	static WebElement we;
	
	//driver = DriverFactory.getDriver(TestData.BROWSER);
	
	public static String homePageUrl = "http://www.bbc.com/";
	
	//cssSelector
	public String homePageTab = "#orb-nav-links > ul > li.orb-nav-homedotcom.orb-w > a";
	//public String welcomeToBbComLabel = ".module.module--date.module--highlight > .module__title";
	public String welcomeToBbComLabel = "#page > section.module.module--date.module--highlight > h2 > span";
	
	
	// id

	
	// className
	
/*	
	BasePage() {
		driver = DriverFactory.getDriver(TestData.BROWSER);	
System.out.println("--------debug6---BasePage()----------");
	}
*/
	
	
	/*
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	*/
	
	/*
	@BeforeClass(alwaysRun = true)
	void driverInit() {
		driver = DriverFactory.getDriver(TestData.BROWSER);	
System.out.println("--------debug8---BasePage()----------");
	}
	*/
		
	public String navigateToHomePage() {
		String result = "";			
		driver = DriverFactory.getDriver(TestData.BROWSER);	
		driver.navigate().to(homePageUrl);		
		we = driver.findElement(By.cssSelector(homePageTab));
		we.click();
		we = driver.findElement(By.cssSelector(welcomeToBbComLabel));
		return result = we.getText();
		//return result = we.toString();
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