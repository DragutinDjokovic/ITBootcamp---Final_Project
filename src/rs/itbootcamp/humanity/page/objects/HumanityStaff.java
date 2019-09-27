package rs.itbootcamp.humanity.page.objects;

import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelUtils;

public class HumanityStaff {

	private static final String STAFF = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";

	private static final String SELECT_EMPLOYEE_STARTPART = "//a[contains(text(),'";
	private static final String SELECT_EMPLOYEE_ENDPART = "')]";

	private static final String EDIT_DETAILS = "//div[@id='_cd_staff']//div[@class='right']";

	private static final String ADD_EMPLOYEE = "//button[@id='act_primary']";
	private static final String FIRST_NAME = "//input[@id='_asf1']";
	private static final String SECOND_NAME = "//input[@id='_asl1']";
	private static final String EMAIL = "//input[@id='_ase1']";
	private static final String SAVE = "//button[@id='_as_save_multiple']";

	private static final String ADD_EMPLOYEES_FIRSTNAME_APACHEPOI_STARTPART = "//input[@id='_asf";
	private static final String ADD_EMPLOYEES_SECONDNAME_APACHEPOI_STARTPART = "//input[@id='_asl";
	private static final String ADD_EMPLOYEES_EMAIL_APACHEPOI_STARTPART = "//input[@id='_ase";
	private static final String ADD_EMPLOYEES_APACHEPOI_ENDPART = "']";
	
	private static final String LIST_OF_EMPLOYEES_PATH = "//table[@class='employeesList']";
	// Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// First Employee
	public static void selectEmployee(WebDriver driver, String name) {
		driver.findElement(By.xpath(SELECT_EMPLOYEE_STARTPART + name + SELECT_EMPLOYEE_ENDPART)).click();
	}
	// Edit details

	public static void editDetails(WebDriver driver) {
		driver.findElement(By.xpath(EDIT_DETAILS)).click();
	}

	// Add Employee
	public static WebElement getAddEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE));
	}

	public static void clickAddEmployee(WebDriver driver) {
		getAddEmployee(driver).click();
	}

	// First Name
	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME));
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void setFirstName(WebDriver driver, String text) {
		getFirstName(driver).sendKeys(text);
	}

	// Second Name
	public static WebElement getSecondName(WebDriver driver) {
		return driver.findElement(By.xpath(SECOND_NAME));
	}

	public static void clickSecondName(WebDriver driver) {
		getSecondName(driver).click();
	}

	public static void setSecondName(WebDriver driver, String text) {
		getSecondName(driver).sendKeys(text);
	}

	// Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void setEmail(WebDriver driver, String text) {
		getEmail(driver).sendKeys(text);
	}

	// Save added employees
	public static WebElement getSave(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE));
	}

	public static void clickSave(WebDriver driver) {
		getSave(driver).click();
	}
	
	//lista zaposlenih sa sajta
		public static List<String> getArrayOfEmployees(WebDriver driver) {
			List<WebElement> list = driver.findElement(By.xpath(LIST_OF_EMPLOYEES_PATH)).findElements(By.className("staff-employee"));
			List<String> saSajta = new ArrayList<>();
			for(WebElement e : list) {
				saSajta.add(e.getAttribute("innerHTML"));
			}
			return saSajta;
		}

	//
	public static void addEmployee(WebDriver driver, String ime, String prezime, String email, int n) {
		n = n + 1;
		WebElement elIme = driver.findElement(
				By.xpath(ADD_EMPLOYEES_FIRSTNAME_APACHEPOI_STARTPART + n + ADD_EMPLOYEES_APACHEPOI_ENDPART));
		WebElement elPrezime = driver.findElement(
				By.xpath(ADD_EMPLOYEES_SECONDNAME_APACHEPOI_STARTPART + n + ADD_EMPLOYEES_APACHEPOI_ENDPART));
		WebElement elEmail = driver
				.findElement(By.xpath(ADD_EMPLOYEES_EMAIL_APACHEPOI_STARTPART + n + ADD_EMPLOYEES_APACHEPOI_ENDPART));

		elIme.sendKeys(ime);
		elPrezime.sendKeys(prezime);
		elEmail.sendKeys(email);
	}

	//clickAddEmployee(driver);
	public static void automaticAddEmployees(WebDriver driver) {

		ExcelUtils.setExcel("Data.xls");
		ExcelUtils.setWorkSheet(1);
		int r = ExcelUtils.getRowsNumber();

		for (int i = 0; i < r; i++) {
			String firstName = ExcelUtils.getDataAt(i+1, 0);
			String lastName = ExcelUtils.getDataAt(i+1, 1);
			String email = ExcelUtils.getDataAt(i+1, 2);
			addEmployee(driver, firstName, lastName, email, i);

		}
		ExcelUtils.closeExcel();
	}

}
