package javascriptexecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;




public class JavaScripExecutor_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textinput-1")));
		
		WebElement disabled =driver.findElement(By.id("textinput-1"));
		
		//javascript executor function
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//for scrolling the page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		js.executeScript("arguments[0].value='Hi Saifer Khan' ", disabled);
		
		

	}

}
