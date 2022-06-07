package Dhaka_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetValueFromWeb {

	@Test
		public void getValue() {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("ashraful");///What i have given  in sendkeys  
			driver.findElement(By.id("pass")).sendKeys("12345");//it will print in my console
			
			String emailvalue = driver.findElement(By.id("email")).getAttribute("value");//i is returning us string of value
			System.out.println(emailvalue);						
			
			String passValue = driver.findElement(By.id("pass")).getAttribute("value");
			System.out.println(passValue);		//By default we have to use "value"
												//Because it's returning String value.
	}
	
}
