package MavenProj.MavenProj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Automation_selenium\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		//driver.findElement(By.id("show-textbox")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.id("hide-textbox")).click();
		
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='option3']")).click();
		driver.findElement(By.tagName("body")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption3")).click();
		
		//alert button and field
		driver.findElement(By.id("name")).sendKeys("Saifer");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,600)");
		//driver.findElement(By.id("product")).click();
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=800");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(5000);
		driver.close();
		
		
	
		
	}

}
