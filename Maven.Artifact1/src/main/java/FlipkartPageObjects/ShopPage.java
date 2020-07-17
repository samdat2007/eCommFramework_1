package FlipkartPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends CommonPageClass {

	public ShopPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[contains(@data-tracking-id,'Deals of the Day')]")
	WebElement dealsOftheDay;

	@FindBy(xpath="//a[@title='VIEW ALL']")
	WebElement dealsViewAll;
	
	public void dealsOftheDay() {
		dealsOftheDay.isDisplayed();
	//	dealsViewAll.click();
		
	}
	
}
