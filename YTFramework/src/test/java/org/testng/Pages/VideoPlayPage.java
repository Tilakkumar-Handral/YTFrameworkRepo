package org.testng.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VideoPlayPage {
	WebDriver driver;
	Properties pr;
	
	public VideoPlayPage(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void clickOnVideo() throws InterruptedException {
		//code to play video
		driver.findElement(By.xpath(pr.getProperty("clickOnVideoBtn"))).click();
		Thread.sleep(9000);
	}

	public void clickOnLikeBtn() throws InterruptedException {
		//code to like the video
		driver.findElement(By.xpath(pr.getProperty("vidLikeBtn"))).click();
		Thread.sleep(2000);
	}
	
	public void clickOnChannelSubscription() throws InterruptedException {
		//code to click on subscription
		driver.findElement(By.xpath(pr.getProperty("subscriptionBtn"))).click();
		Thread.sleep(3000);
	}
	
	public void clickOnCommentBtn() throws InterruptedException {
		//scroll to comment box
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 300).build().perform();
		Thread.sleep(3000);
		
		//code to click on comment box and add comment
		driver.findElement(By.xpath(pr.getProperty("commentPlcaHolderBtn"))).click();
		WebElement commentBox = driver.findElement(By.xpath(pr.getProperty("commentText")));
		commentBox.click();
		commentBox.sendKeys(":)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("commentBtn"))).click();
		Thread.sleep(3000);
	}

}
