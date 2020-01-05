package com.seleniumtesting.session2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\Selenium\\\\\");
		WebDriver driver = new ChromeDriver();
		
		String getURL = "https://www.vtiger.com/log-in/";
		driver.get(getURL);
		
	}

}
