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
	private static final String UPLOAD_PICTURE = "//div[@id='_cd_staff']//div[@class='right']";
	
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
	// upload picture
		
}
