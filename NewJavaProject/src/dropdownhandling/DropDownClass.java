package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement allopt=driver.findElement(By.tagName("Select"));
		
		Select sct=new Select(allopt);
		System.out.println(sct.isMultiple());
		
		List<WebElement>opts=sct.getOptions();
		System.out.println(opts.size());
		
		for(WebElement opt: opts) {
			
			System.out.println(opt.getText());
		}
		
		sct.selectByIndex(2);
		Thread.sleep(2000);
		sct.selectByContainsVisibleText("Eustatius and Saba");
		Thread.sleep(2000);
		sct.selectByVisibleText("Algeria");
		Thread.sleep(2000);
		sct.selectByValue("AGO");
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
