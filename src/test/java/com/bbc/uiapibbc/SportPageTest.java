/**
 *   File Name: SportPageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 30, 2017
 *   
 */

package com.bbc.uiapibbc;

import java.util.ArrayList;
import java.util.HashSet;

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
		String expected = "More from BBC Sport";
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.moreFromBbcSportLabel(), expected, "current Label doesn't match to More From BBC Sport");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testSportSection01() {
		String expected = "Football";
		int slot = 1;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}

	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testSportSection02() {
		String expected = "Formula 1";
		int slot = 2;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testSportSection03() {
		String expected = "Cricket";
		int slot = 3;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testSportSection04() {
		String expected = "Rugby Union";
		int slot = 4;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testSportSection05() {
		String expected = "Rugby League";
		int slot = 5;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testSportSection06() {
		String expected = "Tennis";
		int slot = 6;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testSportSection07() {
		String expected = "Golf";
		int slot = 7;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testSportSection08() {
		String expected = "Athletics";
		int slot = 8;
		sportPage = homePage.navigateToSportPage();
		Assert.assertEquals(sportPage.sportSectionName(slot), expected, "current Sport Section doesn't match to expected");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "sport", "bat", "regression", "all"}, priority = 1)
	public void testIsSportSectionsAreDifferent() {
		al = new ArrayList<>();
		hs = new HashSet<>();
		int slot;
		
		for(slot=1; slot<9; ++slot) {	
			sportPage = homePage.navigateToSportPage();
			al.add(sportPage.sportSectionName(slot));
			hs.add(sportPage.sportSectionName(slot));		
		}
		Assert.assertTrue(al.size() == hs.size(), "current Sport Sections contains duplicates");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "dup", "sport", "bat", "regression", "all"}, priority = 1)
	public void testDupCode01() {
		int res;
		res = sportPage.dupCodeQQQ04();
		res = sportPage.dupCodeQQQ04();
		res = sportPage.dupCodeQQQ04();
		
		Assert.assertTrue(res == 30, "qqq dup code");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "dup", "sport", "bat", "regression", "all"}, priority = 1)
	public void testDupCode02() {
		int res;
		res = sportPage.dupCodeQQQ04();
		res = sportPage.dupCodeQQQ04();
		res = sportPage.dupCodeQQQ04();
		
		Assert.assertTrue(res == 30, "qqq dup code");	
	}
	
	@Test(enabled = true, groups = {"SportPageTestClass", "dup", "sport", "bat", "regression", "all"}, priority = 1)
	public void testDupCode03() {
		int res;
		res = sportPage.dupCodeQQQ04();
		res = sportPage.dupCodeQQQ04();
		res = sportPage.dupCodeQQQ04();
		
		Assert.assertTrue(res == 30, "qqq dup code");	
	}
	
	
}
