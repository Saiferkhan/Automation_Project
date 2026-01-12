package automationProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunctionality {
	
	WebDriver driver;
	
	public LoginFunctionality(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail")
	WebElement username;
	
	@FindBy(id="userPassword")
	WebElement Password;
	
	@FindBy(id="login")
	WebElement Submit;
	
	public void LoginPage(String email, String password) {
		
		username.sendKeys(email);
		Password.sendKeys(password);
		Submit.click();
	}
	
	
	public WebElement explicitWaitTocall(By findBy) {
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(22));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

}
