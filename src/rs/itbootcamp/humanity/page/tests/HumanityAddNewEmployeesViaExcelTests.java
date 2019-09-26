/*
package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import utility.ExcelUtils;
import org.testng.annotations.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HumanityAddNewEmployeesViaExcelTests {
	@Test
	public void AddNewEmployeesTest() {
		
		ExcelUtils.setExcel("Data.xls");
		ExcelUtils.setWorkSheet(0);	
		String userName = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);
		
		String ime, prezime, email, celoIme;
		boolean testPoint;

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try {
			HumanityHome.logIn(driver, userName, password);
//			test
			HumanityMenu.clickStaff(driver);
			HumanityStaff.clickAddEmployee(driver);
			
			ExcelUtils.setWorkSheet(1);	
			int r = ExcelUtils.getRowNumber();
			for(int i=1; i < r; i++) {
				userName = ExcelUtils.getDataAt(i, 0);
				prezime = ExcelUtils.getDataAt(i, 1);
				email = ExcelUtils.getDataAt(i, 2);
				HumanityStaff.addEmployee(driver, email, ime, prezime, i);
			}
			HumanityStaff.clickSave(driver);
			Thread.sleep(1500);
			HumanityMenu.clickStaff(driver);
			
			for(int i=1; i < ExcelUtils.getRowNumber(); i++) {
				ime = ExcelUtils.getDataAt(i, 0);
				prezime = ExcelUtils.getDataAt(i, 1);
				celoIme = ime + " " + prezime;
				testPoint = HumanityStaff.isThere(driver, celoIme);
				Assert.assertTrue(testPoint);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {			
			ExcelUtils.closeExcel();
			driver.quit();
		}
	}
}
*/