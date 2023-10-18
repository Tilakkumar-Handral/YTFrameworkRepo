package org.testng.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 extends BaseClass{
	@Test
	public void testSubscription() throws InterruptedException {
		Thread.sleep(3000);
		//login code
		WebElement siginButton = driver.findElement(By.xpath(pr.getProperty("siginButton")));
		siginButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("emailText"))).sendKeys("testy6004@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("emailNxtBtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("passText"))).sendKeys("youtubetest87",Keys.ENTER);
		Thread.sleep(6000);
		
		//code to click on subscriptions
		driver.findElement(By.xpath(pr.getProperty("subscriptionsBtn"))).click();
		Thread.sleep(3000);
		
		//logout code
		driver.findElement(By.xpath(pr.getProperty("avtarBtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("logoutBtn"))).click();
		Thread.sleep(3000);
	}
}
