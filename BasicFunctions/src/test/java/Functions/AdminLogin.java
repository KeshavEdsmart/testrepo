package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLogin {

	public static void main(String args[]) throws InterruptedException {
		String Website = "https://admin-release.edsmart.com/home";
		String AdminID = "testautomation@edsmart.com";
		String AdminPass = "A49cBFi9Wbw*x#Q8fg}^#J}w";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(Website);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.findElement(By.id("i0116")).sendKeys(AdminID);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.xpath("//*[@id=\"i0118\"]")).sendKeys(AdminPass);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))).click();

		System.out.println("print");
		
		
		
	}
}
