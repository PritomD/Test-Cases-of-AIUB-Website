package aiub_system.test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase103_0 {

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

	// Requirement 112.0
	public void chkAcademics() {

		driver.get("http://www.aiub.edu");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[3]/a[1]")))
				.build().perform();

	}

	public static void main(String[] args) {

		TestCase103_0 obj = new TestCase103_0();

		obj.invokeBrowser();
		obj.chkAcademics();

	}

}
