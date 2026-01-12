import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		Actions act =new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
		WebElement target=driver.findElement(By.id("trash"));
		Thread.sleep(2000);
		act.dragAndDrop(source, target).perform();
		
		//Keys up and down process using actions class
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='CheatSheets']")).click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
	
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		WebElement serarch=driver.findElement(By.id("s"));
		
		act.keyDown(Keys.CONTROL).sendKeys(serarch,"v").keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

	}

}
