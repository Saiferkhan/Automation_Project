package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiden_Notification_popup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		
		//Notification Popup
		Thread.sleep(3000);
		Robot robo =new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		//robo.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		
		//hidden alert popup.
		driver.findElement(By.xpath("//img[@alt='cross']")).click();
		
		
		Thread.sleep(4000);
	}

}
