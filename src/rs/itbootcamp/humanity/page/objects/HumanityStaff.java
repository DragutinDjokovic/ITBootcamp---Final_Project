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
	private static final String SAVE = "//button[@id='_as_save_multiple']";

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
	//Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}
	public static void setEmail(WebDriver driver, String text) {
		getEmail(driver).sendKeys(text);
	}
	//Save added employees
	public static WebElement getSave(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE));
	}

	public static void clickSave(WebDriver driver) {
		getSave(driver).click();
	}
	
	
	
	
	

}
/*package rs.itbootcamp.humanity.page.objects;

//apache POI
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import utility.ExcelUtils;

//selenium
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class HumanityEditStaff {
	
	
      public static void addEmployees() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogIn(driver);
		HumanityHome.setUserName(driver, "jesidata@web-inc.net");
		HumanityHome.setPassword(driver, "sifrica");
		HumanityHome.setSendLogIn(driver);
		
		HumanityStaff.clickStaff(driver);
		HumanityStaff.clickAddEmployee(driver);
		
		//idemo uvoz excela by ExcelUtils
		ExcelUtils.setExcel("projekatExcel.xls");
		ExcelUtils.setWorkSheet(0);
		int r = ExcelUtils.getRowNumber();
		
		for(int i = 0 ; i < r; i++) {
			String ime = ExcelUtils.getDataAt(i, 0);
			String prezime = ExcelUtils.getDataAt(i, 1);
			String email = ExcelUtils.getDataAt(i, 2);
			
			HumanityStaff.setFirstNameA(driver, ime, i+1);
			HumanityStaff.setSecondNameA(driver, prezime, i+1);
			HumanityStaff.setEmailA(driver, email, i+1);
		}
		ExcelUtils.closeExcel();
		
		HumanityStaff.clickSave(driver);

		
}

}
*/