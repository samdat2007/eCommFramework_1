package FlipkartPageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;



public class CommonUtils {
	WebDriver driver;
	
	public CommonUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void goBack() {
		driver.navigate().back();
	}
	
	public void exitPage() {
		driver.close();
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public void implictiWait() {
       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

}
