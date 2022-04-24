package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import confugaration.pathConfugaration;

public class baseClass {
public WebDriver driverInit() {
	System.setProperty("webdriver.chrome.driver", pathConfugaration.driverpath);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
}
}
