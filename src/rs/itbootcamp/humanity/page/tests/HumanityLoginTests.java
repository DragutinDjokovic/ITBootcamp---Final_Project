package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTests {
	public String LogedInURL = "https://stojkovicdoo.humanity.com/app/dashboard/";
	public WebDriver driver;
	
	/*-@Test
	driver.get(HumanityHome.URL);
	String URLA = driver.getCurrentUrl();
	Assert.assertEquals(URLA, );
	*/
	@BeforeTest
	public void setBaseUrl() {
		WebDriver driver = new ChromeDriver();
		driver.get(LogedInURL);
	}
	@Test
	public void verifyLogedIn() {
		String exceptedLogedIn = "\"https://stojkovicdoo.humanity.com/app/dashboard/\"";
		String actualLogedIn = driver.getTitle()
	}
	
	
	
/*	public static WebElement getFirst_Name(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}
*/
}