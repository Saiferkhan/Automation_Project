package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//alert with OK
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//alert with ok and cancel
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//aler with textbox
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		driver.switchTo().alert().sendKeys("Saifer Khan");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.close();

	}

}
