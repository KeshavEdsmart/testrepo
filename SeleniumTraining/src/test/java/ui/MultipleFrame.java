// Switch between multiple frames

package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult"); // switch to the frame with the id = iframeResult
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().parentFrame(); // switch back to the parent frame
		
		
	}

}
