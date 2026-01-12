package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/digest_auth");
		
		Robot robo=new Robot();
		
		//for username
		getvalue(robo,"admin");
		
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//for password
		getvalue(robo,"admin");
		
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);

	}
	
	public static void getvalue(Robot robo, String text) {
		
		for(char c : text.toCharArray()) {
			
			int k=KeyEvent.getExtendedKeyCodeForChar(c);
			
			robo.keyPress(k);
			robo.keyRelease(k);
					
		}
	}

}
