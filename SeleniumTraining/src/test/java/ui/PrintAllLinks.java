//Using Select function to print all links

package ui;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		
		List<WebElement> allTags = driver.findElements(By.tagName("options"));
				//findElementsByTagName("option");
		System.out.println("Total Tags are: " + allTags.size());
		
		for(int i=0; i<allTags.size(); i++) {
			System.out.println("Links on page are: " + allTags.get(i).getAttribute("value"));
			System.out.println("Links on page are: " + allTags.get(i).getText());

		}
		//driver.close();
	}

}
