// Use Keyboard keys to select the auto dropdown options

package ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Lists;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// get todays date and add 5 days
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 5);
		Date date = cal.getTime();
		System.out.println(date);

		// Format the date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String formatDate = sdf.format(date);
		System.out.println(formatDate);

		// Split and retrieve just the date
		String dateArr[] = formatDate.split("/");
		String duedate = dateArr[0];
		System.out.println(duedate);

		//current date
		cal = Calendar.getInstance();
		Date today = cal.getTime();
		System.out.println(today);

		// Format the date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
		String formatDate1 = sdf1.format(today);
		System.out.println(formatDate1);

		// Split and retrieve just the date
		String dateArr1[] = formatDate1.split("/");
		String cdate = dateArr1[0];
		System.out.println(cdate);

		List<WebElement> dates = driver.findElements(By.xpath("//a[@class =\"ui-state-default\" ]"));

		for (WebElement e : dates) {
			if (e.getText().trim().equals(cdate)) {
				e.click();
			}
		}
		
		
		
		
		
		String currentDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a"))
				.getText().trim();

		List<WebElement> dates1 = driver.findElements(By.xpath("//a[@class =\"ui-state-default\" ]"));

		for (WebElement e : dates1) {
			if (e.getText().trim().equals(currentDate)) {
				e.click();
			}
		}

//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.makemytrip.com/");
//		driver.manage().window().maximize(); 
//		driver.findElement(By.xpath("//span[text()='From']")).click();
//		// Looks Messy. Another way as well. Option 1
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Sydney");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN); // Use Keyboard keys to
//		Thread.sleep(2000);
//																			// select the option
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
//		

		/*
		 * Option 2. Easy way WebElement from =
		 * driver.findElement(By.xpath("//input[@placeholder='From']"));
		 * from.sendKeys("Sydney"); from.sendKeys(Keys.ARROW_DOWN);
		 * from.sendKeys(Keys.ENTER);
		 */

	}

}
