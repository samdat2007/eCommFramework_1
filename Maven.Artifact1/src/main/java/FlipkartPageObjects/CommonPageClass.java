package FlipkartPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CommonPageClass extends CommonUtils {
	
	CommonUtils commonUtils=new CommonUtils(driver);

	public CommonPageClass(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Electronics']")
	WebElement electronics;
	
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	WebElement tvAppliances;
	

	@FindBy(xpath="//a[@title='Apple']")
	WebElement apple;
	
	@FindBy(xpath="//a[@title='Mi']")
	WebElement mi;
	
	public void appleSeclection() {
		electronics.click();
		commonUtils.implictiWait();
		apple.click();
		
	}
	
	public void miSeclection() {
		tvAppliances.click();
		mi.click();
		
	}

}
