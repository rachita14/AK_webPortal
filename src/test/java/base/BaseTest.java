package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver = null;

	//@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterTest
	public void closeBrowser() {

		driver.close();
	}
}
