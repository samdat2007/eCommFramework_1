package FlipkartTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginActionTest extends PageInitialisation {
	
	@BeforeTest
	public Properties propertiesDeclare() throws IOException {
		Properties propObj=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.home")+"//eclipse-workspace//Maven.Artifact1//src//test//java//Resources//application.properties");
		propObj.load(fis);
		return propObj;
		}
	
	@Test
	public void loginAndSelectCategory() throws IOException {
		loginpage.loginAction(propertiesDeclare().getProperty("username"),propertiesDeclare().getProperty("password"));
		shopPage.categorySelection();
		
	}

}
