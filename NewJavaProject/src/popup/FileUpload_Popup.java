package popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Popup {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?");
		
		driver.findElement(By.xpath("//p[contains(text(),'I have work experience')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(2000);
		
		//first method
		//Runtime.getRuntime().exec("./autoITfiles/Autoit1.exe");
		
		//Other method to upload file but popup dont remove due to this method
		
		File uploadfile=new File("C:/Users/user/Downloads/UpdateResume_old.pdf");
		
		WebElement upload=driver.findElement(By.cssSelector("input[type='file']"));
		
		upload.sendKeys(uploadfile.getAbsolutePath());
		
		Thread.sleep(4000);
	}

}
