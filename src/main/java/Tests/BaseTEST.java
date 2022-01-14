package Tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.wahooHomePage;

	
public class BaseTEST {

	WebDriver driver;
	public wahooHomePage homePage;
	@BeforeClass
	public void setup() {
		// driver location 
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// implicit wait if webElement is not found
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		// navigate to application 
		driver.get("https://eu.wahoofitness.com/");
		homePage = new wahooHomePage(driver);
}
	@AfterClass
	//Close browser after test
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
