package Dhaka_Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Refresh {
@Test
 public void pageRefresh() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//If My url open before 10 seconds it will open my url,it will not wait upto 10 sec.
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20 sec is the standart seconds to wait.
	driver.get("http://smweb.suffixit.com:8576/");
	driver.manage().window().maximize();
	
	driver.navigate().refresh();
    String p = driver.getPageSource();
    System.out.print("Page Source is : " + p);
	Thread.sleep(4000);
	 
 }
}
