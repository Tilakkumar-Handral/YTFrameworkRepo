package org.testng.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	Properties pr;
	
	public HomePage(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void clickOnTrending() throws InterruptedException {
		//code to click on trending videos
		driver.findElement(By.xpath(pr.getProperty("trendingBtn"))).click();
		Thread.sleep(3000);
	}
	
	public void clickOnHistory() throws InterruptedException {
		//code to click on history
		driver.findElement(By.xpath(pr.getProperty("historyBtn"))).click();
		Thread.sleep(3000);
	}
	
	public void clickOnSubscriptions() throws InterruptedException {
		//code to click on subscriptions
		driver.findElement(By.xpath(pr.getProperty("subscriptionsBtn"))).click();
		Thread.sleep(3000);
	}
	
	public void clickOnWatchLater() throws InterruptedException {
		//code to click on watch later
		driver.findElement(By.xpath(pr.getProperty("watchLaterBtn"))).click();
		Thread.sleep(3000);
	}
	
	public void clickOnLybrery() throws InterruptedException {
		//code to click on library
		driver.findElement(By.xpath(pr.getProperty("libreryBtn"))).click();
		Thread.sleep(3000);
	}
}
