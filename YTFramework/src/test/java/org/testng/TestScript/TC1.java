package org.testng.TestScript;

import java.io.IOException;

import org.testng.Base.BaseClass;
import org.testng.Pages.HomePage;
import org.testng.Pages.LoginPage;
import org.testng.Pages.LogoutPage;
import org.testng.annotations.Test;
import org.testng.utilities.CaptureScreenshot;
import org.testng.utilities.LogCapture;

public class TC1 extends BaseClass{
	
	@Test
	public void testTrending() throws InterruptedException, IOException {

		LoginPage login =  new LoginPage(driver, pr);
		login.login();
		
		LogCapture.takeLogs("TC1", "Logged in successfully!");
		CaptureScreenshot.takeScreenshot(driver);
		
		HomePage home = new HomePage(driver, pr);
		home.clickOnTrending();
		LogCapture.takeLogs("TC1", "Clicked on trending button successfully!");
		
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.logout();
		LogCapture.takeLogs("TC1", "Logged out successfully!");

		
	}
}
