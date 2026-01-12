package practice;



import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\user\\Automation_selenium\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/#");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Laptops")).click();
		js.executeScript("window.scrollBy(0,300)");
		//driver.findElement(By.id("composer-submit-button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("hrefch")));
		
		List<WebElement> Items =driver.findElements(By.className("hrefch"));
		
		for (WebElement Item : Items) {
			
			String selectitem=Item.getText().trim();
			System.out.println(selectitem);
			if(selectitem.equalsIgnoreCase("MacBook air")) {
				Thread.sleep(2000);
				Item.click();
				System.out.print("Item matched :"+Item);
				break;
				}		
		}
		
		/*Items.stream()
	     .filter(item -> item.getText().trim().equalsIgnoreCase("MacBook air"))
	     .findFirst()
	     .ifPresent(item -> {
	         item.click();
	         System.out.println("Item matched: " + item.getText());
	     });*/
			
	}

}
