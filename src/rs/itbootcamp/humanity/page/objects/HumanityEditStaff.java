package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {

	// obligate to first clickMAinProfile item in main menu
	// than to click on profile

	private static final String EDIT_DETAILS = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PICTURE = "//input[@id='fileupload']";
	private static final String NICK_NAME = "//input[@id='nick_name']";

	// Edit details
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS));
	}

	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}

	// Upload picture
	public static WebElement getUploadPicture(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_PICTURE));
	}

	public static void clickUploadPicture(WebDriver driver) {
		getUploadPicture(driver).click();
	}
	//// get and set nick name
	public static WebElement getNickName(WebDriver driver) {
		return driver.findElement(By.xpath(NICK_NAME));
	}

	public static void setNickName(WebDriver driver, String text) {
		getNickName(driver).sendKeys(text);
	}
	
	
}

