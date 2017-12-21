/**
 *   File Name: NewsPageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 30, 2017
 *   
 */

package com.bbc.uiapibbc;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * NewsPageTest //ADDD (description of class)
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
public class NewsPageTest extends BaseTest {
		
	@Test(enabled = true, groups = {"news", "bat", "regression", "all"}, priority = 0)
	public void testNavigateToNewsVideoPage() {
		String expected = "Video Top Stories";
		newsPage = homePage.navigateToNewsPage();
		newsVideoPage = newsPage.navigateToNewsVideoPage();
	//	Helper.waiting2000();
		Assert.assertEquals(newsVideoPage.getNewsVideoPageLabel(), expected, "current Page Title doesn't match to News Video page");
	}

}
