package com.bbc.uiapibbc;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/** @author Yutaka */

/** This class will be used to generate a WebDriver depending on the parameters from the user
 * it will contain specefications for the particular drivers 
 */

public class TestBaseSetup {

	private WebDriver driver;
	DesiredCapabilities capabilities;
	static String driverPath = "/uiapibbc/resources/webdrivers/mac/";

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(String browserType, String appURL) {
		switch (browserType) {
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
				driver.get(appURL);
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/resources/webdrivers/mac/geckodriver");
		    capabilities = DesiredCapabilities.firefox();
		    capabilities.setCapability("marionette", true);
		    driver = new FirefoxDriver(capabilities);
//		    driver.manage().window().maximize();
			driver.manage().window().setSize(new Dimension(1920, 1080));
			driver.get(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
	