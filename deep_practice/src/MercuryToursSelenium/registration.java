package MercuryToursSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class registration {
	
	//Defining WebDriver
	WebDriver _driver = new FirefoxDriver();
	
	//opening page URL & Clicking Register Link
	@Before
	public void OpenUrlAndregisterLinkClick() {
		_driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		_driver.manage().window().maximize();
		//Assert to check if correct page gets opened Title Check "Welcome: Mercury Tours"
	}
	
	@Test
	public void test() {
		_driver.findElement(By.linkText("REGISTER")).click();
		//Assert to check if registration page gets opened - get title check "Register: Mercury Tours"
	}
	
	@After
	//Driver close
	public void browserClose() {
		//_driver.quit();
	}
	
	

}
