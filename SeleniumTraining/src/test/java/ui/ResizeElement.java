// resize an element

package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		
		//Switch the frame
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		// find the resizable element
		WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		

		// Actions functions are used to resize
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 500, 400).perform();
	}

}
