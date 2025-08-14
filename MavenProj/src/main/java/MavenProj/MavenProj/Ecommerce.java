package MavenProj.MavenProj;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Automation_selenium\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();

		Thread.sleep(2000);
		String[] pname = { "Brocolli", "Cucumber", "Beetroot" };
		// String pname1= "Brocolli";
		List<WebElement> element = driver.findElements(By.cssSelector("h4.product-name"));
		// WebElement element = driver.findElement(By.cssSelector("h4.product-name"));
		List arrlist = Arrays.asList(pname);
		for (int i = 0; i < element.size(); i++) {

			String product = element.get(i).getText().split("-")[0].trim();
			if (arrlist.contains(product)) {

				// String dd =driver.findElement(By.cssSelector("a.increment")).get(i);
				WebElement additemcount = driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i);
				for (int j = 0; j < 2; j++) {

					additemcount.click();

				}

			}

		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		}
}
