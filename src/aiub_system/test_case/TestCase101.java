package aiub_system.test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase101 {

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

	// Requirement: 110.0
	public void chkMajorItem() {

		try {
			driver.get("http://www.aiub.edu");

			// Web Mail
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// Login
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// About Us
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// Academics
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[3]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// Faculty
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[5]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// Offices
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[6]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// Administration
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[4]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// Admission
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[7]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// Contact
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[8]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

			// Career
			Actions act = new Actions(driver);

			WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/a[1]"));
			act.moveToElement(ele).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/ul[1]/li[6]/a[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			driver.close();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		TestCase101 obj = new TestCase101();

		obj.invokeBrowser();
		obj.chkMajorItem();

	}

}
