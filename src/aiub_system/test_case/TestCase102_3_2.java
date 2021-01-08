package aiub_system.test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase102_3_2 {

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

	// Requirement 111.1.6.2
	public void chkConvocation() {
		try {
			// Convocation 2
			driver.get("http://www.aiub.edu");
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/a[1]")))
					.build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/ul[1]/li[7]/a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[2]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		TestCase102_3_2 obj = new TestCase102_3_2();
		obj.invokeBrowser();
		obj.chkConvocation();

	}

}
