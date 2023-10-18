package org.testng.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Base.BaseClass;
import org.testng.Pages.HomePage;
import org.testng.Pages.LoginPage;
import org.testng.Pages.LogoutPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC8 extends BaseClass{
	@Test
	public void testLibrary() throws InterruptedException {
		LoginPage login =  new LoginPage(driver, pr);
		login.login();
		
		HomePage home = new HomePage(driver, pr);
		home.clickOnSubscriptions();
		
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.logout();
		
	}
}
