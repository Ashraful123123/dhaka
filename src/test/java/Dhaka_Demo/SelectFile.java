package Dhaka_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectFile {
	@Test
	public void selectFile() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//If My url open before 10 seconds it will open my url,it will not wait upto 10 sec.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20 sec is the standart seconds to wait.
		driver.get("http://smweb.suffixit.com:8576/");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("ter1004");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("TSO-0044");
		
		driver.findElement(By.cssSelector("button[class=\"btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light\"]")).click();
	    driver.findElement(By.cssSelector("a[data-tour=\"reactour__market\"]")).click();
	    driver.findElement(By.cssSelector("a[href=\"/sales-target-batch-process-screen\"]")).click();
	    driver.findElement(By.cssSelector("button[class=\"btn btn-info btn-rounded waves-effect waves-light shadow\"]")).click();
		Thread.sleep(4000);
		//======================Navigating backward and forward==========================//
		
//		driver.navigate().back();
//		Thread.sleep(4000);
//		driver.navigate().forward();
//		Thread.sleep(4000);
//	    driver.findElement(By.cssSelector("button[class=\"btn btn-info btn-rounded waves-effect waves-light shadow\"]")).click();

	   //====================for Select date in web page=======================// 
	    //driver.findElement(By.cssSelector("input#orderDate")).isDisplayed();
	    driver.findElement(By.cssSelector("input#orderDate")).sendKeys("03/27/2022");
	    
//		JavascriptExecutor date =(JavascriptExecutor) driver;
//		 value is a method, and i am passing the date in value method
//       date.executeScript("document.getElementsByName('salesOutDate').value='02/18/22'");

		   //====================for upload file in web page=======================// 
       WebElement upload = driver.findElement(By.cssSelector("input#fileName"));
                  upload.sendKeys("D:\\file\\57_Lalbag_MarketWise_Target_Sales_Out_Format.xlsx");
       
       //=========upload button a click korar jonno=================================//
        driver.findElement(By.cssSelector("input[class=\"btn btn-info mr-2 shadow rounded\"]")).click();
       
		driver.findElement(By.cssSelector("a[class=\"btn btn-warning shadow rounded\"]")).click();
		driver.findElement(By.cssSelector("button[title=\"Move to trash\"]")).click();
		Thread.sleep(3000);
		
		//=========If the Exception show---element got intercepted,then i will have to use that==================//
		//========================To delete the uploaded file=============================//
		WebElement searchButton = driver.findElement(By.xpath("//button[@name=\"Remove\"]"));
		searchButton.click();
		//=======================We can use this code also=====================//
//		JavascriptExecutor js = (JavascriptExecutor)driver;		
//		js.executeScript("arguments[0].click()", searchButton);


	}
	
	
	
}
