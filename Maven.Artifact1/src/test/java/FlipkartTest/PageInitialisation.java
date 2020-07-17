package FlipkartTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BrowserFactory.BrowserFactory;
import FlipkartPageObjects.AppleStorePage;
import FlipkartPageObjects.CommonPageClass;
import FlipkartPageObjects.CommonUtils;
import FlipkartPageObjects.LoginPage;
import FlipkartPageObjects.ShopPage;

public class PageInitialisation {
	WebDriver driver=BrowserFactory.browser("Chrome","https://www.flipkart.com");
	CommonPageClass commonPageClass=PageFactory.initElements(driver, CommonPageClass.class);
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	ShopPage shopPage=PageFactory.initElements(driver, ShopPage.class);
	AppleStorePage appleStorePage=PageFactory.initElements(driver, AppleStorePage.class);
	CommonUtils commonUtils=PageFactory.initElements(driver, CommonUtils.class);

	
}