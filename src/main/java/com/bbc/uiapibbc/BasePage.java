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

	//static WebDriver driver = TestBaseSetup.getDriver(TestData.BROWSER);	
	static WebElement we;
	
	//WebDriver driver = TestBaseSetup.getDriver();
	WebDriver driver;
		
	public static String homePageUrl = "http://www.bbc.com/";
	
	//cssSelector
	public String homePageTab = "#orb-nav-links > ul > li.orb-nav-homedotcom.orb-w > a";
	//public String welcomeToBbComLabel = ".module.module--date.module--highlight > .module__title";
	public String welcomeToBbComLabel = "#page > section.module.module--date.module--highlight > h2 > span";
	
	
	// id

	
	// className
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String navigateToHomePage() {
		String result = "";			
		//driver = TestBaseSetup.getDriver(TestData.BROWSER);	
//System.out.println("--------debug8---navigateToHomePage(): ");	
//System.out.println("--------debug9-----driver: " + driver.toString());	
		System.out.println("before driver access");
		driver.navigate().to(homePageUrl);	
//System.out.println("--------debug10---navigateToHomePage()----------");	

//		we = driver.findElement(By.cssSelector(homePageTab));
//		we.click();
		System.out.println("before find element");
		we = driver.findElement(By.cssSelector(welcomeToBbComLabel));
		System.out.println("before get text");
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
