package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityUploadPictureTest {
	private static WebDriver driver;
	@Test
	public static void testUploadPicture() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			HumanityHome.logIn(driver, "jesidata@web-inc.net", "sifrica");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(2000);
			HumanityProfile.clickMainProfileItem(driver);
			HumanityProfile.clickProfile(driver);
			HumanityProfile.clickEditDetails(driver);
			HumanityProfile.uploadPicture(driver);
			HumanityProfile.clickSaveEditedDetails(driver);
			Thread.sleep(5000);
			Assert.assertNotEquals(driver.findElement(By.className("j-user-avatar-settings")).getAttribute("src"),
					"https://d3l54fgzztlejs.cloudfront.net/app/layout/images/no_avatar.png", "Upload unsuccsessful.");
			System.out.println("Test OK!");
		} catch (Exception e) {
			Assert.fail();
			System.out.println(e.getMessage());
			System.out.println("Test NOT OK!");
		} finally {

			driver.quit(); 
		}
	}
	
	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		if(driver==null)
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public static boolean logInHere() {
		
		createDriver();
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityHome.clickLogIn(driver);
		HumanityHome.setUserName(driver, "jesidata@web-inc.net");
		HumanityHome.setPassword(driver, "sifrica");
		HumanityHome.setSendLogIn(driver);
		return true;
	}
	
	@AfterMethod
	public static void quitDriver() {
		driver.quit();
	}
	
	@Test
	public static void testAppVersion() throws InterruptedException {
		
		try {
	//		HumanityHome.logIn(driver, "jesidata@web-inc.net", "sifrica");
			
			Thread.sleep(2000);
			HumanityProfile.clickMainProfileItem(driver);
			String humanityAppVersion = "9.5.5";
			Assert.assertEquals(HumanityProfile.appVersion(driver), humanityAppVersion, "Old version of Humanity App.");
		} catch (Exception e) {
			Assert.fail();
			System.out.println(e.getMessage());
		} finally {
			driver.quit(); 
		}
		
	}

}
