package com.seleniumtesting.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssAttributes {

	public static void main(String[] args) {
		
		//get current working directory
		String chromeDriverExecutableLocation = System.getProperty("user.dir") + "\\DriverExecutables\\chromedriver.exe";
		
		//set the path of chrome executable diver
		System.setProperty("webdriver.chrom.driver", chromeDriverExecutableLocation); 
			
		//create and instance of chrome driver class
		WebDriver driver = new ChromeDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//enter app url
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement button = driver.findElement(By.id("loginButton"));
		System.out.println(button.getCssValue("color"));
	}

}
