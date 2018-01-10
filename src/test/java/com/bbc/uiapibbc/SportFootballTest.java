/**
 *   File Name: SportFootballTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 9, 2018
 *   
 */

package com.bbc.uiapibbc;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * SportFootballTest //ADDD (description of class)
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
public class SportFootballTest extends BaseTest {
	
	
	/*
	

	testIsPtsFirstTeamPremierLeagueHierThanLast
*/
	
	@Test(enabled = true, groups = {"SportFootballPageTestClass", "sport", "sportfootball", "bat", "regression", "all"}, priority = 2)
	public void testIsFootballTablesPresent() {
		String expected = "Football Tables";
		homePage.navigateToSportPage();
		sportPage.navigateToSportFootballPage();
		Assert.assertEquals(sportFootballPage.isFootballTablesPresent(), expected, "marker label 'Football Tables' is missing");
	}

	@Test(enabled = true, groups = {"SportFootballPageTestClass", "sport", "premier", "sportfootball", "bat", "regression", "all"}, priority = 2)
	public void testIsPremierLeaguePresent() {
		String expected = "Premier League";
		homePage.navigateToSportPage();
		sportPage.navigateToSportFootballPage();
		Assert.assertEquals(sportFootballPage.isPremierLeaguePresent(), expected, "marker label 'Premier League' is missing");
	}
	
	@Test(enabled = true, groups = {"SportFootballPageTestClass", "sport", "premier", "sportfootball", "regression", "all"}, priority = 2)
	public void testQtyTeamsPremierLegue() {
		int expected = 20;
		homePage.navigateToSportPage();
		sportPage.navigateToSportFootballPage();
		Assert.assertEquals(sportFootballPage.numberLastTeamPremierLeague() - sportFootballPage.numberFirstTeamPremierLeague(), expected, "qty premier league doesn't match to expectes");
	}
	
	@Test(enabled = true, groups = {"SportFootballPageTestClass", "sport", "premier", "sportfootball", "all"}, priority = 2)
	public void testIsPtsFirstTeamPremierLeagueHierThanLast() {
		homePage.navigateToSportPage();
		sportPage.navigateToSportFootballPage();
		Assert.assertTrue(sportFootballPage.ptsLastTeamPremierLeague() - sportFootballPage.ptsFirstteamPremierLeague() > 0, "Points first team from premier league less than the last team");
	}
	
	
}
