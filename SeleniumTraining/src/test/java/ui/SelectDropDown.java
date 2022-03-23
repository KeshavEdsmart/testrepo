//Select dropdown functions

package ui;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*
		 * When we use dropdown
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.name("employees_c"));
		Select select = new Select(down);
		Thread.sleep(2000);
		select.selectByValue("level1");
		Thread.sleep(2000);

		select.selectByVisibleText("51 - 100 employees");
		Thread.sleep(2000);

		select.selectByIndex(5);
		Thread.sleep(2000);
		*/
		
		
		
		// when we do multiple selection
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.id("multi-select"));
		Select select = new Select(down);
		select.selectByIndex(5);
		Thread.sleep(2000);

		select.selectByValue("California");
		Thread.sleep(2000);

		List<WebElement> allItems = select.getAllSelectedOptions();
		System.out.println(allItems.size());
		select.deselectAll();
		Thread.sleep(2000);

		select.selectByIndex(5);
		Thread.sleep(2000);

		select.selectByValue("California");
		Thread.sleep(2000);

		select.deselectByIndex(5);
		Thread.sleep(2000);

		List<WebElement> allItems1 = select.getAllSelectedOptions();
		System.out.println(allItems1.size());
		
	}

}
