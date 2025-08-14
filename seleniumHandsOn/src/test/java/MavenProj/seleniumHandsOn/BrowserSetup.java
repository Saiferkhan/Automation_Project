package MavenProj.seleniumHandsOn;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserSetup {

	public WebDriver driver;
	public Properties prop;

	public Properties loadConfig() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C://Users//user//eclipse-workspace//seleniumHandsOn//src//test//java//sourcepackage//config.properties");

		prop.load(fis);
		return prop;
	}

	public WebDriver initializebrowser() throws IOException {

		prop=loadConfig();
		String BrowserName = prop.getProperty("browsers");

		if (BrowserName.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("Safari")) {

			driver = new SafariDriver();
		} else if (BrowserName.equalsIgnoreCase("FirefoxDriver")) {

			driver = new FirefoxDriver();
		}
//		else {
//            throw new IllegalArgumentException("Unsupported browser: " + BrowserName);
//		}

		 //driver.get("pageURL");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;

	}

}
