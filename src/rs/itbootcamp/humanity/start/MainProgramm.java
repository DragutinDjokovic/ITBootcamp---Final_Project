package rs.itbootcamp.humanity.start;

//apache POI
import java.io.File;
//apache POI
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



//selenium
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//selenium
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class MainProgramm {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Look at AboutUs
		//HumanityHome.clickAboutUs(driver);
		
		//Look at Free Trials
		HumanityHome.clickFreeTrial(driver);
		HumanityHome.setFullName(driver, "Jovan Stojkovic");
		HumanityHome.setWorkEmail(driver, "jesidata@web-inc.net");
		HumanityHome.clickStartFreeTrial(driver);
		Thread.sleep(2000);
		
		//Log-in
		driver.get(HumanityHome.URL);
		HumanityHome.clickLogIn(driver);
		HumanityHome.setUserName(driver, "jesidata@web-inc.net");
		HumanityHome.setPassword(driver, "sifrica");
		HumanityHome.setSendLogIn(driver);
		
		//It goes through Menu items
		HumanityMenu.clickDashboard(driver);
		HumanityMenu.clickShiftPlanning(driver);
		HumanityMenu.clickTimeClock(driver);
		HumanityMenu.clickLeave(driver);
		HumanityMenu.clickTraining(driver);
		HumanityMenu.clickStaff(driver);
		HumanityMenu.clickPayroll(driver);
		HumanityMenu.clickReports(driver);
		
		//It goes through first tree employees
		HumanityStaff.clickStaff(driver);
		HumanityStaff.clickFirstEmployee(driver);
		HumanityStaff.clickStaff(driver);
		HumanityStaff.clickSecondEmployee(driver);
		HumanityStaff.clickStaff(driver);
		HumanityStaff.clickThirdEmployee(driver);
		HumanityStaff.clickStaff(driver);
		HumanityStaff.clickAddEmployee(driver);
		
		//dohvata polja u AddEmployees
		HumanityStaff.clickFirstName(driver);
		HumanityStaff.clickSecondName(driver);
		HumanityStaff.clickEmail(driver);
		
		Thread.sleep(3000);
		// driver.quit();
	}

}