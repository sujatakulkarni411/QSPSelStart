package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) throws InterruptedException {
		
		//get current working directory
		String chromeDriverexecutableLocation = System.getProperty("user.dir")+"\\DriverExecutables\\chromedriver.exe";
				
		//set the path of chrome executable diver" 
		System.setProperty("webdriver.chrom.driver", chromeDriverexecutableLocation);
				
		//create and instance of chrome driver class 
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		//maximize browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(250, 500));
		Thread.sleep(2000);
		
		//enter app url
		driver.get("https://www.facebook.com");
		
		//get page source code
		String pageSourceCode = driver.getPageSource();
		System.out.println(pageSourceCode);
		
		//get current url
		System.out.println(driver.getCurrentUrl());
		
		//get page title
		System.out.println(driver.getTitle());
		
		//identify the search input field
		WebElement emailIDField = driver.findElement(By.id("email"));
		
		//type email Id
		emailIDField.sendKeys("abc@gmail.com");
		emailIDField.clear();
		emailIDField.sendKeys("qwe@gmail.com");

		//identify forgotten account link field
		WebElement forgottenAccLink = driver.findElement(By.linkText("Forgotten account?"));
		
		//click on the link
		forgottenAccLink.click();
		
		
	}

}
