// how to take sceenshot and save it

package ui;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// create todays date into string so that string can be used for naming
		Date CurrentDate = new Date();
		String SSFile = CurrentDate.toString().replace(" ", "-").replace(":", "-");
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		// take screenshot
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		//Save screenshot using the date as name
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+SSFile+".png"));
		
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		//driver.close();
	}

}
