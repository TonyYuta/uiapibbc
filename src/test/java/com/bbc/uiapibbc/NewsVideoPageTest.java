/**
 *   File Name: NewsVideoPageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 18, 2017
 *   
 */

package com.bbc.uiapibbc;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * NewsVideoPageTest //ADDD (description of class)
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
public class NewsVideoPageTest extends BaseTest {
		
	@Test(enabled = false, groups = {"news", "newsvideo", "video", "regression", "all"}, priority = 0)
	public void testSecondOfMostWatchedVideo() {
		String expected = "Video Top Stories";
		newsPage = homePage.navigateToNewsPage();
		newsVideoPage = newsPage.navigateToNewsVideoPage();
		Helper.waiting2000();
		Assert.assertEquals(newsVideoPage.getNewsVideoPageLabel(), expected, "current Page Title doesn't match to News Video page");
	}

	@Test(enabled = true, groups = {"news", "newsvideo", "video", "regression", "all"}, priority = 0)
	public void testBigNumberMostWatchedVideo() {
		byte expected = 5;
		byte slot = 5;
		newsPage = homePage.navigateToNewsPage();
		newsVideoPage = newsPage.navigateToNewsVideoPage();
		Helper.waiting2000();
		Assert.assertEquals(newsVideoPage.mostWatchedVideo(slot), expected, "big number of most watched video doesn't match to slot number");
	}

	
}


