package Framework.frameworkProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass extends BrowserLaunch{

	public Baseclass(WebElement driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void base() throws IOException {
		
		
		BrowserLaunch brow =new BrowserLaunch(driver);
		brow.initializeBrowser();
		
		LoginPage login =new LoginPage((WebDriver) driver);
		login.actionMethod();
	}
}
	
	

