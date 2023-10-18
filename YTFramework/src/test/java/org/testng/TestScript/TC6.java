package org.testng.TestScript;

import org.testng.Base.BaseClass;
import org.testng.Pages.LoginPage;
import org.testng.Pages.LogoutPage;
import org.testng.Pages.VideoPlayPage;
import org.testng.annotations.Test;

public class TC6 extends BaseClass{
	
	@Test
	public void testAddComment() throws InterruptedException {
	
		LoginPage login =  new LoginPage(driver, pr);
		login.login();
		
		VideoPlayPage video = new VideoPlayPage(driver, pr);
		video.clickOnVideo();
		video.clickOnCommentBtn();
		
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.logout();
		

		

	}
}
