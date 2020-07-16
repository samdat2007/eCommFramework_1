package BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver browser(String browserName, String url) {
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\samya\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\samya\\Downloads\\chromedriver_win32\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	

}
