package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityAppVersionTest {

	@Test
	public static void testAppVersion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			HumanityHome.logIn(driver, "jesidata@web-inc.net", "sifrica");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(2000);
			HumanityProfile.clickMainProfileItem(driver);
			String humanityAppVersion = "9.5.5";
			Assert.assertEquals(HumanityProfile.appVersion(driver), humanityAppVersion, "Old version of Humanity App.");
			System.out.println("Test OK!");	
		} catch (Exception e) {
			Assert.fail();
			System.out.println(e.getMessage());
			System.out.println("Test NOT OK!");
		} finally {
			driver.quit(); 
		}
	}
}
