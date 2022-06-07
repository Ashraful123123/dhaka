package Dhaka_Demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Second_Window_Handle {		//driver.manage().deleteAllCookies();

	@Test
	public void secondWindowHandle() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.paychex.com/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		String parentTitles =driver.getTitle();					//this Test Cases,is this Text displaying or not
		System.out.println("Title of this parent page is :" +" "+parentTitles);
		
// 1st Step : We are click in "Paychex Flex login" Link,After clicking this 1st new tab will be opened,
//			: And We Will be in the 1st Child Window.
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,380)");
		driver.findElement(By.xpath("//a[@href='https://benefits.paychex.com/']")).click();
		//driver.findElement(By.linkText("MySQL SELECT")).click();
		Thread.sleep(2000);
		 //To Handle all the multipleWindow here we declared method .getWindowHandles() method
		//which return Set of<String>,and we store it in multiWindow Variable.
		
		     Set <String> multiWindow  = driver.getWindowHandles();//Set give us one of the method call iterator
															      //Iterator work same as loop
//iterator method-Return us collection of Iterator<String> **This Iterator work as a loop coming from Set Interface**
		Iterator <String> repitation   = multiWindow.iterator();
				
			String parentWindow = repitation.next();
			String childWindow  = repitation.next();
													//After clicking the 1st Step, new tab opened,and we came in the
			driver.switchTo().window(childWindow); //Child Window,So we switch in the Child Window.
			boolean firstChildWindow = driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr[2]/td[3]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[3]/div[1]")).isDisplayed();
			Assert.assertTrue(firstChildWindow);				 //Here we are using isDisplayed Method for verifying
			String title =driver.getTitle();					//this Test Cases,is this Text displaying or not
			System.out.println("Title of this child page is :" +" "+title);//isDisplayed Method return boolean,
																	//so we store it in boolean.
			Thread.sleep(2000);
			driver.close();
			
			
			driver.switchTo().window(parentWindow);
			boolean parent = driver.findElement(By.xpath("//h3[text()='Employee Login Options']")).isDisplayed();
			Assert.assertTrue(parent);
			String parentTitle =driver.getTitle();					//this Test Cases,is this Text displaying or not
			System.out.println("Title of this parent page is :" +" "+parentTitle);
			Thread.sleep(2000);
			driver.close();

			
			/*
		 * 1st Step  : Lunch PayChex URL(Parent Window) 
		 * 2nd Step  : CLick on Login - "Paychex Flex login"
		 * =================================================
		 * 3rd Step  : Verify User In The Login Page-(We are in the Child window)
		 * 4rth Step : Verify We are in PayChex page
		 */
		
		/*
		 * Assert Class - coming from TestNg -we USe Assert class to verify our Test Script 
		 */
	}

}
