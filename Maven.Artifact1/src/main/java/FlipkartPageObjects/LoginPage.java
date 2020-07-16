package FlipkartPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement username;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginButton;
	
	public void loginAction(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		loginButton.click();
	}
}
