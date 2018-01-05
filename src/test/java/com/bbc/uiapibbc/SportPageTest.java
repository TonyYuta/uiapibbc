/**
 *   File Name: SportPageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 30, 2017
 *   
 */

package com.bbc.uiapibbc;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * SportPageTest //ADDD (description of class)
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
public class SportPageTest extends BaseTest {

	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testIsPresentMoreFromBbcSportLabel() {
		String expected = "More From BBC Sport";
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.moreFromBbcSportLabel(), expected, "current Label doesn't match to More From BBC Sport");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testIs8SportSectionsAreDifferent() {
		String expected = "Football";
		int slot = 1;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}
	
}
