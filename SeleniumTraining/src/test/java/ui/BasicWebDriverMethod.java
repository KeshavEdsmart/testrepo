// get and manage functions

package ui;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethod {

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

		driver.get("http://saucedemo.com/"); // open web page
		driver.manage().deleteAllCookies(); // delete all cookies
		driver.manage().window().maximize(); // maximize the window

		String currentURL = driver.getCurrentUrl(); // get the current URL and print it
		System.out.println(currentURL);

		String currentTitle = driver.getTitle(); // get the current title of the page and print it
		System.out.println(currentTitle);

		String source = driver.getPageSource(); // get the source of the page and print
		System.out.println(source);

		// driver.navigate().to("http://google.com"); // got to google from saucedemo

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("user-name")).clear(); // clear the text box
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); // input the user name again because we
																			// cleared it in the above step
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		driver.navigate().to("https://www.sugarcrm.com/au/?utm_source=sugarcrm.com");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		driver.findElement(By.id("icon-facebook")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		driver.close();

	}

}
