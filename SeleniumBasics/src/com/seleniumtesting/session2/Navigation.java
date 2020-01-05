package com.seleniumtesting.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String args[]) throws InterruptedException{
		
		//get current working directory
		//String chromeDriverExecutableLocation = System.getProperty("user.dir")
			//	+ "\\DriverExecutables\\chromedriver.exe";
		
		//set the path of chrome executable diver
		System.setProperty("webdriver.chrom.driver", "F:\\Selenium\\Selenium-workspace\\SeleniumBasics\\DriverExecutables\\chromedriver.exe");
		
		//create and instance of chrome driver class
		WebDriver driver = new ChromeDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//enter app url
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		
		
		
		
	}

}
