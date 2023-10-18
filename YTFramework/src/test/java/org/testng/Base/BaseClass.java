package org.testng.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		File file = new File("../YTFramework/locators.properties");
		FileReader fr = new FileReader(file);
		pr = new Properties();
		pr.load(fr);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
