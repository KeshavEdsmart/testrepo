// if we have multiple browser to work on then we use web driver interface

package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webInterface {

	public static String browser = "chrome"; // we will get this value from CSV,XLS file
	public static WebDriver driver; // driver is a variable from webdriver interface

	public static void main(String[] args) {
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); // set the value of driver to firefox
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); // set the value of driver to chrome
		}

		driver.get("http://google.com");
	}

}
