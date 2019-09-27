package rs.itbootcamp.humanity.page.objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.ExcelUtils;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com/";
	private static final String ABOUT_US = "//p[contains(text(),'About Us')]";
	private static final String FREE_TRIAL = "//a[@class='button pale']";
	private static final String FULL_NAME = "//div[@class='form-group']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL = "//input[@placeholder='Work Email']";
	private static final String START_FREE_TRIAL = "//input[@id='popup-free-trial-link']";
	private static final String LOGIN = "//p[contains(text(),'LOGIN')]";// pocetni login
	private static final String USER_NAME = "//input[@id='email']";
	private static final String PASSWORD = "//input[@id='password']";
	private static final String LOG_IN = "//button[contains(text(),'Log in')]";// drugi login

	// Info About Us
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}

	// Free Trial button
	public static WebElement getFreeTrial(WebDriver driver) {
		return driver.findElement(By.xpath(FREE_TRIAL));
	}

	public static void clickFreeTrial(WebDriver driver) {
		getFreeTrial(driver).click();
	}

	// Free Trial Full Name
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME));
	}

	public static void setFullName(WebDriver driver, String text) {
		getFullName(driver).sendKeys(text);
	}

	// Free Trial WorkEmail
	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL));
	}

	public static void setWorkEmail(WebDriver driver, String text) {
		getWorkEmail(driver).sendKeys(text);
	}

	// Start Free Trial Button
	public static WebElement getStartFreeTrial(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE_TRIAL));
	}

	public static void clickStartFreeTrial(WebDriver driver) {
		getStartFreeTrial(driver).click();
	}

	// prvi login
	public static void clickLogIn(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN)).click();
	}

	// username
	public static WebElement getUserName(WebDriver driver) {
		return driver.findElement(By.xpath(USER_NAME));
	}

	public static void setUserName(WebDriver driver, String text) {
		getUserName(driver).sendKeys(text);
	}

	// sifra
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD));
	}

	public static void setPassword(WebDriver driver, String text) {
		getPassword(driver).sendKeys(text);
	}

	// submit login data for second time
	public static void setSendLogIn(WebDriver driver) {
		driver.findElement(By.xpath(LOG_IN)).click();
	}

	// Log in "thing"
	public static boolean logIn(WebDriver driver, String email, String password) {
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		clickLogIn(driver);
		setUserName(driver, email);
		setPassword(driver, password);
		setSendLogIn(driver);
		return true;
	}

	// automatsko logovanje
	public static void automaticLogIn(WebDriver driver) {
		ExcelUtils.setExcel("Data.xls");
		ExcelUtils.setWorkSheet(0);
		
		String userName = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);

		logIn(driver, userName, password);

		ExcelUtils.closeExcel();
	}

}
