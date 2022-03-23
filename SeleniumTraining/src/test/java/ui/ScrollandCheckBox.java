// Scroll page to an element and check the checkbox

package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollandCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		
		// Scroll to an element
		WebElement radio = driver.findElement(By.xpath("//input[@value='Request a Demo']"));
		Actions action = new Actions(driver);
		action.moveToElement(radio);
		action.perform();
		
		
		// check and uncheck checkbox
		driver.findElement(By.name("interest_market_c")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("interest_market_c")).click();

	}

}
