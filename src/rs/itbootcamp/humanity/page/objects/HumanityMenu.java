package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {

	private static final String DASHBOARD = "//i[@class='primNavQtip__icon icon-dashboard']";
	private static final String SHIFT_PLANNING = "//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	private static final String TIME_CLOCK = "//i[@class='primNavQtip__icon icon-timeclock']";
	private static final String LEAVE = "//i[@class='primNavQtip__icon icon-leave2']";
	private static final String TRAINING = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String PAYROLL = "//i[@class='primNavQtip__icon icon-payroll']";
	private static final String REPORTS = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	public static  String URL = "https://stojkovicdoo.humanity.com/app/dashboard/"; 
	private static final String SETTINGS_GEAR = "//i[@class='primNavQtip__icon icon-gear']"; 
	
	// Dashboard
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD));
	}

	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}

	// ShiftPlanning
	public static WebElement getShiftPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING));
	}

	public static void clickShiftPlanning(WebDriver driver) {
		getShiftPlanning(driver).click();
	}

	// TimeClock
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK));
	}

	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}

	// Leave
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// Training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	// Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// Payroll
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	// Reports
	public static void clickReports(WebDriver driver) {
		driver.findElement(By.xpath(REPORTS)).click();
	}
	// click Settings main 
		public static void clickSettingsGear(WebDriver driver) {
			driver.findElement(By.xpath(SETTINGS_GEAR)).click();
		}
}
