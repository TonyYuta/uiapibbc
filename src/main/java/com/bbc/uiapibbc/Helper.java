/**
 *   File Name: Helper.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 11, 2017
 *   
 */

package com.bbc.uiapibbc;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Helper //ADDD (description of class)
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
public class Helper {
	
	static String currentWeekDay() {
		 
        Date now = new Date();
 
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        //System.out.println(simpleDateformat.format(now));
        return simpleDateformat.format(now);
        }
	
	static String currentWeekdayDayOfMonthMonth() {
		Date now = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE, dd MMMM"); // Weekday, dayOfMonth Month
        //System.out.println(simpleDateformat.format(now));
        return simpleDateformat.format(now);
	}
	
	static void waiting500() {
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	
	static void waiting2000() {
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	
	static void waiting5000() {
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	
	static void waiting1000() {
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	
	static void waiting1500() {
		try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
		}

	

}
