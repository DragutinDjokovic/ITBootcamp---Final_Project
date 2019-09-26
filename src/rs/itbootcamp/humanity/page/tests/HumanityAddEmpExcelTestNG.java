package rs.itbootcamp.humanity.page.tests;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import rs.itbootcamp.humanity.page.objects.HumanityStaff;
	import rs.itbootcamp.humanity.page.objects.HumanityHome;
	import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
	import rs.itbootcamp.humanity.page.objects.HumanityMenu;
	import rs.itbootcamp.humanity.page.objects.HumanityProfile;
	import rs.itbootcamp.humanity.page.objects.HumanitySettings;
	
	import utility.ExcelUtils;
	
	public class HumanityAddEmpExcelTestNG {
		@Test
				public void addEmployeesTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			
			String manName, manLastName, manEmail, manPass, mir, mill;
			List<String> fullNames = new ArrayList<>();

			manName = "Jovan";
			manLastName = "Stojkovic";
			manEmail = "jesidata@web-inc.net";
			manPass = "sifrica";
			mir = "Michael";
			mill = "Schmidt";

			fullNames.add(manName + " " + manLastName+" ");
			fullNames.add(mir + " " + mill+" ");
			// lista iz excela
			String srcFile = "Data.xls";

			ExcelUtils.setExcel(srcFile);
			ExcelUtils.setWorkSheet(1);
			int r = ExcelUtils.getRowsNumber();

			for (int i = 1; i < r; i++) {
				String ime = ExcelUtils.getDataAt(i, 0);
				String prezime = ExcelUtils.getDataAt(i, 1);

				fullNames.add(ime + " " + prezime+" ");
			}

			// lista sa sajta
			HumanityHome.clickLogIn(driver);
			HumanityHome.setUserName(driver, "jesidata@web-inc.net");
			HumanityHome.setPassword(driver, "sifrica");
			HumanityHome.setSendLogIn(driver);
			HumanityMenu.clickStaff(driver);
			List<String> saSajta = HumanityStaff.getArrayOfEmployees(driver);
SoftAssert sa= new SoftAssert();
			for (String s : saSajta) {
				
				sa.assertTrue(fullNames.contains(s),s);
				System.out.println(s);
			}
			
			Thread.sleep(3000);
			
			System.out.println(saSajta);
			System.out.println(fullNames);
			sa.assertAll();
			driver.quit();
			
		}

	}

