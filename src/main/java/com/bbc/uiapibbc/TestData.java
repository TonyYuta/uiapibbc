/**
 *   File Name: TestData.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 27, 2017
 *   
 */

package com.bbc.uiapibbc;

import static java.lang.System.getProperties;

import java.util.Properties;

/**
 * TestData //ADDD (description of class)
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
public class TestData {
	
	public static String invalidUserName01 	= "userName01";	 
	public static String invalidUserEmail01 = "userCIOEmail01@mail.com";	 
	public static String invalidPwd01 		= "invalidPassword";  

	public static String validUserName01 	= "yutakatony@mail.com"; 
	public static String validEmail01 		= "yutakatony@mail.com"; 
	public static String validPwd01 		= "vitoto";  

	public static String homePageUrl 		= "https://http://www.bbc.com/";

		
	//reading the properties file to launch the driver in the correct env with CLA 
    private static  Properties ENV_PROPERTIES = getProperties();
    //specifying the projects environment  
    public static  String ENV_NAME = (String) ENV_PROPERTIES.get("env");
    //specifying a browser 
    public static String BROWSER = (String) ENV_PROPERTIES.get("browser");
    //specifying the username 
    public static  String USERNAME = (String) ENV_PROPERTIES.get("username");
    //specifying the password 
    public static  String PASSWORD = (String) ENV_PROPERTIES.get("password");
    //specifying the secret answer 
    public static  String SECRET = (String) ENV_PROPERTIES.get("secret");

	
}
