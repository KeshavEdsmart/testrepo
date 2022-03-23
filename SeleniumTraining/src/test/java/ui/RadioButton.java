// check radio buttons

package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/au/home#/book/bookflight");
		driver.manage().window().maximize();


		// check and uncheck radio button
		WebElement radio1 = driver.findElement(By.id("redeemFlights"));
		radio1.click();
		System.out.println(radio1.isSelected());
		
		// print number of radio button available on page
		System.out.println( driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());

	}

}
