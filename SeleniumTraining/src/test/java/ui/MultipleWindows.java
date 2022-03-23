// Switch between tabs

package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/?ir=1");
		driver.manage().window().maximize();		
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/a")).click();
		
		Set<String> windows = driver.getWindowHandles(); //check for the number of windows
		System.out.println(windows);
		
		Iterator<String> iterator = windows.iterator(); //variable to iterate between windows
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		
		driver.switchTo().window(childwindow); //switch to the next window
		driver.findElement(By.name("UserFirstName")).sendKeys("Keshav");
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentwindow); //switch back to the first window

		
		driver.quit(); //close all tabs

	}

}
