package FlipkartTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BrowserFactory.BrowserFactory;
import FlipkartPageObjects.LoginPage;
import FlipkartPageObjects.ShopPage;

public class PageInitialisation {
	WebDriver driver=BrowserFactory.browser("Chrome","https://www.flipkart.com");
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	ShopPage shopPage=PageFactory.initElements(driver, ShopPage.class);

	
}