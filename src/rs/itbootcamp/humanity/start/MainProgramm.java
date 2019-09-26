package rs.itbootcamp.humanity.start;

//apache POI
import java.io.File;
//apache POI
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
//selenium
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//selenium
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.HumanityLogInTests;

public class MainProgramm {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		Scanner sc = new Scanner(System.in);
		int options;
		do {
			System.out.print("Number is option :" + "\n1  - Log in to a site" + "\n2  - Look at - About Us"
					+ "\n3  - Look at - Free Trials" + "\n4  - It goes through - Menu Items"
					+ "\n5  - It goes through - tree employes" + "\n6  - It catches the fields in AddEmployees "
					+ "\n7  - Look at the profile options" + "\n8  - To set a nickname"
					+ "\n9  - Get to Settings, set Country, Default Language, Time Format"
					+ "\n10 - Upload a picture and set a nickname" + "\n0 - End a programm at any time.\n");
			System.out.println("Choose option: ");
			WebDriver driver = new ChromeDriver();
			options = sc.nextInt();
			switch (options) {
			case 1:
				driver.get(HumanityHome.URL);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				HumanityHome.clickLogIn(driver);
				HumanityHome.setUserName(driver, "jesidata@web-inc.net");
				HumanityHome.setPassword(driver, "sifrica");
				HumanityHome.setSendLogIn(driver);
				break;
			case 2:
				HumanityHome.clickAboutUs(driver);
				break;
			case 3:
				HumanityHome.clickFreeTrial(driver);
				HumanityHome.setFullName(driver, "Jovan Stojkovic");
				HumanityHome.setWorkEmail(driver, "jesidata@web-inc.net");
				HumanityHome.clickStartFreeTrial(driver);
				Thread.sleep(2000);
				break;
			case 4:
				HumanityMenu.clickDashboard(driver);
				HumanityMenu.clickShiftPlanning(driver);
				HumanityMenu.clickTimeClock(driver);
				HumanityMenu.clickLeave(driver);
				HumanityMenu.clickTraining(driver);
				HumanityMenu.clickStaff(driver);
				HumanityMenu.clickPayroll(driver);
				HumanityMenu.clickReports(driver);
				HumanityMenu.clickSettingsGear(driver);
				break;
			case 5:
				HumanityStaff.clickStaff(driver);
				HumanityStaff.selectEmployee(driver, "Aleksandra Radojcic");
				HumanityStaff.clickStaff(driver);
				HumanityStaff.selectEmployee(driver, "Cvijan Peranovic");
				HumanityStaff.clickStaff(driver);
				HumanityStaff.selectEmployee(driver, "Dragutin Djokovic");
				HumanityStaff.clickStaff(driver);
				HumanityStaff.clickAddEmployee(driver);
				break;
			case 6:
				HumanityStaff.clickFirstName(driver);
				HumanityStaff.clickSecondName(driver);
				HumanityStaff.clickEmail(driver);
				break;
			case 7:
				HumanityProfile.clickMainProfileItem(driver);
				HumanityProfile.clickProfileSettings(driver);
				HumanityProfile.clickMainProfileItem(driver);
				HumanityProfile.clickProfile(driver);
				break;
			case 8:
				HumanityEditStaff.setNickName(driver, "Johny");
				break;
			case 9:
				HumanityMenu.clickSettingsGear(driver);
				HumanitySettings.changeCountry(driver, "Portugal");
				HumanitySettings.changeDefaultLanguage(driver, "Serbian");
				HumanitySettings.changeTimeFormat(driver, "24 hour");
				Thread.sleep(3000);
				break;
			case 10:
				HumanityProfile.clickMainProfileItem(driver);
				HumanityProfile.clickProfile(driver);
				HumanityProfile.clickEditDetails(driver);
				Thread.sleep(3000);
				HumanityProfile.uploadPicture(driver);
				HumanityProfile.setNickName(driver);
				HumanityProfile.clickSaveEditedDetails(driver);

				Thread.sleep(3000);
				driver.quit();
				break;
			case 0:
				System.out.println("End of programm. Thank you!");
				Thread.sleep(2000);
				break;
			default:
				System.out.println("You have entered wrong option!");
			}
		} while (options != 0);
	}
}

/*
 * //----------------------------------------------
 * HumanityHome.automaticLogIn(driver); HumanityStaff.clickStaff(driver);
 * HumanityStaff.clickAddEmployee(driver);
 * HumanityStaff.automaticAddEmployees(driver); HumanityStaff.clickSave(driver);
 * // driver.get(HumanityHome.URL); //
 * driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
 * //driver.manage().window().maximize(); /*
 */