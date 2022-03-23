// how to use keyboard functions such as  Cntl+C and Cntl+V

package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement SourceText = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[4]/pre/span"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);

		// Code to select all and copy.     build() is used because we are using multiple sendkeys in 1 line
		action.keyDown(SourceText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		
		WebElement DestText = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]//div[4]/pre/span"));
		
		
		// Select all paste
		action.keyDown(DestText, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();		
	}

}
