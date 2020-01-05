package session1;

import org.openqa.selenium.By;
//import org.apache.xalan.xsltc.compiler.SyntaxTreeNode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium-workspace\\SeleniumBasics\\DriverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://demowebshop.tricentis.com";
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
		System.out.println("Check1");
		driver.findElement(By.xpath("//div/ul/li[3]/a")).click();
		System.out.println("Check2");
		driver.findElement(By.xpath("//*[contains(@class,'product')]")).click();
		System.out.println("Check3");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();

	}

}
