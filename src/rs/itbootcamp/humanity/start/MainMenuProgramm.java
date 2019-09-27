package rs.itbootcamp.humanity.start;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.HumanityAddEmpExcelTestNG;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityAppVersionTest;
import rs.itbootcamp.humanity.page.tests.HumanityLogInTests;
import rs.itbootcamp.humanity.page.tests.HumanityLogInViaExcelTests;
import rs.itbootcamp.humanity.page.tests.HumanityUploadPictureTest;

public class MainMenuProgramm {

	public static void main(String[] args) throws InterruptedException, IOException {

		Scanner sc = new Scanner(System.in);
		int mainMenu;
		do {

			System.out.println("Choose among options by press the number: ");
			System.out.println("1 - Test");
			System.out.println("2 - Functionalities");
			System.out.println("0 - Leave the program.");

			mainMenu = sc.nextInt(); // user inputs the choice
			sc.nextLine();
			switch (mainMenu) {

			case 1:// main menu 1 Tests
				int subMenu1;
				do {
					System.out.println("Choose number to do a test for: ");
					System.out.println("1 - Humanity LogIn Test");
					System.out.println("2 - Humanity LogIn by ApachePOI Test");
					System.out.println("3 - Humanity Add Employee Test");
					System.out.println("4 - Humanity Add Employees by ApachePOI Test");
					System.out.println("5 - Humanity Upload Picture Test");
					System.out.println("6 - Humanity App Version Test");
					System.out.println("All of the sets are in testNG. \n"
							+ "You can run it separately of a MainProgramm.\n"
							+ "Enjoy!");

					subMenu1 = sc.nextInt();
					switch (subMenu1) {
					case 1:// 11
						HumanityLogInTests.logInTest();
						break;
					case 2:// 12
						HumanityLogInViaExcelTests.testThe();
						break;
					case 3:// 13
						HumanityAddNewEmployeeTests.addEmployeesTest();
						break;
					case 4:// 14
						HumanityAddEmpExcelTestNG.addEmployeesTest();
						break;
					case 5:// 15
						HumanityUploadPictureTest.testUploadPicture();
						break;
					case 6:// 16
						HumanityAppVersionTest.testAppVersion();
						break;
					case 0:// 10
						System.out.println("End of programm. Thank you!");
						Thread.sleep(2000);
						break;
					default:
						System.out.println(
								"Dear user, You have chosen the unsupported option and will be directed to the previous menu!");
					}
				} while (subMenu1 != 0);

			case 2: // main menu 2 Functionalities
				int subMenu2;
				do {
					System.out.print("Press number as option for: \n" + "\n1  - Log in to a site"
							+ "\n2  - Look at - About Us" + "\n3  - Look at - Free Trials"
							+ "\n4  - It goes through - Menu Items" + "\n5  - It goes through - tree employes"
							+ "\n6  - It catches the fields in AddEmployees " + "\n7  - Look at the profile options"
							+ "\n8  - To set a nickname"
							+ "\n9  - Get to Settings, set Country, Default Language, Time Format"
							+ "\n10 - Upload a picture and set a nickname" + "\n0 - End a programm at any time.\n");
					System.out.println("Choose option: ");
					WebDriver driver = new ChromeDriver();
					subMenu2 = sc.nextInt();
					switch (subMenu2) {
					// -------
					case 1:// 21
						driver.get(HumanityHome.URL);
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						driver.manage().window().maximize();
						HumanityHome.clickLogIn(driver);
						HumanityHome.setUserName(driver, "jesidata@web-inc.net");
						HumanityHome.setPassword(driver, "sifrica");
						HumanityHome.setSendLogIn(driver);
						break;
					case 2:// 22
						HumanityHome.clickAboutUs(driver);
						break;
					case 3:// 23
						HumanityHome.clickFreeTrial(driver);
						HumanityHome.setFullName(driver, "Jovan Stojkovic");
						HumanityHome.setWorkEmail(driver, "jesidata@web-inc.net");
						HumanityHome.clickStartFreeTrial(driver);
						Thread.sleep(2000);
						break;
					case 4:// 24
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
					case 5:// 25
						HumanityStaff.clickStaff(driver);
						HumanityStaff.selectEmployee(driver, "Aleksandra Radojcic");
						HumanityStaff.clickStaff(driver);
						HumanityStaff.selectEmployee(driver, "Cvijan Peranovic");
						HumanityStaff.clickStaff(driver);
						HumanityStaff.selectEmployee(driver, "Dragutin Djokovic");
						HumanityStaff.clickStaff(driver);
						HumanityStaff.clickAddEmployee(driver);
						break;
					case 6:// 26
						HumanityStaff.clickFirstName(driver);
						HumanityStaff.clickSecondName(driver);
						HumanityStaff.clickEmail(driver);
						break;
					case 7:// 27
						HumanityProfile.clickMainProfileItem(driver);
						HumanityProfile.clickProfileSettings(driver);
						HumanityProfile.clickMainProfileItem(driver);
						HumanityProfile.clickProfile(driver);
						break;
					case 8:// 28
						HumanityEditStaff.setNickName(driver, "Johny");
						break;
					case 9:// 29
						HumanityMenu.clickSettingsGear(driver);
						HumanitySettings.changeCountry(driver, "Portugal");
						HumanitySettings.changeDefaultLanguage(driver, "Serbian");
						HumanitySettings.changeTimeFormat(driver, "24 hour");
						Thread.sleep(3000);
						break;
					case 10:// 210
						HumanityProfile.clickMainProfileItem(driver);
						HumanityProfile.clickProfile(driver);
						HumanityProfile.clickEditDetails(driver);
						Thread.sleep(3000);
						HumanityProfile.uploadPicture(driver);
						HumanityProfile.setNickName(driver);
						HumanityProfile.clickSaveEditedDetails(driver);
						Thread.sleep(3000);
						break;
					case 0:// 20
						System.out.println("End of programm. Thank you!");
						Thread.sleep(2000);
						break;
					default:
						System.out.println("You have entered wrong option!");
					}
				} while (subMenu2 != 0);

			case 0: // mainMenu 0
				System.out.println("You choose to end a programm.Bye!");
				break;

			default: // main menu default
				System.out.println("You have entered wrong option!");
			}
		} while (mainMenu != 0);

	}
}
