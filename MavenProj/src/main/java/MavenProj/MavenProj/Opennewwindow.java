package MavenProj.MavenProj;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Opennewwindow {

	private static final String Output = null;
	private static final String TakesScreenShot = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Automation_selenium\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("C:\\Intel\\screenshot.png"));
		
		//driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		//String parentwindow =  driver.getWindowHandle();
	

	}

}
