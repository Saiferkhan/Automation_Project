package MavenProj.seleniumHandsOn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductPage {
	
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void addToCardProduct() throws InterruptedException {
		
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod = products.stream()
				.filter(s -> s.findElement(By.cssSelector("b")).getText().equals("ADIDAS ORIGINAL")).findFirst()
				.orElse(null);
		
		if(prod !=null) {
			
			prod.findElement(By.xpath(".//button[contains(text(),' Add To Cart')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();

			driver.findElement(By.xpath("//button[contains(text(),'Buy Now')]")).click();
		}else {
			
			throw new RuntimeException("Product not found: ");
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("Ind");

		List<WebElement> items = driver.findElements(By.cssSelector(".ta-item"));

		int size1 = items.size();
		System.out.println("Item Size=" + size1);

		for (WebElement item : items) {

			if (item.getText().equalsIgnoreCase("India")) {

				item.click();
				break;
			}
		}
		
		driver.findElement(By.name("coupon")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Apply Coupon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".action__submit")).click();
		Thread.sleep(2000);
		String textvalue = driver.findElement(By.cssSelector(".hero-primary")).getText();

		// Assert.assertTrue(textvalue.equalsIgnoreCase("Thankyou for the order."));

		Assert.assertEquals("THANKYOU FOR THE ORDER.", textvalue, "String Not matched");
	}

}
