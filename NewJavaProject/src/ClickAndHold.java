import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.kirupa.com/html5/press_and_hold.htm");
		
		WebElement circle=driver.findElement(By.id("item"));
		
		Actions act=new Actions(driver);
		
//		act.clickAndHold(circle).perform();
//		
//		Thread.sleep(2000);
//		
//		act.release(circle).perform();
//		Thread.sleep(2000);
//		act.contextClick(circle).perform();
		
		//locate element using getlocation 
		Point loc=driver.findElement(By.xpath("//span[text()='Videos']")).getLocation();		
		System.out.println(loc);
		act.moveToLocation(683, 47).click().perform();
		
		//Double click actions
		WebElement dbleclick=driver.findElement(By.xpath("//h1[text()='Watch and Learn!']"));
		Thread.sleep(2000);
		act.doubleClick(dbleclick).perform();
		Thread.sleep(2000);
		//driver.close();

	}

}
