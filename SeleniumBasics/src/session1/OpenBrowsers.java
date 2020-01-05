package session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowsers {

	public static void main(String[] args) {
		
			openChrome();
			//openFF();
			//openIE();
		}
		
		public static void openChrome()
		{
			//set the path of cherome driver executables
			System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Selenium Softwares\\Driver\\chromedriver.exe");
			
			//create an instance of ChromeDriver Class
			WebDriver driver = new ChromeDriver();
			String baseURL = "https://www.google.com/";
			driver.get(baseURL);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
			
		}
		
		/*	public static void openIE()
		{
			System.setProperty("webdriver.ie.driver","F:\\Selenium\\Selenium-workspace\\SeleniumBasics\\DriverExecutables\\IEDriverServer.exe");
			//WebDriver wd1 = new InternetExplorerDriver();
			WebDriver IEDriver = new InternetExplorerDriver();
		} 
	  public static void openFF()
		{
			System.setProperty("webdriver.gecko.driver","F:\\Selenium\\Selenium-workspace\\SeleniumBasics\\DriverExecutables\\geckodriver.exe");
			WebDriver wd2 = new FirefoxDriver();
			String baseURL = "https://www.guru99.com/";
			wd2.get(baseURL);
			String title = wd2.getTitle();
			System.out.println(title);
		} */

	}

