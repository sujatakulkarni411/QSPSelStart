package com.seleniumtesting.session2;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static <WebElement> void main(String[] args[]) {
		// TODO Auto-generated method stub

		String chromDriverExecutableLocation = System.s();
		
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter app url
		driver.get("https://www.google.com");
		
		
	driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
	List<> suggestList = driver.findElement(By.xpath("ul[@class=erkvQe]/li/div/div/div/span"));
	
	
		
	}

}
