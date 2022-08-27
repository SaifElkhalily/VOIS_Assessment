package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
  				"G:\\Software Testing Engineer\\Selenium\\Web driver\\geckodriver.exe");
  		driver = new FirefoxDriver();
  		driver.get("http://automationpractice.com/index.php");
  		driver.manage().window().maximize();	
	}
	public static WebDriver getWebDriver() {
		return driver;
	}

}
