package com.seleniumtesting.session2;

import java.awt.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValueFromApp {

	public static void main(String[] args) {
		//get current working directory
				String chromeDriverExecutableLocation = System.getProperty("user.dir")
						+ "\\DriverExecutables\\chromedriver.exe";
				
				//set the path of chrome executable diver
				System.setProperty("webdriver.chrom.driver", chromeDriverExecutableLocation);
				
				//create and instance of chrome driver class
				WebDriver driver = new ChromeDriver();
				
				//maximize browser window
				driver.manage().window().maximize();
				
				//enter app url
				driver.get("https://demo.vtiger.com/vtigercrm/");
				WebElement pswd = driver.findElement(By.id("password"));
				
				org.openqa.selenium.Point point = pswd.getLocation();
				int x = point.getX();
				int y = point.getY();
				System.out.println("pswd X = "+x+"\npswd Y = "+y);
				
				WebElement button = 
			
	}

}
