package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	private static final String STAFF = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String FIRST_EMPLOYEE = "//a[contains(text(),'Alba Vitez')]";
	private static final String SECOND_EMPLOYEE = "//a[contains(text(),'Borut Pahor')]";
	private static final String THIRD_EMPLOYEE = "//a[contains(text(),'Dane Glistic')]";
	private static final String ADD_EMPLOYEE = "//button[@id='act_primary']";
	private static final String FIRST_NAME = "//input[@id='_asf1']";
	private static final String SECOND_NAME = "//input[@id='_asl1']";
	private static final String EMAIL = "//input[@id='_ase1']";

	// Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// First Employee
	public static WebElement getFirstEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_EMPLOYEE));
	}

	public static void clickFirstEmployee(WebDriver driver) {
		getFirstEmployee(driver).click();
	}

	// Second Employee
	public static WebElement getSecondEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SECOND_EMPLOYEE));
	}

	public static void clickSecondEmployee(WebDriver driver) {
		getSecondEmployee(driver).click();
	}

	// Third Employee
	public static WebElement getThirdEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(THIRD_EMPLOYEE));
	}

	public static void clickThirdEmployee(WebDriver driver) {
		getThirdEmployee(driver).click();
	}

	// Add Employee
	public static WebElement getAddEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE));
	}

	public static void clickAddEmployee(WebDriver driver) {
		getAddEmployee(driver).click();
	}
	//First Name
	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME));
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}
	// Second Name
	public static WebElement getSecondName(WebDriver driver) {
		return driver.findElement(By.xpath(SECOND_NAME));
	}

	public static void clickSecondName(WebDriver driver) {
		getSecondName(driver).click();
	}
	//Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}
	

}
