package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityLogInTests {

	@Test

	public static void logInTest() throws InterruptedException {

		String email = "jesidata@web-inc.net";
		String password = "sifrica";

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			HumanityHome.clickLogIn(driver);
			HumanityHome.setUserName(driver, email);
			HumanityHome.setPassword(driver, password);
			HumanityHome.setSendLogIn(driver);
			Thread.sleep(3000);

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
			System.out.println("Test OK!");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test NOT OK!");
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
