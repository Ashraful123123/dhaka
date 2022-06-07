package Dhaka_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown {

	@Test
	public void scrollDown() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// we handle scroll Down by using JavascriptExecutor,whicn is an Interface.
//		
//		for (int i = 0; i < 5000; i++) {
//			
//			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1)", "");
//
//		}
		//((JavascriptExecutor)driver).executeScript("scroll(0,15000)");
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,4000)");

		driver.findElement(By.id("LandingAirBookingSearchForm_promoCode")).sendKeys("123");
//		driver.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();

	}

}
