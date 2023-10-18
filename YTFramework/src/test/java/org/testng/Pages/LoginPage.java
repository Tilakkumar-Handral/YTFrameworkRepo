package org.testng.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.utilities.LogCapture;

public class LoginPage {
	WebDriver driver;
	Properties pr;
	
	public LoginPage(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void login() throws InterruptedException {
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
		
	}
}
