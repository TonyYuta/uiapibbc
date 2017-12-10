package com.bbc.uiapibbc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/** @author Yutaka */

/** This class will be used to generate a WebDriver depending on the parameters from the user
 * it will contain specefications for the particular drivers 
 */

public class DriverFactory {

	// private constructor does not allow to create class into object 
	//DriverFactory() {}//constructor
	
	// defining timeouts 
	static final int IMPLICIT_WAIT = 7;
	static final int SCRIPT_LOAD_WAIT = 7;
	//getDriver will return the driverType user input 
	// it is synchronized for multi Threading safety
	public static synchronized WebDriver getDriver(String driverType) {
	// beautifying the input
		
// temporary for debug
//driverType = "chrome";
//driverType = "firefox";		
		
	driverType = driverType.trim().toLowerCase();
	
	DesiredCapabilities capabilities;
		  
	WebDriver driver;
	switch (driverType) {
		case "chrome":
		    System.setProperty("webdriver.chrome.driver", "/Library/chromedriver");
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/resources/webdrivers/mac/chromedriver");
			capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("disable-extensions");
			options.addArguments("disable-infobars");
			options.addArguments("start-maximized");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			driver.manage().window().maximize();
			break;
		
		case "firefox":
			//System.setProperty("webdriver.gecko.driver","/Library/geckodriver");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/resources/webdrivers/mac/geckodriver");
		    capabilities = DesiredCapabilities.firefox();
		    capabilities.setCapability("marionette", true);
		    driver = new FirefoxDriver(capabilities);
//		    driver.manage().window().maximize();
			driver.manage().window().setSize(new Dimension(1920, 1080));

		   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			break;
			
			
			
	/*		
		case "phantom":
			//PhanthomJS driver 
			//System.setProperty("phantomjs.binary.path", System.getProperty("user.dir")+"/Library/phantomjs");
			System.setProperty("phantomjs.binary.path", System.getProperty("user.dir")+"/resources/webdrivers/mac/phantomjs");
		//	/cioprod/resources/webdrivers/mac/phantomjs
	        
			//adding phantom capability to browser https websites 
			DesiredCapabilities phantomCaps = DesiredCapabilities.phantomjs(); // or new DesiredCapabilities();
			phantomCaps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, 
					new String[] {"--ssl-protocol=tlsv1","--web-security=false", "--ignore-ssl-errors=true"});			
			driver = new PhantomJSDriver(phantomCaps);
			driver.manage().window().setSize(new Dimension(1920, 1080));
	        break;
		*/
			
			
			
			
		default:
			String msg = "Unknown driver type";
			throw new IllegalArgumentException(msg);
		} // driver type switch case

		WebDriver.Timeouts timeouts = driver.manage().timeouts();
		timeouts.implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		timeouts.setScriptTimeout(SCRIPT_LOAD_WAIT, TimeUnit.SECONDS);

		addShutDownHook(driver);
		return driver;
	} // getDriver method
	  	  
	  // close will be used to close driver browser window 
		//public static synchronized void closeBrowser(WebDriver driver) {
		public static void closeBrowser(WebDriver driver) {
			if (driver != null) {
				try {
					driver.getCurrentUrl();
					driver.close();
					//driver.quit();
					System.out.printf("\n Yutaka: driver instance closed successfully =)\n");
				} catch (Throwable e) {
					System.out.printf("\n\n Yutaka: an exception was caught %s\n\n",e);
				} //try catch statement
			} // if statement
		} // close method
		
		  // close will be used to quit driver browser 
			public static void quitBrowser(WebDriver driver) {
				if (driver != null) {
					try {
						driver.getCurrentUrl();
						driver.close();
						driver.quit();
						System.out.printf("\n Yutaka: driver instance closed successfully =)\n");
					} catch (Throwable e) {
						System.out.printf("\n Yutaka: an exception was caught %s\n",e);
					} //try catch statement
				} // if statement
			} // close method

			//addShutDownHook will be used to shut down all Threads of driver 
		private static void addShutDownHook(final WebDriver driver) {
			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
//					close(driver);  // Disabling close - stops shutdownhook exception 
				} //run
				
			});
		}// addShutDownHook method
	
		
} //class
