package MavenProj.MavenProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Automation_selenium\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("Mob");
		Thread.sleep(3000);

		List<WebElement> webb = driver
				.findElements(By.xpath("//ul[contains(@class, 'bbjHWC')]/li[contains(@class,'AgOexi')]"));

		for (WebElement wb : webb) {

			// System.out.println("for loop");
			// System.out.println(wb.getText());

			if (wb.getText().equalsIgnoreCase("mobile")) {

				wb.click();
				break;
			}

		}
	}

}
