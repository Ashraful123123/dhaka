package Dhaka_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWait_PageloadOut {    //Before lunching the url ,we are using (implicitlyWait).
										  //After lunching the url, we will use (PageLoadTimeout).
	@Test								 //ExplicitWait we use for between the WebElement
	public void waitingTime() {		//We will wait untill the WebElement 
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 //If My url open before 10 seconds it will open my url,it will not wait upto 10 sec.		
		//20 sec is the standart seconds to wait,
	   //Sometimes Web page take time to open the url
	  //We used this Implicitwait to lunch the URL properly
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		 //After lunching the url,
		//now will wait till all the WebElement loaded perfectly.
	   //To load all the WebElement behind the DOM,we will use =pageLoadOut()
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		
		//To make sure,all the WebElement of the page loaded perfectly,we use == (pageLoadOut)
		//===========================================================//
		String title = driver.getTitle();
		System.out.println("Corrent Title is:" +" "+ title);
		String url   = driver.getCurrentUrl();
		System.out.println("Correct url is:" +" "+ url);
		     //Here I am giving the name=classframe,//
		driver.switchTo().frame("classFrame");   //Which frame where you have to go///
		//=====================Explicit Wait,WebDriver Wait,Soft Wait==========================
		//WebDriver is a class,now we are trying to access that,so we created an object of that class
		
		WebDriverWait pleaseWait = new  WebDriverWait(driver,Duration.ofSeconds(10));	
		pleaseWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.linkText("Deprecated"))));	
		//We are waiting until the WebElement is visible
		//we are giving the condition that,wait upto 20 seconds to find the webElement.
		//here if,it find the WebElement in 10 sec,it will click and go into the next step.
		
		driver.findElement(By.linkText("Deprecated")).click();
		
	}

}
//===========================Thread.sleep==============================//
/*
 * It will wait 20seconds even if it found the webelement in 5 seconds It will
 * stop all the execution for 20 seconds
 */

//==========================ImplicitlyWait===========================//
/*
 * Before lunching the url,we use this Implicitwait to lunch the URL properly If
 * My url open before 10 seconds it will open my url,it will not wait upto 20
 * sec.
 */

//========================ExplicitWaitlyWait=======================//
/*
 * Exlicit wait also call WebDriver wait
 * we will use it between the Webelements.like In a Test scenario we can have
 * multiple test steps to check Now, if we have two steps,and we done our 1st
 * step properly We not going to wait 20 Seconds.We will go to the next step =
 * ExplicitWait.
 */

//=========================PageLoadOut============================//
/*
 * After lunching the url, now will wait till all the WebElement loaded
 * perfectly. To load all the WebElement behind the DOM,we will use
 * =pageLoadOut()
 */
/*
 * ========================Wait================================== We will use
 * this at last line or stage There are different types of wait we use in my
 * code Mostly we use soft wait,In soft wait we have implicitWait and
 * ExplicitWait There is another wait which is hard wait Normally for executing
 * test cases we don't use hard wait,we use soft wait For one step to another
 * step it will upto 20 seconds
 * 
 * ===============================================================
 * For WebElement Synchronization issue we use
 * Explicit Wait.And we use ExplicitWait between the webElements
 * This is also called WebDriver Wait
 */