
package rs.itbootcamp.humanity.page.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
//import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	// public class HumanityAddEmployeesTestNG {

	@Test
	public static void addEmployeesTest() throws InterruptedException {

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

			HumanityStaff.clickStaff(driver);
			HumanityStaff.clickAddEmployee(driver);

			String firstName = "Michael";
			String secondName = "Schmidt";
			String emailMS = "m.schmidt@gmail.com";

			HumanityStaff.setFirstName(driver, firstName);
			HumanityStaff.setSecondName(driver, secondName);
			HumanityStaff.setEmail(driver, emailMS);

			HumanityStaff.clickSave(driver);
			HumanityMenu.clickStaff(driver);

			List<WebElement> addedEmployee = driver
					.findElements(By.xpath("//a[contains(text(),'" + firstName + " " + secondName + "')]"));

			Assert.assertTrue(addedEmployee.size() > 0, "Unsuccsessful adding of a employee!");
			System.out.println("Test OK!");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test NOT OK!");
		}
		Thread.sleep(3000);
		driver.quit();
	}
	
}
//
