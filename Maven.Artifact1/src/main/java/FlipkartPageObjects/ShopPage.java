package FlipkartPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage {
	WebDriver driver;
	public ShopPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//span[text()='Electronics']")
	WebElement electronics;
	

	@FindBy(xpath="//a[@title='Apple']")
	WebElement apple;
	
	public void categorySelection() {
		driver.navigate().refresh();
		electronics.click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Apple']")));
		apple.click();
		
	}
}
