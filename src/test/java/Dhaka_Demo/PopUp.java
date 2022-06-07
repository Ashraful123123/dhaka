package Dhaka_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUp {

	@Test
	public void popUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		//For handling Any kind of PopUp in Webpage//////////
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		//ALERT is the PopUp that are coming when I click
		//to handle pop up using Alert method,than we are accepting the pop-up
		//Switching to alert,which is pop-up,than what should i do, I will accept it.
		driver.findElement(By.id("login1")).clear();
		//If there is anything written in the LOGIN field,than it will clear everything clear in that field//
		driver.findElement(By.id("login1")).sendKeys("alam");
        driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        
        
		
	}
}
