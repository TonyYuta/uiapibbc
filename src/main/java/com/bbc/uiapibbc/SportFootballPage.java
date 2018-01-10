/**
 *   File Name: SportFootballPage.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 21, 2017
 *   
 */

package com.bbc.uiapibbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * SportFootballPage //ADDD (description of class)
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
public class SportFootballPage extends BasePage{
	
	WebElement we;
	
	// cssSelector
	private By footballTablesLabel = By.cssSelector("div:nth-child(3)>div>div>h2");
	private By premierLeagueBtn = By.cssSelector("#u2753239788580686 ul>li>button");
	private By firstTeamPremierLegueNumber = By.cssSelector("#u014977014623582363 > div > div:nth-child(3) > div > table > tbody > tr:nth-child(1) > td.gs-o-table__cell.gs-o-table__cell--bold.gs-o-table__cell--right.gel-pr\2b");
	private By lastTeamPremierLegueNumber = By.cssSelector("tbody.gel-long-primer > tr:nth-child(23) > td:first-child");
	private By firstTeamPremierLegueScore = By.cssSelector("#u14825823856517673 > div > div:nth-child(3) > div > table > tbody > tr:nth-child(1) > td.gs-o-table__cell.gs-o-table__cell--bold.gs-o-table__cell--right.gel-pr\2b");
	private By lastTeamPremierLegueScore = By.cssSelector("#u14825823856517673 > div > div:nth-child(3) > div > table > tbody > tr:nth-child(23) > td.gs-o-table__cell.gs-o-table__cell--bold.gs-o-table__cell--right.gel-pr\2b");
	
	public SportFootballPage(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * 

	 */
	
	
	String isFootballTablesPresent() {
		we = driver.findElement(footballTablesLabel);
		return we.getText();
	}
	
	String isPremierLeaguePresent() {
		we = driver.findElement(premierLeagueBtn);
		return we.getText();
	}
	
	int numberFirstTeamPremierLeague() {
		we = driver.findElement(firstTeamPremierLegueNumber);
		return Integer.parseInt(we.getText());
	}

	int numberLastTeamPremierLeague() {
		we = driver.findElement(lastTeamPremierLegueNumber);
		return Integer.parseInt(we.getText());
	}

	int ptsFirstteamPremierLeague() {
		we = driver.findElement(firstTeamPremierLegueScore);
		return Integer.parseInt(we.getText());
	}

	int ptsLastTeamPremierLeague() {
		we = driver.findElement(lastTeamPremierLegueScore);
		return Integer.parseInt(we.getText());
	}


	
}
