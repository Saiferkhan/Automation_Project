package automationProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		LoginFunctionality login=new LoginFunctionality(driver);
		login.LoginPage("chotubhai3335@gmail.com", "Chotu@12345");
		
		login.explicitWaitTocall(By.cssSelector(".mb-3"));
		
		//driver.findElement(By.id("userEmail")).sendKeys("chotubhai3335@gmail.com");
		//driver.findElement(By.id("userPassword")).sendKeys("Chotu@12345");
		//driver.findElement(By.id("login")).click();
		//Thread.sleep(2000);
		List<WebElement> product =driver.findElements(By.cssSelector(".mb-3"));
		
		WebElement prod = product.stream().filter(s->
		s.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		//Thread.sleep(2000);
		//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		prod.findElement(By.xpath("//button[contains(text(),'Add To Cart')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		Thread.sleep(2000);
		
		//to delete record from the cart
		//driver.findElement(By.cssSelector("button.btn-danger")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Buy Now')]")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
