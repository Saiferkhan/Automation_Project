package MavenProj.seleniumHandsOn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class Baseclass extends BrowserSetup{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		 
		BrowserSetup bs =new BrowserSetup();
		WebDriver driver =bs.initializebrowser();

		driver.get(bs.prop.getProperty("pageURL"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
		
		LoginFunctionality login=new LoginFunctionality(driver);
		login.actionMethod("chotubhai3335@gmail.com", "Chotu@12345");
		
		ProductPage prodpage=new ProductPage(driver);
		prodpage.addToCardProduct();
		

//		driver.findElement(By.id("userEmail")).sendKeys("chotubhai3335@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("Chotu@12345");
//		driver.findElement(By.id("login")).click();
//		
		
		
		
		

//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		//driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.TAB);


//		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
//		int size = products.size();
//		System.out.println(size);
		
		

		/* For loop condition -------------------------------------------------------
		 * for (WebElement prod : products) { 
		 * String productName = prod.getText();
		 * 
		 * if (productName.equalsIgnoreCase("ADIDAS ORIGINAL")) {
		 * System.out.println("COndition is working");
		 * prod.findElement(By.xpath(".//button[contains(text(),'Add To Cart')]")).
		 * click(); break;
		 * 
		 * } }
		 */
		
		
		
		
		/* Using java stream condition -----------------------------*/

//		WebElement prod = products.stream()
//				.filter(s -> s.findElement(By.cssSelector("b")).getText().equals("ADIDAS ORIGINAL")).findFirst()
//				.orElse(null);
//
//		prod.findElement(By.xpath(".//button[contains(text(),' Add To Cart')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
//
//		driver.findElement(By.xpath("//button[contains(text(),'Buy Now')]")).click();
		
//		JavascriptExecutor  js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,500)");

//		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("Ind");
//
//		List<WebElement> items = driver.findElements(By.cssSelector(".ta-item"));
//
//		int size1 = items.size();
//		System.out.println("Item Size=" + size1);
//
//		for (WebElement item : items) {
//
//			if (item.getText().equalsIgnoreCase("India")) {
//
//				item.click();
//				break;
//			}
//		}
//		driver.findElement(By.name("coupon")).sendKeys("rahulshettyacademy");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Apply Coupon']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector(".action__submit")).click();
//		Thread.sleep(2000);
//		String textvalue = driver.findElement(By.cssSelector(".hero-primary")).getText();
//
//		// Assert.assertTrue(textvalue.equalsIgnoreCase("Thankyou for the order."));
//
//		Assert.assertEquals("THANKYOU FOR THE ORDER.", textvalue, "String Not matched");
	}
}
