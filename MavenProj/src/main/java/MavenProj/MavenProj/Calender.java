package MavenProj.MavenProj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Automation_selenium\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		Thread.sleep(3000);
				
		((JavascriptExecutor)  driver).executeScript("window.scrollTo(0,700)");
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("28/07/2025");
		driver.findElement(By.tagName("body")).click();
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();

	}

}
