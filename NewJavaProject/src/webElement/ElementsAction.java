package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement element =driver.findElement(By.className("desktop-searchBar"));
		
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(element.isSelected());
		
		Rectangle rec=element.getRect();
		
		System.out.println(rec.getHeight());
		System.out.println(rec.getDimension());
		System.out.println(rec.getWidth());
		System.out.println(rec.getPoint());
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		
		System.out.println(element.getAttribute("placeholder"));
		
		driver.close();

	}

}
