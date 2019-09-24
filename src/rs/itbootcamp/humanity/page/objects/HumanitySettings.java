package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	
	//Previosly obligate to click in settings in main menu
	
	private static final String COUNTRY = "//select[@id='country']";
	private static final String DEFAULT_LANGUAGE = "//td[@class='nowrap']//select[@name='language']";
	private static final String TIME_FORMAT = "//select[@name='pref_24hr']";
	
	//change country
/*	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(COUNTRY));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}
	*/
	public static void changeCountry(WebDriver driver, String text) {
	Select drpCountry = new Select (driver.findElement(By.xpath(COUNTRY)));
	drpCountry.selectByVisibleText(text);
	}
	
	//change DefaultLanguage
	
	public static void changeDefaultLanguage(WebDriver driver, String text) {
	Select drpDefaultLanguage = new Select (driver.findElement(By.xpath(DEFAULT_LANGUAGE)));
	drpDefaultLanguage.selectByVisibleText(text);
	}
	// Change Time format
	public static void changeTimeFormat(WebDriver driver, String text) {
		Select drpTimeFormat = new Select (driver.findElement(By.xpath(TIME_FORMAT)));
		drpTimeFormat.selectByVisibleText(text);
		}
	
	
}
