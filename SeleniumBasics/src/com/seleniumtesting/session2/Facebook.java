package com.seleniumtesting.session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium-workspace\\SeleniumBasics\\DriverExecutables\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.facebook.com/");
		//input[@value='Log In']
		chromeDriver.findElement(By.id("email")).sendKeys("sskulkarni411@gmail.com");
		chromeDriver.findElement(By.id("pass")).sendKeys("Height@152");
		chromeDriver.findElement(By.xpath("//input[@type='submit']")).click();;
		chromeDriver.findElement(By.xpath("//div[@id='userNavigationLabel']")).submit();
		Thread.sleep(2000);
//		
//			
//		chromeDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//
//		chromeDriver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")).click();
		
	}

}
