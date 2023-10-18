package org.testng.TestScript;

import org.testng.Base.BaseClass;
import org.testng.Pages.HomePage;
import org.testng.Pages.LoginPage;
import org.testng.Pages.LogoutPage;
import org.testng.annotations.Test;

public class TC3 extends BaseClass{
	
	@Test
	public void testSubscription() throws InterruptedException {
		LoginPage login =  new LoginPage(driver, pr);
		login.login();
		
		HomePage home = new HomePage(driver, pr);
		home.clickOnSubscriptions();
		
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.logout();
	}
}
