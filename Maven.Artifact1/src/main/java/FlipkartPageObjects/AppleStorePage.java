package FlipkartPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleStorePage extends CommonPageClass {

	public AppleStorePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//img[contains(@src,'https://rukminim1.flixcart.com/flap/50/50/image/2d44b6.jpg?q=50')]")
	WebElement iphone8plus;
	
	@FindBy(xpath="//img[contains(@src,'https://rukminim1.flixcart.com/flap/50/50/image/830006.jpg?q=50')]")
	WebElement iphone8;
	
	@FindBy(xpath="//img[contains(@src,'https://rukminim1.flixcart.com/flap/50/50/image/86f7bd9f9190d65d.jpg?q=50')]")
	WebElement iWatch;
	
	
	public void selectAppleWatch() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView()", iWatch); 
		iWatch.click();
	}

}
