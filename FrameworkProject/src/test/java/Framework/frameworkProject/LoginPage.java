package Framework.frameworkProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(linkText="Sign in")
	WebElement singinPage;
	
	@FindBy(id="email_create")
	WebElement mailid;
	
	@FindBy(xpath="//span[contains(text(),'Create an account')]")
	WebElement CreateMail;
	
	public void actionMethod() {
		
		singinPage.click();
		
		mailid.sendKeys("abcd12332q@gmail.com");
		
		CreateMail.click();
	}

}
