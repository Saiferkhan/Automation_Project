package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Deselect_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement multi=driver.findElement(By.id("cars"));
		
		Select sct=new Select(multi);
		
		sct.selectByContainsVisibleText("Audi");
		Thread.sleep(2000);
		sct.selectByIndex(1);
		Thread.sleep(2000);
		sct.selectByValue("volvo");
		Thread.sleep(2000);
		sct.deselectByIndex(1);

	}

}
