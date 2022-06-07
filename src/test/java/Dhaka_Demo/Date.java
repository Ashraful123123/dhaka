package Dhaka_Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Date {
	@Test
	public void date() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor date =(JavascriptExecutor) driver;
															//value is a method, and i am passing the date in value method
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='06/25/21'");	
		Thread.sleep(3000);
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='05/01/21'");

	}

}
