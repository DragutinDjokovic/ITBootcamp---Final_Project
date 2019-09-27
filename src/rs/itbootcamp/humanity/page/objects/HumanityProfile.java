package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {

	private static final String MAIN_PROFILE_ITEM = "//img[@id='tr_avatar']";
	private static final String PROFILE_PROFILE = "//a[contains(text(),'Profile')]";
	private static final String PROFILE_SETTINGS = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String PROFILE_AVAILABILITY = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String PROFILE_SIGNOUT = "//a[contains(text(),'Sign Out')]";
	private static final String EDIT_DETAILS = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PICTURE = "//input[@id='fileupload']";
	private static final String NICK_NAME = "//input[@id='nick_name']";
	private static final String SAVE_EDITED_DETAILS = "//input[@name='update']";
	private static final String APP_VERSION = "//div[@id='humanityAppVersion']";
	
	// Get in Main profile item to get different options of a profile
	public static WebElement getMainProfileItem(WebDriver driver) {
		return driver.findElement(By.xpath(MAIN_PROFILE_ITEM));
	}

	public static void clickMainProfileItem(WebDriver driver) {
		getMainProfileItem(driver).click();
	}

	// Get in profile to see the profile
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_PROFILE));
	}

	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}

	// Get in profile settings
	public static WebElement getProfileSettings(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_SETTINGS));
	}

	public static void clickProfileSettings(WebDriver driver) {
		getProfileSettings(driver).click();
	}

	// Get in profile availability
	public static WebElement getProfileAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_AVAILABILITY));
	}

	public static void clickProfileAvailability(WebDriver driver) {
		getProfileAvailability(driver).click();
	}
	// Get Sign Out 
		public static WebElement getProfileSignOut(WebDriver driver) {
			return driver.findElement(By.xpath(PROFILE_SIGNOUT));
		}

		public static void clickProfileSignOut(WebDriver driver) {
			getProfileSignOut(driver).click();
		}
	// Edit details
		public static WebElement getEditDetails(WebDriver driver) {
			return driver.findElement(By.xpath(EDIT_DETAILS));
		}

		public static void clickEditDetails(WebDriver driver) {
			getEditDetails(driver).click();
		}
	// Upload a picture
		public static void uploadPicture(WebDriver driver) {
			WebElement uploadElement = driver.findElement(By.xpath(UPLOAD_PICTURE));
			uploadElement.sendKeys("C:\\Users\\Laptop\\Desktop\\projekat data\\Jovan Stojkovic.jpg");
		}
		
		// Humanity App Version
		public static WebElement getAppVersion(WebDriver driver) {
			return driver.findElement(By.xpath(APP_VERSION));
		}
		public static String appVersion(WebDriver driver) {
			return getAppVersion(driver).findElement(By.tagName("b")).getText();
		} 		
		
		// Add a nickname
		public static void setNickName(WebDriver driver) {
			driver.findElement(By.xpath(NICK_NAME)).sendKeys("Maradona");;			
		}
		// Save edited details
		public static void clickSaveEditedDetails(WebDriver driver) {
			driver.findElement(By.xpath(SAVE_EDITED_DETAILS)).click();
		}
		
		
		
		
}
