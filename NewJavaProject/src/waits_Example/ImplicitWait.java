package waits_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicitwait
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//fluent wait
		FluentWait<WebDriver> fwait=new FluentWait<>(driver);
		
		fwait.withTimeout(Duration.ofSeconds(10));
		fwait.pollingEvery(Duration.ofMillis(200));
		
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		fwait.until(ExpectedConditions.titleIs("OrangeHRM"));
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
