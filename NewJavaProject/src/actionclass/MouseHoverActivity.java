package actionclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[contains(@src,'0787339426-Shop-By-Category_HP-4_22.jpg')]")).click();
		
		//WebElement item= driver.findElement(By.xpath("//a[@data-group=\"home\"]"));
		Actions act = new Actions(driver);
		
		WebElement loc=driver.findElement(By.xpath("//img[contains(@src,'84ad4a6f6d8ffba0fe532.jpg')]"));
		
		//System.out.println(item.getLocation());
	    act.scrollToElement(loc).perform();
		
		//action.moveToLocation(326,32).click().perform();
		
//		WebElement ele=driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
//		
//		ele.sendKeys("dresses");
//		Thread.sleep(2000);
//		ele.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(("(//h4[text()='Floral Print A-Line Dress'])[2]"))).click();
//		Set<String> ids=driver.getWindowHandles();
//		ArrayList<String> allids=new ArrayList<String>(ids);
//		
//		driver.switchTo().window(allids.get(1));
//		//xpath using  text.
//		driver.findElement(By.xpath("//p[text()='XS']")).click();
//		
//		//xpath using contains and text.
//		driver.findElement(By.xpath("//div[contains(text(),'ADD TO')]")).click();
//		
//		
//		//xpath using contains and attribute.
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconWishlist')]")).click();
//		
		
		
		driver.close();
		
		

	}

}
