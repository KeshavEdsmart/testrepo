// Handle pop up alerts

package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult"); // switch to the frame with the id = iframeResult
		driver.findElement(By.xpath("/html/body/button")).click();

		// handle the alert
		String alert = driver.switchTo().alert().getText(); // get the text in the alert and print it
		System.out.println(alert);

		// add value to the alert
		driver.switchTo().alert().sendKeys("Keshav Sharma");
		Thread.sleep(2000);

		// accept the alert
		driver.switchTo().alert().accept();

		// handle the alert before switching back to the parent frame
		driver.switchTo().parentFrame(); // switch back to the parent frame
		Thread.sleep(2000);

		
		driver.close();

	}

}
