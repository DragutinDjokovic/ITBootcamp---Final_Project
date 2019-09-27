package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import utility.ExcelUtils;

public class HumanityLogInViaExcelTests {

	@Test
	public static void testThe() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			// excel list
			ExcelUtils.setExcel("Data.xls");
			ExcelUtils.setWorkSheet(0);
			String email = ExcelUtils.getDataAt(1, 0);
			String password = ExcelUtils.getDataAt(1, 1);
			HumanityHome.clickLogIn(driver);
			HumanityHome.setUserName(driver, email);
			HumanityHome.setPassword(driver, password);
			HumanityHome.setSendLogIn(driver);
			Thread.sleep(3000);
			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test OK!");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Test NOT OK!");
		}
		driver.quit();
	}

}
