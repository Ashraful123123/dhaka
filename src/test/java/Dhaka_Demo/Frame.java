package Dhaka_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
	
	
	@Test
	public void frame() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//If My url open before 10 seconds it will open my url,it will not wait upto 10 sec.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20 sec is the standart seconds to wait.
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		//To make sure,all the WebElement of the page loaded perfectly,we use == (pageLoadOut)
		//===========================================================//
		String title = driver.getTitle();
		System.out.println("Correct Title is:" +" "+ title);
		String url   = driver.getCurrentUrl();
		System.out.println("Correct url is:" +" "+ url);
		


				
		
		/////If there is more than one frame in WebPage,then we will have to use switchTo().frame();//////////
		driver.switchTo().frame("classFrame");   //Which frame where you have to go///
		Thread.sleep(2000);						//Here I am giving the name=classframe,//
		driver.findElement(By.linkText("Deprecated")).click();
	   ///////////////////////////////////////////////////////////////////////////////
		
		
	}

}
