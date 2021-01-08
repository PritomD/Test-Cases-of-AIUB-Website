package aiub_system.test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase102_0 {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Books\\10th Semester\\SQT\\Final\\Selenium\\selenium-java-3.141.59\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Requirement: 111.1.1 || 111.1.2
	public void chkAboutUs() {
		try {

			driver.get("http://www.aiub.edu");

			// Home
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[1]/a[1]")).click();
			Thread.sleep(2000);

			// Information
			Actions act = new Actions(driver);
			
			WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/a[1]"));
			act.moveToElement(ele).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(3000);
//			driver.navigate().back();

			// General Information
//			Actions act2 = new Actions(driver);
//			WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/a[1]"));
//			act2.moveToElement(element).perform();
//			
//			WebElement element2 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/ul[1]/li[2]/a[1]"));
//			
//			WebDriverWait wait = new WebDriverWait(driver, 20); //here, wait time is 20 seconds
//
//			wait.until(ExpectedConditions.visibilityOf(element2)); //this will wait for elememt to be visible for 20 seconds
//			element2.click(); 

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		try {
			TestCase102_0 obj = new TestCase102_0();

			obj.invokeBrowser();
			obj.chkAboutUs();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
