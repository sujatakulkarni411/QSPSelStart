package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium-workspace\\SeleniumBasics\\DriverExecutables\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		String basrURL = "http://demowebshop.tricentis.com";
		chromeDriver.get(basrURL);
		
		chromeDriver.findElement(By.xpath("//a[@class='ico-register']")).click();
		chromeDriver.findElement(By.xpath("//input[@id='gender-female']")).click();
		chromeDriver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("sujata");
		chromeDriver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kulkarni");
		chromeDriver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sskulkarni411@gmail.com");
		chromeDriver .findElement(By.xpath("//input[@name='Password']")).sendKeys("123");
		chromeDriver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123");

		String title = chromeDriver.getTitle();
		System.out.println(title);
		
		String currentURL = chromeDriver.getCurrentUrl();
		System.out.println(currentURL);
		//chromeDriver.close();
		
	}

}
