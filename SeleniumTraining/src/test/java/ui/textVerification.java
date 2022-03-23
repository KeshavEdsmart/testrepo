package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textVerification {
	
	@Test
	public void titleTest() throws InterruptedException{
		String expectedtitle = "Electronics,hfdbh Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedtitle, "Titel verification failed");
		driver.close();
		
	}
	

}
