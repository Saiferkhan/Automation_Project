package MavenProj.MavenProj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Automation_selenium\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().deleteAllCookies();--Delete all cookies
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 15 pro Mobile");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).submit();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("container")).click();
		
		
	//	driver.close();

	}

}
