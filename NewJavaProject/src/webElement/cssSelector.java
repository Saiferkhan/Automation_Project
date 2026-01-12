package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement element =driver.findElement(By.className("desktop-searchBar"));
		//WebElement ele=driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
		
		Thread.sleep(2000);
		//ele.sendKeys(Keys.ENTER);
		
		List<WebElement> items=driver.findElements(By.cssSelector("[class = 'desktop-suggestion null']"));
		Thread.sleep(2000);
		System.out.println(items.size());
		
		for (WebElement item : items) {
			
			String selectedItem=item.getText();
			if(selectedItem.equalsIgnoreCase("Dressberry")) {
				
				item.click();				
				System.out.print("Item has been selected :"+selectedItem);
				break;
			}
		}
		
		//Thread.sleep(5000);
		driver.close();

	}

}
