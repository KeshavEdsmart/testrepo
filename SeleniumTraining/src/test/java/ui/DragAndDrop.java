// Drag and Drop an element

package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		//Switch the framw
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		// find the draggable element
		WebElement drag = driver.findElement(By.id("draggable"));
		
		
		// find the droppable element
		WebElement drop = driver.findElement(By.id("droppable"));

		// Actions functions are used to drag and drop
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
	}

}
