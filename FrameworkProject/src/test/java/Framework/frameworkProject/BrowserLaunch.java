package Framework.frameworkProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public WebElement driver;
	public BrowserLaunch(WebElement driver) {
		
		this.driver=driver;
	}

	public void initializeBrowser() throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C://Users//user//eclipse-workspace//FrameworkProject//src//test//java//Framework//resources//config.properties");

		prop.load(fis);

		String browserName = prop.getProperty("browser");
		String URL = prop.getProperty("baseURL");

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("EdgeDriver")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new EdgeDriver();
		}
		((Properties) driver).get(URL);
	}
}
