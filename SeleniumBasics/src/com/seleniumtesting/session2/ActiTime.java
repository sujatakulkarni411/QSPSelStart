package com.seleniumtesting.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium-workspace\\SeleniumBasics\\DriverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String getURL = "https://demo.actitime.com/login.do";
		driver.get(getURL);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div/table/tbody/tr/td[3]/a[@class='logout']"));
		
		
	}


}
