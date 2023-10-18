package org.testng.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;
	Properties pr;
	
	public LogoutPage(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void logout() throws InterruptedException {
		//logout code
		driver.findElement(By.xpath(pr.getProperty("avtarBtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("logoutBtn"))).click();
		Thread.sleep(3000);
	}
}
